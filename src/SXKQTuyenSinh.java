
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
class ThiSinh{
    private String Ma,Ten;
    private double Toan,Ly,Hoa;

    public ThiSinh(String Ma, String Ten, double Toan, double Ly, double Hoa) {
        this.Ma = Ma;
        this.Ten = Ten;
        this.Toan = Toan;
        this.Ly = Ly;
        this.Hoa = Hoa;
    }

    public String getMa() {
        return Ma;
    }
    
    public double KhuVuc(){
        if(Ma.substring(0,3).compareTo("KV1")==0){
            return 0.5;
        } else if(Ma.substring(0,3).compareTo("KV2")==0){
            return 1.0;
        } else return 2.5;
    }
    public double DiemTB(){
        return Toan*2+Ly+Hoa;
    }
    public String KetQua(){
        if(DiemTB()+KhuVuc()>=24){
            return "TRUNG TUYEN";
        }else return "TRUOT";
    }
    public String SoSanh(double a){
        if((int)a==a){
            return String.valueOf((int)a);
        }else return String.valueOf(a);
    }
    public double DiemXetTuyen(){
        return DiemTB()+KhuVuc();
    }

    @Override
    public String toString() {
        return Ma+" "+Ten+" "+SoSanh(KhuVuc())+" "+SoSanh(DiemXetTuyen())+" "+KetQua();
    }
    
}
public class SXKQTuyenSinh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> ds=new ArrayList<>();
        while(n-->0){
            String Ma=sc.nextLine();
            String Ten=sc.nextLine();
            double Toan=Double.parseDouble(sc.nextLine());
            double Ly=Double.parseDouble(sc.nextLine());
            double Hoa=Double.parseDouble(sc.nextLine());
            ThiSinh ts=new ThiSinh(Ma, Ten, Toan, Ly, Hoa);
            ds.add(ts);
        }
        Collections.sort(ds,new Comparator<ThiSinh>() {
            @Override
            public int compare(ThiSinh o1, ThiSinh o2) {
                if(o1.DiemXetTuyen()<o2.DiemXetTuyen())  return 1;
                else if(o1.DiemXetTuyen()==o2.DiemXetTuyen()){
                    if(o1.getMa().compareTo(o2.getMa())>0)   return 1;
                    else return -1;
                }
                else return -1;
            }
        });
        for(ThiSinh x:ds){
            System.out.println(x);
        }
    }
}
