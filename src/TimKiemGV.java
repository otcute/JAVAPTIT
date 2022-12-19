
import java.util.ArrayList;
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
    String Ma,Ten,Nganh;

    public GV(String Ma, String Ten, String Nganh) {
        this.Ma = Ma;
        this.Ten = Ten;
        this.Nganh = Nganh;
    }

    public String getTen() {
        return Ten;
    }
    public String CHuanHoa(){
        String[] a=Nganh.split(" ");
        String kq="";
        for(int i=0;i<a.length;i++){
            kq+=a[i].substring(0,1).toUpperCase();
        }
        return kq;
    }

    @Override
    public String toString() {
        return Ma+" "+Ten+" "+CHuanHoa();
    }
    
}
public class TimKiemGV {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        ArrayList<GV> ds=new ArrayList<>();
        for(int i=1;i<=n;i++){
            String Ma="GV"+String.format("%02d", i);
            String Ten=sc.nextLine();
            String Nganh=sc.nextLine();
            ds.add(new GV(Ma,Ten,Nganh));
        }
        int a=sc.nextInt();
        sc.nextLine();
        while(a-->0){
            String s=sc.nextLine();
            String b=s.toUpperCase();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA "+s+":");
            for(GV x:ds){
                if(x.getTen().toUpperCase().contains(b)){
                    System.out.println(x);
                }
            }
        }
    }
}
