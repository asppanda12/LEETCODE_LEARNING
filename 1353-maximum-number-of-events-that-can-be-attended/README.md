<h2><a href="https://leetcode.com/problems/maximum-number-of-events-that-can-be-attended/">1353. Maximum Number of Events That Can Be Attended</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given an array of <code style="user-select: auto;">events</code> where <code style="user-select: auto;">events[i] = [startDay<sub style="user-select: auto;">i</sub>, endDay<sub style="user-select: auto;">i</sub>]</code>. Every event <code style="user-select: auto;">i</code> starts at <code style="user-select: auto;">startDay<sub style="user-select: auto;">i</sub></code><sub style="user-select: auto;"> </sub>and ends at <code style="user-select: auto;">endDay<sub style="user-select: auto;">i</sub></code>.</p>

<p style="user-select: auto;">You can attend an event <code style="user-select: auto;">i</code> at any day <code style="user-select: auto;">d</code> where <code style="user-select: auto;">startTime<sub style="user-select: auto;">i</sub> &lt;= d &lt;= endTime<sub style="user-select: auto;">i</sub></code>. You can only attend one event at any time <code style="user-select: auto;">d</code>.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the maximum number of events you can attend</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/02/05/e1.png" style="width: 400px; height: 267px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> events = [[1,2],[2,3],[3,4]]
<strong style="user-select: auto;">Output:</strong> 3
<strong style="user-select: auto;">Explanation:</strong> You can attend all the three events.
One way to attend them all is as shown.
Attend the first event on day 1.
Attend the second event on day 2.
Attend the third event on day 3.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> events= [[1,2],[2,3],[3,4],[1,2]]
<strong style="user-select: auto;">Output:</strong> 4
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= events.length &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">events[i].length == 2</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= startDay<sub style="user-select: auto;">i</sub> &lt;= endDay<sub style="user-select: auto;">i</sub> &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
</ul>
</div>