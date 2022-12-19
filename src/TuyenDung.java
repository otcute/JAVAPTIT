
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
class TS{
    private String Ma,Ten;
    private double LyThuyet,ThucHanh;

    public TS(String Ma, String Ten, double LyThuyet, double ThucHanh) {
        this.Ma = Ma;
        this.Ten = Ten;
        this.LyThuyet = LyThuyet;
        this.ThucHanh = ThucHanh;
    }

    public double getLyThuyet() {
        if(LyThuyet<=10){
            return LyThuyet;
        }
        else return LyThuyet/10;
    }

    public double getThucHanh() {
        if(ThucHanh<=10.0){
            return ThucHanh;
        }
        else return ThucHanh/10;
    }
    public double DiemTB(){
        return (getLyThuyet()+getThucHanh())/2;
    }
    public String XepLoai(){
        if(DiemTB()<5)   return "TRUOT";
        else if(DiemTB()<8)   return "CAN NHAC";
        else if(DiemTB()<=9.5)  return "DAT";
        else return "XUAT SAC";
    }

    @Override
    public String toString() {
        return Ma+" "+Ten+" "+String.format("%.2f", DiemTB())+" "+XepLoai();
    }
    
    
}
public class TuyenDung {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<TS> ds=new ArrayList<>();
        for(int i=1;i<=n;i++){
            String Ma="TS"+String.format("%02d", i);
            String Ten=sc.nextLine();
            double LyThuyet=Double.parseDouble(sc.nextLine());
            double ThucHanh=Double.parseDouble(sc.nextLine());
            TS ts=new TS(Ma, Ten, LyThuyet, ThucHanh);
            ds.add(ts);
        }
        Collections.sort(ds,new Comparator<TS>() {
            @Override
            public int compare(TS o1, TS o2) {
               if(o1.DiemTB()<o2.DiemTB())  return 1;
               return -1;
            }
        });
        for(TS x:ds){
            System.out.println(x);
        }
    }
}
