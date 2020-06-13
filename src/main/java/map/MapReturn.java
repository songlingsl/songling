package map;

import java.util.*;

public class MapReturn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map m=new HashMap();
        m.put("s","ss");
        m.put(1, "aa");
        m.put("1", 11);
        m.put(2, 2);
        
       System.out.println(m.get(2));
        
	}

}
