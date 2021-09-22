package day9_17;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;

public class Test1 {

	public static void main(String[] args) {

		try {
			InetAddress ads = InetAddress.getLocalHost();

			System.out.println(ads);
			System.out.println(ads.getCanonicalHostName());
			System.out.println(ads.getAddress());
			System.out.println(ads.isReachable(10));

			ads = InetAddress.getByName("www.baidu.com");

			System.out.println(ads);
			System.out.println("===================");
			String path = "http://www.baidu.com/s?wd=java";
			URL url = new URL(path);
			System.out.println(url);
			
			System.out.println(url.getPath());
			System.out.println(url.getHost());
			System.out.println(url.getPort());
			System.out.println(url.getProtocol());
			
			System.out.println(url.getDefaultPort());
			
			System.out.println(url.getFile());
			System.out.println(url.getContent());
			System.out.println(url.getQuery());

			URLConnection conn=url.openConnection();
			InputStream in=	conn.getInputStream();
			
			System.out.println(in.available());
			
			Reader reader=new InputStreamReader(in);
			
			
			
			
			
		
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
