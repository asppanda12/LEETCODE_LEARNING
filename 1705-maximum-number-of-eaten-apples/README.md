<h2><a href="https://leetcode.com/problems/maximum-number-of-eaten-apples/">1705. Maximum Number of Eaten Apples</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">There is a special kind of apple tree that grows apples every day for <code style="user-select: auto;">n</code> days. On the <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> day, the tree grows <code style="user-select: auto;">apples[i]</code> apples that will rot after <code style="user-select: auto;">days[i]</code> days, that is on day <code style="user-select: auto;">i + days[i]</code> the apples will be rotten and cannot be eaten. On some days, the apple tree does not grow any apples, which are denoted by <code style="user-select: auto;">apples[i] == 0</code> and <code style="user-select: auto;">days[i] == 0</code>.</p>

<p style="user-select: auto;">You decided to eat <strong style="user-select: auto;">at most</strong> one apple a day (to keep the doctors away). Note that you can keep eating after the first <code style="user-select: auto;">n</code> days.</p>

<p style="user-select: auto;">Given two integer arrays <code style="user-select: auto;">days</code> and <code style="user-select: auto;">apples</code> of length <code style="user-select: auto;">n</code>, return <em style="user-select: auto;">the maximum number of apples you can eat.</em></p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> apples = [1,2,3,5,2], days = [3,2,1,4,2]
<strong style="user-select: auto;">Output:</strong> 7
<strong style="user-select: auto;">Explanation:</strong> You can eat 7 apples:
- On the first day, you eat an apple that grew on the first day.
- On the second day, you eat an apple that grew on the second day.
- On the third day, you eat an apple that grew on the second day. After this day, the apples that grew on the third day rot.
- On the fourth to the seventh days, you eat apples that grew on the fourth day.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> apples = [3,0,0,0,0,2], days = [3,0,0,0,0,2]
<strong style="user-select: auto;">Output:</strong> 5
<strong style="user-select: auto;">Explanation:</strong> You can eat 5 apples:
- On the first to the third day you eat apples that grew on the first day.
- Do nothing on the fouth and fifth days.
- On the sixth and seventh days you eat apples that grew on the sixth day.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">n == apples.length == days.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= n &lt;= 2 * 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= apples[i], days[i] &lt;= 2 * 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">days[i] = 0</code> if and only if <code style="user-select: auto;">apples[i] = 0</code>.</li>
</ul>
</div>