package map;

import java.util.*;

public class MapValue {
public static void main(String d[]){
	Map map=new HashMap();
	map.put("key", "value");
	Collection<String> c=map.values();
	for(String s:c){
		System.out.println(s);
	}
}
}
