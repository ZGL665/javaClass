package day9_14;

public class Test2 implements Runnable {

	public static void main(String[] args) {

		Test2 test2 = new Test2();
		//Ŀ��test2
		Thread t1 = new Thread(test2, "�߳�1");

		Thread t2 = new Thread(test2, "�߳�2");

		t1.start();

		t2.start();

		// t1.run();

		// t2.run();

	}

	@Override
	public void run() {

		while (true) {

			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
