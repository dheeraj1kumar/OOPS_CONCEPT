public class a21 {
    public static void main(String[] args) {
        int arr[]={0,3,3,4,5};
        int sum=0;
        double avg=0;
        for(int s:arr){
            sum+=s;

        }
        avg=sum/arr.length;
        System.out.println("summ of all the elements is "+sum);
        System.out.println("Average of all the elements is "+avg);
    }
}
