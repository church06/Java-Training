import java.util.Arrays;
import java.util.HashMap;

public class _1 {
    public static void main(String[] args) {
        int[] test = {1, 2, 5, 10, 3, 22, 7};
        int target = 24;

        _1 one = new _1();
        System.out.println(Arrays.toString(one.position(test, target)));
        System.out.println(Arrays.toString(one.values(test, target)));
        ;
    }

    private int[] position(int[] nums, int target) {

        int[] sum = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                sum[1] = i;
                sum[0] = map.get(nums[i]);
            }
            map.put(target - nums[i], i);
        }
        return sum;
    }

    private int[] values(int[] nums, int target) {
        int[] sum = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                sum[1] = num;
                sum[0] = map.get(num);
            }

            map.put(target - num, num);
        }

        return sum;
    }
}
