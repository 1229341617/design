package design.singleton;

public class LazyDoubleCheckSingleton {
	private static LazyDoubleCheckSingleton instance;
	
	private LazyDoubleCheckSingleton() {
		
	}
	
	public static LazyDoubleCheckSingleton getInstance() {
		if(instance != null) {//针对非第一次校验
			synchronized (LazyDoubleCheckSingleton.class) {
				if(instance == null) {//只针对第一次校验
					instance = new LazyDoubleCheckSingleton();
				}
				return instance;
			}
		}
		return instance;
	}
}
