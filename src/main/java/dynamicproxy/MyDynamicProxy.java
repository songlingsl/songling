package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyDynamicProxy<T> implements InvocationHandler{
	
		   //invocationHandler持有的被代理对象
		    T target;
		    
		    public MyDynamicProxy(T target) {
		       this.target = target;
		    }
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("方法前");
	        Object result = method.invoke(target, args);
	        System.out.println("方法后");
	        return result;
	}

}
