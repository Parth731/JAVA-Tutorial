package com.company;

class Base{

    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am a function");
    }
}


class Derive extends Base{

    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}


public class CWH_45_Inheritance {
    public static void main(String[] args) {

        //base class object
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX()); //4
        //b.setY(4); //error : base class can not access to the derive class
        //System.out.println(b.getY()); //error

        //derive class object
        Derive d = new Derive();
        d.setX(43);
        System.out.println(d.getX());   //4
        d.setY(45);
        System.out.println(d.getY());   //45

    }
}
