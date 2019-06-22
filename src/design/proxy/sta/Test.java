package design.proxy.sta;

public class Test {
	public static void main(String[] args) {
		ActionProxy actionProxy = new ActionProxy(new Action());
		actionProxy.eat();
	}
}
