package MixedCode;

public class ThrowExp {
    public static void div(int a ,int b) throws ArithmeticException {
        if(b==0){
            throw new ArithmeticException("Cant divide by zero");
        }
        else{
            int z=a/b;
            System.out.println(z);
        }
    }
    public static void main(String[] args) {
        try {
            div(12, 0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
