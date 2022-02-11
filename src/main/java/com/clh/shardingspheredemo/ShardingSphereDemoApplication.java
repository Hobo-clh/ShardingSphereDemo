package com.clh.shardingspheredemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
@MapperScan("com.clh.shardingspheredemo.mapper")
public class ShardingSphereDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingSphereDemoApplication.class, args);
    }

    static class T {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            while (true) {
                int i = sc.nextInt();
                if (i == -1) {
                    break;
                }
                System.out.println(((i) ^ (i >>> 16)) % 3);
            }

            sc.close();

        }
    }
}
