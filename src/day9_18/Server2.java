package day9_18;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Server2 implements Runnable {

	DatagramSocket ds = null;

	public static void main(String[] args) throws Exception {

		Server2 t = new Server2();
		t.ds = new DatagramSocket(8080); // ��ȡ��ۣ����Ӷ˿ں�

		// �����߳�
		Thread t1 = new Thread(t);

		Thread t2 = new Thread(t);

		t1.start();
		t2.start();

	}

	@Override
	public void run() {

		while (true) {

			byte[] buf = new byte[10];// ����

			DatagramPacket dp = new DatagramPacket(buf, 10);// �������ݰ�

			System.out.println("���ڽ��տͻ�������");
			try {
				ds.receive(dp); // �����ȴ�
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(dp.getData() + "����" + dp.getPort());

		}

	}

}
