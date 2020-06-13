package HashAndMap;

import java.util.*;

public class TestMap {
	public String a = "aa";
	private String b;

	/**
	 * 测试hashmap与hashtable中对象的值变化对另一处引用的影响
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, TestMap> mapa = new Hashtable<String, TestMap>();
		Map<String, TestMap> mapb = new Hashtable<String, TestMap>();
		TestMap test = new TestMap();
		mapa.put("a", test);
		mapb.put("b", test);
		System.out.println(mapa);
		System.out.println(mapb);
		TestMap testa = mapa.get("a");
		testa.setB("bbb");
		TestMap testb = mapb.get("b");
		System.out.println(testa);
		System.out.println(testb);
		System.out.println(testb.getB());
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

}
