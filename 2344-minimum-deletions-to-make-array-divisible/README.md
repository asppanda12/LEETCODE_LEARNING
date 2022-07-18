<h2><a href="https://leetcode.com/problems/minimum-deletions-to-make-array-divisible/">2344. Minimum Deletions to Make Array Divisible</a></h2><h3>Hard</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given two positive integer arrays <code style="user-select: auto;">nums</code> and <code style="user-select: auto;">numsDivide</code>. You can delete any number of elements from <code style="user-select: auto;">nums</code>.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the <strong style="user-select: auto;">minimum</strong> number of deletions such that the <strong style="user-select: auto;">smallest</strong> element in </em><code style="user-select: auto;">nums</code><em style="user-select: auto;"> <strong style="user-select: auto;">divides</strong> all the elements of </em><code style="user-select: auto;">numsDivide</code>. If this is not possible, return <code style="user-select: auto;">-1</code>.</p>

<p style="user-select: auto;">Note that an integer <code style="user-select: auto;">x</code> divides <code style="user-select: auto;">y</code> if <code style="user-select: auto;">y % x == 0</code>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [2,3,2,4,3], numsDivide = [9,6,9,3,15]
<strong style="user-select: auto;">Output:</strong> 2
<strong style="user-select: auto;">Explanation:</strong> 
The smallest element in [2,3,2,4,3] is 2, which does not divide all the elements of numsDivide.
We use 2 deletions to delete the elements in nums that are equal to 2 which makes nums = [3,4,3].
The smallest element in [3,4,3] is 3, which divides all the elements of numsDivide.
It can be shown that 2 is the minimum number of deletions needed.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [4,3,6], numsDivide = [8,2,6,10]
<strong style="user-select: auto;">Output:</strong> -1
<strong style="user-select: auto;">Explanation:</strong> 
We want the smallest element in nums to divide all the elements of numsDivide.
There is no way to delete elements from nums to allow this.</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nums.length, numsDivide.length &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nums[i], numsDivide[i] &lt;= 10<sup style="user-select: auto;">9</sup></code></li>
</ul>
</div>