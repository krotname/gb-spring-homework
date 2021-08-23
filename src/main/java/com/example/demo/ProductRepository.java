package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public  class ProductRepository {

    @Autowired
    private Product p1;
    @Autowired
    private Product p2;
    @Autowired
    private Product p3;
    @Autowired
    private Product p4;
    @Autowired
    private Product p5;

}

