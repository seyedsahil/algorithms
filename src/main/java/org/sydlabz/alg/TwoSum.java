package org.sydlabz.alg;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void run() {
        int[][] numbers = {
                {2, 7, 11, 15},
                {3, 2, 4},
                {3, 3},
                {-3, 4, 3, 90},
                {0, 1}
        };
        int[] target = {9, 6, 6, 0, 5};

        for (int i = 0; i < numbers.length; i++) {
            int[] positions = twoSum(numbers[i], target[i]);
            System.out.println("i=" + positions[0] + ", " + "j=" + positions[1]);
        }
    }

    private static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int j = 0; j < numbers.length; j++) {
            Integer i = map.get(numbers[j]);

            if (i == null) {
                map.put(target - numbers[j], j);
            } else {
                if (i != j) {
                    return new int[] {i, j};
                }
            }
        }

        return new int[] {-1, -1};
    }
}
