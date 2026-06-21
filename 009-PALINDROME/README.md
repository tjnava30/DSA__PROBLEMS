# Palindrome Number

Java solution for the **Palindrome Number** problem.

## Problem

Given an integer `x`, return `true` if `x` is a palindrome; otherwise, return `false`.

A palindrome number reads the same forward and backward.

### Example

```text id="p7m0yb"
Input: x = 121
Output: true

Input: x = -121
Output: false

Input: x = 10
Output: false
```

## Approach

* Return `false` if the number is negative.
* Store the original number in a temporary variable.
* Reverse the digits using modulo (`%`) and division (`/`).
* Compare the reversed number with the original number.

## Complexity

* **Time Complexity:** O(log n)
* **Space Complexity:** O(1)

## Tech Stack

* Java
