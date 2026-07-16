import java.util.Arrays;

public class solution {
    public static void main(String[] args) {
        int[] arr = { 0, 2, 1, 5, 3, 4 };
        System.out.println(Arrays.toString(buildArray(arr)));
    }

    static int[] buildArray(int[] nums) {
        int[] a;
        a = Arrays.copyOf(nums, nums.length);
        for (int i = 0; i < nums.length; i++) {

            a[i] = nums[nums[i]];
        }
        return a;

    }
}
