package com.karinapinchuk;

import javax.swing.*;
import java.util.*;

public class Lesson2 {
    public static void main(String[] args) {
        // task 1
        for (int i = 1; i <= 5; i++) {
            System.out.print(i+ " ");
        }
        System.out.println();
        // task 2
        for (int i = 5; i > 0; i--) {
            System.out.print(i+ " ");
        }
        System.out.println();
        // task 3
        for (int i = 1; i <= 10; i++) {
            System.out.println("3 * "+i+ " = "+3*i);
        }
        // task 4
        Scanner scanner = new Scanner(System.in);
        int k = 0;
        System.out.println("Please, print some positive integer");
        if(scanner.hasNextInt()) {
            k = scanner.nextInt();
        }
        int l = 0;
        for (int i = 0; i <= k; i++) {
            l += i;
        }
        //scanner.close();
        System.out.println(l);
        // task 5
        for (int i = 1; i <= 14; i++) {
            System.out.print(7*i+" ");
        }
        System.out.println();
        // task 6
        for (int i = 0; i <= 9; i++) {
            System.out.print((int)Math.pow(2,i)+" ");
        }
        System.out.println();
        // task 7
        int shots = 0;
        System.out.println("Синий, большой, с усами и полный зайцев");
        String answer = null;
        Scanner scanner1 = new Scanner(System.in);
        while (shots < 3) {
            shots++;
            answer = scanner1.nextLine();
            if (answer.equalsIgnoreCase("Троллейбус")) {
                System.out.println("Правильно!");
                break;
            } else if (answer.equalsIgnoreCase("Сдаюсь")) {
                System.out.println("Ответ - троллейбус");
                break;
            } else if (shots == 3) {
                System.out.println("Игра окончена");
            }
        }

        //Arrays
        //task 1
        int [] arr1 = new int[8];
        Random random = new Random();
        for (int cnt = 0; cnt < arr1.length; cnt++) {
            arr1[cnt] = random.nextInt(1,11);
            System.out.print(arr1[cnt]+" ");
        }
        System.out.println();
        //task 2
        for (int cnt1 = 0; cnt1 < arr1.length; cnt1++) {
            if (cnt1%2 == 1) {
                arr1[cnt1] = 0;
            }
            System.out.print(arr1[cnt1] + " ");
        }
        System.out.println();
        //task 3
        int [] arr2 = new int[12];
        for (int cnt = 0; cnt < arr2.length; cnt++) {
            arr2[cnt] = random.nextInt(-15,16);
            System.out.print(arr2[cnt]+" ");
        }
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i<arr2.length;i++) {
            list.add(arr2[i]);
        }
        int max = Collections.max(list);
        System.out.println("Max element - " + max + " with last index " + list.lastIndexOf(max));
        //task 4
        int [] arr3 = new int[4];
        for (int cnt = 0; cnt < arr3.length; cnt++) {
            arr3[cnt] = random.nextInt(10,100);
            System.out.print(arr3[cnt]+" ");
        }
        //task 5
        int flag = 0;
        int maxNum = 0;
        for (int cnt = 0; cnt < arr3.length; cnt++) {
            if (maxNum > arr3[cnt]) {
                flag = 1;
            }
            maxNum = arr3[cnt];
        }
        System.out.println();
        if (flag == 1) {
            System.out.println("This array is not in increasing order");
        } else {
            System.out.println("This array is in increasing order");
        }
        //task 6
        String[] strings = {"Hello","Bye","Welcome","Back"};
        reverseArray(strings);
        for (String str:strings) {
            System.out.print(str + " ");
        }
        System.out.println();
        //task 7
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        double array1Sum = 0;
        double array2Sum = 0;
        double avg1 = 0;
        double avg2 = 0;
        for (int cnt = 0; cnt < array1.length; cnt++) {
            array1[cnt] = random.nextInt(0,6);
            System.out.print(array1[cnt]+" ");
            array1Sum += array1[cnt];
        }
        System.out.println();
        for (int cnt = 0; cnt < array2.length; cnt++) {
            array2[cnt] = random.nextInt(0,6);
            System.out.print(array2[cnt]+" ");
            array2Sum += array2[cnt];
        }
        System.out.println();
        avg1 = array1Sum/array1.length;
        avg2 = array2Sum/array2.length;
        System.out.println(avg1+ " " + avg2);
        if (avg1>avg2) {
            System.out.println("AVG meaning of Array1 is greater");
        } else if (avg1==avg2) {
            System.out.printf("AVG meaning of Arrays are equal");
        } else {
            System.out.println("AVG meaning of Array2 is greater");
        }
    }

    public static void reverseArray (Object[] objects) {
        int start = 0, end = objects.length-1;
        while (start < end) {
            Object temp = objects[start];
            objects[start] = objects[end];
            objects[end] = temp;
            start++;
            end--;
        }
    }
}
