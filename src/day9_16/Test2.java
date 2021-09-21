package day9_16;

public class Test2 implements Runnable {

	private Object lock1 = new Object();
	private int count = 0;

	@Override
	public void run() {

		System.out.println("当前是" + Thread.currentThread().getName());

		// 如果进来的是线程1，先获得锁
		if (Thread.currentThread().getName().equals("线程1")) {

			synchronized (lock1) {

				while (true) {

					System.out.println(Thread.currentThread().getName()+"————————"+count);

					try {
						Thread.sleep(200);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					count++;
					if (count == 20) {

						// 当count>100时，线程1释放锁,等待
						try {
							System.out.println("线程1释放锁,等待");
							lock1.wait(5000);
							System.out.println("等待结束");
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					}

				}

			}

		} else {
			// 否则进来的时线程2,线程2拿到锁

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			synchronized (lock1) {

				System.out.println(Thread.currentThread().getName() + "拿到锁");
				//唤醒等待的锁
				lock1.notify();
				System.out.println("唤醒线程1");
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				
			}

			System.out.println(Thread.currentThread().getName() + "释放锁，执行后面的代码");
			
		}

		

	}

	public static void main(String[] args) {

		Test2 target = new Test2();

		Thread t1 = new Thread(target);

		t1.setName("线程1");

		Thread t2 = new Thread(target);
		t2.setName("线程2");

		t1.start();
		t2.start();

	}

}
