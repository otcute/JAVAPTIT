
import java.util.ArrayList;
import java.util.Scanner;

public class DSDoanhNghiep2 {
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
        listdn.sort(java.util.Comparator.comparing(dn::getsl).reversed().thenComparing(dn::getid));
        int h=Integer.parseInt(sc.nextLine());
        while(h-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU "+a+" DEN "+b+" SINH VIEN:");
            for(dn i:listdn){
                if(i.getsl()>=a&&i.getsl()<=b){
                    System.out.println(i);
                }
            }
        }
    }
}
