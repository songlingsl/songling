package map;

import java.util.HashMap;
import java.util.Map;

public class MapCount {

	public static void main(String[] args) {
		//测试map可以放置的数据量
		for(int i=0;i<50;i++){
			Map map=new HashMap();
			for(int j=0;j<500000;j++){
			    System.out.println("放置"+i+"    "+j);
				map.put(i+j, i+j+"d"+i+j);
			}
			
			
		}

	}

}
