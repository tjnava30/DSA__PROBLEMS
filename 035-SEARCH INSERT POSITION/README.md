# Search Insert Position

Java solution for the **Search Insert Position** problem using binary search.

## Problem

Given a sorted array of distinct integers `nums` and a target value `target`, return the index if the target is found.

If not, return the index where it would be inserted to maintain the sorted order.

### Example

```text id="vvhn24"
Input: nums = [1,3,5,6], target = 5
Output: 2

Input: nums = [1,3,5,6], target = 2
Output: 1

Input: nums = [1,3,5,6], target = 7
Output: 4
```

## Approach

* Use binary search to locate the target.
* If the target is found, return its index.
* If not found, return `start`, which represents the correct insertion position.

## Complexity

* **Time Complexity:** O(log n)
* **Space Complexity:** O(1)

## Tech Stack

* Java
* Binary Search
