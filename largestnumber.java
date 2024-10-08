package demo;
import java.util.Scanner;

public class largestnumber{
    public static void findLargestElements(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }

        int fl = Integer.MIN_VALUE;
        int sl = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++)
            if (arr[i] > fl) {
                sl = fl;
                fl = arr[i];
            }
            else if (arr[i] > sl && arr[i] < fl) {
                sl = arr[i];
            }
        if (sl == Integer.MIN_VALUE) {
            System.out.println("The largest element is: " + fl);
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("The largest element is: " + fl);
            System.out.println("The second largest element is: " + sl);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements in array");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter elements of array");
        for (int i=0; i<n;i++){
            arr[i]= sc.nextByte();
        }
        findLargestElements(arr);
    }
}