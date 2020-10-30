package com.company;

class MyMainEmployee{

    private int id;
    private String name;


    //constructor
    //you can also constructor method overloading
    public MyMainEmployee(){
        id = 46;
        name = "Your-Name-Parth";
    }


    public MyMainEmployee(String myname, int num){

        id = num;
        name = myname;
    }

    public MyMainEmployee(String myname){

        id = 1;
        name = myname;
    }




    public String getName(){
        return name;
    }

    public void setName(String na){
        this.name = na;
    }

    public int getId(){
        return id;
    }

    public void setId(int idd){
        id = idd;
    }

}

public class  CWH_42_Contructor {

    public static void main(String[] args) {

        //MyMainEmployee harry = new MyMainEmployee();

        //every property keliye me settter() and getter()
        //ka use nai karuga to contructor come the picture

        //below two line will not commented. this value access
        //below two line commented constructor value access
        //harry.setName("codewithharry");
        //harry.setId(34);


        //System.out.println(harry.getName()); //Your-Name-Parth
        //System.out.println(harry.getId());   //46
        /*
        when constructor call answer is:
        -Your-Name-Parth
        -46

        when no constructor call Answer is:
        -codewithharry
        -32
        */


        MyMainEmployee harry = new MyMainEmployee("Programmingwithharry", 12);
        System.out.println(harry.getName());    //Programmingwithharry
        System.out.println(harry.getId());      //12

        MyMainEmployee Parth = new MyMainEmployee("Programmingwithharry");
        System.out.println(Parth.getName());    //Programmingwithharry
        System.out.println(Parth.getId());      //1


    }

}
