package com.lovo.servlet.mybaits;

/**
 * 英雄的制作
 */
public class MakeHero {

    //聚合关系 持有接口 可以多态
    private  HeroBuilder heroBilder;

    public MakeHero(HeroBuilder heroBilder){
        this.heroBilder=heroBilder;
    }
    public void bulid(){
        heroBilder.buildPymbol();
        heroBilder.bulidKien();;
        heroBilder.bulidKill();
    }

    public Hero getHero() {
     return  heroBilder.createHero();
    }
}
