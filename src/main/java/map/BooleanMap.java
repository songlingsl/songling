package map;

import java.util.HashMap;
import java.util.Map;

public class BooleanMap {
public static void main(String s[]){
	Map map=new HashMap();
	map.put("a", true);
	
	map.get("a");
	System.out.println((Boolean)map.get("a"));
	
}
}
