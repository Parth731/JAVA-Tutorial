package com.company;

class Employee{

    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String na){
        name = na;
    }
}

class cellPhone{

    public void ringing(){
        System.out.println("Ringing...");
    }

    public void vibrating(){
        System.out.println("Ringing...");
    }

    public void callFriend(){
        System.out.println("Calling Mukul...");
    }

}

class Square{

    int side;
    public int area(){
        return side*side;
    }

    public int perimeter(){
        return 4*side;
    }
}

class Rectangle{

    int width;
    int length;
    public int area(){
        return width*length;
    }

    public int perimeter(){
        return 2*(length + width);
    }
}

class Circle{

    double PI = 3.14;
    int r;

    public double area(){

        return (PI*r*r);
    }

    public double perimeter(){
        return (2*PI*r);
    }
}

class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}
public class CWH_39_ch08_PS {

    public static void main(String[] args) {

        /*
        problem 1:
        create a class Employee with following property and
        method

        -salary(property)(int)
        -getsalary(method returning int)
        -name(property)(string)
        -getname(method returning string)
        -setName(method changing name)
         */

        /*
        Employee harry = new Employee();
        harry.setName("codewithharry");
        harry.salary = 344;
        int salary = harry.getSalary();
        System.out.println("harry Salary => "+salary);
        String Name = harry.getName();
        System.out.println("Employee Name => "+Name);
        */

        /*
        problem2:
        Creating a class cellphone with method to print
        "ringing...","vibrating"
         */

        /*

        cellPhone oneplue =new  cellPhone();
        oneplue.callFriend();
        oneplue.vibrating();
        oneplue.ringing();

         */

        /*
        problem3:
        create a class square with a method to initization its
        side, a calculating area, perimeter etc:
         */
        Square sq = new Square();
        sq.side = 3;
        System.out.println("Square Area => "+sq.area());
        System.out.println("Square perimeter => "+sq.perimeter());


        /*
        problem4:
        create a class rectangle & repeat 3
         */
        Rectangle rect = new Rectangle();
        rect.length = 2;
        rect.width = 3;
        System.out.println("Rectangle area => "+rect.area());
        System.out.println("Rectangle perimeter => "+rect.perimeter());

        /*
        problem 6:
        Repeat 4 for circle
         */
        Circle cir = new Circle();
        cir.r = 3;
        System.out.println("Circle area => "+cir.area());
        System.out.println("Circle Perimeter => "+cir.perimeter());

        /*
        problem 7:
        create a class Tommyvecetti for rockstar Games cataple
        hitting (print hitting), running, firing etc..

         */
        Tommy player1 = new Tommy();
        player1.fire();
        player1.run();
        player1.hit();


    }

}



