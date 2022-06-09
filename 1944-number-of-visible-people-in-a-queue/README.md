<h2><a href="https://leetcode.com/problems/number-of-visible-people-in-a-queue/">1944. Number of Visible People in a Queue</a></h2><h3>Hard</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">There are <code style="user-select: auto;">n</code> people standing in a queue, and they numbered from <code style="user-select: auto;">0</code> to <code style="user-select: auto;">n - 1</code> in <strong style="user-select: auto;">left to right</strong> order. You are given an array <code style="user-select: auto;">heights</code> of <strong style="user-select: auto;">distinct</strong> integers where <code style="user-select: auto;">heights[i]</code> represents the height of the <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> person.</p>

<p style="user-select: auto;">A person can <strong style="user-select: auto;">see</strong> another person to their right in the queue if everybody in between is <strong style="user-select: auto;">shorter</strong> than both of them. More formally, the <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> person can see the <code style="user-select: auto;">j<sup style="user-select: auto;">th</sup></code> person if <code style="user-select: auto;">i &lt; j</code> and <code style="user-select: auto;">min(heights[i], heights[j]) &gt; max(heights[i+1], heights[i+2], ..., heights[j-1])</code>.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">an array </em><code style="user-select: auto;">answer</code><em style="user-select: auto;"> of length </em><code style="user-select: auto;">n</code><em style="user-select: auto;"> where </em><code style="user-select: auto;">answer[i]</code><em style="user-select: auto;"> is the <strong style="user-select: auto;">number of people</strong> the </em><code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code><em style="user-select: auto;"> person can <strong style="user-select: auto;">see</strong> to their right in the queue</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<p style="user-select: auto;"><img alt="" src="https://assets.leetcode.com/uploads/2021/05/29/queue-plane.jpg" style="width: 600px; height: 247px; user-select: auto;"></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> heights = [10,6,8,5,11,9]
<strong style="user-select: auto;">Output:</strong> [3,1,2,1,1,0]
<strong style="user-select: auto;">Explanation:</strong>
Person 0 can see person 1, 2, and 4.
Person 1 can see person 2.
Person 2 can see person 3 and 4.
Person 3 can see person 4.
Person 4 can see person 5.
Person 5 can see no one since nobody is to the right of them.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> heights = [5,1,2,3,10]
<strong style="user-select: auto;">Output:</strong> [4,1,1,1,0]
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">n == heights.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= n &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= heights[i] &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;">All the values of <code style="user-select: auto;">heights</code> are <strong style="user-select: auto;">unique</strong>.</li>
</ul>
</div>