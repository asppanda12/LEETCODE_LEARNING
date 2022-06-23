<h2><a href="https://leetcode.com/problems/all-ancestors-of-a-node-in-a-directed-acyclic-graph/">2192. All Ancestors of a Node in a Directed Acyclic Graph</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given a positive integer <code style="user-select: auto;">n</code> representing the number of nodes of a <strong style="user-select: auto;">Directed Acyclic Graph</strong> (DAG). The nodes are numbered from <code style="user-select: auto;">0</code> to <code style="user-select: auto;">n - 1</code> (<strong style="user-select: auto;">inclusive</strong>).</p>

<p style="user-select: auto;">You are also given a 2D integer array <code style="user-select: auto;">edges</code>, where <code style="user-select: auto;">edges[i] = [from<sub style="user-select: auto;">i</sub>, to<sub style="user-select: auto;">i</sub>]</code> denotes that there is a <strong style="user-select: auto;">unidirectional</strong> edge from <code style="user-select: auto;">from<sub style="user-select: auto;">i</sub></code> to <code style="user-select: auto;">to<sub style="user-select: auto;">i</sub></code> in the graph.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">a list</em> <code style="user-select: auto;">answer</code><em style="user-select: auto;">, where </em><code style="user-select: auto;">answer[i]</code><em style="user-select: auto;"> is the <strong style="user-select: auto;">list of ancestors</strong> of the</em> <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> <em style="user-select: auto;">node, sorted in <strong style="user-select: auto;">ascending order</strong></em>.</p>

<p style="user-select: auto;">A node <code style="user-select: auto;">u</code> is an <strong style="user-select: auto;">ancestor</strong> of another node <code style="user-select: auto;">v</code> if <code style="user-select: auto;">u</code> can reach <code style="user-select: auto;">v</code> via a set of edges.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2019/12/12/e1.png" style="width: 322px; height: 265px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 8, edgeList = [[0,3],[0,4],[1,3],[2,4],[2,7],[3,5],[3,6],[3,7],[4,6]]
<strong style="user-select: auto;">Output:</strong> [[],[],[],[0,1],[0,2],[0,1,3],[0,1,2,3,4],[0,1,2,3]]
<strong style="user-select: auto;">Explanation:</strong>
The above diagram represents the input graph.
- Nodes 0, 1, and 2 do not have any ancestors.
- Node 3 has two ancestors 0 and 1.
- Node 4 has two ancestors 0 and 2.
- Node 5 has three ancestors 0, 1, and 3.
- Node 6 has five ancestors 0, 1, 2, 3, and 4.
- Node 7 has four ancestors 0, 1, 2, and 3.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2019/12/12/e2.png" style="width: 343px; height: 299px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 5, edgeList = [[0,1],[0,2],[0,3],[0,4],[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
<strong style="user-select: auto;">Output:</strong> [[],[0],[0,1],[0,1,2],[0,1,2,3]]
<strong style="user-select: auto;">Explanation:</strong>
The above diagram represents the input graph.
- Node 0 does not have any ancestor.
- Node 1 has one ancestor 0.
- Node 2 has two ancestors 0 and 1.
- Node 3 has three ancestors 0, 1, and 2.
- Node 4 has four ancestors 0, 1, 2, and 3.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= n &lt;= 1000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= edges.length &lt;= min(2000, n * (n - 1) / 2)</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">edges[i].length == 2</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= from<sub style="user-select: auto;">i</sub>, to<sub style="user-select: auto;">i</sub> &lt;= n - 1</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">from<sub style="user-select: auto;">i</sub> != to<sub style="user-select: auto;">i</sub></code></li>
	<li style="user-select: auto;">There are no duplicate edges.</li>
	<li style="user-select: auto;">The graph is <strong style="user-select: auto;">directed</strong> and <strong style="user-select: auto;">acyclic</strong>.</li>
</ul>
</div>