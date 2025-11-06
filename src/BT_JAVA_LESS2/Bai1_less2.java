package BT_JAVA_LESS2;

import javax.xml.namespace.QName;
import java.util.Scanner;

public class Bai1_less2 {
    public static void main(String[] args) {
        Bai1_less2 livecode = new Bai1_less2();
        //livecode.ex1();
        //livecode.ex2();
        //livecode.ex3();
        //livecode.ex4();
        //livecode.ex5();
        livecode.ex6();
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

    public void ex3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so bat ky: ");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("=> Day la so chan");
        } else if (number % 2 != 0) {
            System.out.println("=> Day la so le");
        }
        {
        }
    }

    public void ex4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        int firstNum = sc.nextInt();
        System.out.print("Nhap so thu hai: ");
        int secondNum = sc.nextInt();
        if (firstNum == secondNum) {
            System.out.println("=> Hai so co gia tri bang nhau ");
        } else if (firstNum > secondNum) {
            System.out.println("=> So co gia tri lon nhat la: " + firstNum);
        } else if (firstNum < secondNum) {
            System.out.println("=> So co gia tri lon nhat la: " + secondNum);
        }
    }

    public void ex5() {
        int firstNum = 100;
        int secondNum = 200;

        firstNum = firstNum + secondNum;
        secondNum = firstNum - secondNum;
        firstNum = firstNum - secondNum;

        System.out.println("So a sau khi hoan doi la: " + firstNum);
        System.out.println("So b sau khi hoan doi la: " + secondNum);
    }
    public void ex6(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin ten: ");
        String name = sc.nextLine();

        System.out.println("Nhap thong tin tuoi: ");
        int age = sc.nextInt();

        System.out.println("Nhap chieu cao: ");
        float high = sc.nextFloat();

        System.out.println("Nhap gioi tinh (F/M): ");
        char general = sc.next().charAt(0);

        System.out.println("\n ----- Thong tin ca nhan ----- \n");
        System.out.println("Ten: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("Chieu cao: " + high + "m");
        System.out.println("Gioi tinh (M/F): " + general);
    }
}
