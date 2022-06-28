package com.lkk.bridging.service.impl;

import com.lkk.bridging.service.DaoService;

/**
 * @ClassName RedDaoServiceImpl
 * @Description //TODO
 * @Author lkk
 * Date 2022/06/27/10:15
 * @Version 1.0
 **/
public class RedDaoServiceImpl implements DaoService {
    @Override
    public void getName(String name) {
        System.out.println("小红狗的名字叫："+name);
    }
}
