package com.yhau.renting.dubbo.server.service;

import com.yhau.renting.dubbo.server.pojo.HouseResources;

public interface HouseResourcesService {
    /**
     * 新增房源
     * @param houseResources
     * @return -1:输入的参数不符合要求，0：数据插入数据库失败，1：成功
     */
    int saveHouseResources(HouseResources houseResources);
}
