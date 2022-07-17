package string_manipulation;
//2. Price of a formal shirt is 1200 tk and Sharee is 3500 tk. If you buy 2 shirt and 1 sharee,
// then 400 tk will be discounted. After your purchase what will be your total cost?
public class digit_extraction {
    public static void main(String[] args) {
        String str="Price of a formal shirt is 1200 tk and Sharee is 3500 tk. If you buy 2 shirt and 1 sharee, then 400 tk will be discounted. After your purchase what will be your total cost?";
        str = str.replaceAll("[^\\d]", " ");
        str = str.trim();
        str = str.replaceAll(" +", " ");
        String[] arr=(str.split(" "));

        int shirt_price=Integer.parseInt(arr[0]);
        int sharee_price=Integer.parseInt(arr[1]);
        int shirt_quantity=Integer.parseInt(arr[2]);
        int sharee_quantity=Integer.parseInt(arr[3]);
        int discount=Integer.parseInt(arr[4]);
        int total_price=(shirt_price*shirt_quantity)+(sharee_price*sharee_quantity)-discount;
        System.out.println("Total cost "+total_price);
    }
}
