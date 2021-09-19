package day9_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(2);
		list.add(4);
		list.add(1);
		list.add(3);
		list.add(5);

		System.out.println(list);

		/*Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {

				return o2 - o1;
			}

		});*/
		
		Collections.sort(list,(Integer o1, Integer o2)->{ return o2 - o1; });

		System.out.println(list);

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
