package day9_14;

public class Test5 extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 999; i++) {
			System.out.println("��ǰ�߳�" + Thread.currentThread().getName());

			if (isInterrupted()) {

				return;

			}else {
				
				System.out.println(i);
			}

		}

	}

	public static void main(String[] args) {

		Thread t1 = new Test5();

		t1.start();

		
		t1.interrupt();

		
		for (int i = 0; i <400; i++) {
			System.out.println("���߳�"+Thread.currentThread().getName());
			

			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		

		}

	}

}
