// import java.util.*;

// //class Distance to read, print and add distance
// class Distance {
//   private int feet;
//   private int inches;

//   public void getDistance() {
//     Scanner sc = new Scanner(System.in);

//     System.out.print("Enter feet: ");
//     feet = sc.nextInt();
//     System.out.print("Enter inches: ");
//     inches = sc.nextInt();
//   }
//   public void showDistance() {
//     System.out.println("Feet: " + feet + "\tInches: " + inches);
//   }

//   public void addDistance(Distance D1, Distance D2) {
//     inches = D1.inches + D2.inches;
//     feet = D1.feet + D2.feet + (inches / 12);
//     inches = inches % 12;
//   }
// }

// public class a37InchFeet {
//   public static void main(String[] s) {
   

//       Distance D1 = new Distance();
//       Distance D2 = new Distance();
//       Distance D3 = new Distance();

//       //read first distance
//       System.out.println("Enter first distance: ");
//       D1.getDistance();

//       //read second distance
//       System.out.println("Enter second distance: ");
//       D2.getDistance();

//       //add distances
//       D3.addDistance(D1, D2);
//       //print distance
//       System.out.println("Total distance is:");
//       D3.showDistance();
//     } 
//   }




public class q34 {
  int l, b;

  int area() {

      int a = l * b;
      return a;
  }

q34(int len, int bred) {
      l = len;
      b = bred;
     // area();
  }
}
class a37InchFeet{
      public static void main(String[] args) {

          q34 s=new q34(4,5);
          q34 s1=new q34(5,8);
          System.out.println(s.area());
          System.out.println(s1.area());

      }
  }





