package outofmemoery;

import java.util.ArrayList;




public class TestHeapOverflow {  
  
   String s="d";  
   String  j ="kk";  
    public TestHeapOverflow(long nextLong) {
	s=s+nextLong;
	j=j+nextLong;
}
	public static void main(String[] args) {  
        ArrayList<TestHeapOverflow> list = new ArrayList<TestHeapOverflow>();  
  
        while (true) {  
            list.add(new TestHeapOverflow(22));
            System.out.println(".........");
        }  
    }  
  
}  