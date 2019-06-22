package design.singleton;

/**
 * 优点：
 * 	既解决了饿汉模式的浪费内存的缺点
 * 	又解决了懒汉模式的线程不安全问题
 * 缺点：
 * 	通过反射能够破坏只创建一个实例的特点.
 * @author lq
 *
 */
public class InnerSingleton {
	
	private InnerSingleton() {
		
	}
	
	private static class LazyHolder {
		private static final InnerSingleton instance = new InnerSingleton();
	}
	
	
	public static InnerSingleton getInstance() {
		return LazyHolder.instance;
	}
}
