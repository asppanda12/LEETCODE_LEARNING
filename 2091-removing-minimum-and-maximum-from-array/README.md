<h2><a href="https://leetcode.com/problems/removing-minimum-and-maximum-from-array/">2091. Removing Minimum and Maximum From Array</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given a <strong style="user-select: auto;">0-indexed</strong> array of <strong style="user-select: auto;">distinct</strong> integers <code style="user-select: auto;">nums</code>.</p>

<p style="user-select: auto;">There is an element in <code style="user-select: auto;">nums</code> that has the <strong style="user-select: auto;">lowest</strong> value and an element that has the <strong style="user-select: auto;">highest</strong> value. We call them the <strong style="user-select: auto;">minimum</strong> and <strong style="user-select: auto;">maximum</strong> respectively. Your goal is to remove <strong style="user-select: auto;">both</strong> these elements from the array.</p>

<p style="user-select: auto;">A <strong style="user-select: auto;">deletion</strong> is defined as either removing an element from the <strong style="user-select: auto;">front</strong> of the array or removing an element from the <strong style="user-select: auto;">back</strong> of the array.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the <strong style="user-select: auto;">minimum</strong> number of deletions it would take to remove <strong style="user-select: auto;">both</strong> the minimum and maximum element from the array.</em></p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [2,<u style="user-select: auto;"><strong style="user-select: auto;">10</strong></u>,7,5,4,<u style="user-select: auto;"><strong style="user-select: auto;">1</strong></u>,8,6]
<strong style="user-select: auto;">Output:</strong> 5
<strong style="user-select: auto;">Explanation:</strong> 
The minimum element in the array is nums[5], which is 1.
The maximum element in the array is nums[1], which is 10.
We can remove both the minimum and maximum by removing 2 elements from the front and 3 elements from the back.
This results in 2 + 3 = 5 deletions, which is the minimum number possible.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [0,<u style="user-select: auto;"><strong style="user-select: auto;">-4</strong></u>,<u style="user-select: auto;"><strong style="user-select: auto;">19</strong></u>,1,8,-2,-3,5]
<strong style="user-select: auto;">Output:</strong> 3
<strong style="user-select: auto;">Explanation:</strong> 
The minimum element in the array is nums[1], which is -4.
The maximum element in the array is nums[2], which is 19.
We can remove both the minimum and maximum by removing 3 elements from the front.
This results in only 3 deletions, which is the minimum number possible.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [<u style="user-select: auto;"><strong style="user-select: auto;">101</strong></u>]
<strong style="user-select: auto;">Output:</strong> 1
<strong style="user-select: auto;">Explanation:</strong>  
There is only one element in the array, which makes it both the minimum and maximum element.
We can remove it with 1 deletion.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nums.length &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">-10<sup style="user-select: auto;">5</sup> &lt;= nums[i] &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;">The integers in <code style="user-select: auto;">nums</code> are <strong style="user-select: auto;">distinct</strong>.</li>
</ul>
</div>