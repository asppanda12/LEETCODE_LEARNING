<h2><a href="https://leetcode.com/problems/parallel-courses-iii/">2050. Parallel Courses III</a></h2><h3>Hard</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given an integer <code style="user-select: auto;">n</code>, which indicates that there are <code style="user-select: auto;">n</code> courses labeled from <code style="user-select: auto;">1</code> to <code style="user-select: auto;">n</code>. You are also given a 2D integer array <code style="user-select: auto;">relations</code> where <code style="user-select: auto;">relations[j] = [prevCourse<sub style="user-select: auto;">j</sub>, nextCourse<sub style="user-select: auto;">j</sub>]</code> denotes that course <code style="user-select: auto;">prevCourse<sub style="user-select: auto;">j</sub></code> has to be completed <strong style="user-select: auto;">before</strong> course <code style="user-select: auto;">nextCourse<sub style="user-select: auto;">j</sub></code> (prerequisite relationship). Furthermore, you are given a <strong style="user-select: auto;">0-indexed</strong> integer array <code style="user-select: auto;">time</code> where <code style="user-select: auto;">time[i]</code> denotes how many <strong style="user-select: auto;">months</strong> it takes to complete the <code style="user-select: auto;">(i+1)<sup style="user-select: auto;">th</sup></code> course.</p>

<p style="user-select: auto;">You must find the <strong style="user-select: auto;">minimum</strong> number of months needed to complete all the courses following these rules:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">You may start taking a course at <strong style="user-select: auto;">any time</strong> if the prerequisites are met.</li>
	<li style="user-select: auto;"><strong style="user-select: auto;">Any number of courses</strong> can be taken at the <strong style="user-select: auto;">same time</strong>.</li>
</ul>

<p style="user-select: auto;">Return <em style="user-select: auto;">the <strong style="user-select: auto;">minimum</strong> number of months needed to complete all the courses</em>.</p>

<p style="user-select: auto;"><strong style="user-select: auto;">Note:</strong> The test cases are generated such that it is possible to complete every course (i.e., the graph is a directed acyclic graph).</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<strong style="user-select: auto;"><img alt="" src="https://assets.leetcode.com/uploads/2021/10/07/ex1.png" style="width: 392px; height: 232px; user-select: auto;"></strong>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 3, relations = [[1,3],[2,3]], time = [3,2,5]
<strong style="user-select: auto;">Output:</strong> 8
<strong style="user-select: auto;">Explanation:</strong> The figure above represents the given graph and the time required to complete each course. 
We start course 1 and course 2 simultaneously at month 0.
Course 1 takes 3 months and course 2 takes 2 months to complete respectively.
Thus, the earliest time we can start course 3 is at month 3, and the total time required is 3 + 5 = 8 months.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>
<strong style="user-select: auto;"><img alt="" src="https://assets.leetcode.com/uploads/2021/10/07/ex2.png" style="width: 500px; height: 365px; user-select: auto;"></strong>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 5, relations = [[1,5],[2,5],[3,5],[3,4],[4,5]], time = [1,2,3,4,5]
<strong style="user-select: auto;">Output:</strong> 12
<strong style="user-select: auto;">Explanation:</strong> The figure above represents the given graph and the time required to complete each course.
You can start courses 1, 2, and 3 at month 0.
You can complete them after 1, 2, and 3 months respectively.
Course 4 can be taken only after course 3 is completed, i.e., after 3 months. It is completed after 3 + 4 = 7 months.
Course 5 can be taken only after courses 1, 2, 3, and 4 have been completed, i.e., after max(1,2,3,7) = 7 months.
Thus, the minimum time needed to complete all the courses is 7 + 5 = 12 months.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= n &lt;= 5 * 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= relations.length &lt;= min(n * (n - 1) / 2, 5 * 10<sup style="user-select: auto;">4</sup>)</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">relations[j].length == 2</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= prevCourse<sub style="user-select: auto;">j</sub>, nextCourse<sub style="user-select: auto;">j</sub> &lt;= n</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">prevCourse<sub style="user-select: auto;">j</sub> != nextCourse<sub style="user-select: auto;">j</sub></code></li>
	<li style="user-select: auto;">All the pairs <code style="user-select: auto;">[prevCourse<sub style="user-select: auto;">j</sub>, nextCourse<sub style="user-select: auto;">j</sub>]</code> are <strong style="user-select: auto;">unique</strong>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">time.length == n</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= time[i] &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;">The given graph is a directed acyclic graph.</li>
</ul>
</div>