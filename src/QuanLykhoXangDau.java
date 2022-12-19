
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
class Kho{
    private String Ma;

    public Kho(String Ma) {
        this.Ma = Ma;
    }
    public String HangSX(){
        String hang="";
        String[] a=Ma.split(" ");
        if(a[0].substring(3,5).compareTo("BP")==0){
            hang="British Petro";
        }else if(a[0].substring(3,5).compareTo("ES")==0){
            hang="Esso";
        }else if(a[0].substring(3,5).compareTo("SH")==0){
            hang="Shell";
        }else if(a[0].substring(3,5).compareTo("CA")==0){
            hang="Castrol";
        }else if(a[0].substring(3,5).compareTo("MO")==0){
            hang="Mobil";
        }else if(a[0].substring(3,5).compareTo("TN")==0){
            hang="Trong Nuoc";
        }
        return hang;
    }
    public long DonGia(){
        long dongia=0;
        String[] a=Ma.split(" ");
        if(a[0].substring(0,1).compareTo("X")==0){
            dongia=128000;
        }else if(a[0].substring(0,1).compareTo("D")==0){
            dongia=11200;
        }else if(a[0].substring(0,1).compareTo("N")==0){
            dongia=9700;
        }
        return dongia;
    }
    public long Thue(){
        String[] a=Ma.split(" ");
        if(a[0].substring(3,5).compareTo("TN")==0)   return 0;
        if(Ma.charAt(0)=='X')  return (long)(DonGia()*Integer.parseInt(a[1])*0.03);
        else if(Ma.charAt(0)=='D') return (long)(DonGia()*Integer.parseInt(a[1])*0.035);
        else if(Ma.charAt(0)=='N')  return (long)(DonGia()*Integer.parseInt(a[1])*0.02);
        else return 0;
    }
//    public long Thue(){
//        long thue=0;
//        String[] a=Ma.split(" ");
//        if(a[0].substring(0,1).compareTo("X")==0){
//            if(a[0].substring(3,5).compareTo("TN")!=0){
//                thue=(long)Math.round(DonGia()*Integer.parseInt(a[1])*0.03);
//            }else{
//                thue=0;
//            }
//        }
//        if(a[0].substring(0,1).compareTo("D")==0){
//            if(a[0].substring(3,5).compareTo("TN")!=0){
//                thue=(long)Math.round(DonGia()*Integer.parseInt(a[1])*0.035);
//            } else{
//                thue=0;
//            }
//        }
//        if(a[0].substring(0,1).compareTo("N")==0){
//            if(a[0].substring(3,5).compareTo("TN")!=0){
//                thue=(long)Math.round(DonGia()*Integer.parseInt(a[1])*0.02);
//            }else{
//                thue=0;
//            }
//        }
//        return thue;
//    } 
    public long ThanhTien(){
        long thanhtien=0;
        String[] a=Ma.split(" ");
        thanhtien=(long)(DonGia()*Integer.parseInt(a[1]))+Thue();
        return thanhtien;
    }

    @Override
    public String toString() {
        String[] a=Ma.split(" ");
        return a[0]+" "+HangSX()+" "+DonGia()+" "+Thue()+" "+ThanhTien();
    }
    
}

public class QuanLykhoXangDau {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<Kho> ds=new ArrayList<>();
        while(t-->0){
            String ma=sc.nextLine();
            ds.add(new Kho(ma));
        }
        for(Kho x:ds){
            System.out.println(x);
        }
    }
}
