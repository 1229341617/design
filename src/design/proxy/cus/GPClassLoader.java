package design.proxy.cus;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class GPClassLoader extends ClassLoader{
	private static File baseDir;
	
	
	
	public GPClassLoader() {
		String basePath = GPClassLoader.class.getResource("").getPath();
		baseDir = new File(basePath);
	}

	
	public  Class<?> findClass(String clazzName) {
		InputStream in = null;
		ByteArrayOutputStream os = null;
		File classFile = null;
		try {
			classFile = new File(baseDir, clazzName + ".class");
			if(classFile.exists()) {
				in = new FileInputStream(new File(baseDir, clazzName + ".class"));
				
				os = new ByteArrayOutputStream();
				byte[] buff = new byte[1024];
				int len;
				while((len = in.read(buff)) != -1) {
					os.write(buff, 0, len);
				}
				String className = GPClassLoader.class.getPackage().getName() + "." + clazzName;
				return defineClass(className, os.toByteArray(), 0, os.size());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(os != null) {
				try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			classFile.delete();
		}
		return null;
	}

}
