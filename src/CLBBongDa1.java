
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
public class CLBBongDa1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<CLB> ds=new ArrayList<>();
        ArrayList<TranDau> list=new ArrayList<>();
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
            list.add(td);
        }
        for(TranDau x:list){
            int DoanhThu=0;
            String ten="";
            for(CLB a:ds){
                if(a.getMa().compareTo(x.getMa().substring(1,3))==0){
                    DoanhThu+=a.getGiaVe()*x.getSoLuong();
                    ten=a.getTen();
                }
            }
            System.out.println(x.getMa()+" "+ten+" "+DoanhThu);
        }
    }
}
