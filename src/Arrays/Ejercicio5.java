package Arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ejercicio5 {


    public static int maxValue(int[] nums) {
        return Arrays.stream(nums).max().getAsInt();
    }

    public static double meanValue(int[] nums) {
        return Arrays.stream(nums).average().getAsDouble();
    }

    public static int countStringsContaining(String[] strings, String target) {
        return (int) Arrays.stream(strings).filter(str -> str.contains(target)).count();
    }

    public static boolean areArraysEqual(String[] arr1, String[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static void swapPairs(String[] strings) {
        for (int i = 0; i < strings.length - 1; i += 2) {
            String temp = strings[i];
            strings[i] = strings[i + 1];
            strings[i + 1] = temp;
        }
    }

    public static int rangeOfValues(int[] nums) {
        return Arrays.stream(nums).max().getAsInt() - Arrays.stream(nums).min().getAsInt() + 1;
    }

    public static double standardDeviation(int[] nums) {
        double mean = meanValue(nums);
        return Math.sqrt(Arrays.stream(nums).mapToDouble(num -> Math.pow(num - mean, 2)).sum() / nums.length);
    }

    public static int minAdjacentDifference(int[] nums) {
        return Arrays.stream(nums).reduce((a, b) -> Math.min(Math.abs(a - b), Integer.MAX_VALUE)).getAsInt();
    }

    public static int[] sumPairs(int[] nums) {
        return IntStream.range(0, (nums.length + 1) / 2)
                .map(i -> (i * 2 + 1 < nums.length) ? nums[i * 2] + nums[i * 2 + 1] : nums[i * 2])
                .toArray();
    }

    public static int[] concatenateArrays(int[] arr1, int[] arr2) {
        return IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).toArray();
    }

    public static int longestOrderedSubsequence(int[] nums) {
        int maxLength = 1;
        int currentLength = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= nums[i - 1]) {
                currentLength++;
                maxLength = Math.max(maxLength, currentLength);
            } else {
                currentLength = 1;
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {5, 9, 11, 2, 7, 17, -9, 0, 13, 209, 75, 99, 21};
        String[] strings = {"apple", "banana", "orange", "grape", "apple"};
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {6, 7, 8, 9, 10};

        System.out.println("Max value: " + maxValue(nums));
        System.out.println("Mean value: " + meanValue(nums));
        System.out.println("Count of strings containing 'apple': " + countStringsContaining(strings, "apple"));
        System.out.println("Are arrays equal: " + areArraysEqual(strings, strings));
        swapPairs(strings);
        System.out.println("Swapped pairs: " + Arrays.toString(strings));
        System.out.println("Range of values: " + rangeOfValues(nums));
        System.out.println("Standard deviation: " + standardDeviation(nums));
        System.out.println("Min adjacent difference: " + minAdjacentDifference(nums));
        System.out.println("Sum pairs: " + Arrays.toString(sumPairs(nums)));
        System.out.println("Concatenated arrays: " + Arrays.toString(concatenateArrays(nums1, nums2)));
        System.out.println("Longest ordered subsequence length: " + longestOrderedSubsequence(nums));
    }
}


