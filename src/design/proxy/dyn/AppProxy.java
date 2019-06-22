package design.proxy.dyn;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AppProxy implements InvocationHandler{
	private Object tar;
	
	
	public Object getProxy(Object obj){
		this.tar = obj;
		return Proxy.newProxyInstance(this.tar.getClass().getClassLoader(), 
				this.tar.getClass().getInterfaces(), this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("拦截前操作...");
		Object result = method.invoke(tar, args);
		System.out.println("拦截后操作...");
		return result;
	}
}
