package com.company;
import java.util.Scanner;

class Circle1{
    public int radius;
    Circle1(){
        System.out.println("circle1 is default constructor");
    }
    
    Circle1(int r){
        System.out.println("I am circle parametrized constructor");
        this.radius = r;
    }

    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}

class Cylinder1 extends Circle1{

    public int height;
    Cylinder1(int r,int h){
        super(r);
        System.out.println("I am cylinder parameter constructor");
        this.height = h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }


}


class Rectangle1{

    public int length;
    public int width;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int area(){
        return this.length * this.width;
    }

}

class Cuboid extends Rectangle1{

    public int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int volume(){
        return  this.length * this.width * this.height;
    }

}


public class CWH_52_ch10_PS {

    public static void main(String[] args) {

        /*
         problem 1:
         create class circle and use inheritance to create
         another class cylinder from it.
        */

        //Circle1 obj1 = new Circle1(12);
        Cylinder1 obj = new Cylinder1(12,4);





        /*
        problem 2:
        create a class rectangle and use inheritance to create
        another class cuboid try to reep it as close to
        real world scenario as possible
         */

        Cuboid cu = new Cuboid();
        Scanner sc = new Scanner(System.in);






        /*
        problem 3:
        create method for area and volume in 1
         */

        double area = obj.area();
        System.out.println("area => " + area);
        double volume = obj.volume();
        System.out.println("volume => " + volume);

        /*
        problem 4:
        create method for area and volume in 2 also create
        getter and setters
         */

        System.out.println("Enter the length..");
        int len = sc.nextInt();
        cu.setLength(len);
        System.out.println("Enter the width..");
        int width = sc.nextInt();
        cu.setWidth(width);
        System.out.println("Enter the height..");
        int height = sc.nextInt();
        cu.setHeight(height);
        System.out.println("area of rectangle => " + cu.area());
        System.out.println("volume of rectangle => " + cu.volume());



        /*
        what is the order of constructor execution for the
        following inheritance hierarchy:

        base
        derive 1
        derive 2

        derive2 obj = new derive2();
        which constructor(s) will be execute and in what order ?
         */

        /*
        answer:
        first base class => derive 1 => derive 2
         */


    }
}
