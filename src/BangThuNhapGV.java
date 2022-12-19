
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
class GV {
    private String ma, ten, chucVu;
    private int luongCB, bacLuong, phuCap, thuNhap;

    public GV() {
    }

    public GV(String ma, String ten, int luongCB) {
        this.ma = ma;
        this.ten = ten;
        this.luongCB = luongCB;
    }

    public int getBacLuong() {
        return Integer.parseInt(ma.substring(2, 4));
    }

    public int getPhuCap() {
        if(ma.substring(0, 2).compareTo("HT") == 0) return 2000000;
        else if(ma.substring(0, 2).compareTo("HP") == 0) return 900000;
        else return 500000;
    }

    public int getThuNhap() {
        return luongCB * getBacLuong() + getPhuCap();
    }

    public String getChucVu() {
        return ma.substring(0, 2);
    }

    
    
    @Override
    public String toString() {
        return ma + " " + ten + " " + getBacLuong() + " " + getPhuCap() + " " + getThuNhap();
    }
    
}
public class BangThuNhapGV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<GV> ds = new ArrayList<>();
        int dem1 = 0, dem2 = 0;
        while(n-- > 0) {
            GV a = new GV(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            if(a.getChucVu().compareTo("HT") == 0){
                dem1++;
                if(dem1 < 2) ds.add(a);
            }
            else if(a.getChucVu().compareTo("HP") == 0){
                dem2++;
                if(dem2 < 3) ds.add(a);
            } else ds.add(a);
        }
        for (GV  a : ds) {
            System.out.println(a);
        }
    }
}
