package BT1_Bien;

public class SinhVien {
    static String Ho = "Le";
    public String Dem;

    public SinhVien(String Dem) {
        this.Dem = Dem;
    }

    public void showStudent() {
        System.out.println("Đệm: " + Dem);
    }

    public static void main(String[] args) {
        String Ten = "Phong";
        SinhVien sv = new SinhVien("Van");
        System.out.println("Họ: " + Ho);
        sv.showStudent();
        System.out.println("Tên: " + Ten);
        System.out.println("Tuổi: " + ThongTin.Tuoi);
    }
}
