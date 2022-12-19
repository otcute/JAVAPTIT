
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import javax.crypto.Mac;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
class DonHang{
    private String TenHang,Ma;
    private int DonGia,SoLuong;

    public DonHang(String TenHang, String Ma, int DonGia, int SoLuong) {
        this.TenHang = TenHang;
        this.Ma = Ma;
        this.DonGia = DonGia;
        this.SoLuong = SoLuong;
    }
    public String STT(){
        return Ma.substring(1,4);
    }
    public int GiamGia(){
        int sale=0;
        if(Ma.substring(4,5).compareTo("1")==0){
            sale=(int)Math.round(DonGia*SoLuong*0.5);
        }
        else if(Ma.substring(4,5).compareTo("2")==0){
            sale=(int)Math.round(DonGia*0.3*SoLuong);
        }
        return sale;
    }
    public int ThanhTien(){
        return DonGia*SoLuong-GiamGia();
    }

    @Override
    public String toString() {
        return TenHang+" "+Ma+" "+STT()+" "+GiamGia()+" "+ThanhTien();
    }
    
}
public class SXDonHang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<DonHang> ds=new ArrayList<>();
        while(t-->0){
            String Ten=sc.nextLine();
            String Ma=sc.nextLine();
            int DonGia=Integer.parseInt(sc.nextLine());
            int SoLuong=Integer.parseInt(sc.nextLine());
            DonHang dh=new DonHang(Ten, Ma, DonGia, SoLuong);
            ds.add(dh);
        }
        Collections.sort(ds,new Comparator<DonHang>() {
            @Override
            public int compare(DonHang o1, DonHang o2) {
                if(o1.STT().compareTo(o2.STT())>0)  return 1;
                else return -1;
            }
        });
        for(DonHang x:ds){
            System.out.println(x);
        }
    }
}
