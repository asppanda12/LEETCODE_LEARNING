<h2><a href="https://leetcode.com/problems/maximum-score-from-removing-stones/">1753. Maximum Score From Removing Stones</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are playing a solitaire game with <strong style="user-select: auto;">three piles</strong> of stones of sizes <code style="user-select: auto;">a</code>​​​​​​, <code style="user-select: auto;">b</code>,​​​​​​ and <code style="user-select: auto;">c</code>​​​​​​ respectively. Each turn you choose two <strong style="user-select: auto;">different non-empty </strong>piles, take one stone from each, and add <code style="user-select: auto;">1</code> point to your score. The game stops when there are <strong style="user-select: auto;">fewer than two non-empty</strong> piles (meaning there are no more available moves).</p>

<p style="user-select: auto;">Given three integers <code style="user-select: auto;">a</code>​​​​​, <code style="user-select: auto;">b</code>,​​​​​ and <code style="user-select: auto;">c</code>​​​​​, return <em style="user-select: auto;">the</em> <strong style="user-select: auto;"><em style="user-select: auto;">maximum</em> </strong><em style="user-select: auto;"><strong style="user-select: auto;">score</strong> you can get.</em></p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> a = 2, b = 4, c = 6
<strong style="user-select: auto;">Output:</strong> 6
<strong style="user-select: auto;">Explanation:</strong> The starting state is (2, 4, 6). One optimal set of moves is:
- Take from 1st and 3rd piles, state is now (1, 4, 5)
- Take from 1st and 3rd piles, state is now (0, 4, 4)
- Take from 2nd and 3rd piles, state is now (0, 3, 3)
- Take from 2nd and 3rd piles, state is now (0, 2, 2)
- Take from 2nd and 3rd piles, state is now (0, 1, 1)
- Take from 2nd and 3rd piles, state is now (0, 0, 0)
There are fewer than two non-empty piles, so the game ends. Total: 6 points.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> a = 4, b = 4, c = 6
<strong style="user-select: auto;">Output:</strong> 7
<strong style="user-select: auto;">Explanation:</strong> The starting state is (4, 4, 6). One optimal set of moves is:
- Take from 1st and 2nd piles, state is now (3, 3, 6)
- Take from 1st and 3rd piles, state is now (2, 3, 5)
- Take from 1st and 3rd piles, state is now (1, 3, 4)
- Take from 1st and 3rd piles, state is now (0, 3, 3)
- Take from 2nd and 3rd piles, state is now (0, 2, 2)
- Take from 2nd and 3rd piles, state is now (0, 1, 1)
- Take from 2nd and 3rd piles, state is now (0, 0, 0)
There are fewer than two non-empty piles, so the game ends. Total: 7 points.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> a = 1, b = 8, c = 8
<strong style="user-select: auto;">Output:</strong> 8
<strong style="user-select: auto;">Explanation:</strong> One optimal set of moves is to take from the 2nd and 3rd piles for 8 turns until they are empty.
After that, there are fewer than two non-empty piles, so the game ends.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= a, b, c &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
</ul>
</div>