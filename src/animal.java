public class animal//opp's concept
    {
        public void eat()//method 1 by created user
        {
            System.out.println("I am eating:");
        }
        public static void main(String[] args)//main method
        {
            System.out.println("1");
            animal buzo=new animal();
            buzo.eat();
            buzo.run();
            animal aa=new animal();
            aa.run();
            aa.eat();
            // buzo.fly() buzo is not object of birds class so we can not call  fly method of another class
            //without using inheritences
            birds sp=new birds();
            sp.fly();
        }
        public void run()//method 2 created by user
        {
            System.out.println("i am running:");
        }

    }
    class birds//another class
    {
        void fly()
        {
            System.out.println("I am flying");
        }
    }

