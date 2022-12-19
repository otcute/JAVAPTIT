
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
class SV{
    private String Ma,Ten;
    private double Toan,Ly,Hoa;
    private String XepLoai;
    public SV(String Ma, String Ten, double Toan, double Ly, double Hoa) {
        this.Ma = Ma;
        this.Ten = Ten;
        this.Toan = Toan;
        this.Ly = Ly;
        this.Hoa = Hoa;
    }
    public double DiemTB(){
        return Toan*2+Ly+Hoa;
    }
    public double UuTien(){
        if(Ma.substring(0,3).equals("KV1"))  return 0.5;
        else if(Ma.substring(0,3).equals(("KV2")))   return 1.0;
        else return 2.5;
    }
    public double TongDiem(){
        return DiemTB()+UuTien();
    }

    public String getMa() {
        return Ma;
    }
    
    public String SoSanh(double s){
        if((int)s==s){
            return String.valueOf((int)s);
        } else return String.valueOf(s);
    }

    public void setXepLoai(String XepLoai) {
        this.XepLoai = XepLoai;
    }

    @Override
    public String toString() {
        return Ma+" "+Ten+" "+SoSanh(UuTien())+" "+SoSanh(TongDiem())+" "+XepLoai;
    }
    
}
public class XDDSTrungTuyen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<SV> ds=new ArrayList<>();
        while(n-->0){
            String Ma=sc.nextLine();
            String Ten=sc.nextLine();
            double Toan=Double.parseDouble(sc.nextLine());
            double Ly=Double.parseDouble(sc.nextLine());
            double Hoa=Double.parseDouble(sc.nextLine());
            ds.add(new SV(Ma, Ten, Toan, Ly, Hoa));
            
        }
        Collections.sort(ds,new Comparator<SV>() {
            @Override
            public int compare(SV o1, SV o2) {
                if(o1.TongDiem()<o2.TongDiem())   return 1;
                else if(o1.TongDiem()==o2.TongDiem()){
                    if(o1.getMa().compareTo(o2.getMa())>0)   return 1;
                    else return -1;
                }
                else return -1;
            }
        });
        int m=Integer.parseInt(sc.nextLine());
        double diemchuan=ds.get(m-1).TongDiem();
        for(SV x:ds){
            if(x.TongDiem()<diemchuan){
                x.setXepLoai("TRUOT");
            } else x.setXepLoai("TRUNG TUYEN");
        }
        System.out.println(diemchuan);
        for(SV x:ds){
            System.out.println(x);
        }
    }
}
