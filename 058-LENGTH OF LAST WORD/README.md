# Length of Last Word

Java solution for the **Length of Last Word** problem.

## Problem

Given a string `s` consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.

### Example

```text id="0a2n7s"
Input: s = "Hello World"
Output: 5

Input: s = "   fly me   to   the moon  "
Output: 4
```

## Approach

* Remove leading and trailing spaces using `trim()`.
* Traverse the string backward from the last character.
* Count characters until a space is encountered.
* Return the count.

## Complexity

* **Time Complexity:** O(n)
* **Space Complexity:** O(n)

## Tech Stack

* Java
* String Manipulation
