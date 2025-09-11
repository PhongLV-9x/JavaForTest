package BT6_For_Array;

public class Array {
    public static void main(String[] args) {
        int index = 0;
        int a[] = new int[26];
        for (int i = 0; i <= 50; i+=2) {
            //i chính là số chẵn càn add vào
            //index chính là vị trí trung gian để gán giá trị i vào theo thứ tự
                System.out.println(i);
                a[index] = i;//Add giá trị số chẵn vào mảng
                index++;
            }
        //in ra giá trị trong mảng
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
