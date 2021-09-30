package day9_18;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Server2 implements Runnable {

	DatagramSocket ds = null;

	public static void main(String[] args) throws Exception {

		Server2 t = new Server2();
		t.ds = new DatagramSocket(8080); // 获取插槽，连接端口号

		// 创建线程
		Thread t1 = new Thread(t);

		Thread t2 = new Thread(t);

		t1.start();
		t2.start();

	}

	@Override
	public void run() {

		while (true) {

			byte[] buf = new byte[10];// 缓存

			DatagramPacket dp = new DatagramPacket(buf, 10);// 放入数据包

			System.out.println("正在接收客户端数据");
			try {
				ds.receive(dp); // 阻塞等待
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(dp.getData() + "来自" + dp.getPort());

		}

	}

}
