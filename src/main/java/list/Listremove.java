package list;

import java.util.*;

public class Listremove {

	
	
	public static void main(String s[]){
		List<String> abc=new ArrayList<String>();
		abc.add("a");
		abc.add("b");
		abc.add("c");
		abc.add("d");
		//错误的处理。。i会增加
//		for(int i=0;i<abc.size();i++){
//			abc.remove(i);
//		}
//		for(int i=0;i<abc.size();i++){
//			System.out.println(abc.get(i).toString());
//		}
		//对的处理一
//		
//		while(!abc.isEmpty()){
//			abc.remove(0);
//		}
//		for(int i=0;i<abc.size();i++){
//			System.out.println(abc.get(i).toString());
//		}
		
		
        //对的处理二
		Iterator it=abc.iterator();
		while (it.hasNext()){
		 it.next();
		 it.remove();
		}
		
		for(int i=0;i<abc.size();i++){
			System.out.println(abc.get(i).toString());
		}
	}
}
