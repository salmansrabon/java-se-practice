package conditional_logic_loop;
//1. Write a program to check if inputted letter is small or capital
import java.util.Scanner;

public class small_capital_letter {
    public static void main(String[] args) {
        System.out.println("Input a letter: ");
        Scanner scanner=new Scanner(System.in);
        checkSmallorCapital(scanner.next());
        scanner.close();
    }
    private static void checkSmallorCapital(String chars){
        char letter=chars.charAt(0);
        if(letter>='A' && letter<='Z'){
            System.out.println("Capital Letter");
        }
        else if(letter>='a' && letter<='z'){
            System.out.println("Small Letter");
        }
        else{
            System.out.println("This is a special character");
        }
    }
}
