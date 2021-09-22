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
		System.out.println("服务器正在等待客户端的请求");

		Socket s = ss.accept(); // 监听连接到客户端 的插槽

		System.out.println("客户端" + s.getPort() + "过来了");

		// 输入流接收客户端的数据
		InputStream in = s.getInputStream();
		DataInputStream ds = new DataInputStream(in);// 服务端输入流转化为数据流

		
		//输出流给客户端发信息
		OutputStream out2=s.getOutputStream();
		DataOutputStream ds2=new DataOutputStream(out2);
		
		
		
		String info = null;

		while ((info = ds.readUTF()) != null) {
			// 读取客户端的信息字符串
			System.out.println("来自客户端---" + s.getPort() + "---的数据是=="+info+"===读取结束");

			
			
			ds2.writeUTF("已经接收到客户端的信息");
			
		}

	}

}
