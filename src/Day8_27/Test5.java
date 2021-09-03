package Day8_27;

import java.util.LinkedList;
import java.util.List;

public class Test5 {

	public static void main(String[] args) {

		LinkedList list=new LinkedList();

			list.add(0, "zhangsan");
			list.add(1, "lisi");
			list.add(2, "wangwu");
			list.addFirst("aaa");
			list.addLast("bbb");
			list.remove(2);
			list.push("bwf");
			list.pop();
			
			System.out.println(list);

	}

}
