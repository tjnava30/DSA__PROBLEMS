# Median of Two Sorted Arrays

Java solution for the **Median of Two Sorted Arrays** problem.

## Problem

Given two sorted arrays `nums1` and `nums2` of sizes `m` and `n`, return the median of the two sorted arrays.

### Example

```text
Input: nums1 = [1, 3], nums2 = [2]
Output: 2.0

Input: nums1 = [1, 2], nums2 = [3, 4]
Output: 2.5
```

## Approach

* Create a new array to store elements from both input arrays.
* Copy all elements from `nums1` and `nums2` into the new array.
* Sort the merged array.
* If the length is odd, return the middle element.
* If the length is even, return the average of the two middle elements.

## Complexity

* **Time Complexity:** O((m + n) log(m + n))
* **Space Complexity:** O(m + n)

where `m` and `n` are the lengths of the input arrays.

## Tech Stack

* Java
* Arrays.sort()
