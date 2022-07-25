package conditional_logic_loop;
//6. Write  a program to find the factorial of a given number
public class factorial {
    public static void main(String[] args) {
        int factorial=getFactorial(8);
        System.out.println("Factorial is "+factorial);
//        int factorial=getFactorialByRecursion(8);
//        System.out.println("Factorial is "+factorial);
    }
    private static int getFactorial(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        return fact;
    }
    private static int getFactorialByRecursion(int n){
        if(n>=1){
            return n*getFactorialByRecursion(n-1);
        }
        else{
            return 1;
        }
    }
}
//test
