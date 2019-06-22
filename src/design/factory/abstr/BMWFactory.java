package design.factory.abstr;

import design.factory.BMW;
import design.factory.Car;

public class BMWFactory extends AbstractFactory {

	@Override
	public Car getCar() {
		return new BMW();
	}

}
