package design.proxy.sta;

public class ActionProxy implements IAction{
	private IAction action;
	
	public ActionProxy() {
		action = new Action();
	}
	
	public ActionProxy(Action action) {
		this.action = action;
	}
	
	
	@Override
	public void eat() {
		System.out.println("ϴ��...");
		action.eat();
		System.out.println("ϴ��...");
	}

}
