package day9_16;

public class Counter {

	private Object lock1 = new Object();

	private Object lock2 = new Object();

	public void show1() {

		synchronized (lock1) {

			System.out.println(Thread.currentThread().getName()+"�õ���1 ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			synchronized (lock2) {

				System.out.println(Thread.currentThread().getName()+"�õ���2 ");
				
			}

		}

		System.out.println(Thread.currentThread().getName()+"�����");
		
	}

	public void show2() {

		
		
		
		synchronized (lock2) {

			System.out.println(Thread.currentThread().getName()+"�õ���2 ");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			synchronized (lock1) {

				System.out.println(Thread.currentThread().getName()+"�õ���1 ");
				
			}

		}

		System.out.println(Thread.currentThread().getName()+"�����");
		
		
	}

	public static void main(String[] args) {

		
		
		
	}

}
