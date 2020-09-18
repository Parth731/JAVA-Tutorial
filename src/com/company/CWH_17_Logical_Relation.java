package com.company;

public class CWH_17_Logical_Relation {

    public static void main(String[] args) {

        System.out.println("For Logical And...");
        boolean a = true;
        boolean b = false;
        boolean c = true;
        if (a && b && c) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

        System.out.println("For Logical Or...");
         a = true;
         b = false;
         c = true;
        if (a || b || c) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

        System.out.println("For Logical NOT...");
        System.out.println(!a);
        System.out.println(!b);

    }
}
