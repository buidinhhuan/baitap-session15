package ex2;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrNumber = new ArrayList<>();
        int max = 0;
        try {
            for (int i = 0; i < arrNumber.size() ; i++) {
                if (arrNumber.get(i)> max){
                     max = arrNumber.get(i);
                }
            }
            System.out.println(max);

        }catch (Exception e){
           if (arrNumber.size()==0){
               System.err.println("mảng rỗng");
           }
        }
    }
}
