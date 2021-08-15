package com.company.fibonacci;

import java.util.Scanner;

// 재귀사용
// 백준 10870번 문제 피보나치 수5
// 피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.
// 0 1 1 2 3 5 8 13 21 34

class Fibonacci_10870_Recursion {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        System.out.println(fibonacci(number));

    }

    //재귀 사용
    private static int fibonacci(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

}
