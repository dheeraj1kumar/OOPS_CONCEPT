import java.lang.*;


class typecasting
{
 
  
    public static void main(String[] args)
    {
        int i = 100;
 
        // Automatic type conversion
        // Integer to long type
        long l = i;
 
        // Automatic type conversion
        // long to float type
        float f = l;
        //float to integer
         //int a=23.5f; //not run
         float b=70.7f;
 
        // Print and display commands
        System.out.println("Int value " + i);
        System.out.println("Long value " + l);
        System.out.println("Float value " + f);
        //System.out.println("int value " + a);
        System.out.println("int value"+(int)b);//explicit typecasting
    }
}

  
