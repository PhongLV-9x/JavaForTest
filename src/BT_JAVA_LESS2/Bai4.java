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
//        bai4.ex5();
//        bai4.ex6(); //Chua lam dc
//        bai4.ex7();
//        bai4.ex8(); //Chua lam dc
//        bai4.ex9();
//        bai4.ex10();
//        bai4.ex11();
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

    public void ex5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nam can kiem tra: ");
        int nam = sc.nextInt();

        if (nam % 4 == 0) {
            System.out.println("day la nam nhuan");
        } else {
            System.out.println("day la nam khong nhuan");
        }
    }

    public void ex6() {

    }

    public void ex7() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so dien: ");
        int soDien = sc.nextInt();

        if (soDien > 0 && soDien <= 50) {
            int tienDien = soDien * 1000;
            System.out.println("So tien " + soDien + "va phai dong so tien la: " + tienDien);
        } else if (soDien > 50 && soDien <= 100) {
            int tienDien = soDien * 1200;
            System.out.println("So dien " + soDien + " va phai dong so tien la: " + tienDien);
        } else if (soDien > 100 && soDien <= 200) {
            int tienDien = soDien * 1500;
            System.out.println("So dien " + soDien + " va phai dong so tien la: " + tienDien);
        } else if (soDien > 200) {
            int tienDien = soDien * 2000;
            System.out.println("So dien " + soDien + " va phai dong so tien la: " + tienDien);
        }
    }

    public void ex8() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so a: ");
        double a = sc.nextDouble();
        System.out.println("Nhap so b: ");
        double b = sc.nextDouble();
        System.out.println("Nhap so c: ");
        double c = sc.nextDouble();

        double delta = b * b - 4 * a * c;

        if (delta > 0) {

        }

    }

    public void ex9() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu cao (m): ");
        double chieuCao = sc.nextDouble();
        System.out.print("Nhap can nag (kg): ");
        double canNang = sc.nextDouble();

        double BMI = canNang / (chieuCao * chieuCao);

        if (BMI < 18.5) {
            System.out.println("Gay");
        } else if (BMI >= 18.5 && BMI < 24.9) {
            System.out.println("Binh thuong");
        } else if (BMI >= 24.9 && BMI < 29.9) {
            System.out.println("Hoi beo");
        } else if (BMI >= 29.9) {
            System.out.println("Beo phi");
        }
        sc.close();
    }

    public void ex10() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap canh a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap canh b: ");
        double b = sc.nextDouble();
        System.out.print("Nhap canh c: ");
        double c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Day la tam giac");
        } else {
            System.out.println("Day khong phai tam giac");
        }
        sc.close();
    }

    public void ex11() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen 1-12: ");
        int nam = sc.nextInt();

        if(nam < 1 || nam > 12) {
            System.out.println("Khong hop le");
            return;
        }

        switch (nam) {
            case 1:
                System.out.println("Thang 1");
                break;
            case 2:
                System.out.println("Thang 2");
                break;
            case 3:
                System.out.println("Thang 3");
                break;
            case 4:
                System.out.println("Thang 4");
                break;
            case 5:
                System.out.println("Thang 5");
                break;
            case 6:
                System.out.println("Thang 6");
                break;
            case 7:
                System.out.println("Thang 7");
                break;
            case 8:
                System.out.println("Thang 8");
                break;
            case 9:
                System.out.println("Thang 9");
                break;
            case 10:
                System.out.println("Thang 10");
                break;
            case 11:
                System.out.println("Thang 11");
                break;
            case 12:
                System.out.println("Thang 12");
                break;
        }
        sc.close();
    }
}


