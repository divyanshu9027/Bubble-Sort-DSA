package bubblesort;
import java.util.Scanner;

public class SortingBS {
    public static void main(String[] args) {
        String a[]=new String[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the 10 string type values:");
        for(int i=0;i<10;i++) {
            a[i]=scanner.nextLine();
        }
        System.out.println("\nunsorted array is:");
        for(int i=0;i<10;i++) {
            System.out.print(a[i]+",");
        }
        //bubble sort
        for(int i=0;i<10-1;i++) {
            for(int j=0;j<10-i-1;j++) {
                if(a[j].compareTo(a[j+1])>0) {
                    String temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;


                }
            }
        }
        System.out.println("\nsorted string is:");
        for(int i=0;i<10;i++) {
            System.out.print(a[i]+",");
        }

    }
    
}
