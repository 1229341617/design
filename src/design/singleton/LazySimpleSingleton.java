package design.singleton;

/**
 * 单例-懒汉-最简单
 * 
 * 缺点:线程不安全
 * @author lq
 *
 */
public class LazySimpleSingleton {
	
	private static LazySimpleSingleton instance;
	
	private LazySimpleSingleton() {
		
	}
	
	/**
	 * 线程不安全,此时会有三种情况产生
	 * 	1.正常情况;
	 * 	2.如果有多个线程同时进行if判断,且同时进入if内部
	 * 		如果没有重复instance的返回,结果应该是多个实例;
	 * 		如果重复instance的返回,结果应该是多个相同的实例,且都为最后一次new的那个实例;
	 * @return
	 */
	public static LazySimpleSingleton getInstance() {
		if(instance == null) {
			instance = new LazySimpleSingleton();
		}
		return instance;
	}
}
