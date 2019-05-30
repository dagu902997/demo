package com.lovo.servlet.mybaits;

public interface HeroBuilder {
    /**
     *
     * @return  符文
     */
    public void buildPymbol();

    /**
     *
     * @return 技能
     */
    public void bulidKill();
    /**
     *
     * @return 皮肤
     */
    public void bulidKien();

    /**
     *
     * @return 英雄
     */
    public Hero createHero();
}
