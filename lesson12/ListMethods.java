package com.karinapinchuk.lesson12;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {
    public static List moreThan300 (List<HeavyBox> list1) {
        List <HeavyBox> newList = new ArrayList<>();
        for (HeavyBox heavyBox:list1) {
            if (heavyBox.getWeight() > 300) {
                newList.add(heavyBox);
            }
        }
        list1.removeAll(newList);
        return newList;
    }
}
