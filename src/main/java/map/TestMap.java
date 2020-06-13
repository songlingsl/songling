package map;

import java.util.HashMap;

public class TestMap {

	
	public static void main (String s[]){
		HashMap map= new HashMap();
		map.remove("key");//不会报错
		map.put("key", "");
		System.out.println(map.size());
		map.remove("key");
		System.out.println(map.size());
		
		TestMap ss=(TestMap)(map.get("key"));//不会报错
		System.out.println(ss);
	}
	
}
