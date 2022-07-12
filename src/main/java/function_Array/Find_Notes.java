package function_Array;

import java.util.Scanner;

//2. Input an amount from the user and find out the number of notes from input amount in given array
public class Find_Notes {
    public static void main(String[] args) {
        int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please input an amount: ");
        int amount = scanner.nextInt();
        scanner.close();
        for (int i = 0; i < notes.length; i++) {
            int note = amount / notes[i];
            amount = amount % notes[i];
            if (note == 0) {
                continue;
            }
            System.out.println(notes[i] + " " + note);
        }
    }
}
