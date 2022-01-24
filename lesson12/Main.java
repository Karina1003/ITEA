package com.karinapinchuk.lesson12;

import com.karinapinchuk.lesson4.Gender;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HeavyBox heavyBox1 = new HeavyBox(15);
        HeavyBox heavyBox2 = new HeavyBox(20);
        HeavyBox heavyBox3 = new HeavyBox(7);
        HeavyBox heavyBox4 = new HeavyBox(5);
        //1
        List<HeavyBox> listOfHeavyBoxes = new ArrayList<>();
        listOfHeavyBoxes.add(heavyBox1);
        listOfHeavyBoxes.add(heavyBox2);
        listOfHeavyBoxes.add(heavyBox3);
        listOfHeavyBoxes.add(heavyBox4);
        for (HeavyBox heavyBox:listOfHeavyBoxes) {
            System.out.println(heavyBox.toString());
        }
        heavyBox1.setWeight(1);
        listOfHeavyBoxes.remove(listOfHeavyBoxes.size()-1);
        //2
        HeavyBox[] heavyBoxes1 = listOfHeavyBoxes.toArray(new HeavyBox[listOfHeavyBoxes.size()]);
        for (int i = 0; i < heavyBoxes1.length; i++) {
            System.out.print(heavyBoxes1[i]+ " ");
        }
        System.out.println();
        HeavyBox[] heavyBoxes2 = new HeavyBox[listOfHeavyBoxes.size()];
        for (int i = 0; i < listOfHeavyBoxes.size(); i++) {
            heavyBoxes2[i] = listOfHeavyBoxes.get(i);
        }
        for (int i = 0; i < heavyBoxes2.length; i++) {
            System.out.print(heavyBoxes2[i]+ " ");
        }
        System.out.println();
        HeavyBox[] heavyBoxes3 = new HeavyBox[listOfHeavyBoxes.size()];
        Iterator<HeavyBox> it = listOfHeavyBoxes.iterator();
        while (it.hasNext()) {
            for (int i = 0; i <= heavyBoxes3.length-1; i++) {
                if (heavyBoxes3[i] == null) {
                    heavyBoxes3[i] = it.next();
                    break;
                }
            }
        }
        for (int i = 0; i < heavyBoxes3.length; i++) {
            System.out.print(heavyBoxes3[i] + " ");
        }
        System.out.println();
        listOfHeavyBoxes.clear();
        //3
        Set<HeavyBox> setOfHeavyBoxes = new TreeSet<>();
        setOfHeavyBoxes.add(heavyBox1);
        setOfHeavyBoxes.add(heavyBox2);
        setOfHeavyBoxes.add(heavyBox3);
        setOfHeavyBoxes.add(heavyBox4);
        for (HeavyBox heavyBox:setOfHeavyBoxes) {
            System.out.print(heavyBox + " ");
        }
        System.out.println();
        //4
        Set<Double> uniqueNumbers = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print numbers separated by comma");
        String stat = scanner.nextLine();
        String[] statNumbers = stat.split(",");
        System.out.println(statNumbers);
        for (String str:statNumbers) {
            if (!str.trim().equals("")) {
                uniqueNumbers.add(Double.parseDouble(str.trim()));
            }
        }
        System.out.println(uniqueNumbers);
        //5
        Set<Double> setTask5 = new HashSet<>();
        setTask5.add(3.0);
        setTask5.add(4.0);
        setTask5.add(5.0);
        setTask5.add(7.0);
        System.out.println(SetMethods.union(uniqueNumbers, setTask5));
        System.out.println(SetMethods.intersect(uniqueNumbers, setTask5));
        //6
        ArrayDeque<HeavyBox> dequeHeavyBoxes = new ArrayDeque<HeavyBox>();
        dequeHeavyBoxes.offer(heavyBox1);
        dequeHeavyBoxes.offer(heavyBox2);
        dequeHeavyBoxes.offer(heavyBox3);
        dequeHeavyBoxes.offerFirst(heavyBox4);
        System.out.println(dequeHeavyBoxes);
        dequeHeavyBoxes.poll();
        System.out.println(dequeHeavyBoxes);
        //7
        HeavyBox heavyBox5 = new HeavyBox(305);
        listOfHeavyBoxes.add(heavyBox1);
        listOfHeavyBoxes.add(heavyBox2);
        listOfHeavyBoxes.add(heavyBox3);
        listOfHeavyBoxes.add(heavyBox4);
        listOfHeavyBoxes.add(heavyBox5);
        System.out.println(ListMethods.moreThan300(listOfHeavyBoxes));
        System.out.println(listOfHeavyBoxes);
        //8
        Map<String, Product> mapOfToys = new HashMap<>();
        Product toy1 = new Product("Rabbit");
        Product toy2 = new Product("Dog");
        Product toy3 = new Product("Cat");
        mapOfToys.put(toy1.getName(), toy1);
        mapOfToys.put(toy2.getName(), toy2);
        mapOfToys.put(toy3.getName(), toy3);
        System.out.println(mapOfToys.entrySet());
        System.out.println(mapOfToys.keySet());
        System.out.println(mapOfToys.values());
        //9
        Student student1 = new Student("Jack", "Daniels", 20, Gender.Man, "116-A", "116-A-23",3.5,2021);
        Student student2 = new Student("Ann", "Daniels", 19, Gender.Woman, "116-A", "116-A-35",4.7,2021);
        Student student3 = new Student("Jane", "Adams", 20, Gender.Woman, "116-A", "116-A-08",4.3,2021);
        Student student4 = new Student("Dave", "Adams", 20, Gender.Man, "116-A", "116-A-09",2.7,2021);
        List<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(student1);
        listOfStudents.add(student2);
        listOfStudents.add(student3);
        listOfStudents.add(student4);
        Student.printStudents(listOfStudents, "2021");
        Student.nextYear(listOfStudents);
        Student.printStudents(listOfStudents, "2021");
        //10
        Map<String, Pet> mapOfPets = new HashMap<>();
        Cat cat1 = new Cat("Nika");
        Dog dog1 = new Dog("Jack");
        Parrot parrot1 = new Parrot("Kesha");
        Dog dog2 = new Dog("Rassel");
        mapOfPets.put(cat1.getName(), cat1);
        mapOfPets.put(dog1.getName(), dog1);
        mapOfPets.put(dog2.getName(), dog2);
        mapOfPets.put(parrot1.getName(), parrot1);
        System.out.println(mapOfPets.keySet());
        //12
        List<Catalog> listOfCatalogs = new ArrayList<>();
        listOfCatalogs.add(new Catalog("Magazine", 20.0, 3));
        listOfCatalogs.add(new Catalog("Book", 45.0, 2));
        listOfCatalogs.add(new Catalog("Journal", 23.0, 4));
        listOfCatalogs.add(new Catalog("Essay", 15.0, 1));
        listOfCatalogs.add(new Catalog("Novel", 38.0, 5));
        Catalog.sortByPrice(listOfCatalogs);
        System.out.println(listOfCatalogs);
        Catalog.sortByName(listOfCatalogs);
        System.out.println(listOfCatalogs);
        Catalog.sortByRating(listOfCatalogs);
        System.out.println(listOfCatalogs);
    }
}
