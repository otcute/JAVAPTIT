
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
    private String Ma,Ten,XepLoai;
    private int Nhap,DonGia,Xuat;
    public Hang(String Ma, String Ten, String XepLoai) {
        this.Ma = Ma;
        this.Ten = Ten;
        this.XepLoai = XepLoai;
    }
    public int TongNhap(){
        return Nhap*DonGia;
    }
    public int TongXuat(){
        if(XepLoai.equals("A")){
            return (int)(DonGia*Xuat*1.08);
        }else if(XepLoai.equals("B")){
            return (int)(DonGia*Xuat*1.05);
        }
        else return (int)(DonGia*Xuat*1.02);
    }

    public void setNhap(int Nhap) {
        this.Nhap = Nhap;
    }

    public void setDonGia(int DonGia) {
        this.DonGia = DonGia;
    }

    public void setXuat(int Xuat) {
        this.Xuat = Xuat;
    }

    public String getMa() {
        return Ma;
    }

    public int getNhap() {
        return Nhap;
    }

    public int getDonGia() {
        return DonGia;
    }

    public int getXuat() {
        return Xuat;
    }

    @Override
    public String toString() {
        return Ma+" "+Ten+" "+TongNhap()+" "+TongXuat();
    }
    
}
public class NhapXuatHang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<Hang> ds=new ArrayList<>();
        while(n-->0){
            String Ma=sc.nextLine();
            String Ten=sc.nextLine();
            String XepLoai=sc.nextLine();
            ds.add(new Hang(Ma, Ten, XepLoai));
        }
        
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.nextLine();
            String[] a=s.split(" ");
            for(Hang x:ds){
                if(x.getMa().equals(a[0])){
                    x.setNhap(Integer.valueOf(a[1]));
                    x.setDonGia(Integer.valueOf(a[2]));
                    x.setXuat(Integer.valueOf(a[3]));
                }
            }
        }
        for(Hang x:ds){
            System.out.println(x);
        }
    }
}
