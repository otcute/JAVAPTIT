
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
class SP{
    private int phanthuc,phanao;
    public SP(int phanThuc,int phanAo){
        this.phanthuc=phanThuc;
        this.phanao=phanAo;
    }
    public SP(){}
    @Override
    public String toString() {
        return phanthuc+" + "+phanao+"i";
    }
    
    public SP TinhTong(SP a){
        SP kq=new SP();
        kq.phanthuc=this.phanthuc+a.phanthuc;
        kq.phanao=this.phanao+a.phanao;
        return kq;
    }
    public SP TinhTich(SP a){
        SP kq=new SP();
        kq.phanthuc=this.phanthuc*a.phanthuc-this.phanao*a.phanao;
        kq.phanao=this.phanthuc*a.phanao+this.phanao*a.phanthuc;
        return kq;
    }
}
public class SoPhuc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            SP A=new SP(sc.nextInt(), sc.nextInt());          
            SP B=new SP(sc.nextInt(), sc.nextInt());
            SP tong= new SP();
            tong=A.TinhTong(B);
            SP c=new SP();
            c=tong.TinhTich(A);
            SP d=new SP();
            d=tong.TinhTich(tong);
            System.out.println(c+", "+d);
        }
    }
}
