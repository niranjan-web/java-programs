package com.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class UserEntity {

    @Id
    @Column
    private int userId;
    @Column
    private String userName;
    @Column
    private String userAddress;
    @Column
    private long userMobileNumber;
    
    @OneToMany
    List<CarEntity> carEntityObj;
    
    public List<CarEntity> getCarEntityObj() {
        return carEntityObj;
    }
    public void setCarEntityObj(List<CarEntity> carEntityObj) {
        this.carEntityObj = carEntityObj;
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserAddress() {
        return userAddress;
    }
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }
    public long getUserMobileNumber() {
        return userMobileNumber;
    }
    public void setUserMobileNumber(long userMobileNumber) {
        this.userMobileNumber = userMobileNumber;
    }
    @Override
    public String toString() {
        return "UserEntity [userId=" + userId + ", userName=" + userName + ", userAddress=" + userAddress
                + ", userMobileNumber=" + userMobileNumber + "]";
    }
    public UserEntity(int userId, String userName, String userAddress, long userMobileNumber) {
        super();
        this.userId = userId;
        this.userName = userName;
        this.userAddress = userAddress;
        this.userMobileNumber = userMobileNumber;
    }
    public UserEntity() {
        super();
    }
    
    
}
