package design.singleton;

public class LazySyncSingleton {
	
	private static LazySyncSingleton instance;
	
	private LazySyncSingleton() {
		
	}
	
	/**
	 * 其中一个线程进入，其他线程就会处于monitor状态，如果当前线程释放同步锁后，就会释放该同步锁
	 * @return
	 */
	public static LazySyncSingleton getInstance() {
		synchronized (LazySyncSingleton.class) {//以本类为同步锁
			if(instance == null) {
				instance = new LazySyncSingleton();
			}
			return instance;
		}
	}
	
}
