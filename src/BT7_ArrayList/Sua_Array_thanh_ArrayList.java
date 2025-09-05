package BT7_ArrayList;

import java.util.ArrayList;

public class Sua_Array_thanh_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        for (int i = 0; i <= 50; i += 2) {
            //i chính là số chẵn càn add vào
            //index chính là vị trí trung gian để gán giá trị i vào theo thứ tự
            System.out.println(i);
        }
    }
}
