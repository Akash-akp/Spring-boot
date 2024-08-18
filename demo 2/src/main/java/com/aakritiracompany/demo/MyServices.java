package com.aakritiracompany.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyServices {
    // @Autowired // Field Injection
    private String s;
    private Test t;
    
    // dependency injection by constructor;
    public MyServices(String s,Test t){
        this.s = s;
        this.t = t;
    }

    // DI by setter method
    // @Autowired
    // public void setString(String s){
    //     this.s = s;
    // }

    public String getS(){
        return s;
    }

    public String getSinT(){
        return t.getS();
    }

}
