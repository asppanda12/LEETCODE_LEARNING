<h2><a href="https://leetcode.com/problems/successful-pairs-of-spells-and-potions/">2300. Successful Pairs of Spells and Potions</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given two positive integer arrays <code style="user-select: auto;">spells</code> and <code style="user-select: auto;">potions</code>, of length <code style="user-select: auto;">n</code> and <code style="user-select: auto;">m</code> respectively, where <code style="user-select: auto;">spells[i]</code> represents the strength of the <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> spell and <code style="user-select: auto;">potions[j]</code> represents the strength of the <code style="user-select: auto;">j<sup style="user-select: auto;">th</sup></code> potion.</p>

<p style="user-select: auto;">You are also given an integer <code style="user-select: auto;">success</code>. A spell and potion pair is considered <strong style="user-select: auto;">successful</strong> if the <strong style="user-select: auto;">product</strong> of their strengths is <strong style="user-select: auto;">at least</strong> <code style="user-select: auto;">success</code>.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">an integer array </em><code style="user-select: auto;">pairs</code><em style="user-select: auto;"> of length </em><code style="user-select: auto;">n</code><em style="user-select: auto;"> where </em><code style="user-select: auto;">pairs[i]</code><em style="user-select: auto;"> is the number of <strong style="user-select: auto;">potions</strong> that will form a successful pair with the </em><code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code><em style="user-select: auto;"> spell.</em></p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> spells = [5,1,3], potions = [1,2,3,4,5], success = 7
<strong style="user-select: auto;">Output:</strong> [4,0,3]
<strong style="user-select: auto;">Explanation:</strong>
- 0<sup style="user-select: auto;">th</sup> spell: 5 * [1,2,3,4,5] = [5,<u style="user-select: auto;"><strong style="user-select: auto;">10</strong></u>,<u style="user-select: auto;"><strong style="user-select: auto;">15</strong></u>,<u style="user-select: auto;"><strong style="user-select: auto;">20</strong></u>,<u style="user-select: auto;"><strong style="user-select: auto;">25</strong></u>]. 4 pairs are successful.
- 1<sup style="user-select: auto;">st</sup> spell: 1 * [1,2,3,4,5] = [1,2,3,4,5]. 0 pairs are successful.
- 2<sup style="user-select: auto;">nd</sup> spell: 3 * [1,2,3,4,5] = [3,6,<u style="user-select: auto;"><strong style="user-select: auto;">9</strong></u>,<u style="user-select: auto;"><strong style="user-select: auto;">12</strong></u>,<u style="user-select: auto;"><strong style="user-select: auto;">15</strong></u>]. 3 pairs are successful.
Thus, [4,0,3] is returned.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> spells = [3,1,2], potions = [8,5,8], success = 16
<strong style="user-select: auto;">Output:</strong> [2,0,2]
<strong style="user-select: auto;">Explanation:</strong>
- 0<sup style="user-select: auto;">th</sup> spell: 3 * [8,5,8] = [<u style="user-select: auto;"><strong style="user-select: auto;">24</strong></u>,15,<u style="user-select: auto;"><strong style="user-select: auto;">24</strong></u>]. 2 pairs are successful.
- 1<sup style="user-select: auto;">st</sup> spell: 1 * [8,5,8] = [8,5,8]. 0 pairs are successful. 
- 2<sup style="user-select: auto;">nd</sup> spell: 2 * [8,5,8] = [<strong style="user-select: auto;"><u style="user-select: auto;">16</u></strong>,10,<u style="user-select: auto;"><strong style="user-select: auto;">16</strong></u>]. 2 pairs are successful. 
Thus, [2,0,2] is returned.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">n == spells.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">m == potions.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= n, m &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= spells[i], potions[i] &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= success &lt;= 10<sup style="user-select: auto;">10</sup></code></li>
</ul>
</div>