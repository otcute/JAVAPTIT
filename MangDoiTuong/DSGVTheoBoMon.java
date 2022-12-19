
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author DELL
 */
//class GV {
//
//    private String Ma, Ten, BoMon;
//
//    public GV(String ten, String boMon) {
//        this.Ten = ten;
//        this.BoMon = boMon;
//    }
//
//    public String ChuanHoa() {
//        String[] a = BoMon.split(" ");
//        String kq = "";
//        for (int i = 0; i < a.length; i++) {
//            kq += a[i].substring(0, 1).toUpperCase();
//        }
//        return kq;
//    }
//
//    public String getTen() {
//        return Ten;
//    }
//
//    public void setMa(String Ma) {
//        this.Ma = Ma;
//    }
//
//    public String getBoMon() {
//        return BoMon;
//    }
//
//    public String ten() {
//        String[] a = Ten.split(" ");
//        return a[a.length - 1];
//    }
//
//    @Override
//    public String toString() {
//        return Ma + " " + Ten + " " + ChuanHoa();
//    }
//
//}
class GV{
    String Ma;
    String Ten;
    String Nganh;

    public GV(String Ma, String Ten, String Nganh) {
        this.Ma = Ma;
        this.Ten = Ten;
        this.Nganh = Nganh;
    }
    public String ChuanHoa() {
        String[] a = Nganh.split(" ");
        String kq = "";
        for (int i = 0; i < a.length; i++) {
            kq += a[i].substring(0, 1).toUpperCase();
        }
        return kq;
    }

    @Override
    public String toString() {
        return Ma+" "+Ten+" "+ChuanHoa();
    }
    
}

public class DSGVTheoBoMon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<GV> ds = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String Ma="GV"+String.format("%02d", i);
            String Ten=sc.nextLine();
            String Nganh=sc.nextLine();
            ds.add(new GV(Ma,Ten,Nganh));
        }
        int a = sc.nextInt();
        sc.nextLine();

        while (a-- > 0) {
            String s = sc.nextLine();
            String[] c = s.split(" ");
            String kq = "";
            for (int i = 0; i < c.length; i++) {
                kq += c[i].substring(0, 1).toUpperCase();
            }
            System.out.println("DANH SACH GIANG VIEN BO MON " + kq + ":");
            for (GV x : ds) {
                if (x.ChuanHoa().equals(kq)) {
                    System.out.println(x);
                }
            }
        }
    }
}
