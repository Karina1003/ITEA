package com.karinapinchuk.lesson12;

public class HeavyBox implements Comparable<HeavyBox>{
    private double weight;

    public HeavyBox(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(HeavyBox h) {
        if (this.weight > h.weight) {
            return 1;
        } else if (this.weight == h.weight) {
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "HeavyBox " + weight;
    }
}
