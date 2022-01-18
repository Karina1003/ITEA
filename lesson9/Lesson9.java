package com.karinapinchuk.lesson9;

public class Lesson9 {
    public static void main(String[] args) {
        for (Weekday day:Weekday.values()) {
            System.out.println(weekdayOrDayOff(day));
        }
    }

    public static String weekdayOrDayOff (Weekday day) {
        if (day.isWeekDay()) {
            return day + " is a weekday";
        } else {
            return day + " is a weekend";
        }
    }
}
