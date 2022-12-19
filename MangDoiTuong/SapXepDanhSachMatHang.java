
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
class MatHang{
    private int MaMatHang;
    private String TenMatHang,NhomHang;
    private float GiaBan,GiaMua;
    public MatHang(String tenMatHang,String nhomHang,float giaMua,float giaBan){
        this.GiaBan=giaBan;
        this.GiaMua=giaMua;
        this.NhomHang=nhomHang;
        this.TenMatHang=tenMatHang;
    }
    public float LoiNhuan(){
        return GiaBan-GiaMua;
    }

    public void setMaMatHang(int MaMatHang) {
        this.MaMatHang = MaMatHang;
    }

    @Override
    public String toString() {
        return MaMatHang+" "+TenMatHang+" "+NhomHang+" "+String.format("%.2f", LoiNhuan());
    }
    
}
public class SapXepDanhSachMatHang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<MatHang> ds=new ArrayList<>();
        for(int i=1;i<=n;i++){
            sc.nextLine();
            MatHang mh=new MatHang(sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat());
            mh.setMaMatHang(i);
            ds.add(mh);
        }
        Collections.sort(ds,new Comparator<MatHang>() {
            @Override
            public int compare(MatHang o1, MatHang o2) {
                if(o1.LoiNhuan()<o2.LoiNhuan())  return 1;
                return -1;
            }
        });
        for(MatHang mh:ds){
            System.out.println(mh);
        }
    }
}
