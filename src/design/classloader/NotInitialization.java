package design.classloader;

public class NotInitialization {

	public static void main(String[] args) {
		/**
		 * ��������
		 */
//		new SuperClass();//new
//		System.out.println(SubClass.value);//getstatic
//		SubClass.value = 2;//putstatic
//		SuperClass.printValue();//invokestatic

		/**
		 * ��������
		 */
//		System.out.println(SubClass.value);///���౻��ʼ����SubClassδ��ʼ��
//		SuperClass[] arr = new SuperClass[0];//SuperClassδ��ʼ��
//		System.out.println(SubClass.fvalue);//����final���εı���Ҳ�����ʼ��
	}
}
