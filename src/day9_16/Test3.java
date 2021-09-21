package day9_16;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Test3 extends Thread {

	static int index = 0;

	@Override
	public void run() {
		System.out.println(
				Thread.currentThread().getName() + "————————" + Thread.currentThread().getThreadGroup().activeCount());

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		// 第一种
		/*
		 * ExecutorService exe = Executors.newCachedThreadPool();
		 * 
		 * System.out.println(exe.isShutdown());
		 * 
		 * exe.execute(new Test3()); exe.execute(new Test3()); exe.execute(new Test3());
		 * 
		 * System.out.println(exe.isShutdown());
		 */

		// 第二种
		/*
		 * ExecutorService exe=Executors.newFixedThreadPool(5);
		 * 
		 * 
		 * for (int i = 0; i < 15; i++) {
		 * 
		 * index=i; exe.execute(new Test3());
		 * 
		 * }
		 * 
		 * System.out.println(index);
		 * 
		 * exe.shutdown();
		 */

		// 第三种

		ScheduledExecutorService exe = Executors.newScheduledThreadPool(5);

		/*
		 * exe.schedule(new Test3(), 3, TimeUnit.SECONDS); exe.schedule(new Test3(), 3,
		 * TimeUnit.SECONDS); exe.schedule(new Test3(), 3, TimeUnit.SECONDS);
		 * 
		 */

		/*exe.scheduleWithFixedDelay(new Test3(), 1, 3, TimeUnit.SECONDS);
		exe.scheduleWithFixedDelay(new Test3(), 1, 3, TimeUnit.SECONDS);
		exe.scheduleWithFixedDelay(new Test3(), 1, 3, TimeUnit.SECONDS);*/
		//exe.shutdown();

		
		
		
		
		
	}

}
