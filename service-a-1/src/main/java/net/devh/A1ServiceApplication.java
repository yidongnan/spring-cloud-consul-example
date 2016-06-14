package net.devh;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * User: Michael
 * Email: zhangyichen@xiaoniu66.com
 * Date: 2016/6/3
 */
@EnableDiscoveryClient
@EnableHystrix
@EnableFeignClients
@SpringBootApplication
public class A1ServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(A1ServiceApplication.class, args);
    }
}
