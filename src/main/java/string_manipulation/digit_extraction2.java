package string_manipulation;
//Core i 7 HP laptop price is 76000 tk and cash payment discount 10%.
// What will be the purchase price?
public class digit_extraction2 {
    public static void main(String[] args) {
        String str="Core i 7 HP laptop price is 76000 tk and cash payment discount 10%. What will be the purchase price?";
        str = str.replaceAll("[^\\d]", " ");
        str = str.trim();
        str = str.replaceAll(" +", " ");
        String[] arr=(str.split(" "));
        int laptopPrice=Integer.parseInt(arr[1]);
        int discount=Integer.parseInt(arr[2]);
        int totalPrice=laptopPrice-(laptopPrice*discount)/100;
        System.out.println("Total price "+totalPrice);
    }


}
