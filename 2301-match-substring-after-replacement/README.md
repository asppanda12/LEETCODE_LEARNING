<h2><a href="https://leetcode.com/problems/match-substring-after-replacement/">2301. Match Substring After Replacement</a></h2><h3>Hard</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given two strings <code style="user-select: auto;">s</code> and <code style="user-select: auto;">sub</code>. You are also given a 2D character array <code style="user-select: auto;">mappings</code> where <code style="user-select: auto;">mappings[i] = [old<sub style="user-select: auto;">i</sub>, new<sub style="user-select: auto;">i</sub>]</code> indicates that you may <strong style="user-select: auto;">replace</strong> any number of <code style="user-select: auto;">old<sub style="user-select: auto;">i</sub></code> characters of <code style="user-select: auto;">sub</code> with <code style="user-select: auto;">new<sub style="user-select: auto;">i</sub></code>. Each character in <code style="user-select: auto;">sub</code> <strong style="user-select: auto;">cannot</strong> be replaced more than once.</p>

<p style="user-select: auto;">Return <code style="user-select: auto;">true</code><em style="user-select: auto;"> if it is possible to make </em><code style="user-select: auto;">sub</code><em style="user-select: auto;"> a substring of </em><code style="user-select: auto;">s</code><em style="user-select: auto;"> by replacing zero or more characters according to </em><code style="user-select: auto;">mappings</code>. Otherwise, return <code style="user-select: auto;">false</code>.</p>

<p style="user-select: auto;">A <strong style="user-select: auto;">substring</strong> is a contiguous non-empty sequence of characters within a string.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "fool3e7bar", sub = "leet", mappings = [["e","3"],["t","7"],["t","8"]]
<strong style="user-select: auto;">Output:</strong> true
<strong style="user-select: auto;">Explanation:</strong> Replace the first 'e' in sub with '3' and 't' in sub with '7'.
Now sub = "l3e7" is a substring of s, so we return true.</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "fooleetbar", sub = "f00l", mappings = [["o","0"]]
<strong style="user-select: auto;">Output:</strong> false
<strong style="user-select: auto;">Explanation:</strong> The string "f00l" is not a substring of s and no replacements can be made.
Note that we cannot replace '0' with 'o'.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "Fool33tbaR", sub = "leetd", mappings = [["e","3"],["t","7"],["t","8"],["d","b"],["p","b"]]
<strong style="user-select: auto;">Output:</strong> true
<strong style="user-select: auto;">Explanation:</strong> Replace the first and second 'e' in sub with '3' and 'd' in sub with 'b'.
Now sub = "l33tb" is a substring of s, so we return true.

</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= sub.length &lt;= s.length &lt;= 5000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= mappings.length &lt;= 1000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">mappings[i].length == 2</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">old<sub style="user-select: auto;">i</sub> != new<sub style="user-select: auto;">i</sub></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">s</code> and <code style="user-select: auto;">sub</code> consist of uppercase and lowercase English letters and digits.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">old<sub style="user-select: auto;">i</sub></code> and <code style="user-select: auto;">new<sub style="user-select: auto;">i</sub></code> are either uppercase or lowercase English letters or digits.</li>
</ul>
</div>