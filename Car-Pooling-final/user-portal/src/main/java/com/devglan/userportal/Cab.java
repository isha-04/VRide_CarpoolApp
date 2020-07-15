package com.devglan.userportal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cabs")
public class Cab {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cid;
    @Column
    private String companyName;
    @Column
    private String driverName;
    @Column
    private String vacantSpace;
    @Column
    private String source;
    @Column
    private String destination;
    @Column
    private String driverAuth;
    @Column
    private String driverMob;
    @Column
    private String compnyId;
    @Column
    private String pickup;
    @Column
    private String dropoff;
    
	
    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }
    
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    
    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }
    
    public String getVacantSpace() {
        return vacantSpace;
    }

    public void setVacantSpace(String vacantSpace) {
        this.vacantSpace = vacantSpace;
    }
    
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
    
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
    
    public String getDriverAuth() {
        return driverAuth;
    }

    public void setDriverAuth(String driverAuth) {
        this.driverAuth = driverAuth;
    }
    
    public String getDriverMob() {
        return driverMob;
    }

    public void setDriverMob(String driverMob) {
        this.driverMob = driverMob;
    }
    
    public String getComanyId() {
        return compnyId;
    }

    public void setComanyId(String compnyId) {
        this.compnyId = compnyId;
    }
    public String getpickup() {
        return pickup;
    }

    public void setPickup(String pickup) {
        this.pickup = pickup;
    }
    public String getDropoff() {
        return dropoff;
    }

    public void setDropoff(String dropoff) {
        this.dropoff = dropoff;
    }
}