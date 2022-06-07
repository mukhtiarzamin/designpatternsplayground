/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AsynchMethods;

/**
 *
 * @author Mukhtiar
 */
public class Demo {


	/**
	 * Program entry point.
	 */
	public static void main(String[] args) throws Exception {
		// construct a new executor that will run async tasks
		AsyncExecutor executor = new ThreadAsyncExecutor();

		// start few async tasks with varying processing times, two last with callback handlers
		final AsyncResult<Integer> asyncResult1 = executor.startProcess(lazyval(10, 500));
		final AsyncResult<String> asyncResult2 = executor.startProcess(lazyval("test", 300));
		final AsyncResult<Long> asyncResult3 = executor.startProcess(lazyval(50L, 700));
		final AsyncResult<Integer> asyncResult4 =
				executor.startProcess(lazyval(20, 400), callback("Callback result 4"));
		final AsyncResult<String> asyncResult5 =
				executor.startProcess(lazyval("callback", 600), callback("Callback result 5"));

		// emulate processing in the current thread while async tasks are running in their own threads
		Thread.sleep(350); 
		System.out.println("Some hard work done");

		// wait for completion of the tasks
		final Integer result1 = executor.endProcess(asyncResult1);
		final String result2 = executor.endProcess(asyncResult2);
		final Long result3 = executor.endProcess(asyncResult3);
		asyncResult4.await();
		asyncResult5.await();

		// log the results of the tasks, callbacks log immediately when complete
		System.out.println("Result 1: " + result1);
		System.out.println("Result 2: " + result2);
		System.out.println("Result 3: " + result3);
	}

	/**
	 * Creates a callable that lazily evaluates to given value with artificial delay.
	 *
	 * @param value       value to evaluate
	 * @param delayMillis artificial delay in milliseconds
	 * @return new callable for lazy evaluation
	 */
	private static <T> Callable<T> lazyval(T value, long delayMillis) {
		return () -> {
			Thread.sleep(delayMillis);
			System.out.println("Task completed with: " + value);
			return value;
		};
	}

	/**
	 * Creates a simple callback that logs the complete status of the async result.
	 *
	 * @param name callback name
	 * @return new async callback
	 */
	private static <T> AsyncCallback<T> callback(String name) {
		return (value, ex) -> {
			if (ex.isPresent()) {
				System.out.println(name + " failed: " + ex.map(Exception::getMessage).orElse(""));
			} else {
				System.out.println(name + ": " + value);
			}
		};
	}
