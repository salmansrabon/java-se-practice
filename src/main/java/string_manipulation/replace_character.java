package string_manipulation;
//6. Replace "R" from Rahim with "F" from the given String:
//Input: Ratul and Rahim lives in Rangpur
//Output: Ratul and Fahim lives in Rangpur
public class replace_character {
    public static void main(String[] args) {
        String name="Ratul and Rahim lives in Rangpur";
        char[] chars= name.toCharArray();
        chars[10]='F';
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<chars.length;i++){
            sb.append(chars[i]);
        }
        System.out.println(sb);
    }
}
