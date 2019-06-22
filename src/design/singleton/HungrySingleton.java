package design.singleton;

/**
 * 
 * 单例-饿汉
 * 
 * 在类加载过程的准备阶段，就已经初始化好了instance
 * 缺点:浪费内存
 * @author lq
 *
 */
public class HungrySingleton {
	
	private static final HungrySingleton instance = new HungrySingleton();
	
	private HungrySingleton() {
		
	}
	
	public static HungrySingleton getInstance() {
		return instance;
	}
	
}