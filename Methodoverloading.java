import java.lang.Math;

class OverloadDemo
{
    void area(int x)
    {
    System.out.println("the area of the square is"+Math.pow(x, 2)+"sq units");
    }
    void area(float x, float y)
    {
    System.out.println("the area of the rectangle is "+(x*y)+" sq units");
    }
    /*void area(double x)
    {
        double z = 3.14 * x * x;
        System.out.println("the area of the circle is "+z);
    }*/
} // class closed
class Methodoverloading 
{
     public static void main(String args[]) 
	{
	   OverloadDemo ob = new OverloadDemo();
	   ob.area(5.2f);
	   ob.area(11,12);
	   ob.area(2.3f);
    }
}
