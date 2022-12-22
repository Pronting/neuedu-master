package com.neuedu.quartz.service.impl;

import com.neuedu.quartz.domain.SerialInventory;
import com.neuedu.quartz.mapper.SerialInventoryMapper;
import com.neuedu.quartz.service.SerialInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: pront
 * @Time:2022-12-21 10:45
 */
@Service
public class SerialInventoryImpl implements SerialInventoryService {

    @Autowired
    private SerialInventoryMapper serialInventoryMapper;

    @Override
    public List<SerialInventory> getInfo() {
        return serialInventoryMapper.selectAll();
    }
}
