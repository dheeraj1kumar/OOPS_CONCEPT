//Inheritance in java=transfer property one class method to another class method except constructor
//     and private method
//used=1.  code res usability
//     2.  we can achieve polymorphism(method overriding) using inheritance


//public class DNA_animals {//parent class or super class
//    void eat(){
//        System.out.println("i am eating");
//    }}
//  class Dog extends DNA_animals{//child class or subs-class
//    //DNA_animals class property extends in dog class
//
//      public static void main(String[] args) {
//          Dog d=new Dog();
//          d.eat();
//      }
//  }



  // types of inheritance
//1.  single
//2.  multilevel
//3.  hierarchical
//4.  multiple  =not in java
//5.  hybrid    =not in java


//1. single inheritance
//public class DNA_animals
//{
//     void showA()
//    {
//        System.out.println(" DNA class method");
//    }
//}
//class b extends DNA_animals
//{
//    void showB()
//    {
//        System.out.println("b class method");
//    }
//
//    public static void main(String[] args) {
//        DNA_animals obj=new DNA_animals();
//        obj.showA();
//       // obj.showB();//not call b class method through a class object
//
//
//        b ob2=new b();
//        ob2.showB();
//        ob2.showA();
//    }
//}


//multilevel inheritance
//public class DNA_animals
//{
//    void showA()
//    {
//        System.out.println(" DNA class method");
//    }
//}
//class b extends DNA_animals
//{
//    void showB()
//    {
//        System.out.println("b class mehod");
//    }}
//
//    class c extends b
//    {
//       void showC()
//       {
//           System.out.println("c class method");
//       }
//
//    public static void main(String[] args) {
//        DNA_animals obj1=new DNA_animals();
//        obj1.showA();
//        // obj1.showB();//not call b and c class method through dna  class object
//        //obj1.showC();
//
//        b ob2=new b();
//        ob2.showA();
//        ob2.showB();
//       // ob2.showC();//       not call c class method through b class object
//
////a,b,c class method can be call through c class object
//        c ob3=new c();
//        ob3.showA();
//        ob3.showB();
//         ob3.showC();
//
//
//    }
//}



////hierarchical inheritance
public class DNA_animals
{
    void showA()
    {
        System.out.println(" DNA class method");
    }
}
class b extends DNA_animals
{
    void showB()
    {
        System.out.println("b class mehod");
    }}

class c extends DNA_animals
{
    void showC()
    {
        System.out.println("c class method");
    }

    public static void main(String[] args) {
        DNA_animals obj1=new DNA_animals();
        obj1.showA();
        //obj1.showB();//not call b and c class method through dna  class object
        //obj1.showC();

        B ob2=new B();
        ob2.showA();
        ob2.showB();
        // ob2.showC();//  not call c class method through b class object

//a and c class method can be call through c class object
        c ob3=new c();
        ob3.showA();
       // ob3.showB();           not call b class method through c class object
        ob3.showC();


    }
}



