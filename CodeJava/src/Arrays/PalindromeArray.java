package Arrays;
public class PalindromeArray {
    public static void main(String[] args) {
        int[] arr=ArrayUtility.inputArray();
        boolean value=checkPalindrome(arr);
        if(value){
            System.out.print("It is palindrome");
        }
        else{
            System.out.print("Not Palindrome ");
        }
    }

    public static boolean checkPalindrome(int[] arr){
    int i=0;
    while (i<arr.length/2){
        if(arr[i]!=arr[(arr.length-1)-i]){
            return false;
        }
        i++;
    }
    return true;
    }
}
