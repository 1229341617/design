package design.proxy.dyn;

import java.io.FileOutputStream;
import java.io.OutputStream;

import sun.misc.ProxyGenerator;
import design.proxy.sta.Action;
import design.proxy.sta.IAction;


public class Test {
	public static void main(String[] args) throws Exception {
		IAction actionProxy = (IAction)new AppProxy().getProxy(new Action());
		actionProxy.eat();
		
		byte[] data = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{actionProxy.getClass()});
		OutputStream os = new FileOutputStream("D:/$Proxy0.class");
		os.write(data);
		os.close();
	}
}
