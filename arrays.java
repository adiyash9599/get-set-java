import java.util.*;

public class arrays {
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] += 1;
        }
    }

    public static int linear_search(String names[], String key) {

        for (int i = 0; i < names.length; i++) {
            if (names[i] == key) {
                return i;
            }
        }
        return -1;

    }

    public static int get_largest(int numbers[]) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }

        }
        return largest;
    }

    public static int get_smallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }

        }
        return smallest;
    }

    public static int binary_search(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (numbers[mid] == key) {
                return mid;
            } else if (numbers[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void reverse(int numbers[]) {
        int first = 0, last = numbers.length - 1;
        while (first < last) {
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }

    public static void printPairs(int numbers[]) {
        int tp = 0;
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + curr + ", " + numbers[j] + ")");
                tp++;
            }
            System.out.println(); // time complexity = O(n^2)
        }
        System.out.println("Total pairs: " + tp); // total pairs = n(n-1) / 2
    }

    // Brute Force Method
    // public static void printSubarrays(int numbers[]) {
    // int ts = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
    // for (int i = 0; i < numbers.length; i++) {
    // int start = i;
    // for (int j = i; j < numbers.length; j++) {
    // int end = j;
    // int sum = 0;
    // for (int k = start; k <= end; k++) {
    // System.out.print(numbers[k] + " ");
    // sum += numbers[k];
    // }
    // ts++;
    // System.out.println();
    // System.out.println("sum = " + sum);
    // if (sum < min) {
    // min = sum;
    // }
    // if (sum > max) {
    // max = sum;
    // }
    // }
    // System.out.println();
    // }

    // System.out.println("Total subarrays: " + ts);
    // System.out.println("Max: " + max);
    // System.out.println("Min: " + min);
    // }

    // Prefix Approach
    public static void printSubarrays(int numbers[]) {
        int currSum = 0, maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("Max Sum: " + maxSum);
    }

    public static void kadanes(int numbers[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < numbers.length; i++) {
            cs += numbers[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Our Max Subarray Sum: " + ms);

        // If complete array is negatives
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                ms = Math.max(ms, numbers[i]);
            }
        }
        System.out.println("Our Max Subarray Sum: " + ms);

    }

    public static int trappedRainwater(int height[]) {
        int n = height.length;
        // calc left max boundary array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // calc right max boundary array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trappedRainwater = 0;
        for (int i = 0; i < n; i++) {
            // waterlevel = min(leftMax, rightMax)
            int waterlevel = Math.min(leftMax[i], rightMax[i]);

            // trapped water = waterlevel - height[i]
            trappedRainwater += waterlevel - height[i];
        }

        return trappedRainwater;
    }

    public static int buyAndSellStocks(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        // int marks[] = new int[3];
        // Scanner sc = new Scanner(System.in);

        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // System.out.println(marks.length);
        // marks[0] = 99;
        // marks[1] = 94;
        // marks[2] = 96;

        // update(marks);

        // for (int i = 0; i < marks.length; i++) {
        // System.out.println(marks[i]);
        // }
        // System.out.println();
        // String names[] = { "aditya", "yash", "harsh", "adi" };
        // String key = "adi";

        // int index = linear_search(names, key);

        // if (index == -1) {
        // System.out.println("Not Found!");
        // } else {
        // System.out.println("Found at index: " + index);
        // }

        // int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        // int numbers[] = { -2, -3, -4, -2, -5, -3 };
        // System.out.println(get_largest(numbers));
        // System.out.println(get_smallest(numbers));
        // int key = 99;
        // System.out.println("Index for key is: " + binary_search(numbers, key));
        // reverse(numbers);
        // for (int i = 0; i < numbers.length; i++) {
        // System.out.print(numbers[i] + " ");
        // }
        // printPairs(numbers);
        // printSubarrays(numbers);
        // kadanes(numbers);

        // int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        // System.out.println(trappedRainwater(height));

        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(buyAndSellStocks(prices));
    }
}
