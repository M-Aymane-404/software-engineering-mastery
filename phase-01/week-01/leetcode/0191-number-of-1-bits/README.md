# 191. Number of 1 Bits

## Problem

- Platform: LeetCode
- Difficulty: Easy
- Topic: Binary representation
- Link: https://leetcode.com/problems/number-of-1-bits/

## Approach

The algorithm repeatedly divides the integer by 2 and
uses the modulo operator to extract its least significant bit.

1. Extract the current bit using `n % 2`.
2. Increment the counter if the bit equals 1.
3. Divide `n` by 2.
4. Repeat until `n` becomes 0.
5. Return the counter.

## Complexity Analysis

- Time complexity: O(log n)
  - The integer is divided by 2 at each iteration.
- Space complexity: O(1)
  - Only a constant number of variables is used.

## Examples

| Input | Binary | Output |
|-------|--------|--------|
| 11    | 1011   | 3      |
| 128   | 10000000 | 1    |
| 255   | 11111111 | 8    |

## Submission Results

- Status: Accepted
- Test cases: 598/598
- Runtime: 1 ms
- Runtime percentile: 63.21%
- Memory: 41.76 MB
- Memory percentile: 91.06%

## Learning Outcomes

- Understanding binary representation.
- Extracting the least significant bit using modulo.
- Counting set bits.
- Analyzing time and space complexity.