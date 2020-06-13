package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List list= new ArrayList();
		list.add("");
		list.add("a"); 
		List list1=list;
		list= new ArrayList();
		System.out.println("c"+list1.get(1));
		System.out.println("c1"+list.size());

	}

}
