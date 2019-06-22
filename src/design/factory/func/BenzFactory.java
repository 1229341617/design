package design.factory.func;

import design.factory.Benz;
import design.factory.Car;

public class BenzFactory implements Factory{

	@Override
	public Car getCar() {
		return new Benz();
	}

}
