package ex15;
import java.util.Scanner;
public class Main15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Nhập cạnh thứ nhất: ");
            double side1 = sc.nextDouble();

            System.out.print("Nhập cạnh thứ hai: ");
            double side2 = sc.nextDouble();

            System.out.print("Nhập cạnh thứ ba: ");
            double side3 = sc.nextDouble();

            checkTriangle(side1, side2, side3);

            System.out.println("Ba cạnh nhập vào tạo thành một tam giác hợp lệ.");
        } catch (IllegalTriangleException e) {
            System.err.println("Lỗi: Ba cạnh nhập vào không tạo thành một tam giác hợp lệ.");
        } catch (Exception e) {
            System.err.println("Lỗi: Đầu vào không hợp lệ.");
        } finally {
            sc.close();
        }
    }

    public static void checkTriangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0 || (side1 + side2 <= side3) || (side1 + side3 <= side2) || (side2 + side3 <= side1)) {
            throw new IllegalTriangleException();
        }
    }
}

class IllegalTriangleException extends Exception {
    public IllegalTriangleException() {
        super();
    }
}


