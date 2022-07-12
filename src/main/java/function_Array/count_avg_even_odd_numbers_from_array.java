package function_Array;
//5. Take 5 numbers from users in an array. Then find out the average number,
// how many even and how many odd numbers using these functions:
// average(), countEvenNumbers(), countOddNumbers()
public class count_avg_even_odd_numbers_from_array {
    public static void main(String[] args) {
        int[] nums={5,6,3,4,1};
        double avg=findAverage(nums);
        System.out.println("Average "+avg);
    }
    private static double findAverage(int[] numbers){
        int sum=0;
        for(int i=0;i<numbers.length;i++){
            sum+=numbers[i];
        }
        return sum/numbers.length;
    }
}
