public class rotated {
    public static void main(String[] args) {
        int nums[] = {6, 7, 8, 9, 1, 2, 3};
        int target = 9;

        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        int p = pivot(nums);

        // If no pivot, array is not rotated
        if (p == -1) {
            return binarysearch(nums, target, 0, nums.length - 1);
        }

        // If pivot element is the target
        if (nums[p] == target) {
            return p;
        }

        // Search in first half
        if (target >= nums[0]) {
            return binarysearch(nums, target, 0, p - 1);
        }

        // Search in second half
        return binarysearch(nums, target, p + 1, nums.length - 1);
    }

    static int pivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Case 1: mid > mid+1
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }

            // Case 2: mid < mid-1
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            // Case 3: pivot is in left side
            if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else { // Case 4: pivot is in right side
                start = mid + 1;
            }
        }
        return -1;
    }

    static int binarysearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
