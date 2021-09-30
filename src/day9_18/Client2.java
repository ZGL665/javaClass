package day9_18;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class Client2 {

	public static void main(String[] args) throws Exception {

		DatagramSocket ds = new DatagramSocket();

		System.out.println(ds.getLocalPort());

		
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入消息");
		
		
		String info = "hello";
		InetAddress address = InetAddress.getByName("localhost");

		DatagramPacket dp = new DatagramPacket(info.getBytes(), info.getBytes().length, address, 8080);

		ds.send(dp);  //发送数据包
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
