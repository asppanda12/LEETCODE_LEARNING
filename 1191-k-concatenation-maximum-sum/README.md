<h2><a href="https://leetcode.com/problems/k-concatenation-maximum-sum/">1191. K-Concatenation Maximum Sum</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given an integer array <code style="user-select: auto;">arr</code> and an integer <code style="user-select: auto;">k</code>, modify the array by repeating it <code style="user-select: auto;">k</code> times.</p>

<p style="user-select: auto;">For example, if <code style="user-select: auto;">arr = [1, 2]</code> and <code style="user-select: auto;">k = 3 </code>then the modified array will be <code style="user-select: auto;">[1, 2, 1, 2, 1, 2]</code>.</p>

<p style="user-select: auto;">Return the maximum sub-array sum in the modified array. Note that the length of the sub-array can be <code style="user-select: auto;">0</code> and its sum in that case is <code style="user-select: auto;">0</code>.</p>

<p style="user-select: auto;">As the answer can be very large, return the answer <strong style="user-select: auto;">modulo</strong> <code style="user-select: auto;">10<sup style="user-select: auto;">9</sup> + 7</code>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> arr = [1,2], k = 3
<strong style="user-select: auto;">Output:</strong> 9
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> arr = [1,-2,1], k = 5
<strong style="user-select: auto;">Output:</strong> 2
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> arr = [-1,-2], k = 7
<strong style="user-select: auto;">Output:</strong> 0
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= arr.length &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= k &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">-10<sup style="user-select: auto;">4</sup> &lt;= arr[i] &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
</ul>
</div>