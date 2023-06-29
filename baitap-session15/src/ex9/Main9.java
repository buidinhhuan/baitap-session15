package ex9;
import java.util.Scanner;
public class Main9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Nhập số nguyên dương n: ");
            try {
                n = scanner.nextInt();
                validInput = true;

                if (n <= 0) {
                    System.out.println("Lỗi: n không phải số nguyên dương!");
                    validInput = false;
                }
            } catch (Exception e) {
                System.out.println("Lỗi: Nhập không hợp lệ. Vui lòng nhập một số nguyên dương!");
                scanner.nextLine(); // Xóa dữ liệu đầu vào không hợp lệ khỏi bộ nhớ đệm
            }
        }

        int result = fibonacci(n);
        System.out.println("Số Fibonacci thứ " + n + " là: " + result);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int fibNMinus2 = 0;
        int fibNMinus1 = 1;
        int fibN = 0;

        for (int i = 2; i <= n; i++) {
            fibN = fibNMinus1 + fibNMinus2;
            fibNMinus2 = fibNMinus1;
            fibNMinus1 = fibN;
        }

        return fibN;
    }
}


