
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
    public String Ten(){
        return Ma.substring(0,1);
    }

    @Override
    public String toString() {
        return Ma+" "+SoLuong+" "+XuatHang()+" "+DonGia()+" "+ThanhTien()+" "+Thue();
    }
    
}
public class LietKeNhapXuatHangTheoNhom {
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
        String s=sc.nextLine();
        Collections.sort(ds,new Comparator<Hang>() {
            @Override
            public int compare(Hang o1, Hang o2) {
                if(o1.Thue()<o2.Thue())  return 1;
                else return -1;
            }
        });
        for(Hang x:ds){
            if(x.Ten().compareTo(s)==0){
                System.out.println(x);
            }
        }
    }
}
