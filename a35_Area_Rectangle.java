import java.util.Scanner;

class Area{
    int len;
    int bre;

Area(int a,int b){
    len=a;
    bre=b;
}
public int returnArea(int len,int bre){
    return len*bre;
}
}
public class a35_Area_Rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        int l=sc.nextInt();
        System.out.println("Enter the breadth of the rectangle: ");
        int b=sc.nextInt();
        Area a=new Area(l, b);
        System.out.println("Area of the rectangle is :"+a.returnArea(l, b));
    }
}
