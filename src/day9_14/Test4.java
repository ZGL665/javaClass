package day9_14;

public class Test4 extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {

			System.out.println("子线程" + Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Test4();
		t1.setName("线程1");
		t1.start();
		
		Thread t2 = new Test4();
		t2.setName("线程2");
		t2.start();

		System.out.println(Thread.currentThread().getName());
		
		t1.join();
		t2.join();
		System.out.println("程序结束");
		
	}

}
