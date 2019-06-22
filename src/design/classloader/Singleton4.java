package design.classloader;


/**
 * ����-�������ģʽ-��̬�ڲ���
 * ��֤�˰�ȫ�ֱ�֤������
 * @author lq
 *
 */
public class Singleton4 {
	
	//1.˽�л�������;
	private Singleton4() {
		
	}
	
	public static class LazyHolder {
		//final��ֹ��̬�ڲ����������,��CgLib��Ҳ�����¸�INSTANCE��ֵ���鷳��
		private static final Singleton4 INSTANCE = new Singleton4();
	}
	
	//3.final��ֹ����д
	public static final Singleton4 getInstance() {
		return LazyHolder.INSTANCE;
	}
}
