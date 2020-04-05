package bubblesort;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[]=new int[10];
        System.out.println("enter the 10 elements in an array:");
        for(int i=0;i<10;i++) {
            a[i]=scanner.nextInt();
        }
        System.out.print("\nunsorted array is:");
        for(int i=0;i<10;i++) {
            System.out.print(a[i]+",");
        }
        //bubble sort
        for(int i=0;i<10-1;i++) {
            for(int j=0;j<10-i-1;j++) {
                if(a[j]>a[j+1]) {
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        System.out.println("\nunsorted array is:");
        for(int i=0;i<10;i++) {
            System.out.print(a[i]+",");
        }
    }}