
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

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getMaSV() {
        return MaSV;
    }

    public String getHoTen() {
        return HoTen;
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
    
}
public class DSDoiTuongSV1 {
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
            if(i<10){
                sv.setMaSV("B20DCCN00"+i);
            }else{
                sv.setMaSV("B20DCCN0"+i);
            }
            ds.add(sv);
        }
        for(SinhVien x:ds){
                System.out.print(x.getMaSV()+" "+x.getHoTen()+" "+x.getLop()+" "+x.getNgaySinh()+" ");
                System.out.printf("%.2f",x.getGPA());
                System.out.println();
            }
        
    }
}
