
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
    private String Ten,Bai;

    public SV(String Ten, String Bai) {
        this.Ten = Ten;
        this.Bai = Bai;
    }

    

    public String getTen() {
        return Ten;
    }

    public int AC(){
        String[] a=Bai.split(" ");
        return Integer.valueOf(a[0]);
    }
    public int Sub(){
        String[] a=Bai.split(" ");
        return Integer.valueOf(a[1]);
    }

    @Override
    public String toString() {
        return Ten+" "+AC()+" "+Sub();
    }
    
}
public class BangXepHang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<SV> ds=new ArrayList<>();
        while(n-->0){
            String Ten=sc.nextLine();
            String Bai=sc.nextLine();
            SV sv=new SV(Ten, Bai);
            ds.add(sv);
        }
        Collections.sort(ds,new Comparator<SV>() {
            @Override
            public int compare(SV o1, SV o2) {
                if(o1.AC()<o2.AC())   return 1;
                else if(o1.AC()==o2.AC()){
                    if(o1.Sub()>o2.Sub())   return 1;
                    else if(o1.Sub()==o2.Sub()){
                        if(o1.getTen().compareTo(o2.getTen())>0)   return 1;
                        else return -1;
                    }
                    else return -1;
                }
                else return -1;
            }
        });
        for(SV x:ds){
            System.out.println(x);
        }
    }
}
