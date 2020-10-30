/*
private data can be access using class method

NOTE:   we can't access private data using dot operator
 */

package com.company;

class MyEmployee{

    private int id;
    private String name;

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


public class CWH_40_Access_Modifiers {

    public static void main(String[] args) {

        MyEmployee harry = new MyEmployee();
        //harry.id = 45;
        //harry.name = "CWH"; //throw an error due to private  access modifier

        harry.setName("CWH");
        harry.setId(333);
        System.out.println(harry.getName());
        System.out.println(harry.getId());


    }
}
