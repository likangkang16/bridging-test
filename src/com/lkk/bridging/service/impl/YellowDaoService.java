package com.lkk.bridging.service.impl;

import com.lkk.bridging.service.DaoService;

/**
 * @ClassName YellowDaoService
 * @Description //TODO
 * @Author lkk
 * Date 2022/06/27/10:16
 * @Version 1.0
 **/
public class YellowDaoService implements DaoService {
    @Override
    public void getName(String name) {
        System.out.println("小黄狗的名字叫:"+name);
    }
}
