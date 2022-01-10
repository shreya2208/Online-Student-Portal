package com.company.logic;

import java.util.*;

public class BranchQueue {
    public Student st;
    Queue<Double> q98 = new LinkedList<Double>();
    Queue<Double> q96 = new LinkedList<Double>();
    Queue<Double> q92 = new LinkedList<Double>();

    Queue<Double> per98 = new LinkedList<Double>();
    Queue<Double> per96 = new LinkedList<Double>();
    Queue<Double> per92 = new LinkedList<Double>();
    public double[] compS = new double[5];
    public double[] ITS = new double[5];
    public double[] Entc = new double[5];
    public double[] notSelected = new double[10];
    int j;
    int m;

    Scanner inp = new Scanner(System.in);

    // Enqueue All percentiles

    public void enqueueAndSortPer(double percentile) {

        if ((percentile <= 100) && (percentile >= 98.00)) {
            q98.add(percentile);
        }

        else if ((percentile >= 96.00) && (percentile < 98.00)) {

            q96.add(percentile);
        }

        else if (percentile < 96.00) {

            q92.add(percentile);
        }
    }

    // Add Percentile into queue in descending order

    void addIntoQueue() {

        List<Double> list98 = new ArrayList<Double>();
        list98.addAll(q98);
        Collections.sort(list98);
        Collections.reverse(list98);

        per98.addAll(list98);

        List<Double> list96 = new ArrayList<Double>();
        list96.addAll(q96);
        Collections.sort(list96);
        Collections.reverse(list96);

        per96.addAll(list96);

        List<Double> list92 = new ArrayList<Double>();
        list92.addAll(q92);
        Collections.sort(list92);
        Collections.reverse(list92);

        per92.addAll(list92);
    }

    // Allow Seats of branches using array

    public void dequeueIntoTheArray() {

        System.out.println();

        System.out.println("\n\nComp Students : ");
        for (int i = 0; i < compS.length; i++) {

            if (!per98.isEmpty()) {
                compS[i] = per98.poll();
            }

        }
        System.out.println("\n\nIT Students : ");

        int j = 0;
        while (per98.isEmpty() == false) {
            ITS[j] = per98.poll();
            j++;
        }

        for (int k = j; k < 5; k++) {

            if (!per96.isEmpty()) {
                ITS[k] = per96.poll();
            }

        }

        System.out.println("\n\nENTC Students : ");
        int m = 0;
        while (per96.isEmpty() == false) {
            ITS[m] = per96.poll();
            m++;
        }

        for (int l = m; l < 5; l++) {

            if (!per92.isEmpty()) {

                Entc[l] = per92.poll();
            }
        }

        System.out.println("\n\nStudents not selected :");
        int z = 0;

        while (per92.isEmpty() == false) {

            notSelected[z] = per92.poll();
            System.out.println(notSelected[z]);
            z++;

        }

    }

    public void displayResultForSelectedBranches() {

        System.out.println(
                "1-Computer Branch\n2-Information Technology Branch\n3-Electronics & Telecommunication Branch\n4-Students that are not selected");
        System.out.println("Please enter your choice : ");
        int ch = inp.nextInt();
        switch (ch) {
            case 1:
                System.out.println("-------------------------------------------------------------------------------");
                System.out.println("                   STUDENTS SELECTED IN COMPUTER BRANCH");
                System.out.println("-------------------------------------------------------------------------------");

                for (int i = 0; i < compS.length; i++) {
                    System.out.println(compS[i] + " ");
                }
                break;
            case 2:
                System.out.println("-------------------------------------------------------------------------------");
                System.out.println("            STUDENTS SELECTED IN INFORMATION TECHNOLOGY BRANCH");
                System.out.println("-------------------------------------------------------------------------------");

                for (int j = 0; j < ITS.length; j++) {
                    System.out.println(ITS[j] + " ");
                }
                break;
            case 3:
                System.out.println("-------------------------------------------------------------------------------");
                System.out.println("        STUDENTS SELECTED IN ELECTRONICS & TELECOMMUNICATION BRANCH");
                System.out.println("-------------------------------------------------------------------------------");

                for (int m = 0; m < Entc.length; m++) {
                    System.out.println(Entc[m] + " ");
                }
                break;
            case 4:
                System.out.println("-------------------------------------------------------------------------------");
                System.out.println("              STUDENTS WHO ARE NOT SELECTED IN ANY BRANCH");
                System.out.println("-------------------------------------------------------------------------------");

                for (int l = m + 1; l < Entc.length; l++) {
                    System.out.println(Entc[l] + " ");
                }
                break;
            default:
                System.out.println("Please enter a valid choice!");
                break;
        }
    }

    // Display result for all branches

    public void displayResultForCS(double per, String name) {

        for (int i = 0; i < compS.length; i++) {

            if (per == compS[i]) {
                System.out.println("Name       : " + name);
                System.out.println("Percentile : " + compS[i]);
            }
        }
    }

    public void displayResultForIT(double per, String name) {

        for (int i = 0; i < ITS.length; i++) {

            if (per == ITS[i]) {
                System.out.println("Name       : " + name);
                System.out.println("Percentile : " + ITS[i]);
            }

        }
    }

    public void displayResultForEandTC(double per, String name) {

        for (int m = 0; m < Entc.length; m++) {

            if (per == Entc[m]) {
                System.out.println("Name       : " + name);
                System.out.println("Percentile : " + Entc[m]);
            }
        }
    }
}
