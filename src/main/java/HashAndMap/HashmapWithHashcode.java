package HashAndMap;

import java.util.*;

public class HashmapWithHashcode {


	//1：Object类的hashCode.返回对象的内存地址经过处理后的结构，由于每个对象的内存地址都不一样，所以哈希码也不一样。
	//	2：String类的hashCode.根据String类包含的字符串的内容，根据一种特殊算法返回哈希码，只要字符串所在的堆空间相同，返回的哈希码也相同。
	//3：Integer类，返回的哈希码就是Integer对象里所包含的那个整数的数值，例如Integer i1=new Integer(100),i1.hashCode的值就是100 。由此可见，2个一样大小的Integer对象，返回的哈希码也一样。
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map map= new HashMap();
		CompareObj obj1=new CompareObj();
		obj1.setS("ss");
		map.put(obj1, "a");
		System.out.println(map.size());;
		CompareObj obj2=new CompareObj();
		obj2.setS("ss");
		map.put(obj2, "b");
		System.out.println(map.size());;
	}

}
