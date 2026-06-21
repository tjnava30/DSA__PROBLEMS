# Find the Index of the First Occurrence in a String

Java solution for the **Find the Index of the First Occurrence in a String** problem.

## Problem

Given two strings `haystack` and `needle`, return the index of the first occurrence of `needle` in `haystack`, or `-1` if `needle` is not part of `haystack`.

### Example

```text id="dylh8f"
Input: haystack = "sadbutsad", needle = "sad"
Output: 0

Input: haystack = "leetcode", needle = "leeto"
Output: -1
```

## Approach

* Use Java's built-in `indexOf()` method to find the first occurrence of `needle` in `haystack`.
* Return the result directly.

## Complexity

* **Time Complexity:** O(n × m) in the worst case
* **Space Complexity:** O(1)

where:

* `n` is the length of `haystack`
* `m` is the length of `needle`

## Tech Stack

* Java
* String API (`indexOf`)
