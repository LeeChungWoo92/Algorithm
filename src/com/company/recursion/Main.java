package com.company.recursion;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        in.close();;

        //int sum = factorial(N); 재귀
        int sum = factorialLoop(N); //반복문
        System.out.println(sum);

    }

    //재귀사용
    private static int factorial(int n) {
        if(n <=1) return 1; //재귀 종료 조건
        return n * factorial(n-1);
    }

    //반복문사용
    private static int factorialLoop(int n) {
        int sum2 = 1;
        for(int i=1; i<=n; n--){
            sum2 = sum2*n;
        }
        return sum2;
    }


}