package ex6;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhâp vào 1 số nguyên");
        int input = sc.nextInt();
        try {
            if (input % 2 == 0){
                System.out.println(input + " chia hết cho 2");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        throw new Exception( input + " không chia hết cho 2");
    }
}
