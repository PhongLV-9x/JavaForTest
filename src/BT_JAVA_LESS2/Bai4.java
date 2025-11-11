package BT_JAVA_LESS2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Bai4 bai4 = new Bai4();
//        bai4.ex1();
//        bai4.ex2();
//        bai4.ex3();
//        bai4.ex4();
        bai4.ex5();
    }

    public void ex1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen: ");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("Day la so chan");
        } else {
            System.out.println("Day la so le");
        }

    }

    public void ex2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so bat ky: ");
        int number = sc.nextInt();
        if (number > 0) {
            System.out.println("Day la so duong");
        } else if (number < 0) {
            System.out.println("Day la so am");
        } else {
            System.out.println("Khong phai so am, khong phai so duong");
        }
    }

    public void ex3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so tuoi: ");
        int tuoi = sc.nextInt();
        if (tuoi >= 18) {
            System.out.println("Du tuoi di too");
        } else if (tuoi < 18) {
            System.out.println("Chua du tuoi nhe");
        }
    }

    public void ex4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so diem: ");
        int diem = sc.nextInt();

        if (diem >= 90) {
            System.out.println("Xep loai A: " + diem);
        } else if (diem >= 80) {
            System.out.println("Xep loai B: " + diem);
        } else if (diem >= 70) {
            System.out.println("Xep loai C: " + diem);
        } else if (diem >= 60) {
            System.out.println("Xep loai D: " + diem);
        } else if (diem < 60) {
            System.out.println("Xep loai F: " + diem);
        }
    }


    public void ex5(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nam can kiem tra: ");
        int nam = sc.nextInt();

        if(nam % 4 == 0){
            System.out.println("day la nam nhuan");
        } else {
            System.out.println("day la nam khong nhuan");
        }
    }
}


