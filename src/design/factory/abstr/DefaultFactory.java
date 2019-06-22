package design.factory.abstr;

import design.factory.Car;

public class DefaultFactory extends AbstractFactory {
	private AbstractFactory audiFactory = new AudiFactory();

	@Override
	public Car getCar() {
		return audiFactory.getCar();
	}

}
