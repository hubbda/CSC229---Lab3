public class Lab3Work {
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

    public static int linearSearch(int[] a, int size, int search) {
        int i = 0, location;
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

    public static void main(String[] args) {
        int[] myArr = {5,23,3,2,6,10,7,15};

        sortArray(myArr, 8);

        linearSearch(myArr,8,2);

        binarySearch(myArr, 10);

        System.out.println(binarySearch(myArr, 10));
        System.out.println(linearSearch(myArr,8,2));
    }

}
