package conditional_logic_loop;
//9. Write a program to sum of user input until users input ‘q’ from keyboard
import java.util.Scanner;

public class sum_of_user_input {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sum=0;
        char charInput;
        int input;
        do{
            try{
                System.out.println("Input a number for summation (press q for quit)");
                input=scanner.nextInt();
                sum+=input;
                System.out.println(sum);
            }
            catch (Exception e){
                charInput=scanner.next().charAt(0);
                if(charInput=='q' || charInput=='Q'){
                    break;
                }
            }
        }
        while(true);
    }
}
