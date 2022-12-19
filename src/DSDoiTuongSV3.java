
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
class SinhVien{
    private String MaSV,HoTen,NgaySinh,Lop;
    private float GPA;
    public SinhVien(String hoTen,String lop,String ngaySinh,float gpa){
        this.GPA=gpa;
        this.HoTen=hoTen;
        this.Lop=lop;
        this.NgaySinh=ngaySinh;
    }
    public String ChuanHoaNgaySinh(String s){
        String[] a=s.split("/");
        String kq="";
        if(a[0].length()==1){
            a[0]="0"+a[0];
        }
        if(a[1].length()==1){
            a[1]="0"+a[1];
        }
        kq=a[0]+"/"+a[1]+"/"+a[2];
        return kq;
//          if(s.charAt(2)!='/'){
//              s="0"+s;
//          }
//          if(s.charAt(5)!='/'){
//              s=s.substring(0,3)+"0"+s.substring(3);
//          }
//          return s;
    }

    public String ChuanHoaHoTen(String s){
        s=s.trim().toLowerCase();
        while(s.contains("  ")){
            s=s.replace("  "," ");
        }
        String[] a=s.split(" ");
        String kq="";
        for(int i=0;i<a.length;i++){
            kq+=a[i].substring(0,1).toUpperCase()+a[i].substring(1)+" ";
        }
        return kq;
    }
    
    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getMaSV() {
        return MaSV;
    }

    public String getHoTen() {
        return ChuanHoaHoTen(HoTen);
    }

    public String getNgaySinh() {
        return ChuanHoaNgaySinh(NgaySinh);
    }

    public String getLop() {
        return Lop;
    }

    public float getGPA() {
        return GPA;
    }

    @Override
    public String toString() {
        return MaSV+" "+ChuanHoaHoTen(HoTen)+" "+Lop+" "+ChuanHoaNgaySinh(NgaySinh)+" "+String.format("%.2f", GPA);
    }
    
    
}
public class DSDoiTuongSV3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<SinhVien> ds=new ArrayList<>();
        for(int i=1;i<=n;i++){
            sc.nextLine();
            String HoTen=sc.nextLine();
            String Lop=sc.nextLine();
            String NgaySinh=sc.nextLine();
            float GPA=sc.nextFloat();
            SinhVien sv=new SinhVien(HoTen, Lop, NgaySinh, GPA);
            NgaySinh=sv.ChuanHoaNgaySinh(NgaySinh);
            HoTen=sv.ChuanHoaHoTen(HoTen);
            if(i<10){
                sv.setMaSV("B20DCCN00"+i);
            }else{
                sv.setMaSV("B20DCCN0"+i);
            }
            ds.add(sv);
        }
        Collections.sort(ds,new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if(o1.getGPA()<o2.getGPA())   return 1;
                return -1;
            }
        });
        for(SinhVien x:ds){
                System.out.println(x);
            }
        
    }
}
