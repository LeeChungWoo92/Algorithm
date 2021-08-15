package com.company.factorial;


import java.util.Scanner;

// 반복문 사용
// 백준 10872번 문제 팩토리얼
public class Factorial_10872_Loop {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int sum = factorialLoop(N); //반복문
        System.out.println(sum);

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