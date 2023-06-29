package ex14;

public class Main14 {

        public static void main(String[] args) {
            int[] numbers = { 5, 10, 15, 20, 25 };

            try {
                double average = calculateAverage(numbers);
                System.out.println("Giá trị trung bình của mảng là: " + average);
            } catch (IllegalArgumentException e) {
                System.err.println("Lỗi: Mảng không có phần tử!");
            }
        }

        public static double calculateAverage(int[] numbers) {
            if (numbers == null || numbers.length == 0) {
                throw new IllegalArgumentException();
            }

            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }

            return (double) sum / numbers.length;
        }
    }


