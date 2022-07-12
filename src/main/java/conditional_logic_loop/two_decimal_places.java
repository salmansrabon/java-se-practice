package conditional_logic_loop;
//3. Input 2 decimal numbers and check if they are both same or different up to two decimal places. E.g 120.546 & 120.241
public class two_decimal_places {
    public static void main(String[] args) {
        double number1=120.569;
        double number2=120.57;
        if(Math.round(number1)==Math.round(number2)){
            System.out.println("Matches");
        }
        else{
            System.out.println("Didn't match");
        }
    }


}
