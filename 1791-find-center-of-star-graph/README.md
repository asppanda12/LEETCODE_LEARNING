<h2><a href="https://leetcode.com/problems/find-center-of-star-graph/">1791. Find Center of Star Graph</a></h2><h3>Easy</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">There is an undirected <strong style="user-select: auto;">star</strong> graph consisting of <code style="user-select: auto;">n</code> nodes labeled from <code style="user-select: auto;">1</code> to <code style="user-select: auto;">n</code>. A star graph is a graph where there is one <strong style="user-select: auto;">center</strong> node and <strong style="user-select: auto;">exactly</strong> <code style="user-select: auto;">n - 1</code> edges that connect the center node with every other node.</p>

<p style="user-select: auto;">You are given a 2D integer array <code style="user-select: auto;">edges</code> where each <code style="user-select: auto;">edges[i] = [u<sub style="user-select: auto;">i</sub>, v<sub style="user-select: auto;">i</sub>]</code> indicates that there is an edge between the nodes <code style="user-select: auto;">u<sub style="user-select: auto;">i</sub></code> and <code style="user-select: auto;">v<sub style="user-select: auto;">i</sub></code>. Return the center of the given star graph.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/02/24/star_graph.png" style="width: 331px; height: 321px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> edges = [[1,2],[2,3],[4,2]]
<strong style="user-select: auto;">Output:</strong> 2
<strong style="user-select: auto;">Explanation:</strong> As shown in the figure above, node 2 is connected to every other node, so 2 is the center.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> edges = [[1,2],[5,1],[1,3],[1,4]]
<strong style="user-select: auto;">Output:</strong> 1
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">3 &lt;= n &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">edges.length == n - 1</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">edges[i].length == 2</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= u<sub style="user-select: auto;">i,</sub> v<sub style="user-select: auto;">i</sub> &lt;= n</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">u<sub style="user-select: auto;">i</sub> != v<sub style="user-select: auto;">i</sub></code></li>
	<li style="user-select: auto;">The given <code style="user-select: auto;">edges</code> represent a valid star graph.</li>
</ul>
</div>