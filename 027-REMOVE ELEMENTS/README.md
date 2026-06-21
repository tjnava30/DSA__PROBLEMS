# Remove Element

Java solution for the **Remove Element** problem using the two-pointer technique.

## Problem

Given an integer array `nums` and an integer `val`, remove all occurrences of `val` in-place and return the number of remaining elements `k`.

The first `k` elements of `nums` should contain the elements that are not equal to `val`.

### Example

```text id="xg4a0t"
Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]

Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,3,0,4,_,_,_]
```

## Approach

* Traverse the array using a pointer `i`.
* Maintain another pointer `k` to track the position for the next valid element.
* If `nums[i]` is not equal to `val`, place it at index `k` and increment `k`.
* Return `k` after processing all elements.

## Complexity

* **Time Complexity:** O(n)
* **Space Complexity:** O(1)

## Tech Stack

* Java
* Two Pointers
