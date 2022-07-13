package string_manipulation;

//1. Write a program to convert each 1st char to uppercase from a string
public class convert_to_titlecase {
    public static void main(String[] args) {
        String str="rahim lives in sylhet";
        String[] words=str.split(" ");
        for(int i=0;i<words.length;i++){
            String firstLetter= String.valueOf(words[i].charAt(0)).toUpperCase();
            String othersLetter=words[i].substring(1);
            System.out.println(firstLetter+othersLetter);
        }
    }
}
