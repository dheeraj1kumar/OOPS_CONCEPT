 class Uses {
    int i=10;

}
class Bus extends Uses{
    int i=20;
    void show(int i){
        System.out.println(i);
    }
    public static void main(String[] args) {
        Bus ob=new Bus();
        ob.show(30);
    }
}
