package day9_18;

import java.lang.reflect.Field;
import java.util.Properties;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) throws Exception {

		Class c1=User.class;//静态获取class类
		
		User u=new User();//普通方法实例化对象
		System.out.println(u.name);
		System.out.println(u.age);
		//System.out.println(u.id);
		
	
		
		Properties pro=new Properties();
		
		pro.load(Test3.class.getResourceAsStream("obj.properties"));
		
		
		
		User user=(User) Class.forName(pro.getProperty("user")).newInstance();
		
		
		Field f1=c1.getDeclaredField("name"); //获取name字段
		
		System.out.println(f1.get(u));        //name字段是u的
		System.out.println("=============");
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入属性值。。。。。");
		String fieldName="age";
		
		f1=c1.getDeclaredField(fieldName);
		
	/*	u.name="zhangsan";//普通设置
		System.out.println("普通设置"+f1.get(u));*/
		
		
		/*f1.set(u, "lisi");  //反射设置
		System.out.println("反射设置name"+f1.get(u));*/
	
		
		f1.set(u, 22);
		System.out.println("反射设置age"+f1.get(u));
		
		System.out.println("========私有的=========");
		
		//System.out.println(u.id);
		
	}

}
