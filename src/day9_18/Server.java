package day9_18;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {

		InputStream in =null;
		DataInputStream din =null;
		Socket s =null;
		
		ServerSocket ss=null;
		try {
			ss = new ServerSocket(8090);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

			System.out.println("�������ڶ˿ں�8090�����ͻ��˵�����");

			while (true) {
				try {
					 s = ss.accept();// socket����
					// ���������������
					 in = s.getInputStream();
					 din = new DataInputStream(in);

					System.out.println("��ӭ�ͻ���===" + s.getPort() + "===����"); // ��ӭ�ͻ�������
				} catch (Exception e) {
					// TODO: handle exception
				}
				

				while (true) {

					try {
						String info = din.readUTF(); // ����˶�ȡ���Կͻ��˵���Ϣ
						System.out.println("���Կͻ���===" + s.getPort() + "===����Ϣ===" + info);
					} catch (Exception e) {
						System.out.println("�˳�");
						break;
					}
					

				}

			}

		

	}

}
