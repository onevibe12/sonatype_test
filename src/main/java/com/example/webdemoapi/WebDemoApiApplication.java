package com.example.webdemoapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.servlet.ServletRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;
import com.example.webdemoapi.RequestMain;

@SpringBootApplication
public class WebDemoApiApplication {

    public static void main(String[] args) {

        SpringApplication.run(WebDemoApiApplication.class, args);

        InetAddress local;
        try {
            local = InetAddress.getLocalHost();
            String ip = local.getHostAddress();
            System.out.println("CURRENT LOCAL ip:port = "+ ip);

        } catch (UnknownHostException e1) {
            e1.printStackTrace();
        }
    }

}
