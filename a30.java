
import java.util.Scanner;
import java.util.Set;
public class a30 {
    public static int setDim(int l,int b){
        int area=l*b;
        return area;
    }
    public static  void getArea(int area){
        System.out.println( area);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the length of the rectangle: ");
        int l=sc.nextInt();
        System.out.println("Enter the breadth of the rectangle: ");
        int b=sc.nextInt();
        getArea(setDim(l,b));
    }

}
