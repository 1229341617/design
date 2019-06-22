package design.prototype;

import org.junit.Test;

public class ConcreatePrototypeTest {

	@Test
	public void testClone() throws Exception {
		ConcreatePrototype cctype = new ConcreatePrototype();
		
		Thread.currentThread().sleep(3000);
		
		ConcreatePrototype copy = (ConcreatePrototype)cctype.clone();
		
		System.out.println("基本类型-age:" + (cctype.getAge() == copy.getAge()) );
		System.out.println("基本类型-name:" + (cctype.getName() == copy.getName()));
		System.out.println("引用-date:" + (cctype.getCurrdate() == copy.getCurrdate()));
		System.out.println("对象:" + (cctype == copy) );
		System.out.println("引用-list:" + (cctype.getList() == copy.getList()));
		System.out.println("------------------");
		System.out.println(cctype.getCurrdate());
		System.out.println(copy.getCurrdate());
	}
}
