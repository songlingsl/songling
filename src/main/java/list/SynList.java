package list;

public class SynList extends Thread{
	int value=0;
	public SynList(int i){
		value=i;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i=1;i<5;i++){
			
			 for(int j=0;j<i*1000;j++){
					
					new SynList(i).start();
			}
		}
		
      
     

	}
	@Override
	public void run(){
		Invoke.getInstance().invokeProbeAndExe("value："+value);
		
	}

}
