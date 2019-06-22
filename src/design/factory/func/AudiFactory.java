package design.factory.func;

import design.factory.Audi;
import design.factory.Car;

public class AudiFactory implements Factory{
	
	@Override
	public Car getCar() {
		return new Audi();
	}
	
}
