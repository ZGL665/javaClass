package day9_14;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;

public class Test3 implements Callable {

	
	@Override
	public Object call() throws Exception {

		System.out.println(Thread.currentThread().getName()+"被调用");
		
		Thread.sleep(2000);
		
		return 100;
	}
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException {

		
		Test3 test3=new Test3();
		
		RunnableFuture<Integer>  target=new FutureTask<>(test3);
		
		Thread t1=new Thread(target,"线程1");
		
		t1.start();
		
		System.out.println("当前主线程"+Thread.currentThread().getName());
		
		Thread.sleep(2000);
		
		
		
		
		
		
		
		

	}



}
