package day8_26;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Test8 {

	public static void main(String[] args) throws Exception {

		long start = System.currentTimeMillis();

		// 读取旧文件
		File file = new File("D:\\CloudMusic\\MV/a.mp4");
		InputStream in = new FileInputStream(file);
		// 写入新文件
		File file2 = new File("D:\\CloudMusic\\MV/a2.mp4");
		OutputStream out = new FileOutputStream(file2);

		byte[] buff = new byte[10];

		int i = 0;
		while ((i = in.read(buff)) != -1) {
			out.write(buff);
			out.flush();

		}
		in.read(buff);

		long end = System.currentTimeMillis();

		System.out.println("耗时：" + (end - start) / 1000);

		in.close();
		out.close();

	}

}
