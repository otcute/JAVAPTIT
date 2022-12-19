
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
    private String Ma,Ten;
    private long Cu,Moi;

    public KH(String Ma, String Ten, long Cu, long Moi) {
        this.Ma = Ma;
        this.Ten = Ten;
        this.Cu = Cu;
        this.Moi = Moi;
    }
    public long SoNuoc(){
        return (long)(Moi-Cu);
    }
    public long ThanhTien(){
        if(SoNuoc()<=50)  return (long)Math.round(SoNuoc()*100+SoNuoc()*100*0.02);
        else if(SoNuoc()<=100)  return (long)Math.round((50*100+((SoNuoc()-50)*150))*1.03);
        else return (long)Math.round((50*100+50*150+((SoNuoc()-100)*200))*1.05);
    }

    @Override
    public String toString() {
        return Ma+" "+Ten+" "+ThanhTien();
    }
    
}
public class HoaDonTienNuoc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<KH> ds=new ArrayList<>();
        for(int i=1;i<=n;i++){
            String Ma="KH"+String.format("%02d", i);
            String Ten=sc.nextLine();
            long Cu=Long.parseLong(sc.nextLine());
            long Moi=Long.parseLong(sc.nextLine());
            KH kh=new KH(Ma, Ten, Cu, Moi);
            ds.add(kh);
        }
        Collections.sort(ds,new Comparator<KH>() {
            @Override
            public int compare(KH o1, KH o2) {
                if(o1.ThanhTien()<=o2.ThanhTien())  return 1;
                else return -1;
            }
        });
        for(KH x:ds){
            System.out.println(x);
        }
    }
}
