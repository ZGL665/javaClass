package day9_18;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws Exception {

		Socket s = new Socket("localhost", 8090);

		// 客户端输出流输出，服务端接收
		OutputStream out1 = s.getOutputStream();
		DataOutputStream dout1 = new DataOutputStream(out1);

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("请输入消息");
			dout1.writeUTF(sc.nextLine()); // 客户端写入消息

		}

	}

}
