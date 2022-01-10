package com.company.client;

import com.company.logic.Student;
import com.company.logic.StudentArraylist;

import java.util.Scanner;

public class OnlineStudentPortal_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentArraylist list = new StudentArraylist();
        int choice;

        do {
            System.out.println("========================================================================");
            System.out.println("                 WELCOME TO STUDENT ADMISSION PORTAL ");
            System.out.println("========================================================================");
            System.out.println("1. Apply for engineering .");
            System.out.println("2. Display Student Details");
            System.out.println("3. Display list of all branches.");
            System.out.println("4. Display list for selected branch.");
            System.out.println("========================================================================");
            choice = sc.nextInt();

            switch (choice) {
                case 1:

                    System.out.println("---------------------------------------------------------------");
                    System.out.println("                    ENTER STUDENTS DATA            ");
                    System.out.println("---------------------------------------------------------------");

                    Student s[] = new Student[10];

                    for (int i = 0; i < s.length; i++) {
                        System.out.println(" \nEnter the data for Student :" + (i + 1));
                        s[i] = new Student();
                        s[i].acceptProfileInfo();
                        list.addStudent(s[i]);
                    }

                    break;
                case 2:
                    list.displayStudentProfile();
                    break;

                case 3:
                    list.displayList();
                    break;

                case 4:
                    break;

                default:
                    System.out.println(" INVALID INPUT !!!!");
            }

            System.out.println(" Do you want to continue......Press 1 ");

        } while (sc.nextInt() == 1);

        sc.close();

    }

}
