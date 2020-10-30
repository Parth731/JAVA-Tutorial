/*

any real word object = property + behavour
object in oops = attribute + methods



 */


package com.company;

class Employee1{

    int id;
    String name;
    int salary;

    public void printDetails(){

        System.out.println("My id is " + id);
        System.out.println("and my name is " + name);
    }

    public int getSalary(){
        return salary;
    }

}



public class CWH_38_Creating_Own_Class {


    public static void main(String[] args) {

        System.out.println("This is our custom class");
        Employee1 parth = new Employee1(); // instantiating a new employee object
        Employee1 jhon = new Employee1();

        //setting attribute(property) for parth
        parth.id = 24;
        parth.name = "DELL";
        parth.salary = 40000;

        //setting attribute(property) for jhon
        jhon.id = 30;
        jhon.name = "Jhon Tripathi";
        jhon.salary = 20000;
        //printing the attributes
        //System.out.println(parth.id);
        //System.out.println(parth.name);
        parth.printDetails();
        jhon.printDetails();
        int salary = jhon.getSalary();
        System.out.println(salary);

    }

}
