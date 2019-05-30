package com.lovo.servlet.mybaits;

import org.junit.Test;

public class TBulider {
    @Test
    public  void  testBulider(){
        //创建构建者开始构建
        HeroBuilder hb=new VNBasicBulider();
        //生产者
        MakeHero mk =new MakeHero(hb);
        //开始构建
         mk.bulid();
         //获得对象
       Hero hero= mk.getHero();
        System.out.println(hero);

    }
}
