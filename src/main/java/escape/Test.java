package escape;

public class Test {

	public static void main(String[] args) {
		String s="aaa\007]2;xjnocjcw@222.83.19.166\033bbbaaa\007fdsfdsf]2;xjnocjcw@222.83.19.166\033gg";//\007BEL响铃的八进制码,\033ESC的八进制码
		s=s.replaceAll("\007[^\007^\033]+\033", "");
		 System.out.println("值"+s+"后");
		s="kkk\033[42D                                       \033[42Dffff";//去掉[42D                                       [42D
		s=s.replaceAll("\033\\[42D", "");
		 System.out.println("值"+s+"后");
	}

}
