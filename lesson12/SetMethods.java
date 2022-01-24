package com.karinapinchuk.lesson12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMethods {
    public static Set<Double> union (Set<Double> set1, Set<Double> set2) {
        Set<Double> newSet = new HashSet<>();
        if (!set1.isEmpty()) {
            newSet.addAll(set1);
        }
        if (!set2.isEmpty()) {
            newSet.addAll(set2);
        }
        return newSet;
    }

    public static Set<Double> intersect (Set<Double> set1, Set<Double> set2) {
        Set<Double> newSet = new HashSet<>();
        Iterator<Double> it = set1.iterator();
        Double dbl;
        if (!set1.isEmpty() && !set2.isEmpty()) {
            while (it.hasNext()) {
                dbl = it.next();
                if (set2.contains(dbl)) {
                    newSet.add(dbl);
                }
            }
        }
        return newSet;
    }
}
