<h2><a href="https://leetcode.com/problems/maximum-xor-for-each-query/">1829. Maximum XOR for Each Query</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given a <strong style="user-select: auto;">sorted</strong> array <code style="user-select: auto;">nums</code> of <code style="user-select: auto;">n</code> non-negative integers and an integer <code style="user-select: auto;">maximumBit</code>. You want to perform the following query <code style="user-select: auto;">n</code> <strong style="user-select: auto;">times</strong>:</p>

<ol style="user-select: auto;">
	<li style="user-select: auto;">Find a non-negative integer <code style="user-select: auto;">k &lt; 2<sup style="user-select: auto;">maximumBit</sup></code> such that <code style="user-select: auto;">nums[0] XOR nums[1] XOR ... XOR nums[nums.length-1] XOR k</code> is <strong style="user-select: auto;">maximized</strong>. <code style="user-select: auto;">k</code> is the answer to the <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> query.</li>
	<li style="user-select: auto;">Remove the <strong style="user-select: auto;">last </strong>element from the current array <code style="user-select: auto;">nums</code>.</li>
</ol>

<p style="user-select: auto;">Return <em style="user-select: auto;">an array</em> <code style="user-select: auto;">answer</code><em style="user-select: auto;">, where </em><code style="user-select: auto;">answer[i]</code><em style="user-select: auto;"> is the answer to the </em><code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code><em style="user-select: auto;"> query</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [0,1,1,3], maximumBit = 2
<strong style="user-select: auto;">Output:</strong> [0,3,2,3]
<strong style="user-select: auto;">Explanation</strong>: The queries are answered as follows:
1<sup style="user-select: auto;">st</sup> query: nums = [0,1,1,3], k = 0 since 0 XOR 1 XOR 1 XOR 3 XOR 0 = 3.
2<sup style="user-select: auto;">nd</sup> query: nums = [0,1,1], k = 3 since 0 XOR 1 XOR 1 XOR 3 = 3.
3<sup style="user-select: auto;">rd</sup> query: nums = [0,1], k = 2 since 0 XOR 1 XOR 2 = 3.
4<sup style="user-select: auto;">th</sup> query: nums = [0], k = 3 since 0 XOR 3 = 3.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [2,3,4,7], maximumBit = 3
<strong style="user-select: auto;">Output:</strong> [5,2,6,5]
<strong style="user-select: auto;">Explanation</strong>: The queries are answered as follows:
1<sup style="user-select: auto;">st</sup> query: nums = [2,3,4,7], k = 5 since 2 XOR 3 XOR 4 XOR 7 XOR 5 = 7.
2<sup style="user-select: auto;">nd</sup> query: nums = [2,3,4], k = 2 since 2 XOR 3 XOR 4 XOR 2 = 7.
3<sup style="user-select: auto;">rd</sup> query: nums = [2,3], k = 6 since 2 XOR 3 XOR 6 = 7.
4<sup style="user-select: auto;">th</sup> query: nums = [2], k = 5 since 2 XOR 5 = 7.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [0,1,2,2,5,7], maximumBit = 3
<strong style="user-select: auto;">Output:</strong> [4,3,6,4,6,7]
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">nums.length == n</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= n &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= maximumBit &lt;= 20</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= nums[i] &lt; 2<sup style="user-select: auto;">maximumBit</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">nums</code>​​​ is sorted in <strong style="user-select: auto;">ascending</strong> order.</li>
</ul>
</div>