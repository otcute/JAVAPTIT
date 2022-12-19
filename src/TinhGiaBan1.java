
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
class MatHang{
    private String Ma,Ten,DVT;
    private long DonGia,SoLuong;

    public MatHang(String Ma,String Ten, String DVT, long DonGia, long SoLuong) {
        this.Ma=Ma;
        this.Ten = Ten;
        this.DVT = DVT;
        this.DonGia = DonGia;
        this.SoLuong = SoLuong;
    }
    public long PhiVanChuyen(){
        long phi=0;
        phi=Math.round((DonGia*SoLuong*0.05));
        return phi;
    }
    public long ThanhTien(){
        long tien=0;
        tien=Math.round(DonGia*SoLuong+PhiVanChuyen());
        return tien;
    }
    public long GiaBan(){
        long gia=0;
        gia=Math.round(ThanhTien()+0.02*ThanhTien());
        return gia;
    }

    public String getMa() {
        return Ma;
    }

    @Override
    public String toString() {
        return Ma+" "+Ten+" "+DVT+" "+PhiVanChuyen()+" "+ThanhTien()+" "+GiaBan();
    }
    
}
public class TinhGiaBan1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> ds=new ArrayList<>();
        for(int i=1;i<=n;i++){
            String Ma="MH"+String.format("%02d", i);
            String Ten=sc.nextLine();
            String DVT=sc.nextLine();
            long DonGia=Long.parseLong(sc.nextLine());
            long SoLuong=Long.parseLong(sc.nextLine());
            ds.add(new MatHang(Ma, Ten, DVT, DonGia, SoLuong));
        }
        for(MatHang x: ds){
            System.out.println(x);
        }
    }
   
}
