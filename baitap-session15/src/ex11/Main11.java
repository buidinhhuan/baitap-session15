package ex11;

import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("nhâp năm");
            int year = sc.nextInt();
            if (year > 0) {
                System.out.println("nhập tháng");
                int month = sc.nextInt();
                System.out.println("nhâp vào ngày");
                int date = sc.nextInt();
                switch (month) {
                    case 1:
                        if (date > 0 && date < 31) {
                            System.out.println("ngày tháng năm hợp lệ");
                        }
                        else {
                            System.err.println("ngày tháng năm không hợp lê hợp lệ");
                        }
                        break;
                    case 2:
                        if ((year % 4 == 0 && year % 100 != 0 || year % 400 == 0) && (date > 0 && date < 28)){
                            System.out.println("ngày tháng năm hợp lệ");
                        }else {
                            System.err.println("ngày tháng năm không hợp lê hợp lệ");
                        }
                            break;
                    case 3:
                        if (date > 0 && date < 31) {
                            System.out.println("ngày tháng năm hợp lệ");
                        } else {
                            System.err.println("ngày tháng năm không hợp lê hợp lệ");
                        }
                        break;
                    case 4:
                        if (date > 0 && date < 30) {
                            System.out.println("ngày tháng năm hợp lệ");
                        }else {
                            System.err.println("ngày tháng năm không hợp lê hợp lệ");
                        }
                        break;
                    case 5:
                        if (date > 0 && date < 31) {
                            System.out.println("ngày tháng năm hợp lệ");
                        }else {
                            System.err.println("ngày tháng năm không hợp lê hợp lệ");
                        }
                        break;
                    case 6:
                        if (date > 0 && date < 30) {
                            System.out.println("ngày tháng năm hợp lệ");
                        }else {
                            System.err.println("ngày tháng năm không hợp lê hợp lệ");
                        }
                        break;
                    case 7:
                        if (date > 0 && date < 31) {
                            System.out.println("ngày tháng năm hợp lệ");
                        }else {
                            System.err.println("ngày tháng năm không hợp lê hợp lệ");
                        }
                        break;
                    case 8:
                        if (date > 0 && date < 31) {
                            System.out.println("ngày tháng năm hợp lệ");
                        }else {
                            System.err.println("ngày tháng năm không hợp lê hợp lệ");
                        }
                        break;
                    case 9:
                        if (date > 0 && date < 30) {
                            System.out.println("ngày tháng năm hợp lệ");
                        }else {
                            System.err.println("ngày tháng năm không hợp lê hợp lệ");
                        }
                        break;
                    case 10:
                        if (date > 0 && date < 31) {
                            System.out.println("ngày tháng năm hợp lệ");
                        }else {
                            System.err.println("ngày tháng năm không hợp lê hợp lệ");
                        }
                        break;
                    case 11:
                        if (date > 0 && date < 30) {
                            System.out.println("ngày tháng năm hợp lệ");
                        }else {
                            System.err.println("ngày tháng năm không hợp lê hợp lệ");
                        }
                        break;
                    case 12:
                        if (date > 0 && date < 31) {
                            System.out.println("ngày tháng năm hợp lệ");
                        }else {
                            System.err.println("ngày tháng năm không hợp lê hợp lệ");
                        }
                        break;
                    default:
                        System.err.println(" lỗi , tháng không hơp ");
                        main(args);
                }
            } else {
                System.err.println("số năm không thể nhỏ hơn 0");
                main(args);
            }
        } catch (Exception e) {
            System.err.println("lỗi, bạn cần nhâp vào so");
            main(args);
        }
    }
}
