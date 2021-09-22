package day9_18;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Test1 {

	public static void main(String[] args) {

		/*
		 * try { InetAddress[] ads = InetAddress.getAllByName("www.baidu.com");
		 * 
		 * for (InetAddress address : ads) {
		 * 
		 * if (address.isReachable(10000)) { //测试再10秒内是否可到达
		 * 
		 * System.out.println(address.getHostAddress());
		 * System.out.println(address.getHostName());
		 * 
		 * }
		 * 
		 * }
		 * 
		 * } catch (Exception e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */

		System.out.println("=======================");

		String urlPath = "https://www.baidu.com";

		try {
			URL url = new URL(urlPath);
			System.out.println(url.getHost());
			System.out.println(url.getPath());
			System.out.println(url.getPort());
			System.out.println(url.getProtocol());

			URLConnection conn = url.openConnection();
			conn.connect();

			HttpURLConnection hc = (HttpURLConnection) conn;
			InputStream in = hc.getInputStream();

			InputStreamReader reader = new InputStreamReader(in, "utf-8");
			int data = reader.read();
			while (data != -1) {
				System.out.print((char) data);
				data = reader.read();
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
