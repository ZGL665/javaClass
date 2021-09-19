package day9_14;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;

public class Test3 implements Callable {

	
	@Override
	public Object call() throws Exception {

		System.out.println(Thread.currentThread().getName()+"������");
		
		Thread.sleep(2000);
		
		return 100;
	}
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException {

		
		Test3 test3=new Test3();
		
		RunnableFuture<Integer>  target=new FutureTask<>(test3);
		
		Thread t1=new Thread(target,"�߳�1");
		
		t1.start();
		
		System.out.println("��ǰ���߳�"+Thread.currentThread().getName());
		
		Thread.sleep(2000);
		
		
		
		
		
		
		
		

	}



}
