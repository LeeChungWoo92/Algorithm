package com.company.factorial;


import java.util.Scanner;

// 재귀사용
// 백준 10872번 문제 팩토리얼
public class Factorial_10872_Recursion {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int sum = factorial(N); //재귀
        System.out.println(sum);

    }

    //재귀사용
    private static int factorial(int n) {
        if(n <=1) return 1; //재귀 종료 조건
        return n * factorial(n-1);
    }

}