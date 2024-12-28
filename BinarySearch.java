package searching;

import java.util.Scanner;

public class BinarySearch {
    public static int BinarySearch(int[]arr,int key){
        int left=0;
        int right= arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==key){
                return mid;
            } else if (mid<key) {
                left=mid+1;
            }else {
                right = mid - 1;
            }

        }
        return -1;
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

        int index=BinarySearch(arr,key);
        if(index!=-1) {
            System.out.println("Element index are:"+index);
        }else{
            System.out.println("Element index are not found");
        }
    }

}
