package BT_JAVA_LESS2;

import java.util.Scanner;

public class Bai1_less2 {
    public static void main(String[] args) {
        Bai1_less2 livecode = new Bai1_less2();
        //livecode.ex1();
        livecode.ex2();
    }

    public void ex1() {
        int firstNum = 10;
        int secondNum = 20;
        double thirdNum = 30.5;
        double fourthNum = 40.6;
        boolean varChar1 = true;
        boolean varchar2 = false;
        String firstName = "Le";
        String fullName = "Van Phong";


        if (firstNum == secondNum) {
            System.out.println("So thu nhat bang so thu 2");
        } else if (firstNum > secondNum) {
            System.out.println("So thu nhat lon hon so thu 2");
        } else if (firstNum < secondNum) {
            System.out.println("So thu nhat nho hon so thu 2");


            if (thirdNum != fourthNum) {
                System.out.println("So thu 3 khac so thu 4");
            } else if (thirdNum >= fourthNum) {
                System.out.println("So thu 3 lon hon hoac bang so thu 4");
            } else if (thirdNum <= fourthNum) {
                System.out.println("So thu 3 nho hon hoac bang so  thu 4");
            }
            {

            }
            {
            }
            {

            }
            {
            }
        }
    }

    public void ex2() {
        //Lenh in
        Scanner sc = new Scanner(System.in);
        // In ra chieu dai
        System.out.print("Nhap chieu dai: ");
        double chieuDai = sc.nextDouble();
        //In ra chieu rong
        System.out.print("Nhap chieu rong: ");
        double chieuRong = sc.nextDouble();
        //Tinh chu vi va dien tich
        double chuVi = (chieuDai + chieuRong) * 2;
        double dienTich = chieuDai * chieuRong;

        System.out.println("Chu vi HCN la: " + chuVi);
        System.out.println("Dien tich HCN la: " + dienTich);
    }
}
