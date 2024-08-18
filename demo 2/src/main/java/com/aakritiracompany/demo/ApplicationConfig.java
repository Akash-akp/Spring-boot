package com.aakritiracompany.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ApplicationConfig {
    @Bean
    // @Qualifier("q1")
	public Test t(){
        Test t = new Test();
        t.setS("Hello");
        return t;
	}
	
    @Bean
    @Primary
    // @Qualifier("q2")
    public Test t2(){
        Test t = new Test();
        t.setS("Bye");
        return t;
    }


    @Bean
    public String s(){
        return "Aakriti";
    }
}
