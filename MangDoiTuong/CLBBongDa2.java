
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
class CLB{
    private String Ma,Ten;
    private int GiaVe;

    public CLB(String Ma, String Ten, int GiaVe) {
        this.Ma = Ma;
        this.Ten = Ten;
        this.GiaVe = GiaVe;
    }

    public String getMa() {
        return Ma;
    }

    public String getTen() {
        return Ten;
    }

    public int getGiaVe() {
        return GiaVe;
    }
    
}
class TranDau{
    private String Ma;
    private int SoLuong;

    public TranDau(String Ma, int SoLuong) {
        this.Ma = Ma;
        this.SoLuong = SoLuong;
    }

    public String getMa() {
        return Ma;
    }

    public int getSoLuong() {
        return SoLuong;
    }
    
}
class KetQua{
    private String Ma,Ten;
    private int DoanhThu;

    public KetQua(String Ma, String Ten, int DoanhThu) {
        this.Ma = Ma;
        this.Ten = Ten;
        this.DoanhThu = DoanhThu;
    }

    public String getMa() {
        return Ma;
    }

    public String getTen() {
        return Ten;
    }

    public int getDoanhThu() {
        return DoanhThu;
    }
    
    @Override
    public String toString() {
        return Ma+" "+Ten+" "+DoanhThu;
    }
        
    }
public class CLBBongDa2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<CLB> ds=new ArrayList<>();
        ArrayList<KetQua> ds1=new ArrayList<>();
        ArrayList<TranDau> ds2=new ArrayList<>();
        int n=Integer.parseInt(sc.nextLine());
        while(n-->0){
            String Ma=sc.nextLine();
            String Ten=sc.nextLine();
            int GiaVe=Integer.parseInt(sc.nextLine());
            CLB clb=new CLB(Ma, Ten, GiaVe);
            ds.add(clb);
        }
        int m=Integer.parseInt(sc.nextLine());
        while(m-->0){
            String s=sc.nextLine();
            String Ma=s.substring(0,4);
            int SoLuong=Integer.valueOf(s.substring(5));
            TranDau td=new TranDau(Ma, SoLuong);
            ds2.add(td);
        }
        for(TranDau x:ds2){
            int DoanhThu=0;
            String ten="";
            for(CLB a:ds){
                if(a.getMa().compareTo(x.getMa().substring(1,3))==0){
                    DoanhThu+=a.getGiaVe()*x.getSoLuong();
                    ten=a.getTen();
                }
            }
            ds1.add(new KetQua(x.getMa(), ten, DoanhThu));
        }
        Collections.sort(ds1,new Comparator<KetQua>() {
            @Override
            public int compare(KetQua o1, KetQua o2) {
                if(o1.getDoanhThu()<o2.getDoanhThu())  return 1;
                else if(o1.getDoanhThu()==o2.getDoanhThu()){
                    if(o1.getTen().compareTo(o1.getTen())>=0)  return 1;
                    else return -1;
                }
                else return -1;
            }
        });
        for(KetQua s: ds1){
            System.out.println(s);
        }
    }
}
