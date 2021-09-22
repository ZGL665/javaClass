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

			System.out.println("服务器在端口号8090监听客户端的连接");

			while (true) {
				try {
					 s = ss.accept();// socket监听
					// 服务端输入流接收
					 in = s.getInputStream();
					 din = new DataInputStream(in);

					System.out.println("欢迎客户端===" + s.getPort() + "===连接"); // 欢迎客户端连接
				} catch (Exception e) {
					// TODO: handle exception
				}
				

				while (true) {

					try {
						String info = din.readUTF(); // 服务端读取来自客户端的信息
						System.out.println("来自客户端===" + s.getPort() + "===的消息===" + info);
					} catch (Exception e) {
						System.out.println("退出");
						break;
					}
					

				}

			}

		

	}

}
