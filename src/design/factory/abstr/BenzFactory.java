package design.factory.abstr;

import design.factory.Benz;
import design.factory.Car;

public class BenzFactory extends AbstractFactory {

	@Override
	public Car getCar() {
		return new Benz();
	}

}
