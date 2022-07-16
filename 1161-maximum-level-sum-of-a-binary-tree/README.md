<h2><a href="https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/">1161. Maximum Level Sum of a Binary Tree</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given the <code style="user-select: auto;">root</code> of a binary tree, the level of its root is <code style="user-select: auto;">1</code>, the level of its children is <code style="user-select: auto;">2</code>, and so on.</p>

<p style="user-select: auto;">Return the <strong style="user-select: auto;">smallest</strong> level <code style="user-select: auto;">x</code> such that the sum of all the values of nodes at level <code style="user-select: auto;">x</code> is <strong style="user-select: auto;">maximal</strong>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2019/05/03/capture.JPG" style="width: 200px; height: 175px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> root = [1,7,0,7,-8,null,null]
<strong style="user-select: auto;">Output:</strong> 2
<strong style="user-select: auto;">Explanation: </strong>
Level 1 sum = 1.
Level 2 sum = 7 + 0 = 7.
Level 3 sum = 7 + -8 = -1.
So we return the level with the maximum sum which is level 2.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> root = [989,null,10250,98693,-89388,null,null,null,-32127]
<strong style="user-select: auto;">Output:</strong> 2
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">The number of nodes in the tree is in the range <code style="user-select: auto;">[1, 10<sup style="user-select: auto;">4</sup>]</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">-10<sup style="user-select: auto;">5</sup> &lt;= Node.val &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
</ul>
</div>