package com.ritesh.javapractice.ArrayPrograms;//Not Understood (Doubt for later)
/* Return Duplicate Elements from an Array

Goal:Return elements that appear more than once.
Typical Logic:Use a frequency map (Map)
If count > 1 → it’s a duplicate
Key point:
👉 You are identifying repeated elements, not removing them
*/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class returnDuplicatesElementsFromArray {

    public static void main(String[] args) {

        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1, 7 };
        System.out.println(findDuplicates(arr));
    }

    public static List<Integer> findDuplicates(int[] arr) {
        List<Integer> result = new ArrayList<>();
        if (arr == null || arr.length == 0) {
            return result;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                result.add(entry.getKey());
            }
        }
        return result;
    }

}