package Controller;

public class ExceptionDemoCtl {
    public static int divizero(int a, int b) throws Exception{
        if (b == 0){
            throw new ArithmeticException("Divide by zero");
        }
        return a/b;
    }
}
