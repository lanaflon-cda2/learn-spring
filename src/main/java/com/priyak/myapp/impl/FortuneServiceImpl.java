package com.priyak.myapp.impl;

import com.priyak.myapp.IFortuneService;

public class FortuneServiceImpl implements IFortuneService{ 

    @Override
    public String getFortune(){
        return "Today is your lucky day";
    }
}