
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
    private String Ma,HoTen,Lop,Email;
    public SinhVien(String ma,String hoTen,String lop,String email){
        this.Ma=ma;
        this.HoTen=hoTen;
        this.Lop=lop;
        this.Email=email;
    }

    @Override
    public String toString() {
        return Ma+" "+HoTen+" "+Lop+" "+Email;
    }

    public String getMa() {
        return Ma;
    }

    public String getLop() {
        return Lop;
    }
    
    
}
public class LietkeSVTheoLop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<SinhVien> ds=new ArrayList<>();
        sc.nextLine();
        while(n-->0){
            SinhVien sv=new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            ds.add(sv);
        }
        int a=sc.nextInt();  
        sc.nextLine();
        while(a-->0){
            String lop=sc.nextLine();    
            System.out.println("DANH SACH SINH VIEN LOP "+lop+":");
            for(SinhVien x:ds){
                if(x.getLop().compareTo(lop)==0){
                    System.out.println(x);
                }
            }
        }
    }
}
