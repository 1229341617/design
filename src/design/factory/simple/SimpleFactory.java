package design.factory.simple;

import design.factory.Audi;
import design.factory.BMW;
import design.factory.Benz;
import design.factory.Car;

public class SimpleFactory {
	
	public Car getCar(String carName) {
		if("Audi".equalsIgnoreCase(carName)) {
			return new Audi();
		}else if("Benz".equalsIgnoreCase(carName)) {
			return new Benz();
		}else if("BMW".equalsIgnoreCase(carName)) {
			return new BMW();
		} else{
			System.out.println("无法生产该产品！");
			return null;
		}
	}
	
}
