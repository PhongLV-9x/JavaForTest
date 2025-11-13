package BT_JAVA_LESS2;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Bai6 bai6 = new Bai6();
        bai6.ex1();
    }
    public void ex1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so tien: ");
        int tienGui = sc.nextInt();
        if (tienGui <= 0) {
            System.out.println("So tien phai lon hon 0");
            return;
        }
        System.out.print("Nhap so lai suat: ");
        double laiSuat = sc.nextDouble();
        if (laiSuat <= 0) {
            System.out.println("Lai suat phai lon hon 0");
            return;
        }
        System.out.print("Nhao so thang: ");
        int thang = sc.nextInt();
        if (thang < 0) {
            System.out.println("So thang khong hop le");
            return;
        }
        double tinhLaisuat = ((tienGui * laiSuat) / 12) * thang;
        System.out.println("So tien lai la: " + tinhLaisuat);

        sc.close();
    }

    public void ex2() {

    }
}
