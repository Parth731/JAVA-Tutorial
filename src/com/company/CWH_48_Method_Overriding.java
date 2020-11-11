package com.company;
class A{
    public int a;
    public int harry(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}

class B extends A{

    public void meth3(){
        System.out.println("I am method 3 of class B");
    }

    @Override
    public void meth2(){
        System.out.println("I am method 2 of class B");
    }

}


public class CWH_48_Method_Overriding {

    public static void main(String[] args) {

        A a = new A();
        a.meth2();

        B b = new B();
        //here class B method 2 run otherwise class A method 2 run
        b.meth2();
        b.meth3();  //class b method 3 run
    }

}
