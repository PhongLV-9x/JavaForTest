package BT_JAVA_LESS2;

import java.util.Scanner;

import static java.lang.Character.*;

public class Bai5 {
    public static void main(String[] args) {
        Bai5 bai5 = new Bai5();
//        bai5.ex1();
        bai5.ex2();
    }

    public void ex1() {
        StringBuilder upperChars = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String chuoi = sc.nextLine();

        int count = 0;

        for (int i = 0; i < chuoi.length(); i++){
            char ch = chuoi.charAt(i);
            if (isUpperCase(chuoi.charAt(i))) {
                count++;
                upperChars.append(chuoi.charAt(i));
            }
        }
        System.out.println("So ky tu viet hoa: " + count + "(" + upperChars + ")");
    }
    public void ex2() {
        String myString = "Automation - Kiểm thử tự động";
        char charToCount = 't';
        int count = 0;
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == charToCount) {
                count++;
            }
        }
        System.out.println("Số lần ký tự '" + charToCount + "' xuất hiện là: " + count);
    }
}
