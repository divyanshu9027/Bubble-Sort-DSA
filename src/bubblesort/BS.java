package bubblesort;
import java.util.Scanner;

public class BS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the array size you want to entered:");
        int arraysize = scanner.nextInt();
        int a[] = new int[arraysize];
        System.out.println("enter the"+" "+arraysize+" "+"elements in an array:");
        for(int i=0;i<arraysize;i++) {
            a[i]=scanner.nextInt();
        }
        System.out.println("\nunsorted array is:");
        for(int i=0;i<arraysize;i++) {
            System.out.print(a[i]+",");
        }
        // bubble sort algorithm
        for(int i=0;i<arraysize-1;i++) {
            for(int j=0;j<arraysize-i-1;j++) {
                if(a[j]>a[j+1]) {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }

                }
            }
        System.out.println("\nsorted array is:");
        for(int i=0;i<arraysize;i++) {
            System.out.print(a[i]+",");
        }
        }
    }

