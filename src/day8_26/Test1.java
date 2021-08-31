package day8_26;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Files;

public class Test1 {

	public static void main(String[] args) throws IOException {
		// 整个项目的根路径
		System.out.println(System.getProperty("user.dir"));

		// 字节码根目录 bin
		System.out.println(Test1.class.getResource("/"));

		// 当前文件的目录,相对路径
		System.out.println(Test1.class.getResource(""));

		// 默认是项目的根路径
		System.out.println("");

		System.out.println("================");
		File f = new File("a.txt");
		System.out.println(f.getPath()); // 相对路径
		System.out.println(f.getAbsolutePath());// 绝对路径

		System.out.println(f.exists());

		System.out.println("========================");

		String path = "D:/myfiles/a.txt";
		File f1 = new File(path);
		System.out.println(f1.exists());
		System.out.println(f1.isDirectory());
		System.out.println(f1.isFile());
		System.out.println(f1.isAbsolute());
		System.out.println(f1.isHidden());
		System.out.println(f1.canExecute());
		System.out.println(f1.canRead());
		System.out.println(f1.canWrite());

		System.out.println(f1.getName());
		System.out.println(f1.getParent());
		System.out.println(f1.length());

		File f2 = new File("D:/myfiles/a2.txt");
		f1.renameTo(f2);

		File f3 = new File("D:/myfiles/a3.txt");
		f2.renameTo(f3);

		System.out.println(f3.getName());

		path = "D:/myfiles/a3.txt";

		f3.deleteOnExit();

		File f4 = new File("D:/myfiles/a4.txt");
		System.out.println(f4.exists());
		f4.createNewFile();

		System.out.println("======操作目录======");

		File f5 = new File("D:/myfiles/a");
		System.out.println(f5.exists());
		System.out.println(f5.getName());
		System.out.println(f5.isDirectory());
		System.out.println(f5.isFile());
		// System.out.println(f5.length());
		// System.out.println(f5.listFiles().length);
		System.out.println(f5.list().length);
		for (String n : f5.list()) {

			System.out.println(n);

		}

		System.out.println(f5.listFiles().length);
		for (File name : f5.listFiles()) {

			System.out.println(name);

		}

		File f6 = new File("D:/myfiles/b");
		f6.delete();

		path = "D:/myfiles/b";
		File f7 = new File(path);
		f7.mkdir();

		System.out.println("======文件过滤器=======");

		// 匿名内部类
		File[] files = f7.listFiles(new FileFilter() {

			@Override
			public boolean accept(File f) {

				if (f.getName().contains("k") && f.getName().endsWith(".txt")) {

					return true;

				}
				return false;

			}
		});
		System.out.println(files.length);

	}

}
