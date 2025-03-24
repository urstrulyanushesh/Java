package Arrays;
public class SortedArray {
    public static void main(String[] args) {
        int[] num = ArrayUtility.inputArray();
        boolean sorta = increasing(num);
        boolean sortb = decreasing(num);
        if (sorta || sortb) {
            System.out.print("Sorted Array");
        } else {
            System.out.print("Not Sorted Array");
        }
    }

    public static boolean increasing(int[] num) {
        int i = 1;
        while (i < num.length) {
            if (num[i] < num[i - 1]) {
                return false;
            }
            i++;
        }
        return true;
    }
        public static boolean decreasing(int[] num){
            int i = 1;
            while (i < num.length) {
                if (num[i] > num[i - 1]) {
                    return false;
                }
                i++;
            }
            return true;
        }
    }
