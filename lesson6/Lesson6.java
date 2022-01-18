package com.karinapinchuk.lesson6;

public class Lesson6 {
    public static void main(String[] args) {
        double result = BaseConverter.convert(TemperatureMeasures.Fahrenheit,TemperatureMeasures.Kelvin,56);
        System.out.println(result);
    }
}
