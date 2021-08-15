package com.company.fibonacci;

import java.math.BigInteger;
import java.util.Scanner;

// 재귀사용
// 백준 10826번 문제 피보나치 수4
// 피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.
// 이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n ≥ 2)가 된다.
// n=17일때 까지 피보나치 수를 써보면 다음과 같다.
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
// n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.
// 입력 첫째 줄에 n이 주어진다. n은 10,000보다 작거나 같은 자연수 또는 0이다.
// Memoization 사용해보기
// BigInteger 자료형 사용

class Fibonacci_10826_Recursion {
    static BigInteger[] arr;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        arr = new BigInteger[number + 1];
        System.out.println(fibonacci(number));

    }

 /*   private static BigInteger fibonacci(int n) {   // 시간초과...
        if (n == 0) return arr[0] = BigInteger.ZERO;
        if (n == 1) return arr[1] = BigInteger.ONE;
        return arr[n] = fibonacci(n-1).add(fibonacci(n-2));
    }
*/


    private static BigInteger fibonacci(int n) {  // Memoization 사용해보기
        if (n == 0) return arr[n] = BigInteger.ZERO;
        if (n == 1) return arr[n] = BigInteger.ONE;
        if (arr[n] != null) return arr[n];
        return arr[n] = fibonacci(n - 1).add(fibonacci(n - 2));
    }
}
