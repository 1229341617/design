package design.singleton;

/**
 * 
 * ����-����
 * 
 * ������ع��̵�׼���׶Σ����Ѿ���ʼ������instance
 * ȱ��:�˷��ڴ�
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