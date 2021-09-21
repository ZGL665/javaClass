package day9_16;

public class Test2 implements Runnable {

	private Object lock1 = new Object();
	private int count = 0;

	@Override
	public void run() {

		System.out.println("��ǰ��" + Thread.currentThread().getName());

		// ������������߳�1���Ȼ����
		if (Thread.currentThread().getName().equals("�߳�1")) {

			synchronized (lock1) {

				while (true) {

					System.out.println(Thread.currentThread().getName()+"����������������"+count);

					try {
						Thread.sleep(200);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					count++;
					if (count == 20) {

						// ��count>100ʱ���߳�1�ͷ���,�ȴ�
						try {
							System.out.println("�߳�1�ͷ���,�ȴ�");
							lock1.wait(5000);
							System.out.println("�ȴ�����");
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					}

				}

			}

		} else {
			// ���������ʱ�߳�2,�߳�2�õ���

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			synchronized (lock1) {

				System.out.println(Thread.currentThread().getName() + "�õ���");
				//���ѵȴ�����
				lock1.notify();
				System.out.println("�����߳�1");
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				
			}

			System.out.println(Thread.currentThread().getName() + "�ͷ�����ִ�к���Ĵ���");
			
		}

		

	}

	public static void main(String[] args) {

		Test2 target = new Test2();

		Thread t1 = new Thread(target);

		t1.setName("�߳�1");

		Thread t2 = new Thread(target);
		t2.setName("�߳�2");

		t1.start();
		t2.start();

	}

}
