package design.classloader;


/**
 * 单例-懒汉设计模式-静态内部类
 * 保证了安全又保证了性能
 * @author lq
 *
 */
public class Singleton4 {
	
	//1.私有化构造器;
	private Singleton4() {
		
	}
	
	public static class LazyHolder {
		//final防止静态内部类中误操作,如CgLib下也会重新给INSTANCE赋值就麻烦了
		private static final Singleton4 INSTANCE = new Singleton4();
	}
	
	//3.final防止被覆写
	public static final Singleton4 getInstance() {
		return LazyHolder.INSTANCE;
	}
}
