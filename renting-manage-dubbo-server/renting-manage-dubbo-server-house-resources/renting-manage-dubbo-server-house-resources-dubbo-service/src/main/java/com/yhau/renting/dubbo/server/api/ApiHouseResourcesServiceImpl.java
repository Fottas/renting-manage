package com.yhau.renting.dubbo.server.api;

import com.alibaba.dubbo.config.annotation.Service;
import com.yhau.renting.dubbo.server.pojo.HouseResources;
import com.yhau.renting.dubbo.server.service.HouseResourcesService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(version = "1.0.0")
public class ApiHouseResourcesServiceImpl implements ApiHouseResourcesService {
    @Autowired
    private HouseResourcesService houseResourcesService;
    @Override
    public int saveHouseResources(HouseResources houseResources) {
        return houseResourcesService.saveHouseResources(houseResources);
    }
}
