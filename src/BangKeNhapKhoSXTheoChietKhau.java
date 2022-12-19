
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
class MatHang{
    private String Ma,Ten;
    private int SoLuong;
    private long DonGia;

    public MatHang(String Ma,String Ten, int SoLuong, long DonGia) {
        this.Ma=Ma;
        this.Ten = Ten;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
    }
//    public String ChuanHoa(){
//        String[] a=Ten.split(" ");
//        String ma=a[0].substring(0,1).toUpperCase()+a[1].substring(0,1).toUpperCase();
//        return ma;
//    }
    public long ChietKhau(){
            long tien=0;
            if(SoLuong>10){
                tien=Math.round(SoLuong*DonGia*0.05);
            }
            else if(SoLuong>=8 && SoLuong<=10){
                tien=Math.round(SoLuong*DonGia*0.02);
            }
            else if(SoLuong>=5 && SoLuong<8){
                tien=Math.round(SoLuong*DonGia*0.01);
            } else{
                tien=0;
            }
            return tien;
    }
    
    public long ThanhTien(){
        return SoLuong*DonGia-ChietKhau();
    }
    @Override
    public String toString() {
        return Ma+" "+Ten+" "+ChietKhau()+" "+ThanhTien();
    }

    public String getMa() {
        return Ma;
    }
    
}
public class BangKeNhapKhoSXTheoChietKhau {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> ds=new ArrayList<>();
        Map<String,Integer> maHang=new LinkedHashMap<String,Integer>();
        for(int i=1;i<=n;i++){
            String Ten=sc.nextLine();
            int SoLuong=Integer.parseInt(sc.nextLine());
            long DonGia=Long.parseLong(sc.nextLine());
            String[] a=Ten.split(" ");
            String ma=a[0].substring(0,1).toUpperCase()+a[1].substring(0,1).toUpperCase();
            if(maHang.containsKey(ma))  maHang.put(ma,maHang.get(ma)+1);
            else maHang.put(ma, 1);
            String Ma=ma+String.format("%02d", maHang.get(ma));
            MatHang mh=new MatHang(Ma, Ten, SoLuong, DonGia);
            ds.add(mh);
        }
        Collections.sort(ds,new Comparator<MatHang>() {
            @Override
            public int compare(MatHang o1, MatHang o2) {
                if(o1.ChietKhau()<o2.ChietKhau())  return 1;
                else return -1;
            }
        });
        for(MatHang x:ds){
            System.out.println(x);
        }
    }
}
