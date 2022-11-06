import java.util.Scanner;

class array2d{

    public static void main(String[] args) {
        double[][] marks = new double[3][2];
        Scanner s = new Scanner(System.in);

        // taking input
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter marks of student : " + (i + 1));
            for (int j = 0; j < 2; j++) {
                System.out.println("Subject : " + (j + 1));
                marks[i][j] = s.nextDouble();
            }
        }

        // printing output
        for (int i = 0; i < 3; i++) {
            System.out.println("Student" + (i + 1));
            for (int j = 0; j < 2; j++) {
                System.out.println("Subject" + (j + 1) + ":" + marks[i][j]);
            }
        }
    }
}