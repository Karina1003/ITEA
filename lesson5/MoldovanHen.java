package com.karinapinchuk.lesson5;

import java.util.Scanner;

public class MoldovanHen extends Hen{
    int eggs;
    @Override
    public int getCountOfEggsPerMonth() {
        eggs = 20;
        return eggs;
    }
    @Override
    public String getDescription() {
        return super.getDescription()+" My country is Moldova. I lay "+eggs+" a month.";
    }
}
