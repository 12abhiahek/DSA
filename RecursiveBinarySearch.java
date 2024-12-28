package searching;

import java.util.Scanner;

public class RecursiveBinarySearch {
    public static int BinarySearch(int[]arr,int key,int left,int right) {
        BinarySearch:
        while (true) {
            left = 0;
            right = arr.length - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (arr[mid] == key) {
                    return mid;
                } else
                    if (mid < key) {

                        right = key;
                        key = left;
                        left = mid + 1;
                        continue BinarySearch;
                    } else {
                        left = right;
                        right = key;
                        key = mid - 1;
                        continue BinarySearch;
                    }

            }
            return -1;
        }
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=scanner.nextInt();
        int []arr=new int[size];
        System.out.println("Enter arrays element");
        for(int i=0;i<size;i++){
            arr[i]= scanner.nextInt();
        }
        System.out.println("Enter key to find the element in arrays");
        int key=scanner.nextInt();
        int left=0;
        int right= arr.length-1;

        int index=BinarySearch(arr,key,left,right);
        if(index!=-1) {
            System.out.println("Element index are:"+index);
        }else{
            System.out.println("Element index are not found");
        }
    }
}
