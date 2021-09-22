package day9_17;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;





public class Client {

	public static void main(String[] args) throws Exception {

		Socket s = new Socket("localhost", 8080);
		System.out.println("客户端发送请求到服务器");

		//客户端发送信息给服务器
		OutputStream out1=s.getOutputStream();
		DataOutputStream ds1=new DataOutputStream(out1);
		
		
		//客户端接收服务器发送的信息
		
		InputStream in1=s.getInputStream();
		
		DataInputStream ds3=new DataInputStream(in1);
		
		
		
		Scanner sc=new Scanner(System.in);
		
		while (true) {
			
			System.out.println("请输入信息");
			ds1.writeUTF(sc.nextLine());
			
			
			String severInfo=ds3.readUTF();
			
			System.out.println(severInfo);
			
			
			
		}

	}

}
