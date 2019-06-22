package design.singleton;

public class LazyDoubleCheckSingleton {
	private static LazyDoubleCheckSingleton instance;
	
	private LazyDoubleCheckSingleton() {
		
	}
	
	public static LazyDoubleCheckSingleton getInstance() {
		if(instance != null) {//��Էǵ�һ��У��
			synchronized (LazyDoubleCheckSingleton.class) {
				if(instance == null) {//ֻ��Ե�һ��У��
					instance = new LazyDoubleCheckSingleton();
				}
				return instance;
			}
		}
		return instance;
	}
}
