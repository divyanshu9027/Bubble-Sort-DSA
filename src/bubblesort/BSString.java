package bubblesort;
import java.util.Scanner;

public class BSString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of an array::");
        int arraysize = scanner.nextInt();
        String a[] = new String[arraysize];
        System.out.println("enter the"+" "+arraysize+" "+"elements in an array:");
        for(int i=0;i<arraysize;i++) {
            a[i] = scanner.nextLine();
        }
        System.out.println("\nunsorted array is:");
        for(int i=0;i<arraysize;i++) {
            System.out.print(a[i]+",");
        }
        //bubble sort
        for(int i=0;i<arraysize-1;i++) {
            for(int j=0;j<arraysize-i-1;j++) {
                if(a[j].compareTo(a[j+1])>0) {
                    String temp=a[j];
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
