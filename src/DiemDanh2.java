
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
class SV {
    private String ma, ten, lop, diemDanh, kq;

    
    public SV(String ma, String ten, String lop) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
    }

    public String getMa() {
        return ma;
    }

    public void setDiemDanh(String diemDanh) {
        this.diemDanh = diemDanh;
    }

    public String getLop() {
        return lop;
    }
    
    
    public String getKq() {
        int score = 10;
        for(int i = 0; i < diemDanh.length(); i++){
            if(diemDanh.charAt(i) == 'm') score--;
            else if(diemDanh.charAt(i) == 'v') score -= 2;
            else continue;
        }
        if(score > 0) return String.valueOf(score);
        else return String.valueOf("0 KDDK");
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " +getKq();
    }

    
    
}
public class DiemDanh2 {
      public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int students_number = scan.nextInt();
        ArrayList<SV> students = new ArrayList<>();
        scan.nextLine();
        for(int i = 0; i < students_number; i++){
            SV sv=new SV(scan.nextLine(), scan.nextLine(), scan.nextLine());
            students.add(sv);
        }
        for (int i = 0; i < students_number; i++){
            String MSV = scan.next();
            String diem_danh = scan.next();
            for (SV x : students){
                if (x.getMa().equals(MSV)) {
                    x.setDiemDanh(diem_danh);
                }
            }
        }
        String lop=scan.next();
        for (SV stu : students){
            if(stu.getLop().equals(lop)){
                System.out.println(stu);
            }
        }
    }
}
