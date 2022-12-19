
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
class NhanVien{
    private String MaNhanVien,HoTen,GioiTinh,NgaySinh,DiaChi,MaSoThue,NgayKiHopDong;
    public NhanVien(String hoTen, String gioiTinh, String ngaySinh,String diaChi,String maSoThue,String ngayKiHopDong){
        this.DiaChi=diaChi;
        this.GioiTinh=gioiTinh;
        this.HoTen=hoTen;
        this.MaSoThue=maSoThue;
        this.NgayKiHopDong=ngayKiHopDong;
        this.NgaySinh=ngaySinh;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }
    
    

    @Override
    public String toString() {
        return MaNhanVien+" "+HoTen+" "+GioiTinh+" "+NgaySinh+" "+DiaChi+" "+MaSoThue+" "+NgayKiHopDong;
    }
    
}
public class SXDSDoiTuongNV {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        ArrayList<NhanVien> ds=new ArrayList<>();
        for(int i=1;i<=n;i++){
            NhanVien nv=new NhanVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            if(i<10){
                nv.setMaNhanVien("0000"+i);
            }else {
                nv.setMaNhanVien("000"+i);
            }
            ds.add(nv);
        }
        Collections.sort(ds,new Comparator<NhanVien>() {
            @Override
//            public int compare(NhanVien o1, NhanVien o2) {
//                if(o1.getNgaySinh().substring(6).toString().compareTo(o1.getNgaySinh().substring(6).toString())>0)   return 1;
//                else if(o1.getNgaySinh().substring(6).toString().compareTo(o1.getNgaySinh().substring(6).toString())==0){
//                    if(o1.getNgaySinh().substring(3,5).toString().compareTo(o2.getNgaySinh().substring(3,5).toString())>0)  return 1;
//                    else if(o1.getNgaySinh().substring(3,5).toString().compareTo(o2.getNgaySinh().substring(3,5).toString())==0){
//                        if(o1.getNgaySinh().substring(0,2).toString().compareTo(o2.getNgaySinh().substring(0,2).toString())>0)  return 1;
//                    }
//                }
//                return -1;
//            }
            public int compare(NhanVien o1, NhanVien o2) {
               if(o1.getNgaySinh().substring(6).toString().compareTo(o2.getNgaySinh().toString().substring(6)) > 0) return 1;
               else if(o1.getNgaySinh().substring(6).toString().compareTo(o2.getNgaySinh().toString().substring(6)) == 0) {
                   if(o1.getNgaySinh().toString().substring(3,5).compareTo(o2.getNgaySinh().toString().substring(3,5)) > 0) return 1;
                   else if(o1.getNgaySinh().toString().substring(3,5).compareTo(o2.getNgaySinh().toString().substring(3,5)) == 0) {
                      if(o1.getNgaySinh().toString().substring(0, 2).compareTo(o2.getNgaySinh().toString().substring(0, 2)) > 0) return 1;
                    }
               }
               return -1;
            }
        });
        for(NhanVien x:ds){
            System.out.println(x);
        }
    }
}
