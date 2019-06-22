package design.factory.abstr;

import org.junit.Test;

import design.factory.Car;

public class DefaultFactoryTest {
	private AbstractFactory defaultFactory = new DefaultFactory();

	@Test
	public void testGetCar() {
		Car car = defaultFactory.getCar();
		System.out.println(car);
	}

	@Test
	public void testGetCarString() {
		Car car = defaultFactory.getCar("Benz");
		System.out.println(car);
	}

}
