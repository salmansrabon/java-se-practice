package function_Array;
import java.util.Arrays;
import java.util.Scanner;

//1. Take input from a user and check if the number exists in the array
public class check_if_element_Exist_in_array {
    public static void main(String[] args) {
        int[] arr={10,5,9,6,7,8,3,4};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input a number: ");
        int inputNumber= scanner.nextInt();
        check(arr,inputNumber);
        scanner.close();
    }
    private static void check(int[] numbers, int number){
        boolean status=false;
        int pos=0;
        for(int i=0;i<numbers.length;i++){
            if(number==numbers[i]){
                pos=i;
                status=true;
            }
        }
        if(status==true){
            System.out.println("Number exists in position "+pos);
        }
        else{
            System.out.println("Number not found");
        }
    }
}
