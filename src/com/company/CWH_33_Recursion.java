package com.company;

public class CWH_33_Recursion {

    static int factorial(int a){

        // factorial(n) = n*n-1...1
        // factorial(5) = 5*4*3*2*1 =120
        // factorial(n) = n*factorial(n-1)
        if(a==1 || a==0){
            return 1;
        }
        else{
            return a * factorial(a-1);
        }
    }

    static int fibonacii(int n){

        // factorial(n) = n*n-1...1
        // factorial(5) = 5*4*3*2*1 =120
        // factorial(n) = n*factorial(n-1)
        if(n==1)
            return 0;
        else if(n==2){
            return 1;
        }
        else {
            return fibonacii(n - 1) + fibonacii(n - 2);
        }
    }



    static int factorial_iterative(int a){

        if(a==0 || a==1){
            return 1;
        }
        else{
            int product = 1;

            for(int i=1;i<=a;i++){
                product *= i;
            }

            return product;
        }

    }



    public static void main(String[] args) {

        int res = factorial(5);
        System.out.println("The value of factorial res is: " +res);
        res = factorial_iterative(5);
        System.out.println("The value of factorial res is: " + res);

        // fibonacci series - 0,1,1,2,3,5,8,13,21,34
        res = fibonacii(9);
        System.out.println("The value of fibonacii res is: " + res);
    }
}
