
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
class Hang{
    private String Ma;
    private long SoLuong;

    public Hang(String Ma, long SoLuong) {
        this.Ma = Ma;
        this.SoLuong = SoLuong;
    }
    public long XuatHang(){
        long xuat=0;
        if(Ma.substring(0,1).compareTo("A")==0){
            xuat=(long)Math.round(0.6*SoLuong);
        }
        else if(Ma.substring(0,1).compareTo("B")==0){
            xuat=(long)Math.round(0.7*SoLuong);
        }
        return xuat;
    }
    public long DonGia(){
        long dongia=0;
        if(Ma.substring(4,5).compareTo("Y")==0){
            dongia=110000;
        }else if(Ma.substring(4,5).compareTo("N")==0){
            dongia=135000;
        }
        return dongia;
    }
    public long ThanhTien(){
        return XuatHang()*DonGia();
    }
    public long Thue(){
        long thue=0;
        if(Ma.substring(0,1).compareTo("A")==0 && Ma.substring(4,5).compareTo("Y")==0){
            thue=(long)Math.round(0.08*ThanhTien());
        }else if(Ma.substring(0,1).compareTo("A")==0 && Ma.substring(4,5).compareTo("N")==0){
            thue=(long)Math.round(0.11*ThanhTien());
        }else if(Ma.substring(0,1).compareTo("B")==0 && Ma.substring(4,5).compareTo("Y")==0){
            thue=(long)Math.round(0.17*ThanhTien());
        }else if(Ma.substring(0,1).compareTo("B")==0 && Ma.substring(4,5).compareTo("N")==0){
            thue=(long)Math.round(0.22*ThanhTien());
        }
        return thue;
    }

    @Override
    public String toString() {
        return Ma+" "+SoLuong+" "+XuatHang()+" "+DonGia()+" "+ThanhTien()+" "+Thue();
    }
    
}
public class BangTheoDoiNhapXuatHang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<Hang> ds=new ArrayList<>();
        while(t-->0){
            String Ma=sc.nextLine();
            long SoLuong=Long.parseLong(sc.nextLine());
            Hang mh=new Hang(Ma, SoLuong);
            ds.add(mh);
        }
        for(Hang x:ds){
            System.out.println(x);
        }
    }
}
