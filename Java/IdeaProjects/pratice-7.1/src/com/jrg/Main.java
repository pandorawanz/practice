//读入一个数字N, 输出以这个数字开始的乘法表, 乘数 N x i 必须按 N x i = result 的格式输出,并且占一行.
//输入格式:
//一个正整数: N, 2 <= N <= 20
package com.jrg;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print("Please enter the integer 'N':");
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        if (2<=N && N<=20) {
            for(int i = 1; i <= 10 ; i++) {
                System.out.println(N + "×" + i + "=" + N*i);
            }
        }
        else System.out.println("'N' is not in the range from 2 to 20.");
    }
}
