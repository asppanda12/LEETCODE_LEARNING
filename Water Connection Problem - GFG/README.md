# Water Connection Problem
## Medium 
<div class="problem-statement" style="user-select: auto;">
                <p style="user-select: auto;"></p><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">There are n houses and p water pipes in Geek Colony. Every house has at most one pipe going into it and at most one pipe going out of it. Geek needs to install pairs of tanks and taps in the colony according to the following guidelines. &nbsp;<br style="user-select: auto;">
1. Every house with one outgoing pipe but no incoming pipe gets a tank on its roof.<br style="user-select: auto;">
2. Every house with only one incoming and no outgoing pipe gets a tap.<br style="user-select: auto;">
The Geek council has proposed a network of pipes where connections are denoted by three input values: ai, bi, di denoting the pipe of diameter di from house ai to house bi.<br style="user-select: auto;">
Find a more efficient way for the construction of this network of pipes. Minimize the diameter of pipes wherever possible.<br style="user-select: auto;">
<strong style="user-select: auto;">Note</strong>: The generated output will have the following format. The first line will contain t, denoting the total number of pairs of tanks and taps installed. The next t lines contain three integers each: house number of tank, house number of tap, and the minimum diameter of pipe between them</span><span style="font-size: 18px; user-select: auto;">.</span></p>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:</strong>
n = 9, p = 6
a[] = {7,5,4,2,9,3}
b[] = {4,9,6,8,7,1}
d[] = {98,72,10,22,17,66} 
<strong style="user-select: auto;">Output:</strong> 
3
2 8 22
3 1 66
5 6 10
<strong style="user-select: auto;">Explanation:</strong>
Connected components are 
<strong style="user-select: auto;"><em style="user-select: auto;">3-&gt;1, 5-&gt;9-&gt;7-&gt;4-&gt;6 and 2-&gt;8</em></strong>.
Therefore, our answer is<strong style="user-select: auto;"> 3</strong> 
followed by <strong style="user-select: auto;">2 8 22, 3 1 66, 5 6 10.</strong></span></pre>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong style="user-select: auto;">solve()</strong>&nbsp;which takes an integer n(the number of houses), p(the number of pipes),the&nbsp;array a[] , b[] and&nbsp;d[] (where&nbsp;<strong style="user-select: auto;">d[i]&nbsp;</strong>denoting the diameter of the ith pipe from the house <strong style="user-select: auto;">a[i]</strong> to house <strong style="user-select: auto;">b[i]</strong>) as input parameter and returns the array of&nbsp;pairs of tanks and taps installed i.e ith element of the array&nbsp;contains three integers: house number of tank, house number of tap and the minimum diameter of pipe between them. &nbsp;</span></p>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity:</strong>&nbsp;O(n+p)<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:</strong>&nbsp;O(n+p)</span></p>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1&lt;=n&lt;=20<br style="user-select: auto;">
1&lt;=p&lt;=50<br style="user-select: auto;">
1&lt;=a[i],b[i]&lt;=20<br style="user-select: auto;">
1&lt;=d[i]&lt;=100</span></p>
 <p style="user-select: auto;"></p>
            </div>