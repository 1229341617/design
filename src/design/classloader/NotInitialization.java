package design.classloader;

public class NotInitialization {

	public static void main(String[] args) {
		/**
		 * 主动引用
		 */
//		new SuperClass();//new
//		System.out.println(SubClass.value);//getstatic
//		SubClass.value = 2;//putstatic
//		SuperClass.printValue();//invokestatic

		/**
		 * 被动引用
		 */
//		System.out.println(SubClass.value);///父类被初始化，SubClass未初始化
//		SuperClass[] arr = new SuperClass[0];//SuperClass未初始化
//		System.out.println(SubClass.fvalue);//访问final修饰的变量也不会初始化
	}
}
