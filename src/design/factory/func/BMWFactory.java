package design.factory.func;

import design.factory.BMW;
import design.factory.Car;

public class BMWFactory implements Factory {

	@Override
	public Car getCar() {
		return new BMW();
	}

}
