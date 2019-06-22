package design.factory.abstr;

import design.factory.Audi;
import design.factory.Car;

public class AudiFactory extends AbstractFactory {

	@Override
	public Car getCar() {
		return new Audi();
	}

}
