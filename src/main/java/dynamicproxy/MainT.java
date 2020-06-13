package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MainT {

	public static void main(String[] args) {
		 //创建一个实例对象，这个对象是被代理的对象
        Subject sub = new RealSubject();
        
        //具体处理对象
        InvocationHandler stuHandler = new MyDynamicProxy<Subject>(sub);
        
        //一个真正实现了接口Subject的代理对象，改对象会执行具体处理对象
        Subject stuProxy = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(), new Class<?>[]{Subject.class}, stuHandler);

       //就是拦截了每个方法执行
        stuProxy.hello("sl");
        
        stuProxy.rent();
	}

}
