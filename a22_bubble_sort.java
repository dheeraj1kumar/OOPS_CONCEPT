import java.util.Scanner;
import java.util.Arrays;

public class a22_bubble_sort {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elments");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Arrays is:");
    int temp=0;
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("after sorting array elements are as:");
        System.out.println(Arrays.toString(arr));
    }
}

