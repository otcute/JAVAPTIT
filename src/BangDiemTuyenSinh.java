
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

    @Override
    public String toString() {
        return Ma+" "+Ten+" "+SoSanh(KhuVuc())+" "+SoSanh(DiemTB())+" "+KetQua();
    }
    
}
public class BangDiemTuyenSinh {
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
        for(ThiSinh x:ds){
            System.out.println(x);
        }
    }
}
