package string_manipulation;
//Write a program that will count how many vowels in the given string:
//"roadtosdet"
//Output: 4
public class find_vowel {
    public static void main(String[] args) {
        int count=0;
        String str="roadtosdet";
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='a'|| ch[i]=='e' || ch[i]=='i' || ch[i]=='o' ||ch[i]=='u'){
                count++;
            }
        }
        System.out.println("Total vowel "+count);
    }
}
