package BT7_ArrayList;

import java.util.ArrayList;

public class Arraylist_new {
    public static void main(String[] args) {
        ArrayList<String> Nhanvien = new ArrayList<>();
        Nhanvien.add("Nam");
        Nhanvien.add("Trung");
        Nhanvien.add("Phong");
        Nhanvien.add("Huy");
        System.out.println(Nhanvien);
        //In kiểu vng lặp for
        System.out.println("Các phần tử có trong List là: ");
        for (int i = 0;i < Nhanvien.size(); i++) {
            System.out.println(Nhanvien.get(i));
        }
        //In vogn lặp for cải tiến
        for (String str: Nhanvien){
            System.out.println(str);
        }
    }
}