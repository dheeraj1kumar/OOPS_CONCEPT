//uses of this keywords



//public class Thisdemo {
//    int i;
//    void setValue(int i)
//    {
//        this.i=i;
//    }
//    void show(){
//        System.out.println(i);
//    }
//
//    public static void main(String[] args) {
//        Thisdemo td=new Thisdemo();
//        td.setValue(10);
//        td.show();
//    }
//}


//2
//public class Thisdemo {
//    void display()
//    {
//        System.out.println("hello");
//    }
//    void show(){
//       this.display();
//        //this.display()
//        // if i don't use this keywords, compiler automatically adds this keywords while invoking the method
//    }
//
//    public static void main(String[] args) {
//        Thisdemo td=new Thisdemo();
//        td.show();
//    }
//}


//3
//public class Thisdemo {
//    Thisdemo()
//    {
//      //  this();
//        System.out.println("no argument constructor");
//    }
//    Thisdemo(int a){
//        this();
//        System.out.println("paramaterised constructor");
//
//    }
//
//    public static void main(String[] args) {
//        Thisdemo td=new Thisdemo(10);



  //  }
//}


//public class Thisdemo {
//    Thisdemo()
//    {
//       this(10);
//        System.out.println("no argument constructor");
//    }
//    Thisdemo(int a){
//
//        System.out.println("paramaterised constructor");
//
//    }
//
//    public static void main(String[] args) {
//        Thisdemo td=new Thisdemo();
//
//
//
//  }
//}


//4


//public class Thisdemo {
//    void m1(Thisdemo td)
//    {
//
//        System.out.println("i am m1");
//    }
//    void m2(){
//        m1(this);
//
//
//    }
//
//  public static void main(String[] args) {
//        Thisdemo td=new Thisdemo();
//        td.m2();
//
//
// }
//}


//5
//public class Thisdemo {
//  class  Test{
//      Test(Thisdemo td){
//          System.out.println("test class constructor");
//      }
//  }
//    void m1() {
//Test t = new Test(this);
//    }
//
//    public static void main(String[] args) {
//        Thisdemo td=new Thisdemo();
//        td.m1();
//
//
//    }
//}

//6
public class Thisdemo{
    Thisdemo m1() {
return this;
    }

    public static void main(String[] args) {
        Thisdemo td=new Thisdemo();
        td.m1();


   }
}