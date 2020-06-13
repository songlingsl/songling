package com.example.songling.arrow;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Main {

    @Test
    public void testArrow(){
//        return new Runnable(){
//            @Override
//            public void run() {
//                System.out.println("fff");
//            }
//        };
        // () -> System.out.println("fff");//与上面效果一样


    }

    @Test
    public void testArrow1(){
//
//       return   new InterfaceTest(){//两个接口无法用lamda表达式,一个接口就用@FunctionalInterface注解，runable
//
//
//           @Override
//           public void aaa(Integer i) {
//               System.out.println("aa");
//           }
//
//           @Override
//           public void bbb(String a) {
//
//           }
//       };


    }

    @Test
    public void testThread(){

//        new Thread(){
//            public void run(){
//                System.out.println("kk");
//            }
//        }.start();
        new Thread(() -> System.out.println("线程启动")).start();
        new Thread(Main::haha).start();

        List<String> cities = Arrays.asList("Milan", "London", "New York", "San Francisco");
        String citiesCommaSeparated = String.join(",", cities);
        System.out.println(citiesCommaSeparated);


    }

    static public void haha(){
        //只要方法参数一样就可以当FunctionalInterface接口的方法
        System.out.println("线程启动ka");
    }
}
