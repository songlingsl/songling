package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;









public class Invoke extends Thread{
	private List<String> allList=Collections.synchronizedList(new ArrayList());
	private static Invoke common=null;
	public static Invoke getInstance(){
		if(common==null){
			synchronized (Invoke.class) {
				if(common==null){
					common=new Invoke();
					common.start();
				}
			}
		}
		return common;
	}
	
	public void invokeProbeAndExe (String value){
		//List  list=map.get(client);
		//System.err.println("add任务list");
		allList.add(value);
	
	}
	@Override
	public void run(){
		while (true){
			if(allList.size()>0){
				 List list1=null;
				
				    list1 =allList;
				    System.err.println("unixshelll调用list1的大小"+list1.size()+"  allList"+allList.size());
				 
				    if(list1.size()!=allList.size()){
				    	 System.err.println("不相等的时候");
				    }
				    allList =  Collections.synchronizedList(new ArrayList());
				
				try {
					groupInvoke(list1);
				  // client.commonInvokeProbe(list1);
				   this.sleep(50);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}else{
				try {
					this.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		
			
		}
	}
	
	private void groupInvoke(List list){
		System.out.println("执行数："+list.size());
		try {
			this.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
