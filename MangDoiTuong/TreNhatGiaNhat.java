
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
class Nguoi{
    private String Info;

    public Nguoi(String Info) {
        this.Info = Info;
    }
    public String Ten(){
        String[] a=Info.split(" ");
        return a[0];
    }
    public String DOB(){
        String[] a=Info.split(" ");
        return a[1];
    }
    public int Ngay(){
        String[] a=DOB().split("/");
        return Integer.valueOf(a[0]);
    }
    public int Thang(){
        String[] a=DOB().split("/");
        return Integer.valueOf(a[1]);
    }
    public int Nam(){
        String[] a=DOB().split("/");
        return Integer.valueOf(a[2]);
    }
    public String toString(){
        return Ten();
    }
}
public class TreNhatGiaNhat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<Nguoi> ds=new ArrayList<>();
        while(n-->0){
            String Info=sc.nextLine();
            Nguoi nguoi=new Nguoi(Info);
            ds.add(nguoi);
        }
        Collections.sort(ds,new Comparator<Nguoi>() {
            @Override
            public int compare(Nguoi o1, Nguoi o2) {
                if(o1.Nam()<o2.Nam())  return 1;
                else if(o1.Nam()==o2.Nam()){
                    if(o1.Thang()<o2.Thang())  return 1;
                    else if(o1.Thang()==o2.Thang()){
                        if(o1.Ngay()<o2.Ngay())  return 1;
                        else return -1;
                    }
                    else return -1;
                }
                else return -1;
            }
        });
        System.out.println(ds.get(0));
        System.out.println(ds.get(ds.size()-1));
    }
}
