package HashAndMap;

public class CompareObj {
        String s="";
        @Override
        public int hashCode() {
        	
        	System.out.println("调用hashcode比较"+s);
        	
        	return s.hashCode();
        }
	@Override
        public boolean equals(Object anObject) {
        	CompareObj obj=(CompareObj)anObject;
        	System.out.println("调用equals比较");
        	if(s.hashCode()==obj.getS().hashCode()){
        		return true;
        	}else{
        		return false;
        	}
        		
        }
		public String getS() {
			return s;
		}
		public void setS(String s) {
			this.s = s;
		}
        
}
