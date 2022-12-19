
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
class SV {
    private String Ma, Ten, Lop;
    private float Diem1, Diem2, Diem3;

    public SV(String Ma, String Ten, String Lop, float Diem1, float Diem2, float Diem3) {
        this.Ma = Ma;
        this.Ten = Ten;
        this.Lop = Lop;
        this.Diem1 = Diem1;
        this.Diem2 = Diem2;
        this.Diem3 = Diem3;
    }

    public String getMa() {
        return Ma;
    }

   
    @Override
    public String toString() {
        return Ma+" "+Ten+" "+Lop+" "+String.format("%.1f", Diem1)+" "+String.format("%.1f", Diem2)+" "+String.format("%.1f", Diem3);
    }
    
}

public class BangDiemTP1 {
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
            ds.add(new SV(Ma,Ten,Lop,diem1,diem2,diem3));
        }
        ds.sort(Comparator.comparing(SV::getMa));
        for(int i=0;i<ds.size();i++){
            System.out.println((i+1)+" "+ds.get(i));
        }
    }
}
