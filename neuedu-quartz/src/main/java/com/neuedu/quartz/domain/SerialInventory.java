package com.neuedu.quartz.domain;

import com.neuedu.common.core.domain.BaseEntity;

/**
 * @Description: 物料库存列表信息表
 * @Author: pront
 * @Time:2022-12-21 09:47
 */
public class SerialInventory extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String warehouse;

    private String serialId;

    private String serialName;

    private String serialModel;

    private String serialSpec;

    private String serialUnit;

    private Integer serialPrice;

    private Integer inventoryAll;

    private Integer inventoryLock;

    private Integer inventoryMax;

    private Integer inventoryMin;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public String getSerialId() {
        return serialId;
    }

    public void setSerialId(String serialId) {
        this.serialId = serialId;
    }

    public String getSerialName() {
        return serialName;
    }

    public void setSerialName(String serialName) {
        this.serialName = serialName;
    }

    public String getSerialModel() {
        return serialModel;
    }

    public void setSerialModel(String serialModel) {
        this.serialModel = serialModel;
    }

    public String getSerialSpec() {
        return serialSpec;
    }

    public void setSerialSpec(String serialSpec) {
        this.serialSpec = serialSpec;
    }

    public String getSerialUnit() {
        return serialUnit;
    }

    public void setSerialUnit(String serialUnit) {
        this.serialUnit = serialUnit;
    }

    public Integer getSerialPrice() {
        return serialPrice;
    }

    public void setSerialPrice(Integer serialPrice) {
        this.serialPrice = serialPrice;
    }

    public Integer getInventoryAll() {
        return inventoryAll;
    }

    public void setInventoryAll(Integer inventoryAll) {
        this.inventoryAll = inventoryAll;
    }

    public Integer getInventoryLock() {
        return inventoryLock;
    }

    public void setInventoryLock(Integer inventoryLock) {
        this.inventoryLock = inventoryLock;
    }

    public Integer getInventoryMax() {
        return inventoryMax;
    }

    public void setInventoryMax(Integer inventoryMax) {
        this.inventoryMax = inventoryMax;
    }

    public Integer getInventoryMin() {
        return inventoryMin;
    }

    public void setInventoryMin(Integer inventoryMin) {
        this.inventoryMin = inventoryMin;
    }
}
