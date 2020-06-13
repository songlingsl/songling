package synchronize;

public class TestThread extends Thread{
public static void main (String s[]){
	
	
	
	for(int i=0;i<20;i++){
		TestThread tt1=new TestThread();
		tt1.start();
	}
	
}

@Override
public void run(){
	System.out.println("开始");
	synchronized (TestThread.class) {
		try{
		String ss="";
		//ss.substring(67);
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
	}
	System.out.println("结束");
}
}
