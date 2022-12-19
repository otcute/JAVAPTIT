
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
public class DSDoanhNghiep1 {
    static class dn{
        String id;
        String ten;
        int sl;

        public dn(String id, String ten, int sl) {
            this.id = id;
            this.ten = ten;
            this.sl = sl;
        }
        public int getsl(){
            return sl;
        }
        public String getid(){
            return id;
        }
        @Override
        public String toString(){
            return id+" "
                    +ten+" "
                    +sl;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<dn> listdn=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String id=sc.nextLine();
            String ten=sc.nextLine();
            int sl=Integer.parseInt(sc.nextLine());
            listdn.add(new dn(id,ten,sl));
        }
        listdn.sort(Comparator.comparing(dn::getsl).reversed().thenComparing(dn::getid));
        for(dn i:listdn){
            System.out.println(i);
        }
    }
}