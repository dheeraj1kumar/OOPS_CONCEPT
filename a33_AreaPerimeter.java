class Triangle{
    int a=3,b=4,c=5;
    Triangle(){
        double p=(a+b+c)/2.0;
        double pr=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("area of the triange is : "+pr);
        System.out.println("parimeter of a triangle is :"+(a+b+c));
        }
}
public class a33_AreaPerimeter{
    public static void main(String[] args) {
        Triangle t=new Triangle();
        }
}