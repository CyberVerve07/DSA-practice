DSA Journy

```
java-dsa-series/


````
# Java DSA Series (23 Nov 2025 → 1 Feb 2026)

This repository contains my 71-day Data Structures & Algorithms journey in Java.
Every day I solve at least one DSA problem and commit the code with tests, analysis, 
and a short README for that day.

## 📅 Progress Timeline
| Day | Topic | Status |
|-----|-------|--------|
| 01  | Two Sum (HashMap) | ✅ Done |
| 02  | Max Subarray (Kadane) | ✅ Done |
| 03  | Two-Pointers + Sliding Window | ✅ Done |
| 04+ | ... | Coming daily |

## 📂 Folder Structure
Each day has:
- A Java file (or multiple files)
- A short README explaining problem + approach
- Tests inside `main()`
- A log entry inside `LOG.md`

## 🧠 Why this repo exists
To build strong problem-solving skills and prepare for backend + product company interviews using Java.  
Strict daily discipline. No skipping. No excuses.

## ▶️ How to Run
```bash
javac DayXX/*.java
java DayXX/ClassName
````

## 🛠️ Tech Stack

* Java 17+
* Git & GitHub
* VSCode / IntelliJ

---

**Last updated:** Day 03

```

--

### `Day01/README.md`
```

# Day 01 — Two Sum (HashMap)

* Implemented TwoSum.java using single-pass HashMap.
* Time: O(n), Space: O(n)
* Tests included in main().

```

### `Day02/README.md`
```

# Day 02 — Maximum Subarray (Kadane)

* Implemented Kadane’s Algorithm.
* Time: O(n), Space: O(1)
* Handles negative-only arrays.

```

### `Day03/README.md`
```

# Day 03 — Two-Pointer & Sliding Window

* TwoSumSorted (two-pointers on sorted arrays)
* LongestUniqueSubstr (sliding window using last-seen map)
* Both are O(n)

````


# Day 04 — Binary Search + Move Zeroes
Problems:
1. BinarySearch.java — classical binary search (O(log n)).
2. MoveZeroes.java — two-pointer in-place array compaction (O(n)).
Notes:
- Binary search fails if you use low < high instead of <=.
- MoveZeroes uses read/write pointer pattern.


# Day 05 — First & Last Position in Sorted Array
- Implemented using two modified binary searches.
- `findFirst` -> force search left.
- `findLast` -> force search right.
- Time: O(log n), Space: O(1)









📘 DSA Practice Questions (Last 20 Days)

Find the First and Last Position of an Element in a Sorted Array

Minimum Size Subarray Sum

Longest Subarray with Sum ≤ K

Group Anagrams

Longest Consecutive Sequence

Top K Frequent Elements

Find the Second Largest Element in an Array

Maximum Sum of a Continuous Subarray (Kadane’s Algorithm)

Binary Tree Level Order Traversal

Valid Parentheses (using Stack)

Check if an Array is Sorted and Rotated

Count Occurrences of an Element in a Sorted Array (Binary Search)

Majority Element (Boyer–Moore Voting Algorithm)

Find a Peak Element (Binary Search)

Longest Substring Without Repeating Characters

Find the Single Non-Repeating Element in a Sorted Array (Binary Search)

Find the Single Non-Repeating Element using XOR

Find the Missing Number in an Array (Using XOR)

Check if a Number is a Power of Two (Bit Manipulation)

Design a Custom Priority Task Queue using OOP Concepts in Java

