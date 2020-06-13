import java.util.*;


public class NullConvert {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map map=new HashMap();
	    String s=(String)map.get("a");
        System.out.println("空可以强制转化");
        s=null;
        String sgg=s;
        System.out.println(sgg+"空可以加");
        
	}

}
