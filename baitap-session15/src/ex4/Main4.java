package ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhâp chuỗi vào ");
        String str = sc.nextLine();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            try {
                //biến kí tưj thành
                list.add(Integer.valueOf(String.valueOf(str.charAt(i))));
            }catch (Exception e){
                list.add(0);
                e.printStackTrace();
            }
        }
        System.out.println(list);
    }
}

