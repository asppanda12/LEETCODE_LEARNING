<h2><a href="https://leetcode.com/problems/minimum-white-tiles-after-covering-with-carpets/">2209. Minimum White Tiles After Covering With Carpets</a></h2><h3>Hard</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given a <strong style="user-select: auto;">0-indexed binary</strong> string <code style="user-select: auto;">floor</code>, which represents the colors of tiles on a floor:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">floor[i] = '0'</code> denotes that the <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> tile of the floor is colored <strong style="user-select: auto;">black</strong>.</li>
	<li style="user-select: auto;">On the other hand, <code style="user-select: auto;">floor[i] = '1'</code> denotes that the <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> tile of the floor is colored <strong style="user-select: auto;">white</strong>.</li>
</ul>

<p style="user-select: auto;">You are also given <code style="user-select: auto;">numCarpets</code> and <code style="user-select: auto;">carpetLen</code>. You have <code style="user-select: auto;">numCarpets</code> <strong style="user-select: auto;">black</strong> carpets, each of length <code style="user-select: auto;">carpetLen</code> tiles. Cover the tiles with the given carpets such that the number of <strong style="user-select: auto;">white</strong> tiles still visible is <strong style="user-select: auto;">minimum</strong>. Carpets may overlap one another.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the <strong style="user-select: auto;">minimum</strong> number of white tiles still visible.</em></p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2022/02/10/ex1-1.png" style="width: 400px; height: 73px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> floor = "10110101", numCarpets = 2, carpetLen = 2
<strong style="user-select: auto;">Output:</strong> 2
<strong style="user-select: auto;">Explanation:</strong> 
The figure above shows one way of covering the tiles with the carpets such that only 2 white tiles are visible.
No other way of covering the tiles with the carpets can leave less than 2 white tiles visible.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2022/02/10/ex2.png" style="width: 353px; height: 123px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> floor = "11111", numCarpets = 2, carpetLen = 3
<strong style="user-select: auto;">Output:</strong> 0
<strong style="user-select: auto;">Explanation:</strong> 
The figure above shows one way of covering the tiles with the carpets such that no white tiles are visible.
Note that the carpets are able to overlap one another.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= carpetLen &lt;= floor.length &lt;= 1000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">floor[i]</code> is either <code style="user-select: auto;">'0'</code> or <code style="user-select: auto;">'1'</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= numCarpets &lt;= 1000</code></li>
</ul>
</div>