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
@EnableHystrix
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class A2ServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(A2ServiceApplication.class, args);
    }
}
