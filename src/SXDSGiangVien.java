
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
class GV{
    private String Ma,Ten,BoMon;
    public GV(String ten,String boMon){
        this.Ten=ten;
        this.BoMon=boMon;
    }
    public String ChuanHoa(String s){
        String[] a=s.split(" ");
        String kq="";
        for(int i=0;i<a.length;i++){
            kq+=a[i].substring(0,1).toUpperCase();
        }
        return kq;
    }

    public String getTen() {
        return Ten;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }
    
    public String ten(){
        String[] a=Ten.split(" ");
        return a[a.length-1];
    }
    
    @Override
    public String toString() {
        return Ma+" "+Ten+" "+ChuanHoa(BoMon);
    }
    
}
public class SXDSGiangVien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        ArrayList<GV> ds=new ArrayList<>();
        
        for(int i=1;i<=n;i++){
            GV gv=new GV(sc.nextLine(), sc.nextLine());
            if(i<10)   gv.setMa("GV0"+i);
            else    gv.setMa("GV"+i);
            ds.add(gv);
        }
        Collections.sort(ds,new Comparator<GV>() {
            @Override
            public int compare(GV o1, GV o2) {
                if(o1.ten().compareTo(o2.ten())>=0)  return 1;
                return -1;
            }
        });
        for(GV x:ds){
            System.out.println(x);
        }
    }
}
