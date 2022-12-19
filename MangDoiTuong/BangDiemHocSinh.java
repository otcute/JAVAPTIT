
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
class HocSinh{
    private String MaHS,Ten;
    private float a,b,c,d,e,f,g,h,i,k;
    public HocSinh(String ten,float a,float b,float c,float d,float e,float f,float g,float h,float i,float k){
        this.Ten=ten;
        this.a=a; this.b=b; this.c=c; this.d=d; this.e=e; this.f=f; this.g=g; this.h=h; this.i=i; this.k=k;
    }
    public float DTB(){
        return (a*2+b*2+c+d+e+f+g+h+i+k)/12;
    }
    public String XepLoai(){
        String xeploai="";
        if(DTB()>=9)     xeploai="XUAT SAC";
        else if(DTB()>=8 && DTB()<=8.9)     xeploai="GIOI";
        else if(DTB()>=7 && DTB()<=7.9)     xeploai="KHA";
        else if(DTB()>=5 && DTB()<=6.9)      xeploai="TB";
        else    xeploai="YEU";
        return xeploai;
    }

    public void setMaHS(String MaHS) {
        this.MaHS = MaHS;
    }

    @Override
    public String toString() {
        return MaHS+" "+Ten+" "+Math.round(DTB()*10.0)/10.0+" "+XepLoai();
    }
    
}
public class BangDiemHocSinh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<HocSinh> ds=new ArrayList<>();
        //sc.nextLine();
        for(int i=1;i<=n;i++){
            sc.nextLine();
            HocSinh hs=new HocSinh(sc.nextLine(), sc.nextFloat(),sc.nextFloat(),sc.nextFloat(),sc.nextFloat(),sc.nextFloat(),sc.nextFloat(),sc.nextFloat(),sc.nextFloat(),sc.nextFloat(),sc.nextFloat());
            if(i<10){
                hs.setMaHS("HS0"+i);
            }else  hs.setMaHS("HS"+i);
            ds.add(hs);
        }
        Collections.sort(ds,new Comparator<HocSinh>() {
            @Override
            public int compare(HocSinh o1, HocSinh o2) {
                if(o1.DTB()<=o2.DTB())  return 1;
                return -1;
            }
        });
        for(HocSinh x:ds){
            System.out.println(x);
        }
    }
}
