
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
    private int STT;
    private String Ma,Ten,Lop,Email,DN;

    public SV(int STT, String Ma, String Ten, String Lop, String Email, String DN) {
        this.STT = STT;
        this.Ma = Ma;
        this.Ten = Ten;
        this.Lop = Lop;
        this.Email = Email;
        this.DN = DN;
    }

    public String getMa() {
        return Ma;
    }

    

    public String getDN() {
        return DN;
    }

    @Override
    public String toString() {
        return STT+" "+Ma+" "+Ten+" "+Lop+" "+Email+" "+DN;
    }
    
}
public class DSThucTap2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<SV> ds=new ArrayList<>();
        for(int i=1;i<=n;i++){
            int STT=i;
            String Ma=sc.nextLine();
            String Ten=sc.nextLine();
            String Lop=sc.nextLine();
            String Email=sc.nextLine();
            String DN=sc.nextLine();
            ds.add(new SV(STT,Ma,Ten,Lop,Email,DN));
        }
        int q=sc.nextInt();
        sc.nextLine();
        while(q-->0){
            //sc.nextLine();
            String dn=sc.nextLine();
            //sc.nextLine();
            Collections.sort(ds,new Comparator<SV>() {
                @Override
                public int compare(SV o1, SV o2) {
                    if(o1.getMa().compareTo(o2.getMa())>0)  return 1;
                    return -1;
                }
            });
            for(SV x:ds){
                if(x.getDN().contains(dn)){
                    System.out.println(x);
                }
            }
        }
    }
}
