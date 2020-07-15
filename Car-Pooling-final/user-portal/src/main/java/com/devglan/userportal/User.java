package com.devglan.userportal;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int emp_id;
    @Column
    private String f_name;
    @Column
    private String c_name;
    @Column
    private String email;
    @Column
    private String psw;

    public String getFullName() {
        return f_name;
    }

    public void setFullName(String f_name) {
        this.f_name = f_name;
    }

    public String getCompanyName() {
        return c_name;
    }

    public void setCompanyName(String c_name) {
        this.c_name = c_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPassword() {
        return psw;
    }

    public void setPassword(String psw) {
        this.psw = psw;
    }
    
    public int getEmployeeId() {
        return emp_id;
    }

    public void setEmployeeId(int empId) {
        this.emp_id = empId;
    }
}
