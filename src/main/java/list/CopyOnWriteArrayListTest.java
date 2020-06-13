package list;

import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	List list=	new CopyOnWriteArrayList();//高并发用list,用于读多写少的并发场景。比如白名单，黑名单，
	list.add("");
System.out.println(list.size());
System.out.println(1<<2);
System.out.println(100>> 1);

Vector v=new Vector();
v.add("");


	}

}
