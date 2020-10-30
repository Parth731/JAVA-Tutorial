package com.company;

class Base1{
    public int x;

    public Base1(){
        System.out.println("I am a constructor");
    }

    public Base1(int a){
        System.out.println("I am a overload constructor with value a as: " + a);

    }


}



class Derive1 extends Base1{
    public int y;

    public Derive1(){
        //base class ka argument wala constructor run hoga
        //super ko comment karate ho to default constructor run hoga
        //super(1);
        System.out.println("I am a derived class constructor");
    }

    public Derive1(int a,int b){

        super(a);
        System.out.println("I am a overload constructor of derived with value b as: " + b);

    }

}

class childofDerive extends Derive1{

    childofDerive(){
        System.out.println("I am a child of derived constructor");
    }

    childofDerive(int a, int b, int c){
        super(a,b);
        System.out.println("I am a overload constructor of derived with value c as: " + c);


    }
}


public class CWH_46_Constructor_Inheritance {

    public static void main(String[] args) {

        //here base class constructor run
        Base1 b = new Base1();

        //first base class constructor run then derived
        //class class constructor run
       //Derive1 d = new Derive1();

        //Derive1 d = new Derive1(15,9);

        childofDerive cod = new childofDerive();
        cod = new childofDerive(12,13,14);


    }


}
