import java.util.ArrayList;

public class DanhSachKhachHang {
private static ArrayList<KhachHang>danhSachKhachHang;
public DanhSachKhachHang()
{
    DanhSachKhachHang.danhSachKhachHang=new ArrayList<KhachHang>();
}
//Day la ham them khach hang
public static void themKhachHang()
{
System.out.println("Day la ham them khach hang");
}
//Day la ham xoa khach hang
public static void xoaKhachHang(String maKhachHang)
{
System.out.println("Day la ham xoa khach hang");
}
//Day la ham sua khach hang
public static void suaKhachHang()
{
System.out.println("Day la ham sua khach hang");
}
//day la ham index khach hang theo ccccd
public static int indexKhachHangTheoCCCD(String CCCD)
{
    System.out.println("Day la ham index Khach Hang Theo CCCD");
    return 0;
}
//Day la ham index khach hang theo ma khach hang
public static int indexKhachHangTheoMa(String maKhachHang)
{
    System.out.println("Day la ham index khach hang theo ma khach hang");
    return 0;
}
//day la ham liet ke khach hang theo ten
public static void lietKeKhachHangTheoTen(String ten)
{
    System.out.println("Day la ham liet ke khach hang theo ten");
}
}

