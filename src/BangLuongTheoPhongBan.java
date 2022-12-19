
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
class PB{
    private String Chuoi;

    public PB(String Chuoi) {
        this.Chuoi=Chuoi;
    }
    public String Ma(){
        String[] a=Chuoi.split(" ");
        return a[0];
    }
    public String Ten(){
        String[] a=Chuoi.split(" ");
        String kq="";
        for(int i=1;i<a.length-1;i++){
            kq+=a[i]+" ";
        }
        kq=kq+a[a.length-1];
        return kq;
    }
    
}
class NV{
    private String Ma,Ten;
    private long Luong,SoNgay;

    public NV(String Ma, String Ten, long Luong, long SoNgay) {
        this.Ma = Ma;
        this.Ten = Ten;
        this.Luong = Luong;
        this.SoNgay = SoNgay;
    }
    public String Nhom(){
        return Ma.substring(0,1);
    }
    public long Luong(){
        long luong=0;
        if(Nhom().equals("A") && (Integer.valueOf(Ma.substring(1,3))>=1 && Integer.valueOf(Ma.substring(1,3))<=3)){
            luong=Luong*SoNgay*10*1000;
        }
        else if(Nhom().equals("A") && (Integer.valueOf(Ma.substring(1,3))>=4 && Integer.valueOf(Ma.substring(1,3))<=8)){
            luong=Luong*SoNgay*12*1000;
        }
        else if(Nhom().equals("A") && (Integer.valueOf(Ma.substring(1,3))>=9 && Integer.valueOf(Ma.substring(1,3))<=15)){
            luong=Luong*SoNgay*14*1000;
        }
        else if(Nhom().equals("A") && (Integer.valueOf(Ma.substring(1,3))>=16)){
            luong=Luong*SoNgay*20*1000;
        }
        else if(Nhom().equals("B") && (Integer.valueOf(Ma.substring(1,3))>=1 && Integer.valueOf(Ma.substring(1,3))<=3)){
            luong=Luong*SoNgay*10*1000;
        }
        else if(Nhom().equals("B") && (Integer.valueOf(Ma.substring(1,3))>=4 && Integer.valueOf(Ma.substring(1,3))<=8)){
            luong=Luong*SoNgay*11*1000;
        }
        else if(Nhom().equals("B") && (Integer.valueOf(Ma.substring(1,3))>=9 && Integer.valueOf(Ma.substring(1,3))<=15)){
            luong=Luong*SoNgay*13*1000;
        }
        else if(Nhom().equals("B") && (Integer.valueOf(Ma.substring(1,3))>=16)){
            luong=Luong*SoNgay*16*1000;
        }
        else if(Nhom().equals("C") && (Integer.valueOf(Ma.substring(1,3))>=1 && Integer.valueOf(Ma.substring(1,3))<=3)){
            luong=Luong*SoNgay*9*1000;
        }
        else if(Nhom().equals("C") && (Integer.valueOf(Ma.substring(1,3))>=4 && Integer.valueOf(Ma.substring(1,3))<=8)){
            luong=Luong*SoNgay*10*1000;
        }
        else if(Nhom().equals("C") && (Integer.valueOf(Ma.substring(1,3))>=9 && Integer.valueOf(Ma.substring(1,3))<=15)){
            luong=Luong*SoNgay*12*1000;
        }
        else if(Nhom().equals("C") && (Integer.valueOf(Ma.substring(1,3))>=16)){
            luong=Luong*SoNgay*14*1000;
        }
        else if(Nhom().equals("D") && (Integer.valueOf(Ma.substring(1,3))>=1 && Integer.valueOf(Ma.substring(1,3))<=3)){
            luong=Luong*SoNgay*8*1000;
        }
        else if(Nhom().equals("D") && (Integer.valueOf(Ma.substring(1,3))>=4 && Integer.valueOf(Ma.substring(1,3))<=8)){
            luong=Luong*SoNgay*9*1000;
        }
        else if(Nhom().equals("D") && (Integer.valueOf(Ma.substring(1,3))>=9 && Integer.valueOf(Ma.substring(1,3))<=15)){
            luong=Luong*SoNgay*11*1000;
        }
        else if(Nhom().equals("D") && (Integer.valueOf(Ma.substring(1,3))>=16)){
            luong=Luong*SoNgay*13*1000;
        }
        return luong;
    }

    public String getMa() {
        return Ma;
    }
    

    @Override
    public String toString() {
        return Ma+" "+Ten+" "+Luong();
    }
    
}
public class BangLuongTheoPhongBan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<PB> ds=new ArrayList<>();
        ArrayList<NV> ds1=new ArrayList<>();
        int n=Integer.parseInt(sc.nextLine());
        while(n-->0){
            String s=sc.nextLine();
            ds.add(new PB(s));
        }
        int m=Integer.parseInt(sc.nextLine());
        while(m-->0){
            String Ma=sc.nextLine();
            String Ten=sc.nextLine();
            long Luong=Long.parseLong(sc.nextLine());
            long SoNgay=Long.parseLong(sc.nextLine());
            NV nv=new NV(Ma, Ten, Luong, SoNgay);
            ds1.add(nv);
        }
        String pb=sc.nextLine();
        for(PB x:ds){
            if(x.Ma().equals(pb)){
                System.out.println("Bang luong phong "+x.Ten()+":");
            }
        }
        for(NV x:ds1){
            if(x.getMa().substring(3).equals(pb)){
                System.out.println(x);
            }
        }
    }
}
