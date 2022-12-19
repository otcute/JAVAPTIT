
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
class GV{
    private String Ma,Ten,MaXet;
    private double DiemTin,DiemChuyenMon;

    public GV(String Ma, String Ten, String MaXet, double DiemTin, double DiemChuyenMon) {
        this.Ma = Ma;
        this.Ten = Ten;
        this.MaXet = MaXet;
        this.DiemTin = DiemTin;
        this.DiemChuyenMon = DiemChuyenMon;
    }

    public String getMa() {
        return Ma;
    }
    
    public String MonHoc(){
        String Monhoc="";
        if(MaXet.substring(0,1).compareTo("A")==0)    Monhoc="Toan";
        else if(MaXet.substring(0,1).compareTo("B")==0)   Monhoc="Ly";
        else if(MaXet.substring(0,1).compareTo("C")==0)   Monhoc="Hoa";
        return Monhoc;
    }
    public double DiemUuTien(){
        if(MaXet.substring(1).compareTo("1")==0)  return 2.0;
        else if(MaXet.substring(1).compareTo("2")==0)  return 1.5;
        else if(MaXet.substring(1).compareTo("3")==0)  return 1.0;
        else return 0.0;
    }
    public double TongDiem(){
        return DiemTin*2+DiemChuyenMon+DiemUuTien();
    }
    public String XepLoai(){
        if(TongDiem()>=18)   return "TRUNG TUYEN";
        else return "LOAI";
    }

    @Override
    public String toString() {
        return Ma+" "+Ten+" "+MonHoc()+" "+String.format("%.1f", TongDiem())+" "+XepLoai();
    }
    
}
public class TuyenGV {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        ArrayList<GV> ds=new ArrayList<>();
        for(int i=1;i<=n;i++){
            String Ma="GV"+String.format("%02d", i);
            String Ten=sc.nextLine();
            String MaXet=sc.nextLine();
            double DiemTin=Double.parseDouble(sc.nextLine());
            double DiemChuyenMon=Double.parseDouble(sc.nextLine());
            GV gv=new GV(Ma, Ten, MaXet, DiemTin, DiemChuyenMon);
            ds.add(gv);
        }
        Collections.sort(ds,new Comparator<GV>() {
            @Override
            public int compare(GV o1, GV o2) {
                if(o1.TongDiem()<=o2.TongDiem())  return 1;
                else return -1;
            }
        });
        for(GV x:ds){
            System.out.println(x);
        }
    }
}
