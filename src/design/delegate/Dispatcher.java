package design.delegate;

public class Dispatcher implements IExecutor {
	private IExecutor executor;
	
	
	public Dispatcher(IExecutor executor) {
		this.executor = executor;
	}

	@Override
	public void doing() {
		executor.doing();
	}

}
