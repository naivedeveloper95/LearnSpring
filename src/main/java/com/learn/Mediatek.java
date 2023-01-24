package com.learn;

import org.springframework.stereotype.Component;

@Component
public class Mediatek implements MobileProcessor {

    @Override
    public void process() {
        System.out.println("World's second best cpu");
    }

}
