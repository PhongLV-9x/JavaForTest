package BT13_Package;

public class Nhanvien {
    public String ten(){
        return "Nguyen Van A";
    }
    public int tuoi(){
        return 18;
    }
    public String ngaysinh(){
        return "01/01/1999";
    }
    public String diachi(){
        return "Ha Noi";
    }
    // Ghi đè toString()
    //@Override
    public String toString() {
        return ten() + "---" + tuoi() + "---" +  ngaysinh() + "---" + diachi();
    //}
    //public static void main(String[] args) {
        //Nhanvien nv = new Nhanvien();
    }
}



