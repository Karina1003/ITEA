package com.karinapinchuk.lesson5;

import java.util.Random;

public class UkrainianHen extends Hen{
    int eggs;
    @Override
    public int getCountOfEggsPerMonth() {
        Random random = new Random();
        eggs = random.nextInt(1,3)*30;
        return eggs;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" My country is Ukraine. I lay "+eggs+" a month.";
    }
}
