//Abstraction


//abstract class vehicle {
//    abstract void start();
//}
//class  Car extends vehicle
//{
//    void start()
//    {
//        System.out.println("car start with key");
//    }
//}
//class Scooter extends vehicle
//{
//    void start()
//    {
//        System.out.println("scooter start with kick");
//    }
//
//    public static void main(String[] args) {
//        //vehicle v=new vehicle()   not create vehicle class object
//        Car c =new Car();
//        c.start();
//        Scooter s=new Scooter();
//        s.start();
//
//
//    }
//}

//interface

//interface vehicle
//{
//    void show();
//}
//class test implements vehicle
//{
//    public void show()
//    {
//        System.out.println("1");
//    }
//
//    public static void main(String[] args) {
//        //vehicle i=new vehicle();    can create object interface class
//        test t=new test();
//        t.show();
//    }
//}


//multiple inheritance
//interface vehicle
//{
//     void show();
//}
//interface vehicle2{
//     void display();
//}
//class test implements vehicle,vehicle2
//{
//    public void show()
//    {
//        System.out.println("1");
//    }
//    public void display()
//    {
//        System.out.println("2");
//    }
//
//    public static void main(String[] args) {
//        //vehicle i=new vehicle();    can create object interface class
//        test t = new test();
//        t.show();
//        t.display();
//    }
//}

//encapsulation
class vehicle
{
    private int empid;

    public void setEmpid(int eid) {


        empid = eid;
    }

    public int getEmpid() {
        return empid;
    }
}
class company
{
    public static void main(String[] args) {
        vehicle e=new vehicle();
        e.setEmpid(101);
        System.out.println(e.getEmpid());
    }
}