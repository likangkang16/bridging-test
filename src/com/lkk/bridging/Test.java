package com.lkk.bridging;

import com.lkk.bridging.abstractions.DaoAbstraction;
import com.lkk.bridging.abstractions.DaoAbstractionImpl;
import com.lkk.bridging.service.impl.YellowDaoService;

/**
 * @ClassName Test
 * @Description //TODO
 * @Author lkk
 * Date 2022/06/28/15:39
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        DaoAbstraction daoAbstraction =new DaoAbstractionImpl(new YellowDaoService());
        daoAbstraction.getDaoName("黄色");
    }
}
