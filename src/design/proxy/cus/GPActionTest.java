package design.proxy.cus;

import design.proxy.sta.Action;
import design.proxy.sta.IAction;

public class GPActionTest {
	
	public static void main(String[] args) {
		IAction action = (IAction)new GPActionProxy().getProxyInstance(new Action());
		action.eat();
	}
}
