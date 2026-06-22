# Sqrt(x)

Java solution for the **Sqrt(x)** problem using binary search.

## Problem

Given a non-negative integer `x`, return the square root of `x` rounded down to the nearest integer.

You must not use any built-in exponent function or operator.

### Example

```text
Input: x = 4
Output: 2

Input: x = 8
Output: 2
```

**Explanation:**

The square root of `8` is approximately `2.828`, so the result is `2`.

## Approach

* Handle edge cases where `x` is `0` or `1`.
* Use binary search to find the square root.
* Compare `mid × mid` with `x`.
* If `mid × mid` is less than `x`, store `mid` as a potential answer and search the right half.
* Otherwise, search the left half.

## Complexity

* **Time Complexity:** O(log x)
* **Space Complexity:** O(1)

## Tech Stack

* Java
* Binary Search
