package design.proxy.cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class Proxy implements MethodInterceptor{
	
	public Object getInstance(Class superClass) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(superClass);
		enhancer.setCallback(this);
		return enhancer.create();
	}

	@Override
	public Object intercept(Object proxy, Method method, Object[] args,
			MethodProxy methodproxy) throws Throwable {
		System.out.println("执行前...");
		Object result = methodproxy.invokeSuper(proxy, args);
		System.out.println("执行后...");
		return result;
	}
	
}
