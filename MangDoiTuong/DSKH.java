
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
class KH{
    private String Ma,Ten,Sex,DOB,DiaChi;

    public KH(String Ma, String Ten, String Sex, String DOB, String DiaChi) {
        this.Ma = Ma;
        this.Ten = Ten;
        this.Sex = Sex;
        this.DOB = DOB;
        this.DiaChi = DiaChi;
    }
    public String CHTen(String s){
        s=s.trim().toLowerCase();
        while(s.contains("  ")){
            s=s.replace("  ", " ");
        }
        String[] a=s.split(" ");
        String kq="";
        for(int i=0;i<a.length;i++){
            kq+=a[i].substring(0, 1).toUpperCase()+a[i].substring(1)+" ";
        }
        return kq;
    }
    public String CHDOB(){
        String[] a=DOB.split("/");
        if(a[0].length()==1){
            a[0]="0"+a[0];
        }
        if(a[1].length()==1){
            a[1]="0"+a[1];
        }
        return a[0]+"/"+a[1]+"/"+a[2];
    }
    public int Ngay(){
        String[] a=CHDOB().split("/");
        return Integer.valueOf(a[0]);
    }
    public int Thang(){
        String[] a=CHDOB().split("/");
        return Integer.valueOf(a[1]);
    }
    public int Nam(){
        String[] a=CHDOB().split("/");
        return Integer.valueOf(a[2]);
    }

    @Override
    public String toString() {
        return Ma+" "+CHTen(Ten)+" "+Sex+" "+DiaChi+" "+CHDOB();
    }
    
}
public class DSKH {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<KH> ds=new ArrayList<>();
        for(int i=1;i<=n;i++){
            String Ma="KH"+String.format("%03d", i);
            String Ten=sc.nextLine();
            String Sex=sc.nextLine();
            String DOB=sc.nextLine();
            String DiaChi=sc.nextLine();
            KH kh=new KH(Ma, Ten, Sex, DOB, DiaChi);
            ds.add(kh);
        }
        Collections.sort(ds,new Comparator<KH>() {
            @Override
            public int compare(KH o1, KH o2) {
                if(o1.Nam()>o2.Nam())  return 1;
                else if(o1.Nam()==o2.Nam()){
                    if(o1.Thang()>o2.Thang())   return 1;
                    else if(o1.Thang()==o2.Thang()){
                        if(o1.Ngay()>o2.Ngay())  return 1;
                        else return -1;
                    }
                    else return -1;
                }
                else return -1;
            }
        });
        for(KH x:ds){
            System.out.println(x);
        }
    }
}
