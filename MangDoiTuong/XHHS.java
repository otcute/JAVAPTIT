
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
class HS{
    private String Ma,Ten;
    private Double DTB;
    private int XH;

    public HS(String Ma, String Ten, Double DTB) {
        this.Ma = Ma;
        this.Ten = Ten;
        this.DTB = DTB;
    }

   
    public String XepLoai(){
        if(DTB<5)  return "Yeu";
        else if(DTB<7)  return "Trung Binh";
        else if(DTB<9)  return "Kha";
        else return "Gioi";
    }

    public void setXH(int XH) {
        this.XH = XH;
    }

    public int getXH() {
        return XH;
    }

    @Override
    public String toString() {
        return Ten+" "+DTB+" "+XepLoai()+" "+XH;
    }
    
}
public class XHHS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<HS> ds=new ArrayList<>();
        for(int i=1;i<=n;i++){
            String Ma="HS"+String.format("%02d", i);
            String Ten=sc.nextLine();
            double DTB=Double.parseDouble(sc.nextLine());
            HS hs=new HS(Ma, Ten, DTB);
            ds.add(hs);
        }
        
    }
}
