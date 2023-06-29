package ex12;

public class Main12 {
    public static void main(String[] args) {
        int number1 = 0;
        int number2 = 0;

        try {
            int gcd = findGCD(number1, number2);
            System.out.println("Ước chung lớn nhất của " + number1 + " và " + number2 + " là: " + gcd);
        } catch (IllegalArgumentException e) {
            System.err.println("Lỗi: Hai số đều bằng 0!");
        }
    }

    public static int findGCD(int number1, int number2) {
        if (number1 == 0 && number2 == 0) {
            throw new IllegalArgumentException();
        }

        number1 = Math.abs(number1);
        number2 = Math.abs(number2);

        while (number2 != 0) {
            int temp = number2;
            number2 = number1 % number2;
            number1 = temp;
        }

        return number1;
    }
}


