
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
class GameThu{
    private String Ma,Ten,GioVao,GioRa;
    public GameThu(String ma,String ten,String gioVao,String gioRa){
        this.Ma=ma;
        this.Ten=ten;
        this.GioVao=gioVao;
        this.GioRa=gioRa;
    }
    
    public int TinhPhut(){
        int phutvao=Integer.parseInt(GioVao.substring(0, 2))*60+Integer.parseInt(GioVao.substring(3));
        int phutra=Integer.parseInt(GioRa.substring(0, 2))*60+Integer.parseInt(GioRa.substring(3));
        return phutra-phutvao;
//          int in = Integer.parseInt(GioVao.substring(0, 2)) * 60 + Integer.parseInt(GioVao.substring(3));
//          int out = Integer.parseInt(GioRa.substring(0, 2)) * 60 + Integer.parseInt(GioRa.substring(3));
//          return out - in;
    }
    
    public String TinhGio(){
        int gio=TinhPhut()/60;
        int phut=TinhPhut()-gio*60;
        return gio+" gio "+phut+" phut";
//        String tonggio="";
//        if((Integer.parseInt(GioRa.substring(3))-Integer.parseInt(GioVao.substring(3)))>0){
//            tonggio=String.valueOf(Integer.parseInt(GioRa.substring(0, 2))-Integer.parseInt(GioVao.substring(0, 2)))+" gio "+String.valueOf(Integer.parseInt(GioRa.substring(3))-Integer.parseInt(GioVao.substring(3)))+" phut";
//        }
//        else {
//            if(Integer.parseInt(GioVao.substring(3))>30)     tonggio=String.valueOf(Integer.parseInt(GioRa.substring(0, 2))-Integer.parseInt(GioVao.substring(0, 2))-1)+" gio "+String.valueOf(Integer.parseInt(GioVao.substring(3))-Integer.parseInt(GioRa.substring(3)))+" phut";
//            else tonggio=String.valueOf(Integer.parseInt(GioRa.substring(0, 2))-Integer.parseInt(GioVao.substring(0, 2))-1)+" gio "+String.valueOf(60-Integer.parseInt(GioVao.substring(3))-Integer.parseInt(GioRa.substring(3)))+" phut";
//        }
//        
//        return tonggio;  
    }

    @Override
    public String toString() {
        return Ma+" "+Ten+" "+TinhGio();
    }
    
}
public class TinhGio {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //sc.nextLine();
        ArrayList<GameThu> ds=new ArrayList<>();
        sc.nextLine();
        for(int i=1;i<=n;i++){
            
            GameThu gt=new GameThu(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            ds.add(gt);
        }
        Collections.sort(ds,new Comparator<GameThu>() {
            @Override
            public int compare(GameThu o1, GameThu o2) {
                if(o1.TinhPhut()<o2.TinhPhut())  return 1;
                return -1;
            }
        });
        for(GameThu x:ds){
            System.out.println(x);
        }
    }
}
