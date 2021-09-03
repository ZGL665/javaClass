package Day8_27;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Test4 {

	public static void main(String[] args) {

		// 实例化实现类ArrayList
		List c = new ArrayList();

		System.out.println(c);

		System.out.println(c.isEmpty());
		System.out.println(c.size());
		System.out.println(c.toString());
		System.out.println("=====上面的为空=====");

		c.add(100);
		c.add(true);
		c.add("bwf");
		c.add(new User());

		c.add(1, "51testing");// 指定位置添加元素

		System.out.println(c.isEmpty());
		System.out.println(c.size());
		System.out.println(c.toString());

		// c.clear();
		// System.out.println(c);

		System.out.println(c.contains("bwf2"));

		c.remove("bwf");
		System.out.println(c);
		c.remove(new User());

		Object[] array = c.toArray();

		System.out.println(array.length);
		System.out.println("数组中的值");

		for (Object object : array) {

			System.out.println(object);

		}

		System.out.println("子接口List指定位置添加");
		System.out.println(c);

		System.out.println("============根据下标打印对应的元素=============");

		System.out.println(c.get(0));
		System.out.println(c.get(1));
		System.out.println(c.get(2));
		System.out.println(c.get(3));

		System.out.println("============通过循环打印=============");

		for (int i = 0; i < c.size(); i++) {

			Object obj = c.get(i);
			System.out.println(obj);

		}

		/*
		 * List list1=new ArrayList();
		 * 
		 * for (int i = 0; i < 20; i++) {
		 * 
		 * list1.add(i);
		 * 
		 * }
		 * 
		 * System.out.println(list1);
		 */

		c.set(2, "wangwu");

		System.out.println(c);

		c.set(3, 100);

		System.out.println(c);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
