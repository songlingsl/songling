package map;

import java.math.BigDecimal;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMap {
public static void main(String s[]){
	
	String aaa="444";
	String bbb=new String("444");
	
	
	System.out.println(aaa.hashCode());
	System.out.println(bbb.hashCode());// hashcode一样
	ConcurrentHashMap map=new ConcurrentHashMap();
	map.put(aaa, aaa);
	map.put(bbb, bbb);
	System.out.println(map.size());//map是用hashcode和equals一同判定是不是一个对象。而不是用真正的地址值
	System.out.println(map.get(aaa));
	System.out.println(map.get(bbb));
	
	Object o=map.putIfAbsent("444", "555");//相当于 if (!map.containsKey(key))
										// return map.put(key, value);
											//  else
											//  return map.get(key);
	
	System.out.println(map.get(aaa));
	System.out.println(o);
	 o=map.putIfAbsent("ddd", "555");
	 System.out.println(o);
}
}
