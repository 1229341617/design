package design.factory.func;

import org.junit.Test;

import design.factory.Car;

public class FactoryTest {

	@Test
	public void testGetCar() {
		Car audi = new AudiFactory().getCar();
		System.out.println(audi);
		
		Car benz = new BenzFactory().getCar();
		System.out.println(benz);
		
		Car bmw = new BMWFactory().getCar();
		System.out.println(bmw);
	}

}
