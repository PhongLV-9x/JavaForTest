package BT_JAVA_LESS2;

public class Bai1_less2 {
    public static void main(String[] args) {
        Bai1_less2 livecode = new Bai1_less2();
        livecode.ex1();
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
}
