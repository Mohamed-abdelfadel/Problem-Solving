import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static boolean isPalindrome(int x) {
        boolean return_type = false;
        if (x >= 0 ){
            List<Integer> numbers = new ArrayList<>();
            String temp = Integer.toString(x);
            int[] newGuess = new int[temp.length()];
            for (int i = 0; i < temp.length(); i++)
            {
                newGuess[i] = temp.charAt(i) - '0';
                numbers.add(newGuess[i]) ;
            }
            if (numbers.size()%2 == 0 ){
                List<Integer> first_half_list = numbers.subList(0, numbers.size() / 2);
                List<Integer> second_half_list = numbers.subList(numbers.size() / 2, numbers.size());
                Collections.reverse(second_half_list);
                if (first_half_list.equals(second_half_list)) {
                    return_type = true ;
                }
            }
            else {
                List<Integer> first_half_list = numbers.subList(0, numbers.size() / 2);
                List<Integer> second_half_list = numbers.subList((numbers.size() / 2)+1, numbers.size());
                Collections.reverse(second_half_list);
                if (first_half_list.equals(second_half_list)) {
                    return_type = true ;
                }
            }
        }
        return return_type;
    }

//    class Solution {
//        public boolean isPalindrome(int x) {
//            String s = String.valueOf(x); // Convert to String
//            int n = s.length(); // Store the String length to int n
//
//            for (int i=0; i<n/2; i++) {
//                // We check whether the elements at the same distance from
//                // beginning and from ending are same, if not we return false
//                if (s.charAt(i) != s.charAt(n-i-1)) return false;
//            }
//
//            // if no flaws are found we return true
//            return true;
//        }
//    }
}
