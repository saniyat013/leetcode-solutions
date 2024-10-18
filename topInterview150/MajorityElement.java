package com.saniyat.problemSolving.leetcodeSolutions.topInterview150;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        int result = 0;
        Map<Integer, Integer> mymap = new HashMap();

        for (int num : nums) {
            if (!mymap.containsKey(num)) {
                mymap.put(num, 1);
            } else {
                mymap.put(num, mymap.get(num) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : mymap.entrySet()) {
            if (entry.getValue() >= nums.length / 2) {
                result = entry.getKey();
            }
        }

        System.out.println("result::" + result);
    }
}
