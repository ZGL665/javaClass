package day9_14;

public class Test1 extends Thread {

	static int count = 0;

	// 重写run
	@Override
	public void run() {

		if (count < 5) {

			System.out.println("子线程" + Thread.currentThread().getName());

			if (Thread.currentThread().getName() == "线程1") {

				try {
					Thread.sleep(9999);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				count++;

			}
		}

	}

	public static void main(String[] args) throws InterruptedException {

		// 新建线程
		Thread t1 = new Test1();
		t1.setName("线程1");
		t1.start();

		while (true) {
			System.out.println(Thread.currentThread().getName());
			// 得到时间分片
			Thread.sleep(500);
			count++;
			
			System.out.println(count);
			

		}

	}

}
