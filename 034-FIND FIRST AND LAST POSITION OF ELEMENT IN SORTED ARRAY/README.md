# Find First and Last Position of Element in Sorted Array

Java solution for the **Find First and Last Position of Element in Sorted Array** problem using binary search.

## Problem

Given a sorted array of integers `nums` and a target value `target`, return the starting and ending positions of the target value.

If the target is not found, return `[-1, -1]`.

### Example

```text id="m8bz9v"
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
```

## Approach

* Perform binary search to find the first occurrence of the target.
* Perform binary search again to find the last occurrence.
* Return both indices as an array.

## Complexity

* **Time Complexity:** O(log n)
* **Space Complexity:** O(1)

## Tech Stack

* Java
* Binary Search
