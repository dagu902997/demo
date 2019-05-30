package com.lovo.servlet.mybaits;

/**
 * 构建普通版本的VN
 */
public class VNBasicBulider implements HeroBuilder {
    //持有英雄
    Hero h=new Hero();

    @Override
    public void buildPymbol() {
     h.setPymbol("全攻击铭文");
    }

    @Override
    public void bulidKill() {
     h.setKill("普通攻击");
    }

    @Override
    public void bulidKien() {
      h.setKien("原始皮肤");
    }

    @Override
    public Hero createHero() {
        return h;
    }

}
