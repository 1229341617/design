package design.proxy.cus;

import java.lang.reflect.Method;

public class GPActionProxy implements GPInvocationHandler{
	private Object tar;
	
	
	public Object getProxyInstance(Object obj) {
		this.tar = obj;
		return GPProxy.getProxyInstance(new GPClassLoader(), tar.getClass().getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("执行前....");
		Object obj = method.invoke(tar, args);
		System.out.println("执行后....");
		return obj;
	}
	
}
