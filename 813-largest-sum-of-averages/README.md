<h2><a href="https://leetcode.com/problems/largest-sum-of-averages/">813. Largest Sum of Averages</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given an integer array <code style="user-select: auto;">nums</code> and an integer <code style="user-select: auto;">k</code>. You can partition the array into <strong style="user-select: auto;">at most</strong> <code style="user-select: auto;">k</code> non-empty adjacent subarrays. The <strong style="user-select: auto;">score</strong> of a partition is the sum of the averages of each subarray.</p>

<p style="user-select: auto;">Note that the partition must use every integer in <code style="user-select: auto;">nums</code>, and that the score is not necessarily an integer.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the maximum <strong style="user-select: auto;">score</strong> you can achieve of all the possible partitions</em>. Answers within <code style="user-select: auto;">10<sup style="user-select: auto;">-6</sup></code> of the actual answer will be accepted.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [9,1,2,3,9], k = 3
<strong style="user-select: auto;">Output:</strong> 20.00000
<strong style="user-select: auto;">Explanation:</strong> 
The best choice is to partition nums into [9], [1, 2, 3], [9]. The answer is 9 + (1 + 2 + 3) / 3 + 9 = 20.
We could have also partitioned nums into [9, 1], [2], [3, 9], for example.
That partition would lead to a score of 5 + 2 + 6 = 13, which is worse.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [1,2,3,4,5,6,7], k = 4
<strong style="user-select: auto;">Output:</strong> 20.50000
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nums.length &lt;= 100</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nums[i] &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= k &lt;= nums.length</code></li>
</ul>
</div>