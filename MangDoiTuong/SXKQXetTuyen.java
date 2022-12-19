
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
class PhuHo{
    private String Ma,Ten,NgaySinh;
    private double LyThuyet,ThucHanh;

    public PhuHo(String Ma,String Ten, String NgaySinh, double LyThuyet, double ThucHanh) {
        this.Ma=Ma;
        this.Ten = Ten;
        this.NgaySinh = NgaySinh;
        this.LyThuyet = LyThuyet;
        this.ThucHanh = ThucHanh;
    }
    public double DiemThuong(){
        if(LyThuyet>=8 && ThucHanh>=8){
            return 1;
        }else if(LyThuyet>=7.5 && ThucHanh>=7.5){
            return 0.5;
        }else return 0;
    }
    public double DiemTB(){
        if((int)Math.round((LyThuyet+ThucHanh)/2+DiemThuong())>=10){
            return 10;
        }
        else return (int)Math.round((LyThuyet+ThucHanh)/2+DiemThuong());
    }
    public String SoSanh(double a){
        if((int)a==a){
            return String.valueOf((int)a);
        }else return String.valueOf(a);
    }
    public String XepLoai(){
        if(DiemTB()<5)   return "Truot";
        else if(DiemTB()>=5 && DiemTB()<7)   return "Trung binh";
        else if(DiemTB()>=7 && DiemTB()<8)   return "Kha";
        else if(DiemTB()>=8 && DiemTB()<9)   return "Gioi";
        else return "Xuat sac";
    }
    public int Tuoi(){
        return (int)(2021-Integer.valueOf(NgaySinh.substring(6)));
    }

    @Override
    public String toString() {
        return Ma+" "+Ten+" "+Tuoi()+" "+SoSanh(DiemTB())+" "+XepLoai();
    }
    
}
public class SXKQXetTuyen {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<PhuHo> ds=new ArrayList<>();
        for(int i=1;i<=n;i++){
            String Ma="PH"+String.format("%02d", i);
            String Ten=sc.nextLine();
            String NgaySinh=sc.nextLine();
            double LyThuyet=Double.parseDouble(sc.nextLine());
            double ThucHanh=Double.parseDouble(sc.nextLine());
            PhuHo ph=new PhuHo(Ma, Ten, NgaySinh, LyThuyet, ThucHanh);
            ds.add(ph);
        }
        Collections.sort(ds,new Comparator<PhuHo>() {
            @Override
            public int compare(PhuHo o1, PhuHo o2) {
                if(o1.DiemTB()<=o2.DiemTB())  return 1;
                else return -1;
            }
        });
        for(PhuHo x:ds){
            System.out.println(x);
        }
    }
}
