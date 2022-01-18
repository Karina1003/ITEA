package com.karinapinchuk.lesson6;

public class BaseConverter {
    public static double convert (TemperatureMeasures tempFrom, TemperatureMeasures tempTo, double degreesFrom){
        double degreesTo = 0.0;
        if (tempFrom.equals(TemperatureMeasures.Celsius)) {
            if (tempTo.equals(TemperatureMeasures.Fahrenheit)) {
                degreesTo = (degreesFrom*9/5)+32;
            }
            if (tempTo.equals(TemperatureMeasures.Kelvin)) {
                degreesTo = degreesFrom+273.15;
            }
        }
        if (tempFrom.equals(TemperatureMeasures.Fahrenheit)) {
            if (tempTo.equals(TemperatureMeasures.Celsius)) {
                degreesTo = (degreesFrom-32)*5/9;
            }
            if (tempTo.equals(TemperatureMeasures.Kelvin)) {
                degreesTo = ((degreesFrom-32)*5/9)+273.15;
            }
        }
        if (tempFrom.equals(TemperatureMeasures.Kelvin)) {
            if (tempTo.equals(TemperatureMeasures.Celsius)) {
                degreesTo = degreesFrom-273.15;
            }
            if (tempTo.equals(TemperatureMeasures.Fahrenheit)) {
                degreesTo = ((degreesFrom-273.15)*9/5)+32;
            }
        }
        return degreesTo;
    }
}
