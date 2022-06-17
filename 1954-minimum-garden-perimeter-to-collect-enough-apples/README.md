<h2><a href="https://leetcode.com/problems/minimum-garden-perimeter-to-collect-enough-apples/">1954. Minimum Garden Perimeter to Collect Enough Apples</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">In a garden represented as an infinite 2D grid, there is an apple tree planted at <strong style="user-select: auto;">every</strong> integer coordinate. The apple tree planted at an integer coordinate <code style="user-select: auto;">(i, j)</code> has <code style="user-select: auto;">|i| + |j|</code> apples growing on it.</p>

<p style="user-select: auto;">You will buy an axis-aligned <strong style="user-select: auto;">square plot</strong> of land that is centered at <code style="user-select: auto;">(0, 0)</code>.</p>

<p style="user-select: auto;">Given an integer <code style="user-select: auto;">neededApples</code>, return <em style="user-select: auto;">the <strong style="user-select: auto;">minimum perimeter</strong> of a plot such that <strong style="user-select: auto;">at least</strong></em><strong style="user-select: auto;"> </strong><code style="user-select: auto;">neededApples</code> <em style="user-select: auto;">apples are <strong style="user-select: auto;">inside or on</strong> the perimeter of that plot</em>.</p>

<p style="user-select: auto;">The value of <code style="user-select: auto;">|x|</code> is defined as:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">x</code> if <code style="user-select: auto;">x &gt;= 0</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">-x</code> if <code style="user-select: auto;">x &lt; 0</code></li>
</ul>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2019/08/30/1527_example_1_2.png" style="width: 442px; height: 449px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> neededApples = 1
<strong style="user-select: auto;">Output:</strong> 8
<strong style="user-select: auto;">Explanation:</strong> A square plot of side length 1 does not contain any apples.
However, a square plot of side length 2 has 12 apples inside (as depicted in the image above).
The perimeter is 2 * 4 = 8.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> neededApples = 13
<strong style="user-select: auto;">Output:</strong> 16
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> neededApples = 1000000000
<strong style="user-select: auto;">Output:</strong> 5040
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= neededApples &lt;= 10<sup style="user-select: auto;">15</sup></code></li>
</ul>
</div>