package ex1;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        try {
            System.out.println("nhập vào số thứ nhất ");
            int number1 = sc.nextInt();
            System.out.println("nhập vào số thứ hai ");
            int number2 = sc.nextInt();
            sum = number1 + number2;
        }catch (Exception e){
            System.err.println(" Lỗi . bạn phải nhâp vào số nguyên \n");
            main(args);
        }
        System.out.println("tổng  của hai số nguyên  la : " + sum);
        sc.close();
    }
}
