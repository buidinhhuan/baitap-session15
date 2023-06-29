package ex8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời bạn nhập số");
        int input = sc.nextInt();
        try {
            for (int i = 2; i <= Math.sqrt(input); i++) {
                if (input % i != 0) {
                    System.out.println("đây là số nguyên tố");
                }
            }

        } catch (Exception e) {
            System.err.println("đây không phải sô nguyên tố");
            main(args);
        }

    }

}
