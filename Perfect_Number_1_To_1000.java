package com.assignments;
import java.util.Scanner;

public class Perfect_Number_1_To_1000 {

    public static void main(String[] args) {

        for (int a = 1; a <= 1000; a++) {

            int sum = 0;

            for (int i = 1; i < a; i++) {

                if (a % i == 0) {
                    sum = sum + i;
                }
            }

            if (sum == a) {
                System.out.println(a);
            }
        }
    }
}