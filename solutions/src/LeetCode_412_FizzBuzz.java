//https://leetcode.com/problems/fizz-buzz/

import java.util.Arrays;
import java.util.List;

public class LeetCode_412_FizzBuzz {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }

    public static List<String> fizzBuzz(int n) {
        String[] list = new String[n];

        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                list[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                list[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                list[i - 1] = "Buzz";
            } else {
                list[i - 1] = Integer.toString(i);
            }
        }

        return Arrays.asList(list);
    }
}
