
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
class KH{
    private String Ma,Loai;
    private long Cu,Moi;

    public KH(String Ma, String Loai, long Cu, long Moi) {
        this.Ma = Ma;
        this.Loai = Loai;
        this.Cu = Cu;
        this.Moi = Moi;
    }
    public int HeSo(){
        int heso=0;
        if(Loai.compareTo("KD")==0){
            heso=3;
        }
        else if(Loai.compareTo("NN")==0){
            heso=5;
        }
        else if(Loai.compareTo("TT")==0){
            heso=4;
        }
        else if(Loai.compareTo("CN")==0){
            heso=2;
        }
        return heso;
    }
    public long ThanhTien(){
        return (Moi-Cu)*HeSo()*550;
    }
    public long PhuTroi(){
        long a=Moi-Cu;
        long phutroi=0;
        if(a<50){
            phutroi=0;
        }
        else if(a<=100){
            phutroi=(long)Math.round((ThanhTien()*35)/100.0);
        }
        else if(a>100){
            phutroi=ThanhTien();
        }
        return phutroi;
    }
    public long TongTien(){
        return ThanhTien()+PhuTroi();
    }

    @Override
    public String toString() {
        return Ma+" "+HeSo()+" "+ThanhTien()+" "+PhuTroi()+" "+TongTien();
    }
}
public class TinhTienDien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<KH> ds=new ArrayList<>(); 
        for(int i=1;i<=n;i++){
            String Ma="KH"+String.format("%02d", i);
            String Loai=sc.nextLine();
            long Cu=Long.parseLong(sc.nextLine());
            long Moi=Long.parseLong(sc.nextLine());
            KH kh=new KH(Ma, Loai, Cu, Moi);
            ds.add(kh);
        }
        for(KH x:ds){
            System.out.println(x);
        }
    }
}
