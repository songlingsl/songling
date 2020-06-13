package com.example.songling.foreach;

import lombok.Getter;
import lombok.Setter;

public class Bbb {
    @Getter
    @Setter
    String name="sl1";
    @Getter
    @Setter
    String add="地址1";
    public Bbb(Aaa aaa){
        this.name=aaa.name;
    }
}
