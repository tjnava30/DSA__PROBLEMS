# Add Binary

Java solution for the **Add Binary** problem.

## Problem

Given two binary strings `a` and `b`, return their sum as a binary string.

### Example

```text id="e5b81i"
Input: a = "11", b = "1"
Output: "100"

Input: a = "1010", b = "1011"
Output: "10101"
```

## Approach

* Traverse both strings from right to left.
* Add corresponding digits along with the carry.
* Append the current binary digit to the result.
* Update the carry for the next iteration.
* Reverse the result string before returning it.

## Complexity

* **Time Complexity:** O(m + n)
* **Space Complexity:** O(m + n)

where `m` and `n` are the lengths of the input strings.

## Tech Stack

* Java
* String Manipulation
