package classloader;



public class Test {
	public static void main(String[] args) throws Exception {
		System.out.println(System.getProperty("java.version"));;
		System.out.println(System.getProperty("java.class.path"));;
		System.out.println(System.getProperty("java.class.version"));;
		System.out.println(System.class.getClassLoader());//由bootstrap classloader加载，它并不是一个真正的实例，所以是null。它加载JRE里自带的类
		//sun.misc.Launcher$AppClassLoader acl=(sun.misc.Launcher$AppClassLoader)Test.class.getClassLoader();
		
		System.out.println(Test.class.getClassLoader());//由AppClassLoader加载，它是system classloader的实例。它读取classpath下的类
	
		System.out.println(Test.class.getClassLoader().getParent());
		//URL[] u=sun.misc.Launcher.getBootstrapClassPath().getURLs();
		
//		for(int i=0;i<u.length;i++){
//			System.out.println(u[i]);
//		}
       
	}
	
}
