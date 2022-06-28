package com.lkk.bridging.abstractions;

import com.lkk.bridging.service.DaoService;

/**
 * @ClassName DaoAbstraction
 * @Description //TODO
 * @Author lkk
 * Date 2022/06/27/10:18
 * @Version 1.0
 **/
public abstract class DaoAbstraction {

    private DaoService daoService;

    public DaoAbstraction(DaoService daoService){
        this.daoService=daoService;
    }

    public void getDaoName(String name){
        this.daoService.getName(name);
    };
}
