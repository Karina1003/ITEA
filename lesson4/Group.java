package com.karinapinchuk.lesson4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class Group {



    private String groupName;
    private Student[] groupOfStudents = new Student[10];
    private int amountOfStudents = 0;

    public Group () {
    }

    public Group(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public Student[] getGroupOfStudents() {
        return groupOfStudents;
    }

    public int getGroupOfStudentsLength() {
        return groupOfStudents.length;
    }

    public void addStudent(Student student) {
        if (amountOfStudents < groupOfStudents.length) {
            for (int i = 0; i < groupOfStudents.length; i++) {
                if (groupOfStudents[i] == null) {
                    groupOfStudents[i] = student;
                    amountOfStudents++;
                    System.out.println("Student " + student.getName() + " " + student.getSurname() + " is added");
                    break;
                }
            }
        }
    }

    public void deleteStudent (String ID) {
        if (amountOfStudents > 0){
            String IDFound = null;
            for(int i = 0; i < groupOfStudents.length; i++){
                if (groupOfStudents[i] != null && ID.equalsIgnoreCase(groupOfStudents[i].getID())){
                    IDFound = groupOfStudents[i].getID();
                    groupOfStudents[i] = null;
                    amountOfStudents--;
                    System.out.println("Student is deleted");
                }
            }
            if (IDFound == null) {
                System.out.println("ID " + ID + " is not found for deleting");
            }
        }
    }

    public Student searchStudent(String surname) throws NoSuchElementException{
        if (amountOfStudents > 0){
            String studentFound = null;
            for(int i = 0; i < groupOfStudents.length; i++){
                if (groupOfStudents[i] != null && surname.equalsIgnoreCase(groupOfStudents[i].getSurname())){
                    studentFound = groupOfStudents[i].toString();
                    return groupOfStudents[i];
                }
            }
            if (studentFound == null){
                throw new NoSuchElementException("Student is not found");
            }
        }
        return null;
    }

    public String toString(){
        String student = "";
        if (amountOfStudents == 0){
            return "This group doesn't contain any student";
        }
        Arrays.sort(groupOfStudents, Comparator.nullsLast(new StudentSurnameComparator()));
        for (int i = 0; i < groupOfStudents.length; i++) {
            if(groupOfStudents[i] != null){
                student = student + groupOfStudents[i] + "\n";
            }
        }
        return groupName + "\n" +
               student
                ;
    }
}
