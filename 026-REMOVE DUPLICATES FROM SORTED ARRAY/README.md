# Remove Duplicates from Sorted Array

Java solution for the **Remove Duplicates from Sorted Array** problem using the two-pointer technique.

## Problem

Given a sorted integer array `nums`, remove duplicates in-place such that each unique element appears only once.

Return the number of unique elements `k`.

The first `k` elements of `nums` should contain the unique values.

### Example

```text
Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]

Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
```

## Approach

* Use two pointers:

  * `i` traverses the array.
  * `k` tracks the position for the next unique element.
* Compare the current element with the last unique element.
* If they differ, place the current element at index `k` and increment `k`.

## Complexity

* **Time Complexity:** O(n)
* **Space Complexity:** O(1)

## Tech Stack

* Java
* Two Pointers
