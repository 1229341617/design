package design.factory.simple;

import org.junit.Test;

import design.factory.Car;

public class SimpleFactoryTest {

	@Test
	public void testGetCar() {
		Car car = new SimpleFactory().getCar("Benz");
		System.out.println(car);
	}

}
