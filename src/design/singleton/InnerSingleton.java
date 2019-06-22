package design.singleton;

/**
 * �ŵ㣺
 * 	�Ƚ���˶���ģʽ���˷��ڴ��ȱ��
 * 	�ֽ��������ģʽ���̲߳���ȫ����
 * ȱ�㣺
 * 	ͨ�������ܹ��ƻ�ֻ����һ��ʵ�����ص�.
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
