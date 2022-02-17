import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;
import java.text.ParseException;
import java.util.Scanner;

public class lab3w {
    public static void sortArray(int[] a, int size) {
        int outer, inner, temp;
        for(outer = size-1; outer > 0; outer--) {
            for(inner = 0; inner < outer; inner++) {
                if(a[inner] > a[inner + 1]) {
                    temp = a[inner];
                    a[inner] = a[inner + 1];
                    a[inner + 1] = temp;
                }
            }
        }
    }

    public static int linearSearch(int[] a, int search) {
        int i = 0, location = 0, size = a.length - 1;
        while(i <= size && search != a[i]) {
            i = i + 1;
            if(i <= size) location = i;
            else location = -1;
        }
        return location;
    }

    public static int binarySearch(int[] a, int search) {
        int start = 0;
        int end = a.length - 1;

        while(start <= end) {
            int middle = (start + end) / 2;

            if (search < a[middle]) {
                end = middle - 1;
            }

            if (search > a[middle]) {
                start = middle + 1;
            }

            if (search == a[middle]) {
                return middle;
            }
        }
        return -1;
    }

    public static void printTime() {
        Instant start = Instant.now();
        long i = 0;
        while (i < 100000000){
            i++;
        }
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();

        System.out.println("Time: " + timeElapsed + "ms");
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int[] myArr = {5,23,3,2,6,10,7,15,9,12,43,85,37,1};
        int arrSize = myArr.length;
        sortArray(myArr, arrSize);

        System.out.print("Enter a integer value to find: ");
        int find = scnr.nextInt();
        System.out.println(binarySearch(myArr, find));
        printTime();
        System.out.print("\nEnter a integer value to find: ");
        find = scnr.nextInt();
        System.out.println(linearSearch(myArr, find));
        printTime();
    }
}
