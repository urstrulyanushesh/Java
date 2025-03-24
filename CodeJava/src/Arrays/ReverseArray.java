package Arrays;
public class ReverseArray {
    public static void main(String[] args) {
        int[] array= ArrayUtility.inputArray();
        reverse(array);
        System.out.print("Reverse Array:");
        ArrayUtility.displayArray(array);
    }

    public static void reverse(int[] arr){
    int i=0;
    while(i<arr.length/2){
        int swap=arr[i];
        arr[i]=arr[(arr.length-1)-i];
        arr[(arr.length-1)-i]=swap;
        i++;
    }
    }
}
