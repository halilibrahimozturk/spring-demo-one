package com.luv2code.springdemo;

import java.util.concurrent.ThreadLocalRandom;

public class RandomFortuneService implements FortuneService {


    @Override
    public String getFortune() {
        String[] fortuneArray = new String[]{"Good","Bad","Ugly"};

        return fortuneArray[ThreadLocalRandom.current().nextInt(0, 2 + 1)];
    }
}
