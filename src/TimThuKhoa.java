
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
class ThiSinh{
    private int MaThiSinh;
    private String Ten,NgaySinh;
    private float Diem1,Diem2,Diem3;
    public ThiSinh(String ten,String ngaySinh,float diem1,float diem2,float diem3){
        this.Diem1=diem1;
        this.Diem2=diem2;
        this.Diem3=diem3;
        this.Ten=ten;
        this.NgaySinh=ngaySinh;
    }
    public float TongDiem(){
        return Diem1+Diem2+Diem3;
    }

    public void setMaThiSinh(int MaThiSinh) {
        this.MaThiSinh = MaThiSinh;
    }

    @Override
    public String toString() {
        return MaThiSinh+" "+Ten+" "+NgaySinh+" "+TongDiem();
    }
    
}
public class TimThuKhoa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<ThiSinh> ds=new ArrayList<>();
        for(int i=1;i<=n;i++){
            sc.nextLine();
            ThiSinh ts=new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextFloat(),sc.nextFloat(),sc.nextFloat());
            ts.setMaThiSinh(i);
            ds.add(ts);
        }
        float max=-1;
        for(ThiSinh x:ds){
            if(max<x.TongDiem())   max=x.TongDiem();
        }
        for(ThiSinh x:ds){
            if(x.TongDiem()==max)      System.out.println(x);           
        }
    }
}
