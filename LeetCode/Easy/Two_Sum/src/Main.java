import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {3,2,4} ;
        int target = 6 ;
        Solution.twoSum(numbers , target);
        System.out.println(Arrays.toString(Solution.twoSum(numbers, target)));
    }
}