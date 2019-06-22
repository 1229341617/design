package design.classloader;

public class Parent {
	public static int A = 1;
	static {
		A = 2;
		System.out.println(A);
		C = 4;
	}
	public static int C = 3;
}
