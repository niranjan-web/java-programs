package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CarEntity {

    @Id
    @Column
    private String brandName;
    @Column
    private String carColor;
    @Column
    private int regNo;
    @Column
    private boolean isLuxury;
    
    @ManyToOne
    UserEntity userEntityObj;
    
    public UserEntity getUserEntityObj() {
        return userEntityObj;
    }
    public void setUserEntityObj(UserEntity userEntityObj) {
        this.userEntityObj = userEntityObj;
    }
    public String getBrandName() {
        return brandName;
    }
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
    public String getCarColor() {
        return carColor;
    }
    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }
    public int getRegNo() {
        return regNo;
    }
    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }
    public boolean isLuxury() {
        return isLuxury;
    }
    public void setLuxury(boolean isLuxury) {
        this.isLuxury = isLuxury;
    }
    @Override
    public String toString() {
        return "CarEntity [brandName=" + brandName + ", carColor=" + carColor + ", regNo=" + regNo + ", isLuxury="
                + isLuxury + "]";
    }
    public CarEntity(String brandName, String carColor, int regNo, boolean isLuxury) {
        super();
        this.brandName = brandName;
        this.carColor = carColor;
        this.regNo = regNo;
        this.isLuxury = isLuxury;
    }
    public CarEntity() {
        super();
    }
    
    
}
