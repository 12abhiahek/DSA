package searching;

import java.util.Scanner;

public class LinearDynamic {
    public static int LinearSearch(int[]arr,int key){
        for(int i=0;i< arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter size");
        int size=scanner.nextInt();

        int [] arr;
        arr = new int[size];
        System.out.println("Enter element in array");
        for(int i=0;i<size;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.print("print arrays value");
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println(" ");
        System.out.println("Enter Key to find the element in a array");
        int key=scanner.nextInt();
        int index=LinearSearch(arr,key);
            if(index!=-1){
                System.out.println("Element index are:"+index);
            }else {
                System.out.println("Element are not found");
            }
    }
}
