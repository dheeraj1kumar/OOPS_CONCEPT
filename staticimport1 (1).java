import static java.lang.Math.*;
class staticimport
{
 void circle(double r)
{
double area = 3.14*r*r;
System.out.println("math power="+Math.pow(r,2));
System.out.println("The area of circle is:" +area);
}
public static void main(String args[])
{
staticimport obj = new staticimport();
obj.circle(2.3);
}
}


