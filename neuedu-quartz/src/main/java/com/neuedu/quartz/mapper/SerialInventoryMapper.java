package com.neuedu.quartz.mapper;

import com.neuedu.quartz.domain.SerialInventory;

import java.util.List;

/**
 * @Description:
 * @Author: pront
 * @Time:2022-12-21 09:54
 */
public interface SerialInventoryMapper {

    /**
     * 根据id删除一条信息
     * @param id id
     * @return
     */
    int deleteById(int id);

    List<SerialInventory> selectAll();


}
