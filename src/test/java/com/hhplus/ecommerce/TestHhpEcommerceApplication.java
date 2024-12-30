package com.hhplus.ecommerce;

import org.springframework.boot.SpringApplication;

public class TestHhpEcommerceApplication {

    public static void main(String[] args) {
        SpringApplication.from(HhpEcommerceApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
