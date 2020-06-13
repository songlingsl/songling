package list;

import java.util.*;

public class ArrayCompareLinked {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//List list= new ArrayList();  //
        List list= new LinkedList(); // 
		long start=System.currentTimeMillis();
		for(int i=0;i<1000000;i++){
			list.add(i+"");
		}
		System.out.println(System.currentTimeMillis()-start);//结果纯ADD用时array 比linked 用时略短

		//delete(list);
		//deleteIterator(list);
		queryDelete(list);
		
	}

	private static void queryDelete(List list) {
		long start=System.currentTimeMillis();
		 
		list.remove(1000);
		list.remove(10000);
		list.remove(100000);
		System.out.println(System.currentTimeMillis()-start);//都比较快，看不出时间差异
		
	}

	private static void deleteIterator(List list) {
		long start=System.currentTimeMillis();
		Iterator it=list.iterator();
		while(it.hasNext()){
			it.next();
			it.remove();
		}
		System.out.println(System.currentTimeMillis()-start);//迭代器用时
        //array用时太长，不能用，linkedlist可用 与 顺序删除用时相当
	}

	private static void delete(List list) {
		long start=System.currentTimeMillis();
		for(int i=(list.size()-1);i>=0;i--){
			list.remove(i);
		}
		
		System.out.println(System.currentTimeMillis()-start);//顺序移除 arraylist 用时短
	}
	
	

}
