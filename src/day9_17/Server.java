package day9_17;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {

		ServerSocket ss = new ServerSocket(8080);
		System.out.println("���������ڵȴ��ͻ��˵�����");

		Socket s = ss.accept(); // �������ӵ��ͻ��� �Ĳ��

		System.out.println("�ͻ���" + s.getPort() + "������");

		// ���������տͻ��˵�����
		InputStream in = s.getInputStream();
		DataInputStream ds = new DataInputStream(in);// �����������ת��Ϊ������

		
		//��������ͻ��˷���Ϣ
		OutputStream out2=s.getOutputStream();
		DataOutputStream ds2=new DataOutputStream(out2);
		
		
		
		String info = null;

		while ((info = ds.readUTF()) != null) {
			// ��ȡ�ͻ��˵���Ϣ�ַ���
			System.out.println("���Կͻ���---" + s.getPort() + "---��������=="+info+"===��ȡ����");

			
			
			ds2.writeUTF("�Ѿ����յ��ͻ��˵���Ϣ");
			
		}

	}

}
