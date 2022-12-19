
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
public class SXSVTheoLop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<SinhVien> ds=new ArrayList<>();
        sc.nextLine();
        for(int i=1;i<=n;i++){
            //sc.nextLine();
            SinhVien sv=new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            ds.add(sv);
        }
        Collections.sort(ds,new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if(o1.getLop().compareTo(o2.getLop())>0)   return 1;
                else if(o1.getLop().compareTo(o2.getLop())==0){
                    if(o1.getMa().compareTo(o2.getMa())>0)    return 1;
                }
                return -1;
            }
        });
        for(SinhVien sv:ds){
            System.out.println(sv);
        }
    }
}
