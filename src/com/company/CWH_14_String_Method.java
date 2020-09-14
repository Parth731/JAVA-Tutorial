package com.company;

public class CWH_14_String_Method {

    public static void main(String[] args) {

        // String a = "Parth";
        // String a1 = new String("Parth");
        String name = "Parth";
        // System.out.println(name);

        //int res = name.length();
        //System.out.println(res);//5

        //String lstring = name.toLowerCase();
        //System.out.println(lstring);

        //String Ustring = name.toUpperCase();
        //System.out.println(Ustring);

        //String nonTrimmedString = "      Parth       ";
        //System.out.println(nonTrimmedString);
        //String trimmedString = nonTrimmedString.trim();
        //System.out.println(trimmedString);

        System.out.println(name.substring(1));
        System.out.println(name.substring(1,4));

        System.out.println(name.replace("r","p"));
        System.out.println(name.replace("rth","goo"));
        name = "Harry";
        System.out.println(name.replace("r","ier"));

        System.out.println(name.startsWith("Har"));//True
        System.out.println(name.endsWith("Har"));//false

        System.out.println(name.charAt(2));//r

        System.out.println(name.indexOf("ry"));//3

        String modigyname = "Harryrryrry";
        System.out.println(modigyname.indexOf("ry", 4));//6
        System.out.println(modigyname.indexOf("ryyui", 4));//-1
        System.out.println(modigyname.lastIndexOf("rry",4));//2
        System.out.println(modigyname.lastIndexOf("rry",7));//5

        System.out.println(name.equals("Harry"));//true
        System.out.println(name.equals("harry"));//false

        System.out.println(name.equalsIgnoreCase("haRry"));//true

        System.out.println("I am escape sequence \" double qoute");
        System.out.println("I am escape sequence \\ double qoute");
        System.out.println("I am escape sequence \' double qoute");
        System.out.println("I am escape sequence \n double qoute");
        System.out.println("I am escape sequence \t double qoute");













    }
}
