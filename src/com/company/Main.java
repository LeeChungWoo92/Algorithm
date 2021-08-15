package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        //System.out.println(fac(N)); // 반복문
        System.out.println(funck(N)); // 재귀

    }



/*
    private static int fac(int n){
        int sum = 1;
        for(int i=1; i<=n; n--){
            sum = sum * n;
        }
        return sum;
    }
*/

    private static int funck(int n){
        if(n<2){
            return n;
        }else{
            return funck(n-1)+funck(n-2);
        }
    }
}
