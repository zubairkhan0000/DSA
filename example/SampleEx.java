import java.util.HashMap;
import java.util.Map;

public class SampleEx {
    public static int[] twoSum(int[] num1, int target) {
        Map<Integer, Integer> m1 = new HashMap<>();
        for (int i = 0; i < num1.length; i++) {
            int complement = target - num1[i];
            if (m1.containsKey(complement)) {
                return new int[] { m1.get(complement), i };
            }
            m1.put(num1[i], i);
        }
        throw new IllegalArgumentException("No such pair exists");
    }

    public static void main(String[] args) {
        int[] num1 = { 2, 5, 6, 7, 9 };
        int target = 7;
        int[] result = twoSum(num1, target);
        System.out.println(result[0] + " " + result[1]);
    }
}
