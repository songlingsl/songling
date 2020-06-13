package map;

import java.util.*;

public class MapIterator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map map=new HashMap();
		map.put("11", "11");
		map.put("22", "22");
	    Iterator it=map.keySet().iterator();
	    System.out.println(map.size());
	    while(it.hasNext()){
	    	String key =(String)it.next();
	    	it.remove();//用迭代器移除
	    	//map.remove(key);//错误。
	    	
	    }
	    System.out.println(map.size());

	}

}
