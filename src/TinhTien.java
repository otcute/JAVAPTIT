
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
class MH{
    private String Ma,Ten;
    private int SoLuong;
    private long DonGia,ChietKhau;

    public MH(String Ma, String Ten, int SoLuong, long DonGia, long ChietKhau) {
        this.Ma = Ma;
        this.Ten = Ten;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
        this.ChietKhau = ChietKhau;
    }
    public long ThanhToan(){
        return DonGia*SoLuong-ChietKhau;
    }

    @Override
    public String toString() {
        return Ma+" "+Ten+" "+SoLuong+" "+DonGia+" "+ChietKhau+" "+ThanhToan();
    }
    
}
public class TinhTien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<MH> ds=new ArrayList<>();
        while(n-->0){
            ds.add(new MH(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
        }
        Collections.sort(ds,new Comparator<MH>() {
            @Override
            public int compare(MH o1, MH o2) {
                if(o1.ThanhToan()<o2.ThanhToan())   return 1;
                else return -1;
            }
        });
        for(MH x:ds){
            System.out.println(x);
        }
    }
}
