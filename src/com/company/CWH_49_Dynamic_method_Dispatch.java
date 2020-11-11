package com.company;

class Phone{

    public void showTime(){
        System.out.println("Time is 8 am");
    }

    public void on(){
        System.out.println("turning on phone");
    }
}

class SmartPhone extends Phone{

    public void music(){
        System.out.println("playing music");
    }

    public void on(){
        System.out.println("turning on smartphone");
    }
}

public class CWH_49_Dynamic_method_Dispatch {
    public static void main(String[] args) {

        //object create run time
        //Phone obj = new Phone();  //allowed
        //SmartPhone smobj = new SmartPhone();  //allowed
        //obj.name();

        Phone obj = new SmartPhone();   // allowed
        //SmartPhone onj2 = new Phone();  //not allowed

        obj.showTime();
        obj.on();
        //obj.music();    //not allowed
        
    }
}
