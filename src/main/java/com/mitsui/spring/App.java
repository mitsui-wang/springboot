package com.mitsui.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpHeaders;

import java.util.concurrent.ConcurrentHashMap;


/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App
{
    public static void main( String[] args )
    {
        HttpHeaders cacheControl = new HttpHeaders();
        ConcurrentHashMap concurrentHashMap;
        System.out.println(HttpHeaders.class.getClassLoader());
        SpringApplication.run(App.class, args);
    }
}
