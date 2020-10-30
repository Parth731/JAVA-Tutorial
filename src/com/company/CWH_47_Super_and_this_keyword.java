package com.company;

/*
this is one reference
 */

class EKClass{

    int a;
    EKClass(int a){

        //a = a;    //0
        this.a = a;
        System.out.println("I am constructor Ekclass");
    }

    public int getA() {
        return a;
    }

    public int returnone(){
        return 1;
    }
}
class Doclass extends EKClass{

    Doclass(int c){

        super(c);
        System.out.println("I am a constructor Doclass");
    }
}
public class CWH_47_Super_and_this_keyword {

    public static void main(String[] args) {

        EKClass e = new EKClass(45);
        Doclass d = new Doclass(5);
        System.out.println(e.getA());
        System.out.println(d.getA());

    }
}
