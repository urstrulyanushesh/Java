package Arrays;

/*
Array Style
public class SumArray {
    public static int sum(int[]a){
        int sum=0;
        for (int i : a) {
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] val= new int[]{4,2,1,3};
        System.out.println(sum(val));
    }
}
 */



//Variable Argument Style
public class SumArray {
    public static int sum(int...a){
        int sum=0;
        for (int i : a) {
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int val= sum(1,2,3,4,5,6,7,8,9);
        System.out.println(val);
    }
}
