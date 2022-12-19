
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
class NV{
    private String Ma,Ten,ChucVu;
    private int SoNgayCong;
    private long Luong;

    public NV(String Ma,String Ten, String ChucVu, int SoNgayCong, long Luong) {
        this.Ma=Ma;
        this.Ten = Ten;
        this.ChucVu = ChucVu;
        this.SoNgayCong = SoNgayCong;
        this.Luong = Luong;
    }
    public long LuongThang(){
        return Luong*SoNgayCong;
    }
    public long TinhThuong(){
        long thuong=0;
        if(SoNgayCong>=25){
            thuong= (long)(0.2*LuongThang());
        }
        else if(SoNgayCong>=22){
            thuong= (long)(0.1*LuongThang());
        }
        else thuong=0;
        return thuong;
    }
    public int PhuCap(){
        int pc=0;
        if(ChucVu.compareTo("GD")==0){
            pc = 250000;
        }
        else if(ChucVu.compareTo("PGD")==0){
            pc = 200000;
        }
        else if(ChucVu.compareTo("TP")==0){
            pc = 180000;
        }
        else if(ChucVu.compareTo("NV")==0){
            pc = 150000;
        }
        return pc;
    }
    public long ThucLinh(){
        return LuongThang()+TinhThuong()+PhuCap();
    }

    public String getMa() {
        return Ma;
    }

    @Override
    public String toString() {
        return Ma+" "+Ten+" "+LuongThang()+" "+TinhThuong()+" "+PhuCap()+" "+ThucLinh();
    }
    
}
public class SXbangTinhCong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<NV> ds=new ArrayList<>();
        for(int i=1;i<=n;i++){
            String Ma="NV"+String.format("%02d", i);
            String Ten=sc.nextLine();
            long Luong=Long.parseLong(sc.nextLine());
            int SoNgayCong=Integer.parseInt(sc.nextLine());
            String ChucVu=sc.nextLine();
            NV nv=new NV(Ma,Ten, ChucVu, SoNgayCong, Luong);
            ds.add(nv);
        }
        Collections.sort(ds,new Comparator<NV>() {
            @Override
            public int compare(NV o1, NV o2) {
                if(o1.ThucLinh()<o2.ThucLinh())   return 1;
                return -1;
            }
        });
        for(NV x:ds){
            System.out.println(x);
        }
    }
}
