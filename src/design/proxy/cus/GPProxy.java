package design.proxy.cus;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

public class GPProxy {
	private static final String ln = "\r\n";
	
	private GPInvocationHandler h;
	
	public static Object getProxyInstance(GPClassLoader classloader, 
							Class<?>[] interfaces, GPInvocationHandler h) {
		try {
			//1.得到被代理类的源码;
			String src = getSrc(interfaces[0]);
			//2.将被代理类的源码写到磁盘中;
			String filepath = GPProxy.class.getResource("").getPath() + "$Proxy0.java";
			File proxyFile = new File(filepath);
			OutputStream os = new FileOutputStream(proxyFile);
			os.write(src.getBytes());
			os.close();
			//3.编译磁盘中的源码文件成class文件;
			JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
			StandardJavaFileManager manager = compiler.getStandardFileManager(null, null, null);
			Iterable<? extends JavaFileObject> iterable = manager.getJavaFileObjects(proxyFile);
			CompilationTask task = compiler.getTask(null, manager, null, null, null, iterable);
			task.call();
			manager.close();
			proxyFile.delete();
			//4.将class文件加载到jvm中并返回代理对象;
			Class<?> proxyClass = new GPClassLoader().findClass("$Proxy0");
			Constructor<?> con = proxyClass.getConstructor(new Class<?>[]{GPInvocationHandler.class});
			return con.newInstance(h);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private static String getSrc(Class<?> interf) {
		StringBuffer src = new StringBuffer();

		src.append("package design.proxy.cus;" + ln);
		src.append("import design.proxy.cus.GPInvocationHandler;" + ln);
		src.append("import java.lang.reflect.Method;" + ln);
		src.append("public class $Proxy0 implements "+interf.getName()+" {" + ln);
		src.append("GPInvocationHandler h;" + ln);
		src.append("public $Proxy0(GPInvocationHandler paramInvocationHandler) {" + ln);
		src.append("this.h = paramInvocationHandler;" + ln);
		src.append("}" + ln);
		
		Method[] ms = interf.getMethods();
		for (int i = 0; i < ms.length; i++) {
			src.append("public " + ms[i].getReturnType().getName() + " " + ms[i].getName() + "(){" + ln);
			src.append("try{" + ln);
			src.append("Method m = " + interf.getName() + ".class.getMethod(\"" + ms[i].getName() + "\", new Class[]{});" + ln);
			src.append("this.h.invoke(this, m, null);" + ln);
			src.append("} catch (Throwable e) {" + ln);
			src.append("e.printStackTrace();" + ln);
			src.append("}" + ln);
			src.append("}" + ln);
		}
		src.append("}" + ln);
		return src.toString();
	}
	
	
}
