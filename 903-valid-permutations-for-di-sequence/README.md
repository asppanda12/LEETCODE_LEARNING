<h2><a href="https://leetcode.com/problems/valid-permutations-for-di-sequence/">903. Valid Permutations for DI Sequence</a></h2><h3>Hard</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given a string <code style="user-select: auto;">s</code> of length <code style="user-select: auto;">n</code> where <code style="user-select: auto;">s[i]</code> is either:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">'D'</code> means decreasing, or</li>
	<li style="user-select: auto;"><code style="user-select: auto;">'I'</code> means increasing.</li>
</ul>

<p style="user-select: auto;">A permutation <code style="user-select: auto;">perm</code> of <code style="user-select: auto;">n + 1</code> integers of all the integers in the range <code style="user-select: auto;">[0, n]</code> is called a <strong style="user-select: auto;">valid permutation</strong> if for all valid <code style="user-select: auto;">i</code>:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">If <code style="user-select: auto;">s[i] == 'D'</code>, then <code style="user-select: auto;">perm[i] &gt; perm[i + 1]</code>, and</li>
	<li style="user-select: auto;">If <code style="user-select: auto;">s[i] == 'I'</code>, then <code style="user-select: auto;">perm[i] &lt; perm[i + 1]</code>.</li>
</ul>

<p style="user-select: auto;">Return <em style="user-select: auto;">the number of <strong style="user-select: auto;">valid permutations</strong> </em><code style="user-select: auto;">perm</code>. Since the answer may be large, return it <strong style="user-select: auto;">modulo</strong> <code style="user-select: auto;">10<sup style="user-select: auto;">9</sup> + 7</code>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "DID"
<strong style="user-select: auto;">Output:</strong> 5
<strong style="user-select: auto;">Explanation:</strong> The 5 valid permutations of (0, 1, 2, 3) are:
(1, 0, 3, 2)
(2, 0, 3, 1)
(2, 1, 3, 0)
(3, 0, 2, 1)
(3, 1, 2, 0)
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "D"
<strong style="user-select: auto;">Output:</strong> 1
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">n == s.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= n &lt;= 200</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">s[i]</code> is either <code style="user-select: auto;">'I'</code> or <code style="user-select: auto;">'D'</code>.</li>
</ul>
</div>