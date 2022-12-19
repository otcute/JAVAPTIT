
import java.util.ArrayList;
import java.util.*;
import java.util.Collections;
import java.util.Comparator;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
class Time{
    private int h,m,s;
    public Time(int h,int m,int s){
        this.h=h;
        this.m=m;
        this.s=s;
    }
    public int TinhGiay(){
        return h*3600+m*60+s;
    }

    @Override
    public String toString() {
        return h+" "+m+" "+s;
    }
    
}
class listTime{
    private ArrayList<Time> ds;
    public listTime(ArrayList<Time> ds){
        this.ds=ds;
    }
    public void addTime(Time a){
        ds.add(a);
    }
}
public class SapXepTime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        ArrayList<Time> ds=new ArrayList<>();
        while(t-->0){
            Time tg=new Time(sc.nextInt(),sc.nextInt(),sc.nextInt());
            ds.add(tg);
        }
        Collections.sort(ds,new Comparator<Time>() {
            @Override
            public int compare(Time o1, Time o2) {
                if(o1.TinhGiay()<o2.TinhGiay())  return -1;
                return 1;
            }
        });
        for(Time x:ds){
            System.out.println(x);
        }
    }
}
