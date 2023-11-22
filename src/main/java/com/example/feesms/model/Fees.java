package com.example.feesms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Fees
{
    @Id
    //defining id as column name
    @Column
    private int id;
    @Column
    private String fees_name;

    //defining age as column name
    @Column
    private String student_name;
    @Column
    private String email;
    @Column
    private int amount;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFees_name() {
        return fees_name;
    }
    public void setFees_name(String fees_name) {
        this.fees_name = fees_name;
    }

    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public String getStudent_name() {
        return student_name;
    }
    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


}
