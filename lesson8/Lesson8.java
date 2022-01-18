package com.karinapinchuk.lesson8;

import java.time.LocalDate;
import java.util.GregorianCalendar;

public class Lesson8 {
    public static void main(String[] args) {
        //1.Notepad
        Notepad date20220101 = new Notepad(new GregorianCalendar(2022, 1, 1));
        Notepad date20220102 = new Notepad(new GregorianCalendar(2022, 1, 2));

        Notepad.Records record1 = date20220101.new Records("Hello");
        Notepad.Records record2 = date20220101.new Records("How was the day?");
        Notepad.Records record3 = date20220102.new Records("How are you?");
        System.out.println(date20220101.getListOfRecords());

        //2.Payment
        Payment payment1 = new Payment("1qw2asz23");
        Payment.Purchase purchase1 = payment1.new Purchase("Flower");
        Payment.Purchase purchase2 = payment1.new Purchase("Pencil");
        Payment.Purchase purchase3 = payment1.new Purchase("Pen");
        Payment.Purchase purchase4 = payment1.new Purchase("Curtain");
        System.out.println(payment1.getListOfPurchases());

        //3.Account
        Account account1 = new Account("26203462309");
        Account.Operation operation1 = account1.new Operation();
        operation1.moneyWithdrawal();
        operation1.payment();
        System.out.println(account1.getListOfOperations());

        //4.StudentBook
        StudentBook studBook1 = new StudentBook("A-123");
        StudentBook.Session session1 = studBook1.new Session("123-1", 2020);
        StudentBook.Session.Exam exam1 = session1.new Exam("Philosophy");
        StudentBook.Session.Exam exam2 = session1.new Exam("Math");
        StudentBook.Session.Exam exam3 = session1.new Exam("Politics");
        StudentBook.Session.Credit credit1 = session1.new Credit("Sociology");
        StudentBook.Session.Credit credit2 = session1.new Credit("Geography");
        StudentBook.Session session2 = studBook1.new Session("123-2", 2021);
        StudentBook.Session.Exam exam4 = session2.new Exam("Biology");
        StudentBook.Session.Exam exam5 = session2.new Exam("Physics");
        StudentBook.Session.Credit credit3 = session2.new Credit("Diplomacy");
        StudentBook.Session.Credit credit4 = session2.new Credit("History");
        System.out.println(studBook1.toString());

        //5.Department
        Department department1 = new Department("Security");
        Department.Positions position1 = department1.new Positions("Manager");
        Department.Positions.Employee employee1 = position1.new Employee("Jake","Adams", true);
        Department.Positions.Employee employee2 = position1.new Employee("Ann","James", true);
        Department.Positions.Employee employee3 = position1.new Employee("Joe","Back", false);
        Department.Positions position2 = department1.new Positions("Administrator");
        Department.Positions.Employee employee4 = position2.new Employee("Joe","Back", true);
        Department.Positions.Employee employee5 = position2.new Employee("Kate","Holl", false);
        System.out.println(department1.toString());

        //6.Catalog
        Catalog catalog1 = new Catalog();
        Catalog.Book book1 = catalog1.new Book("And Then There Were None");
        Catalog.Book book2 = catalog1.new Book("All Quiet on the Western Front");
        book1.setReader("Jonhson");
        book2.setReader("Adams");
        System.out.println(catalog1.toString());

        //7.Europe
        Europe europe = new Europe();
        Europe.Country country1 = europe.new Country("Austria");
        country1.changeOfAdmDivision("Austria-Hungary", 1867);
        country1.changeOfAdmDivision("Austria", 1918);
        System.out.println(europe.toString());

        //8.City
        City city1 = new City("Madrid");
        City.Infrastructure.Boulevard boulevard1 = city1.new Infrastructure().new Boulevard("de Espana");
        City.Infrastructure.Street street1 = city1.new Infrastructure().new Street("de Victoria");
        City.Infrastructure.Square square1 = city1.new Infrastructure(). new Square("de Europa");
        System.out.println(city1.toString());

        //9.BlueRayDisc
        BlueRayDisc blueRay1 = new BlueRayDisc("A");
        BlueRayDisc.Catalog1 catalogBlueRay = blueRay1.new Catalog1("Catalog A");
        BlueRayDisc.Catalog1.Subcatalog subcatalogBlueRay = blueRay1.new Catalog1().new Subcatalog("Subcatalog B");
        System.out.println(blueRay1.toString());

        //10.Mobile
        Mobile mobile1 = new Mobile("Samsung");
        Mobile.PhoneModel model1 = mobile1.new PhoneModel();
        model1.setModel("M30");
        Mobile.PhoneModel.Features feature1 = model1.new Features();
        Mobile.PhoneModel.Features feature2 = model1.new Features();
        feature1.setFeature("Durable");
        feature2.setFeature("Strong battery");
        Mobile.PhoneModel model2 = mobile1.new PhoneModel();
        model2.setModel("M50");
        System.out.println(mobile1.toString());
    }
}
