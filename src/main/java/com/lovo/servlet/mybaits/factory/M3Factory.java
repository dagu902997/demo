package com.lovo.servlet.mybaits.factory;

public class M3Factory implements BasicFactoryBMW {
    @Override
    public IBMW createMMW() {
        return new BMWM3();
    }
}
