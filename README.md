# question-no-3545
Solution to the question no 3545 on leet code 

3545. Minimum Deletions for At Most K Distinct Characters

You are given a string s consisting of lowercase English letters, and an integer k.

Your task is to delete some (possibly none) of the characters in the string so that the number of distinct characters in the resulting string is at most k.

Return the minimum number of deletions required to achieve this.

How It Works:
Count the frequency of each character in the string.

If the number of distinct characters ≤ k, return 0.

Otherwise, remove characters with the smallest frequency first to reduce the number of distinct characters.

Sum the deletions required for that.

Example:

Input: s = "aabbccddeeffg", k = 3
Distinct characters = 7
We need to remove 4 distinct characters.

Remove:
- 'g' (1 time)
- 'a' (2 times)
- 'b' (2 times)
- 'c' (2 times)
Total deletions = 1 + 2 + 2 + 2 = 7
