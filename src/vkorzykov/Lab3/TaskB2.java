package vkorzykov.Lab3;

import java.util.Scanner;

public class TaskB2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <=num; i++){
            if (num%i == 0) {
                System.out.print(i+" ");
            }
        }
    }
}
