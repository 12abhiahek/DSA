package searching;

public class LinearSearch {
    public static int LinearSearch(int [] arr,int key){
        for(int i=0;i< arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static  void main(String [] args) {
        int[] arr = {2, 5, 3, 7, 9};
        System.out.print("arrays are:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        int key = 10;
        int index = LinearSearch(arr, key);
        if (index != -1) {
            System.out.print("index are::"+index);
        } else {
            System.out.print("index not found");
        }
    }
}
