package BT4_IF_ELSE;

public class Switch_case {
    public static void main(String[] args) {
        String Ten = "Hiền";
        switch (Ten) {
            case "Nam":
                System.out.println("Đây là NamCT");
                break;
            case "Phong":
                System.out.println("Đây là PhongLV");
                break;
            case "Thanh":
                System.out.println("Đây là ThanhHH");
                break;
            default:
                System.out.println("Tên không tồn tại");
                break;
        }
    }
}
