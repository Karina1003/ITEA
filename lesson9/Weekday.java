package com.karinapinchuk.lesson9;

public enum Weekday {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public boolean isWeekDay() {
        if (this == SATURDAY || this == SUNDAY) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isWeekend() {
        if (this == SATURDAY || this == SUNDAY) {
            return true;
        } else {
            return false;
        }
    }
}
