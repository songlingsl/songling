package synchronize;

public class Test extends Thread{
	
	
	
	public static void main(String[] args) {
		
		
		for(int i=0;i<3;i++){
			Test t=new Test();
			t.start();
		}
		
		
		
	}
	@Override
	public void run (){
		String s="ss";//以对内存的那个值作为synchronized
		
		synchronized(s){//线程共同用一个S对象，synchronized生效
		//synchronized(Test.class){//线程访问同样的类，synchronized生效
		//	synchronized(this){//同步this，synchronized失效。每个线程一个this
			System.out.println("打印了。。。。");
			s="bb";
			try {
				Thread.sleep(5000L);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		
		
	}
	
	
	
	public void abc(){
		
		
	}
	}
	
