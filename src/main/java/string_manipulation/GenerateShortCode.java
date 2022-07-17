package string_manipulation;
//Write a program that will give following output:
//Input: chattogram
//Output: C8M
public class GenerateShortCode {
    public static void main(String[] args) {
        String str="chattogram";
        String firstChar=String.valueOf(str.toCharArray()[0]).toUpperCase() ;
        int length=str.length();
        String lastChar=String.valueOf(str.toCharArray()[length-1]).toUpperCase() ;
        String shortCode=firstChar+(length-2)+lastChar;
        System.out.println(shortCode);
    }
}
