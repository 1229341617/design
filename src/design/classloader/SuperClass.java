package design.classloader;

public class SuperClass {
	
	static {
		System.out.println("SuperClass init!");
	}
	
	
	public static int value = 123;
	
	public static final int fvalue = 123;
}
