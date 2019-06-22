package design.delegate;

import org.junit.Test;

public class DispatcherTest {

	@Test
	public void testDoing() {
		new Dispatcher(new ExecutorA()).doing();
		new Dispatcher(new ExecutorB()).doing();
	}
}
