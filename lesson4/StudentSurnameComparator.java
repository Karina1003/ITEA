package com.karinapinchuk.lesson4;

import com.karinapinchuk.lesson4.Student;

import java.util.Comparator;

public class StudentSurnameComparator implements Comparator {
    @Override
    public int compare(Object o, Object t1) {
        Student student1 = (Student) o;
        Student student2 = (Student) t1;

        String surname1 = student1.getSurname();
        String surname2 = student2.getSurname();
        if (surname1.compareToIgnoreCase(surname2) > 0){
            return 1;
        } else if (surname1.compareToIgnoreCase(surname2) < 0) {
            return -1;
        } else return 0;
    }
}
