package design.singleton;

/**
 * ����-����-���
 * 
 * ȱ��:�̲߳���ȫ
 * @author lq
 *
 */
public class LazySimpleSingleton {
	
	private static LazySimpleSingleton instance;
	
	private LazySimpleSingleton() {
		
	}
	
	/**
	 * �̲߳���ȫ,��ʱ���������������
	 * 	1.�������;
	 * 	2.����ж���߳�ͬʱ����if�ж�,��ͬʱ����if�ڲ�
	 * 		���û���ظ�instance�ķ���,���Ӧ���Ƕ��ʵ��;
	 * 		����ظ�instance�ķ���,���Ӧ���Ƕ����ͬ��ʵ��,�Ҷ�Ϊ���һ��new���Ǹ�ʵ��;
	 * @return
	 */
	public static LazySimpleSingleton getInstance() {
		if(instance == null) {
			instance = new LazySimpleSingleton();
		}
		return instance;
	}
}
