
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
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
    private String Ma,Ten,NgayNhan,NgayTra,SoPhong;
    private int TienDV;
    private long NgayO;

    public KH(String Ma, String Ten, String NgayNhan, String NgayTra, String SoPhong, int TienDV) {
        this.Ma = Ma;
        this.Ten = Ten;
        this.NgayNhan = NgayNhan;
        this.NgayTra = NgayTra;
        this.SoPhong = SoPhong;
        this.TienDV = TienDV;
    }
    
    public int DonGia(){
        if(SoPhong.substring(0,1).compareTo("1")==0)  return 25;
        else if(SoPhong.substring(0,1).compareTo("2")==0)  return 34;
        else if(SoPhong.substring(0,1).compareTo("3")==0)  return 50;
        else return 80;
    }
    public void NgayO() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yy");
        Date t1 = simpleDateFormat.parse(NgayNhan);
        Date t2 = simpleDateFormat.parse(NgayTra);
        long diff = (long) (t2.getTime() - t1.getTime()) / (1000 * 60 * 60 * 24);
        NgayO = diff+1;
    }

    public long getNgayO() {
        return NgayO;
    }
    public long TongTien() {
        return (long)(NgayO*DonGia()+TienDV);
    }

    @Override
    public String toString() {
        return Ma+" "+Ten+" "+SoPhong+" "+NgayO+" "+TongTien();
    }
    
}
public class HoaDonKS {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<KH> ds=new ArrayList<>();
        for(int i=1;i<=n;i++){
            String Ma="KH"+String.format("%02d", i);
            String Ten=sc.nextLine();
            String SoPhong=sc.nextLine();
            String NgayNhan=sc.nextLine();
            String NgayTra=sc.nextLine();
            int TienDV=Integer.parseInt(sc.nextLine());
            KH kh=new KH(Ma, Ten, NgayNhan, NgayTra, SoPhong, TienDV);
            kh.NgayO();
            ds.add(kh);
        }
        Collections.sort(ds,new Comparator<KH>() {
            @Override
            public int compare(KH o1, KH o2) {
                if(o1.TongTien()<o2.TongTien())  return 1;
                else return -1;
            }
        });
        for(KH x:ds){
            System.out.println(x);
        }
    }
}
