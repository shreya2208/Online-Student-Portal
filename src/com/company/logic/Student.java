package com.company.logic;

import java.util.Scanner;

public class Student {

    private static long loginid = 220441601;
    int id;
    int idcheck;
    private String name;
    private String ENno;
    private double percentile;
    private int yob;
    private int age;
    private double HSCPer;
    private int choice;

    public Student() {
        this.id = (int) loginid;
        loginid++;
    }

    Scanner sc = new Scanner(System.in);

    public void acceptProfileInfo() {
        BranchQueue bq = new BranchQueue();
        System.out.println("\n\n-------------------------------------------------------------------------------");
        System.out.println("                    Fill your details      ");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.print("Enter name            :     ");
        name = sc.next();
        System.out.print("Birth Year            :     ");
        yob = sc.nextInt();
        System.out.print("Application Number    :     ");
        ENno = sc.next();
        System.out.print("CET Percentile        :     ");
        percentile = sc.nextDouble();
        bq.enqueueAndSortPer(percentile);
        System.out.print("HSC Percentage        :     ");
        HSCPer = sc.nextDouble();
        System.out.println("\n-------------------------------------------------------------------------------");
        System.out.println("Choose your college Junior College from below          ");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("1.SMT Laxmibai Gangane Junior College ");
        System.out.println("2.Universal Junior College ");
        System.out.println("3.Sanjay Ghodawat Institute of IIT and Medical Academy ");
        System.out.println("4.Abeda Inamdar Junior College for girls ");
        System.out.println("5.Fergusson College ");
        choice = sc.nextInt();
        System.out.println("-------------------------------------------------------------------------------\n\n");

    }

    public void college() {
        if (choice == 1) {
            System.out.println("SMT Laxmibai Gangane Junior College");
        } else {
            if (choice == 2) {
                System.out.println("Universal Junior College");
            } else {
                if (choice == 3) {
                    System.out.println("Sanjay Ghodawat Institute of IIT and Medical Academy");
                } else {
                    if (choice == 4) {
                        System.out.println("Abeda Inamdar Junior College for girls");
                    } else {
                        System.out.println("Fergusson College");
                    }
                }
            }
        }
    }

    public void calculateAge() {
        age = 2021 - yob;
        System.out.println("age  : " + age);
    }

    public void viewProfile() {
        this.calculateAge();
        while (age <= 19 && age >= 17) {
            System.out.println("enter your login id : ");
            idcheck = sc.nextInt();
            if (idcheck == id) {
                this.displayStudentProfile();
            } else {
                int ch = 0;
                do {
                    System.out.println("Enter correct id :");
                    ch = sc.nextInt();
                } while (ch < 1 || ch > 5);
            }
        }
    }

    public void displayStudentProfile() {

        this.calculateAge();
        if (age <= 19 && age >= 17) {

            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("                                 STUDENT DETAILS                               ");
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println(" Name                :  " + name);
            System.out.println(" Application Number  :  " + ENno);
            System.out.println(" CET percentile      :  " + percentile);
            System.out.println(" HSC percentage      :  " + HSCPer);
            System.out.print(" Junior College Name :  ");
            this.college();
            System.out.println(" Login ID            :  " + this.id);
            System.out.println("-------------------------------------------------------------------------------");

        } else {

            System.out.println("\nStudent having age between 17-19 are allowed only !");
            System.out.println("You can't apply for admission .");
        }

    }

    public static long getLoginid() {
        return loginid;
    }

    public static void setLoginid(long loginid) {
        Student.loginid = loginid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdcheck() {
        return idcheck;
    }

    public void setIdcheck(int idcheck) {
        this.idcheck = idcheck;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getENno() {
        return ENno;
    }

    public void setENno(String eNno) {
        ENno = eNno;
    }

    public double getPercentile() {
        return percentile;
    }

    public void setPercentile(double percentile) {
        this.percentile = percentile;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHSCPer() {
        return HSCPer;
    }

    public void setHSCPer(double hSCPer) {
        HSCPer = hSCPer;
    }

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }
}
