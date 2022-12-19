
package mangdoituong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class MatHang {
    private String ma, ten, donVi;
    private long giaMua, giaBan;

    public MatHang(String ten, String donVi, long giaMua, long giaBan) {
        this.ten = ten;
        this.donVi = donVi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }
    public long LoiNhuan() {
        return giaBan - giaMua;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + donVi + " " + giaMua + " " + giaBan + " " + LoiNhuan();
    }
    
}
public class DanhSachMatHang {
    public static void main(String[] args) {
    ArrayList<MatHang> ds = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
    sc.nextLine();
    MatHang a = new MatHang(sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong());
    if (i < 10) a.setMa("MH00" + i);
    else a.setMa("MH0" + i);
    ds.add(a);
    }
    Collections.sort(ds, new Comparator<MatHang>(){
        @Override
        public int compare(MatHang o1, MatHang o2) {
            if(o1.LoiNhuan() <= o2.LoiNhuan()) return 1;
            return -1;
        }
    });
    for (MatHang a : ds){
        System.out.println(a);
    }
  }
}
