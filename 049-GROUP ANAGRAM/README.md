# Group Anagrams

Java solution for the **Group Anagrams** problem using a HashMap.

## Problem

Given an array of strings `strs`, group the anagrams together and return the grouped lists in any order.

Two strings are anagrams if they contain the same characters with the same frequencies.

### Example

```text id="rjz6ow"
Input: strs = ["eat","tea","tan","ate","nat","bat"]

Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
```

## Approach

* Convert each string to a character array.
* Sort the characters to create a canonical representation.
* Use the sorted string as a key in a HashMap.
* Group all strings with the same sorted key together.
* Return all grouped values from the map.

## Complexity

* **Time Complexity:** O(n × k log k)
* **Space Complexity:** O(n × k)

where:

* `n` is the number of strings.
* `k` is the maximum length of a string.

## Tech Stack

* Java
* HashMap
* Arrays.sort()
