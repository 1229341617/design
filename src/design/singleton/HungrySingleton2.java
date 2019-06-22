package design.singleton;

/**
 * µ¥Àý-¶öºº-±äÐÎ
 * @author lq
 *
 */
public class HungrySingleton2 {
	
	private static HungrySingleton2 instance;
	
	static {
		instance = new HungrySingleton2();
	}
	
	
	private HungrySingleton2() {
		
	}
	
	
	public static HungrySingleton2 getHungrySingleton2() {
		return instance;
	}
}
