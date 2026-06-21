# Reverse Integer

Java solution for the **Reverse Integer** problem.

## Problem

Given a signed 32-bit integer `x`, return `x` with its digits reversed. If reversing `x` causes the value to go outside the signed 32-bit integer range `[-2³¹, 2³¹ - 1]`, return `0`.

### Example

```text
Input: x = 123
Output: 321

Input: x = -123
Output: -321

Input: x = 1534236469
Output: 0
```

## Approach

* Extract digits using modulo (`% 10`).
* Build the reversed number digit by digit.
* Check for integer overflow before updating the reversed value.
* Return `0` if the reversed number exceeds the 32-bit integer range.

## Complexity

* **Time Complexity:** O(log n)
* **Space Complexity:** O(1)

## Tech Stack

* Java
