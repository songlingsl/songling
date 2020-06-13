package lock;

import java.util.concurrent.locks.*;

public class ReentranLockTest extends Thread{
	public static	Lock  lock=new ReentrantLock();//作用类似syncrize
	public static	int  i=0;
	public static void main(String s[]){
	
		
		for(int i=0;i<10;i++){
			ReentranLockTest ren=new ReentranLockTest();
			ren.start();
		}
	}
	@Override
	public void run(){
		System.out.println("前"+i);
		lock.lock();
		
		try {
			sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i++;
	   lock.unlock();
	   System.out.println("后"+i);
	}
	
	

}
