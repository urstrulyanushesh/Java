package Arrays;
public class MergeTwoArray {
    public static void main(String[] args) {
        int[] arr1=ArrayUtility.inputArray();//    Important Note:Should Be Sorted
        int[] arr2=ArrayUtility.inputArray();
        int[] newArray=mergefunc(arr1,arr2);
        System.out.println("Array After Being Merge");
        ArrayUtility.displayArray(newArray);
    }
    public static int[] mergefunc(int[] arr1,int[] arr2){
    int newSize=arr1.length+arr2.length;
    int[] finalArray=new int[newSize];
    int i=0,j=0,k=0;
    while(i< arr1.length||j< arr2.length){
        if(j== arr2.length || (i<arr1.length && arr1[i]<arr2[j])  ){
            finalArray[k]=arr1[i];
            i++;
        }
        else{
            finalArray[k]=arr2[j];
            j++;
        }
        k++;
    }
    return finalArray;
    }
}
