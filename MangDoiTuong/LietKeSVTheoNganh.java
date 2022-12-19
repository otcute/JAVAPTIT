
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
class MH {

    private String ma, ten, lop, gmail;

    public MH(String ma, String ten, String lop, String gmail) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.gmail = gmail;
    }

    public String getMa() {
        return ma;
    }

    public String getLop() {
        return lop;
    }
     public String getChuanhoa(){
        String s = ma.substring(3,7) ;
        if(s.equals("DCKT")) return "KE TOAN" ;
        if(s.equals("DCCN")) return "CONG NGHE THONG TIN" ;
        if(s.equals("DCAT")) return "AN TOAN THONG TIN" ;
        if(s.equals("DCVT")) return "VIEN THONG" ;
        return "DIEN TU" ;
        
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + gmail;
    }

}

public class LietKeSVTheoNganh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        sc.nextLine();
        ArrayList<MH> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            MH a = new MH(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            list.add(a);
        }
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String tv = sc.nextLine();
            String s = tv.toUpperCase() ;
            System.out.println("DANH SACH SINH VIEN NGANH " + tv.toUpperCase() + ":");
            for (MH x : list) {
                if (x.getChuanhoa().equals(s)) {
                    if (x.getMa().substring(3, 7).equals("DCCN") && x.getLop().substring(0, 1).equals("E")) {
                         continue;
                    } else if (x.getMa().substring(3, 7).equals("DCAT") && x.getLop().substring(0, 1).equals("E")) {
                         continue;
                    }
                    else{
                        System.out.println(x);
                    }
                }
            }
        }
    }
}