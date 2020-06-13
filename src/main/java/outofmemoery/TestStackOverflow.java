package outofmemoery;

//什么时候会让Java Method Stack栈溢出？栈的基本特点就是FILO（First In Last Out）,如果in的太多而out的太少，就可能overflow了。
//而Java Method Statck的功能就是保存每一次函数调用时的“现场”，即为入栈，函数返回对应出栈，所以函数的调用深度越大，栈就变得越大，足够大的时候就会溢出。
//所以模拟Java Method Stack溢出，只要不断递归调用某一函数就可以导致溢出。

public class TestStackOverflow {  
    private int stackLength = 0;  
  
    public void stackOverFlow(){  
        ++stackLength;  
        stackOverFlow();  
    }  
  
    public static void main(String[] args){  
        TestStackOverflow test = new TestStackOverflow();  
        try {  
            test.stackOverFlow();  
        } catch (Throwable e) {  
            System.out.println("Stack Length:" + test.stackLength);  
            e.printStackTrace();  
        }  
    }  
  
}  
