package com.neuedu.quartz.controller;

import com.neuedu.quartz.domain.SerialInventory;
import com.neuedu.quartz.service.SerialInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description:
 * @Author: pront
 * @Time:2022-12-21 10:29
 */
@RestController
@RequestMapping("/WMS/warehouse")
public class SerialInventoryController {

    @Autowired
    private SerialInventoryService serialInventoryService;

    @GetMapping("/getInfo")
    public List<SerialInventory> getInfo(){
        System.out.println("前台已请求数据");
        return serialInventoryService.getInfo();
    }

}
