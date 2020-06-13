package synchronize;

import java.util.*;

public class TestLock extends Thread{
	private static String aa="q";
	private static String bb="q";
	public String flag="";
	static TestLock t=new TestLock();
	@Override
	public void run(){
		System.out.println("stop aaa");
//		synchronized (aa) {
			
//			System.out.println("aaaaaa.....");
//			try {
//				this.sleep(10000l);
//			
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			
			
			if(flag.equals("1")){
				System.out.println("调用t.aaa()");
				t.aaa();
				
			}else{
				System.out.println("调用t.bbb()");
				t.bbb();
			}
		}
		
	
	
	public synchronized void aaa(){//aaa方法与bbb方法，在执行时候是互斥的，相当于synchronized(this)，线程安全
		System.out.println("aaa");
		try {
			sleep(5000L);
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("aaa结束");
	}
	
	public  synchronized void bbb(){//加了staitc才对所有线程起作用，去掉staitc；相当于对synchronized(this)；
		System.out.println("bbb");
		try {
			sleep(5000L);
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("bbb结束");
	}
	
	public static void main(String[] args) {
	
		
		TestLock t1=new TestLock();
		t1.start();
		t1=new TestLock();
		t1.flag="1";
		t1.start();
		
//		
//		t1=new TestLock();
//		t1.start();
//		t1.flag="1";
		
//		Testa t2=new TestLock(). new Testa();
//		t2.start();
//		t1=new TestLock();
//		t1.start();
//		t2=new TestLock(). new Testa();
//		t2.start();
//		 if(aa.equals("")){
//			 System.out.println("空");
//		 }
	
		
	}
	
	
	class Testa extends Thread{
		@Override
		public void run(){
			System.out.println("stop bbb");
			synchronized (aa) {

				System.out.println("bbbbbb.....");
			
			}
			
			
		}
		public void synMethod(){
			System.out.println("bbbbsynMetho+synMethod");
			
		}
		
	}
}
