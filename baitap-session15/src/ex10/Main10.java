package ex10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        circleArea();
    }

    public static void circleArea() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("nhâp vào  bán kinh ");
            String input = sc.next();
            double radius = Double.parseDouble(input);
            if (radius < 0) {
                System.err.println("lỗi , không  được  nhâp  vào sô âm ");
            } else {
                double area = Math.PI * radius * radius;
                System.out.println("diện tích hình tròn là : " + area);
            }
        } catch (Exception e) {
            System.err.println("lỗi, bạn hãy nhập lại số");
            sc.nextLine();
            circleArea();
        }
        sc.close();

    }
}
