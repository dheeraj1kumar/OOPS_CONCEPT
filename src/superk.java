//super keywords

//used
//1=refer immediate parent class instance variable
//
//public class superk {
//    int a=10;
//}
//class superk1 extends superk{
//    int a=20;
//    void show(int a)
//    {
//        System.out.println(a);//30 method call
//        System.out.println(this.a);//20//this keyword refer to current class of instance ariable
//        System.out.println(super.a);//10//super keyword refer to parent class of instance variable
//    }
//
//
//    public static void main(String[] args) {
//        superk1 ob=new superk1();
//        ob.show(30);
//    }
//}

//2=immediate parent class method

//public class superk {
//    void m1(){
//        System.out.println("i am in class superk");
//    }
//}
//class superk1 extends superk{
//    void m1(){
//        System.out.println("i am in class superk1");
//    }
//
//    void show() {//child class call without super kerwords
//        m1();
//        super.m1();//used super keyword parents class method call
//    }
//
//    public static void main(String[] args) {
//        superk1 ob=new superk1();
//        ob.show();
//    }
//}

//3=super() can be used to invoke immediate parent class constructor
public class superk {
    superk(){
        System.out.println("i am in class superk");
    }
}
class superk1 extends superk{
    superk1(){
        super();
        System.out.println("i am in class superk1");
    }



    public static void main(String[] args) {
        superk1 ob=new superk1();

    }
}



//super//method
//super()=in constructor
