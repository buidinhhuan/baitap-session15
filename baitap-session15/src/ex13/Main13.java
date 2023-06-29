package ex13;

public class Main13 {

        public static void main(String[] args) {
            String input = "Hello, World!";

            try {
                String reversed = reverseString(input);
                System.out.println("Chuỗi đảo ngược: " + reversed);
            } catch (IllegalArgumentException e) {
                System.err.println("Lỗi: Chuỗi không hợp lệ!");
            }
        }

        public static String reverseString(String input) {
            if (input == null || input.isEmpty()) {
                throw new IllegalArgumentException();
            }

            StringBuilder sb = new StringBuilder(input);
            return sb.reverse().toString();
        }
    }


