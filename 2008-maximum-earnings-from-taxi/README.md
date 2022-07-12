<h2><a href="https://leetcode.com/problems/maximum-earnings-from-taxi/">2008. Maximum Earnings From Taxi</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">There are <code style="user-select: auto;">n</code> points on a road you are driving your taxi on. The <code style="user-select: auto;">n</code> points on the road are labeled from <code style="user-select: auto;">1</code> to <code style="user-select: auto;">n</code> in the direction you are going, and you want to drive from point <code style="user-select: auto;">1</code> to point <code style="user-select: auto;">n</code> to make money by picking up passengers. You cannot change the direction of the taxi.</p>

<p style="user-select: auto;">The passengers are represented by a <strong style="user-select: auto;">0-indexed</strong> 2D integer array <code style="user-select: auto;">rides</code>, where <code style="user-select: auto;">rides[i] = [start<sub style="user-select: auto;">i</sub>, end<sub style="user-select: auto;">i</sub>, tip<sub style="user-select: auto;">i</sub>]</code> denotes the <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> passenger requesting a ride from point <code style="user-select: auto;">start<sub style="user-select: auto;">i</sub></code> to point <code style="user-select: auto;">end<sub style="user-select: auto;">i</sub></code> who is willing to give a <code style="user-select: auto;">tip<sub style="user-select: auto;">i</sub></code> dollar tip.</p>

<p style="user-select: auto;">For<strong style="user-select: auto;"> each </strong>passenger <code style="user-select: auto;">i</code> you pick up, you <strong style="user-select: auto;">earn</strong> <code style="user-select: auto;">end<sub style="user-select: auto;">i</sub> - start<sub style="user-select: auto;">i</sub> + tip<sub style="user-select: auto;">i</sub></code> dollars. You may only drive <b style="user-select: auto;">at most one </b>passenger at a time.</p>

<p style="user-select: auto;">Given <code style="user-select: auto;">n</code> and <code style="user-select: auto;">rides</code>, return <em style="user-select: auto;">the <strong style="user-select: auto;">maximum</strong> number of dollars you can earn by picking up the passengers optimally.</em></p>

<p style="user-select: auto;"><strong style="user-select: auto;">Note:</strong> You may drop off a passenger and pick up a different passenger at the same point.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 5, rides = [<u style="user-select: auto;">[2,5,4]</u>,[1,5,1]]
<strong style="user-select: auto;">Output:</strong> 7
<strong style="user-select: auto;">Explanation:</strong> We can pick up passenger 0 to earn 5 - 2 + 4 = 7 dollars.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 20, rides = [[1,6,1],<u style="user-select: auto;">[3,10,2]</u>,<u style="user-select: auto;">[10,12,3]</u>,[11,12,2],[12,15,2],<u style="user-select: auto;">[13,18,1]</u>]
<strong style="user-select: auto;">Output:</strong> 20
<strong style="user-select: auto;">Explanation:</strong> We will pick up the following passengers:
- Drive passenger 1 from point 3 to point 10 for a profit of 10 - 3 + 2 = 9 dollars.
- Drive passenger 2 from point 10 to point 12 for a profit of 12 - 10 + 3 = 5 dollars.
- Drive passenger 5 from point 13 to point 18 for a profit of 18 - 13 + 1 = 6 dollars.
We earn 9 + 5 + 6 = 20 dollars in total.</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= n &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= rides.length &lt;= 3 * 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">rides[i].length == 3</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= start<sub style="user-select: auto;">i</sub> &lt; end<sub style="user-select: auto;">i</sub> &lt;= n</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= tip<sub style="user-select: auto;">i</sub> &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
</ul>
</div>