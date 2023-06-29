package ex7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        try {
        System.out.println(" nhập số nguyên thứ nhất ");
        int number1 = getInteger();
        System.out.println(" nhập số nguyên thứ hai ");
        int number2 = getInteger();
            if (number1 > number2) {
                System.out.println("số lớn nhất là " + number1);
            } else {

                System.out.println("số lớn nhất là " + number2);
            }
        } catch (Exception e) {
//            e.printStackTrace();
            throw new InputMismatchException("ban can nhap vao so");

        }
    }
    public static int getInteger() throws Exception {
        try {
            int result = new Scanner(System.in).nextInt();
            return result;
        } catch (Exception e) {
            throw new InputMismatchException("Vui long nhap lai: ");

        }
    }
}
