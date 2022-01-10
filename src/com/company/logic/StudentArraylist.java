package com.company.logic;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentArraylist {

    private ArrayList<Student> studentList = new ArrayList<Student>();
    Student obj = new Student();
    BranchQueue bq = new BranchQueue();

    public void displayStudentProfile() {

        for (int i = 0; i < studentList.size(); i++) {
            studentList.get(i).displayStudentProfile();
            double per = studentList.get(i).getPercentile();
            bq.enqueueAndSortPer(per);
        }

        bq.addIntoQueue();
        bq.dequeueIntoTheArray();

    }

    public void displayList() {

        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("                   STUDENTS SELECTED IN COMPUTER BRANCH");
        System.out.println("-------------------------------------------------------------------------------");

        for (int i = 0; i < studentList.size(); i++) {
            double per = studentList.get(i).getPercentile();
            String name = studentList.get(i).getName();
            bq.displayResultForCS(per, name);
        }

        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("            STUDENTS SELECTED IN INFORMATION TECHNOLOGY BRANCH");
        System.out.println("-------------------------------------------------------------------------------");

        for (int i = 0; i < studentList.size(); i++) {
            double per = studentList.get(i).getPercentile();
            String name = studentList.get(i).getName();
            bq.displayResultForIT(per, name);
        }

        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("        STUDENTS SELECTED IN ELECTRONICS & TELECOMMUNICATION BRANCH");
        System.out.println("-------------------------------------------------------------------------------");

        for (int i = 0; i < studentList.size(); i++) {
            double per = studentList.get(i).getPercentile();
            String name = studentList.get(i).getName();
            bq.displayResultForEandTC(per, name);
        }

    }

    public void viewProfile() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your ID : ");
        int checkID = sc.nextInt();

        for (int i = 0; i < studentList.size(); i++) {

            int ID = studentList.get(i).id;
            if (checkID == ID) {
                studentList.get(i).displayStudentProfile();
            } else {

                System.out.println("ID is incorrect !! ");

            }
        }

        sc.close();

    }

    public void addStudent(Student c) {
        this.studentList.add(c);
    }

    public void removeStudent(Student c) {
        this.studentList.remove(c);
    }
}
