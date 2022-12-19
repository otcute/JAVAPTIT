
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
class CuaRo{
    private String Ten,DonVi,Time;

    public CuaRo(String Ten, String DonVi, String Time) {
        this.Ten = Ten;
        this.DonVi = DonVi;
        this.Time = Time;
    }
    public int SoPhut(){
        int sophut=0;
        String[] a=Time.split(":");
        sophut=Integer.valueOf(a[0])*60+Integer.valueOf(a[1])-6*60;
        return sophut;
    }
   
    public String Ma(){
        String ma="";
        String[] a=DonVi.split(" ");
        for(int i=0;i<a.length;i++){
            ma+=a[i].substring(0,1);
        }
        String[] b=Ten.split(" ");
        for(int i=0;i<b.length;i++){
            ma+=b[i].substring(0,1);
        }
        return ma;
    }

    @Override
    public String toString() {
        return Ma()+" "+Ten+" "+DonVi;
    }
    
}

public class DuaXeDap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<CuaRo> ds=new ArrayList<>();
        while(n-->0){
            String Ten=sc.nextLine();
            String DonVi=sc.nextLine();
            String Time=sc.nextLine();
            ds.add(new CuaRo(Ten, DonVi, Time));
        }
        Collections.sort(ds,new Comparator<CuaRo>() {
            @Override
            public int compare(CuaRo o1, CuaRo o2) {
                if(o1.SoPhut()>o2.SoPhut())   return 1;
                else return -1;
            }
        });
        for(CuaRo x:ds){
            System.out.println(x+" "+(int)Math.round((7200.0/x.SoPhut()))+" Km/h");
        }
    }
}
