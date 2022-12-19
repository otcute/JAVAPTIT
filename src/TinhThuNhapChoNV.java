
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
class NV{
    private String Ma,Ten,ChucVu;
    private long Luong;
    private int SoNgayCong;

    public NV(String Ma, String Ten, String ChucVu, long Luong, int SoNgayCong) {
        this.Ma = Ma;
        this.Ten = Ten;
        this.ChucVu = ChucVu;
        this.Luong = Luong;
        this.SoNgayCong = SoNgayCong;
    }
    public long PhuCap(){
        long phucap=0;
        if(ChucVu.compareTo("GD")==0){
            phucap=500;
        }
        else if(ChucVu.compareTo("PGD")==0){
            phucap=400;
        }
        else if(ChucVu.compareTo("TP")==0){
            phucap=300;
        }
        else if(ChucVu.compareTo("KT")==0){
            phucap=250;
        }else{
            phucap=100;
        }
        return phucap;
    }
    public long LuongChinh(){
        long luongchinh=0;
        luongchinh=Luong*SoNgayCong;
        return luongchinh;
    }
    public long TamUng(){
        long tamung=0;
        float a=(PhuCap()+LuongChinh())*2/3;
        if(a<25000){
            tamung=(long)Math.round(a/1000)*1000;
        }else{
            tamung=25000;
        }
        return tamung;
    }
    public long ConLai(){
        return LuongChinh()-TamUng()+PhuCap();
    }

    @Override
    public String toString() {
        return Ma+" "+Ten+" "+PhuCap()+" "+LuongChinh()+" "+TamUng()+" "+ConLai();
    }
    
}
public class TinhThuNhapChoNV {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<NV> ds=new ArrayList<>();
        for(int i=1;i<=n;i++){
            String Ma="NV"+String.format("%02d", i);
            String Ten=sc.nextLine();
            String ChucVu=sc.nextLine();
            long Luong=Long.parseLong(sc.nextLine());
            int SoNgayCong=Integer.parseInt(sc.nextLine());
            NV nv=new NV(Ma, Ten, ChucVu, Luong, SoNgayCong);
            ds.add(nv);
        }
        for(NV x:ds){
            System.out.println(x);
        }
   }
}
