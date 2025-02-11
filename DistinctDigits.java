import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DistinctDigits {
    public static List<Integer> findDistinctDigits(int[] numbers) {
        List<Integer> digits = new ArrayList<>();
        boolean[] seen = new boolean[10];
        for (int num : numbers) {
            while (num > 0) {
                int digit = num % 10;
                if (!seen[digit]) {
                    seen[digit] = true;
                    digits.add(digit);
                }
                num /= 10;
            }
        }
        Collections.sort(digits);
        return digits;
    }
    
    public static void main(String[] args) {
        int[] numbers = {111, 222, 333, 4444, 666};
        System.out.println(findDistinctDigits(numbers));
    }
}
