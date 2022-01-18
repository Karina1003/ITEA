package com.karinapinchuk.lesson5;

import java.util.Random;

public class PolishHen extends Hen{
    int eggs;
    @Override
    public int getCountOfEggsPerMonth() {
        Random random = new Random();
        eggs = Math.round(random.nextInt(150,201)/30);
        return eggs;
    }
    @Override
    public String getDescription() {
        return super.getDescription()+" My country is Poland. I lay "+eggs+" a month.";
    }
}
