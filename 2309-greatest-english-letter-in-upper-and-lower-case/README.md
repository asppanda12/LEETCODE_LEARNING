<h2><a href="https://leetcode.com/problems/greatest-english-letter-in-upper-and-lower-case/">2309. Greatest English Letter in Upper and Lower Case</a></h2><h3>Easy</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given a string of English letters <code style="user-select: auto;">s</code>, return <em style="user-select: auto;">the <strong style="user-select: auto;">greatest </strong>English letter which occurs as <strong style="user-select: auto;">both</strong> a lowercase and uppercase letter in</em> <code style="user-select: auto;">s</code>. The returned letter should be in <strong style="user-select: auto;">uppercase</strong>. If no such letter exists, return <em style="user-select: auto;">an empty string</em>.</p>

<p style="user-select: auto;">An English letter <code style="user-select: auto;">b</code> is <strong style="user-select: auto;">greater</strong> than another letter <code style="user-select: auto;">a</code> if <code style="user-select: auto;">b</code> appears <strong style="user-select: auto;">after</strong> <code style="user-select: auto;">a</code> in the English alphabet.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "l<strong style="user-select: auto;"><u style="user-select: auto;">Ee</u></strong>TcOd<u style="user-select: auto;"><strong style="user-select: auto;">E</strong></u>"
<strong style="user-select: auto;">Output:</strong> "E"
<strong style="user-select: auto;">Explanation:</strong>
The letter 'E' is the only letter to appear in both lower and upper case.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "a<strong style="user-select: auto;"><u style="user-select: auto;">rR</u></strong>AzFif"
<strong style="user-select: auto;">Output:</strong> "R"
<strong style="user-select: auto;">Explanation:</strong>
The letter 'R' is the greatest letter to appear in both lower and upper case.
Note that 'A' and 'F' also appear in both lower and upper case, but 'R' is greater than 'F' or 'A'.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "AbCdEfGhIjK"
<strong style="user-select: auto;">Output:</strong> ""
<strong style="user-select: auto;">Explanation:</strong>
There is no letter that appears in both lower and upper case.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= s.length &lt;= 1000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">s</code> consists of lowercase and uppercase English letters.</li>
</ul>
</div>