package com.company.fibonacci;

import java.util.Scanner;

// 반복문 사용
// 백준 10870번 문제 피보나치 수5
// 피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.
// 0 1 1 2 3 5 8 13 21 34
class Fibonacci_10870_Loop {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        System.out.println(fibonacciLoop(number));

    }

    //반복문 사용
    private static int fibonacciLoop(int number) {
        int first = 1;
        int second = 1;
        int sum = -1;

        if (number <= 2) {
            return 1;
        } else {
            for (int i = 2; i < number; i++) {
                sum = first + second;
                first = second;
                second = sum;
            }
        }
        return sum;
    }


}
