package by.academy;

import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

public class TestRunner extends BlockJUnit4ClassRunner {
	private TestListener listener;

	public TestRunner(Class<TestListener> clz) throws InitializationError {
		super(clz);
		listener = new TestListener();
	}
	@Override
	public void run(final RunNotifier notifier) {
		notifier.addListener(listener);
		super.run(notifier);
	}
}
