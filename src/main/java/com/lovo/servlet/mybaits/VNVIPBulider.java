package com.lovo.servlet.mybaits;

/**
 * 构建VIP版本的VN
 */
public class VNVIPBulider implements HeroBuilder{
    //持有英雄
    Hero h=new Hero();

    @Override
    public void buildPymbol() {
        h.setPymbol("全暴击铭文");
    }

    @Override
    public void bulidKill() {
        h.setKill("终极大招");
    }

    @Override
    public void bulidKien() {
        h.setKien("烈焰美人薇恩");
    }

    @Override
    public Hero createHero() {
        return h;
    }
}
