# Binary Search

Java solution for the **Binary Search** problem using a linear search approach.

## Problem

Given a sorted array of integers `nums` and an integer `target`, return the index of `target` if it exists in the array. Otherwise, return `-1`.

### Example

```text
Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4

Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
```

## Approach

* Traverse the array from left to right.
* Compare each element with the target value.
* Return the index if the target is found.
* Return `-1` if the target is not present.

## Complexity

* **Time Complexity:** O(n)
* **Space Complexity:** O(1)

## Tech Stack

* Java
