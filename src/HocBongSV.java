
import java.util.ArrayList;
import java.util.Scanner;
public class HocBongSV {
    static class SV{
        String ten;
        double tbc;
        int rl;

        public SV(String ten, double tbc, int rl) {
            this.ten = ten;
            this.tbc = tbc;
            this.rl = rl;
        }
        
        public String getxeploai(){
            if(tbc>=3.6 && rl>=90){
                return "XUATSAC";
            }else if(tbc>=3.2 && rl>=80){
                return "GIOI";
            }else if(tbc>=2.5 && rl>=70){
                return "KHA";
            }else{
                return "KHONG";
            }
        }
        @Override
        public String toString(){
            return ten+": "+getxeploai();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String z=sc.nextLine();
        String[] tmp=z.split(" ");
        int t=Integer.valueOf(tmp[0]);
        int tc=Integer.valueOf(tmp[1]);
        ArrayList<SV> ds=new ArrayList<>();
        while(t-->0){
            String ten=sc.nextLine();
            String s=sc.nextLine();
            String[] cmp=s.split(" ");
            double tbc=Double.valueOf(cmp[0]);
            int rl=Integer.valueOf(cmp[1]);
            SV sv=new SV(ten, tbc, rl);
            ds.add(sv);
        }
        for(SV x:ds){
            System.out.println(x);
        }
    }
}
