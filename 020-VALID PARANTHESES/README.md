# Valid Parentheses

Java solution for the **Valid Parentheses** problem using a custom stack implementation.

## Problem

Given a string `s` containing only the characters `'('`, `')'`, `'{'`, `'}'`, `'['`, and `']'`, determine if the input string is valid.

A string is valid if:

* Open brackets are closed by the same type of brackets.
* Open brackets are closed in the correct order.
* Every closing bracket has a corresponding opening bracket.

### Example

```text id="j0k4b3"
Input: s = "()[]{}"
Output: true

Input: s = "(]"
Output: false

Input: s = "([)]"
Output: false
```

## Approach

* Use a stack to store opening brackets.
* Traverse the string character by character.
* Push opening brackets onto the stack.
* For each closing bracket:

  * Check if the stack is empty.
  * Pop the top element and verify that it matches the corresponding opening bracket.
* The string is valid if the stack is empty after processing all characters.

## Complexity

* **Time Complexity:** O(n)
* **Space Complexity:** O(n)

where `n` is the length of the string.

## Tech Stack

* Java
* Stack (Array-based implementation)
