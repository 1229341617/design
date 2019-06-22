package design.singleton;

public class LazySyncSingleton {
	
	private static LazySyncSingleton instance;
	
	private LazySyncSingleton() {
		
	}
	
	/**
	 * ����һ���߳̽��룬�����߳̾ͻᴦ��monitor״̬�������ǰ�߳��ͷ�ͬ�����󣬾ͻ��ͷŸ�ͬ����
	 * @return
	 */
	public static LazySyncSingleton getInstance() {
		synchronized (LazySyncSingleton.class) {//�Ա���Ϊͬ����
			if(instance == null) {
				instance = new LazySyncSingleton();
			}
			return instance;
		}
	}
	
}
