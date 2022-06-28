package com.lkk.bridging.abstractions;

import com.lkk.bridging.service.DaoService;

/**
 * @ClassName DaoAbstractionImpl
 * @Description //TODO
 * @Author lkk
 * Date 2022/06/27/10:19
 * @Version 1.0
 **/
public class DaoAbstractionImpl extends DaoAbstraction{
    public DaoAbstractionImpl(DaoService daoService) {
        super(daoService);
    }

    @Override
    public void getDaoName(String name) {
        super.getDaoName(name);
    }
}
