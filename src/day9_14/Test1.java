package day9_14;

public class Test1 extends Thread {

	static int count = 0;

	// ��дrun
	@Override
	public void run() {

		if (count < 5) {

			System.out.println("���߳�" + Thread.currentThread().getName());

			if (Thread.currentThread().getName() == "�߳�1") {

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

		// �½��߳�
		Thread t1 = new Test1();
		t1.setName("�߳�1");
		t1.start();

		while (true) {
			System.out.println(Thread.currentThread().getName());
			// �õ�ʱ���Ƭ
			Thread.sleep(500);
			count++;
			
			System.out.println(count);
			

		}

	}

}
