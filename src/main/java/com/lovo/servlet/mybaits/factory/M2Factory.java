package com.lovo.servlet.mybaits.factory;

public class M2Factory implements BasicFactoryBMW {
    @Override
    public IBMW createMMW() {
        return new BMWM2();
    }
}
