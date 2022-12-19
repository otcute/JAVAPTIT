
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

    @Override
    public String toString() {
        return MaNhanVien+" "+HoTen+" "+GioiTinh+" "+NgaySinh+" "+DiaChi+" "+MaSoThue+" "+NgayKiHopDong;
    }
    
}
public class DSDoiTuongNV {
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
        for(NhanVien x:ds){
            System.out.println(x);
        }
    }
}
