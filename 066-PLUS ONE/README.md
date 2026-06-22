# Plus One

Java solution for the **Plus One** problem.

## Problem

Given a non-empty array of digits representing a non-negative integer, increment the integer by one and return the resulting array of digits.

The digits are stored such that the most significant digit comes first, and each element contains a single digit.

### Example

```text id="a4n2hj"
Input: digits = [1,2,3]
Output: [1,2,4]

Input: digits = [4,3,2,1]
Output: [4,3,2,2]

Input: digits = [9,9,9]
Output: [1,0,0,0]
```

## Approach

* Traverse the array from right to left.
* If the current digit is less than `9`, increment it and return the array.
* Otherwise, set the current digit to `0` and continue.
* If all digits are `9`, create a new array with one extra digit and set the first element to `1`.

## Complexity

* **Time Complexity:** O(n)
* **Space Complexity:** O(1)

## Tech Stack

* Java
* Array Manipulation
