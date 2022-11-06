class Area{
    public void are(int a,int b){
        System.out.println("Area of the rectangle is: "+a*b);
    }
    public void are(float a){
        float d=a*a;
        System.out.println("Area of the square is :"+d);
    }
    public void are(double a){
        double as=3.14*a*a;
        System.out.println("Area of the circle is: "+as);
    }

}

public class a40_Area {
    public static void main(String[] args) {
        Area a=new Area();
        a.are(10);
        a.are(4.1);
        a.are(2, 3);
    }
}
