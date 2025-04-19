package com.mycompany.searchinsertposition;

public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        int start, end, mid;
        start = 0;
        end = nums.length - 1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target == nums[mid]) {             
                return mid;
                
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = nums[mid] - 1;
            }
        }

        return start;

    }

    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 6};
        int target = 7;
        int idx = searchInsert(nums, target);
        System.out.println("targetIdx : " + idx);

    }
}
