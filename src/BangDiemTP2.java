
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
class SV{
    private String Ma,Ten,Lop;
    float diem1,diem2,diem3;

    public SV(String Ma, String Ten, String Lop, float diem1, float diem2, float diem3) {
        this.Ma = Ma;
        this.Ten = Ten;
        this.Lop = Lop;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public String getTen() {
        return Ten;
    }

    @Override
    public String toString() {
        return Ma+" "+Ten+" "+Lop+" "+String.format("%.1f", diem1)+" "+String.format("%.1f", diem2)+" "+String.format("%.1f", diem3); 
    }
    
}
public class BangDiemTP2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        ArrayList<SV> ds=new ArrayList<>();
        for(int i=1;i<=n;i++){
            String Ma=sc.nextLine();
            String Ten=sc.nextLine();
            String Lop=sc.nextLine();
            float diem1=Float.parseFloat(sc.nextLine());
            float diem2=Float.parseFloat(sc.nextLine());
            float diem3=Float.parseFloat(sc.nextLine());
            ds.add(new SV(Ma, Ten, Lop, diem1, diem2, diem3));
        }
//        ds.sort(Comparator.comparing(SV::getTen));
//        for(int i=0;i<ds.size();i++){
//            System.out.println((i+1)+" "+ds.get(i));
//        }
        Collections.sort(ds,new Comparator<SV>() {
            @Override
            public int compare(SV o1, SV o2) {
                if(o1.getTen().compareTo(o2.getTen())>0)  return 1;
                return -1;
            }
        });
        for(int i=0;i<ds.size();i++){
            System.out.println((i+1)+" "+ds.get(i));
        }
    }
}
