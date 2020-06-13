package com.example.songling.foreach;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    @Test
    public void testForEach(){
         List<String> list=new ArrayList<String>();
        list.add("aa");
        list.add("bb");
         list.forEach(obj-> System.out.println(obj));
        list.forEach( System.out::println);//更简单

        list.stream().filter(v->v.equals("aa")).forEach(System.out::println);//过滤一下,没有了bb
//         for(String obj:list){
//             System.out.println(obj);
//         }

         Map<String,String> map= new HashMap();//迭代map,两个入参
        map.put("aaa","bbb");
         map.forEach((a,b)->{
             System.out.println(a);
             System.out.println(b);
         });

         //加入stream

        List<Aaa> lista=new ArrayList<>();
        Aaa aaa=new Aaa();
        lista.add(aaa);

        List<Bbb> listb=lista.stream().map(Bbb::new).collect(Collectors.toList());//新的对象list
        listb.forEach(v-> System.out.println(v.name));


    }
}
