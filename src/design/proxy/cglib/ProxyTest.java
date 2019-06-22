package design.proxy.cglib;

import design.proxy.sta.Action;

public class ProxyTest {
	public static void main(String[] args) {
		Action a = (Action)new Proxy().getInstance(Action.class);
		a.eat();
	}
}
