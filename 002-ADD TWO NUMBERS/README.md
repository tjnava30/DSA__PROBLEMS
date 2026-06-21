# Add Two Numbers

Java solution for the **Add Two Numbers** problem using linked lists.

## Problem

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each node contains a single digit.

Add the two numbers and return the sum as a linked list.

### Example

```text
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
```

**Explanation:**

```text
342 + 465 = 807
```

Since the digits are stored in reverse order, the result is returned as:

```text
[7,0,8]
```

## Approach

* Create a dummy node to build the result list.
* Traverse both linked lists simultaneously.
* Add corresponding digits along with any carry from the previous step.
* Create a new node with `sum % 10`.
* Update the carry using `sum / 10`.
* Continue until both lists are fully traversed and no carry remains.

## Complexity

* **Time Complexity:** O(max(n, m))
* **Space Complexity:** O(max(n, m))

where `n` and `m` are the lengths of the two linked lists.

## Tech Stack

* Java
* Linked List
