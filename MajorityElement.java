package com.mycompany.majorityelement;

public class MajorityElement {

    public static int findMejorityElement(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > (nums.length / 2)) {
                return nums[i];
            }
        }
        return -1;

    }

    public static void main(String[] args) {

        int[] num = {1, 2, 3, 3, 4, 5, 5, 5, 6, 7, 8};
        findMejorityElement(num);

    }
}
