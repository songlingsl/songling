package dynamicproxy;

public class RealSubject implements Subject
{
    @Override
    public void rent()
    {
        System.out.println("I want to rent my 屋子");
    }
    
    @Override
    public void hello(String str)
    {
        System.out.println("hello: " + str);
    }
}