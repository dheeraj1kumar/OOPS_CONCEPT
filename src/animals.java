//initialize value
//by using method
public class animals {
    String color;
    int age;
    void init(String c,int a)
    {
        color=c;
        age=a;
    }
    void display()
    {
        System.out.println(color+" "+age);
    }

    public static void main(String[] args) {
        animals buzo=new animals();
        buzo.init("black",20);
        buzo.display();


    }
}
