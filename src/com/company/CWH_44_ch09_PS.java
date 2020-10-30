package com.company;

class Cylinder{

    private int radius;
    private int height;

    public Cylinder() {
    }

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    public double surfacearea(){
        return (2 * Math.PI * radius * radius)+ (2 * Math.PI * radius * height);
    }

    public double volume(){
        return Math.PI * radius * radius * height;
    }
}

class myRectangle{
     private int length;
     private int breadth;

    public myRectangle() {
        this.length = 4;
        this.breadth = 5;
    }


    public myRectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

class mySphere{

    private int radius;

    public mySphere(int radius) {
        this.radius = radius;
    }

    public double surfacearea(){
        return 4 * Math.PI * radius * radius;
    }

    public double volume(){

        double d = 4.0/3.0;
        System.out.println(d);
        return d * Math.PI * radius * radius * radius;
    }
}


public class CWH_44_ch09_PS {

    public static void main(String[] args) {

        /*
        problem 1:
        create a class cylinder and use getters and
        setter to set its radius and height
         */
        Cylinder myCylinder = new Cylinder();
        myCylinder.setHeight(12);
        int h = myCylinder.getHeight();
        System.out.println(h);//12
        myCylinder.setRadius(9);
        int r = myCylinder.getRadius();
        System.out.println(r);//9



        /*
        problem 2:
        use 1 to calculated surface area and volume of
        cylinder
         */
        System.out.println(myCylinder.surfacearea());//1187.5220230569416
        System.out.println(myCylinder.volume());//3053.628059289279


        /*
        problem 3:
        use a constructor and repeat 1
         */

        Cylinder rad = new Cylinder(12, 9);
        System.out.println(rad.getRadius());//12
        System.out.println(rad.getHeight());//9
        System.out.println(rad.surfacearea());//1583.3626974092558
        System.out.println(rad.volume());//4071.5040790523717



        /*
        problem 4:
        overload a constructor used to initialize a
        rectangle of length 4 and breadth 5 for using custom
        parameter
         */

        //myRectangle ra = new myRectangle();   //no error  //4 5
        myRectangle ra = new myRectangle(12,56);
        System.out.println(ra.getLength()); //12
        System.out.println(ra.getBreadth());    //56


        /*
        problem 5:
        repeat 1 for a sphere
         */

        mySphere sp = new mySphere(2);
        System.out.println(sp.surfacearea());   //50.26548245743669
        System.out.println(sp.volume());        //25.132741228718345
    }
}
