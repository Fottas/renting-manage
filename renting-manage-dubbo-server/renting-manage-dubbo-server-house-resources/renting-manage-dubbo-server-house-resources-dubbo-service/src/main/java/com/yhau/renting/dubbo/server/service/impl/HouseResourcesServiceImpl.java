package com.yhau.renting.dubbo.server.service.impl;

import com.yhau.renting.dubbo.server.pojo.HouseResources;
import com.yhau.renting.dubbo.server.service.HouseResourcesService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class HouseResourcesServiceImpl extends BaseServiceImpl implements HouseResourcesService {
    @Override
    public int saveHouseResources(HouseResources houseResources) {
        // 编写校验逻辑，如果教研不通过，返回-1
        if (StringUtils.isBlank(houseResources.getTitle())) { return -1; }
        return super.save(houseResources);
    }
}
