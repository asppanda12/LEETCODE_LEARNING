<h2><a href="https://leetcode.com/problems/lfu-cache/">460. LFU Cache</a></h2><h3>Hard</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Design and implement a data structure for a <a href="https://en.wikipedia.org/wiki/Least_frequently_used" target="_blank" style="user-select: auto;">Least Frequently Used (LFU)</a> cache.</p>

<p style="user-select: auto;">Implement the <code style="user-select: auto;">LFUCache</code> class:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">LFUCache(int capacity)</code> Initializes the object with the <code style="user-select: auto;">capacity</code> of the data structure.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">int get(int key)</code> Gets the value of the <code style="user-select: auto;">key</code> if the <code style="user-select: auto;">key</code> exists in the cache. Otherwise, returns <code style="user-select: auto;">-1</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">void put(int key, int value)</code> Update the value of the <code style="user-select: auto;">key</code> if present, or inserts the <code style="user-select: auto;">key</code> if not already present. When the cache reaches its <code style="user-select: auto;">capacity</code>, it should invalidate and remove the <strong style="user-select: auto;">least frequently used</strong> key before inserting a new item. For this problem, when there is a <strong style="user-select: auto;">tie</strong> (i.e., two or more keys with the same frequency), the <strong style="user-select: auto;">least recently used</strong> <code style="user-select: auto;">key</code> would be invalidated.</li>
</ul>

<p style="user-select: auto;">To determine the least frequently used key, a <strong style="user-select: auto;">use counter</strong> is maintained for each key in the cache. The key with the smallest <strong style="user-select: auto;">use counter</strong> is the least frequently used key.</p>

<p style="user-select: auto;">When a key is first inserted into the cache, its <strong style="user-select: auto;">use counter</strong> is set to <code style="user-select: auto;">1</code> (due to the <code style="user-select: auto;">put</code> operation). The <strong style="user-select: auto;">use counter</strong> for a key in the cache is incremented either a <code style="user-select: auto;">get</code> or <code style="user-select: auto;">put</code> operation is called on it.</p>

<p style="user-select: auto;">The functions&nbsp;<code data-stringify-type="code" style="user-select: auto;">get</code>&nbsp;and&nbsp;<code data-stringify-type="code" style="user-select: auto;">put</code>&nbsp;must each run in <code style="user-select: auto;">O(1)</code> average time complexity.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input</strong>
["LFUCache", "put", "put", "get", "put", "get", "get", "put", "get", "get", "get"]
[[2], [1, 1], [2, 2], [1], [3, 3], [2], [3], [4, 4], [1], [3], [4]]
<strong style="user-select: auto;">Output</strong>
[null, null, null, 1, null, -1, 3, null, -1, 3, 4]

<strong style="user-select: auto;">Explanation</strong>
// cnt(x) = the use counter for key x
// cache=[] will show the last used order for tiebreakers (leftmost element is  most recent)
LFUCache lfu = new LFUCache(2);
lfu.put(1, 1);   // cache=[1,_], cnt(1)=1
lfu.put(2, 2);   // cache=[2,1], cnt(2)=1, cnt(1)=1
lfu.get(1);      // return 1
                 // cache=[1,2], cnt(2)=1, cnt(1)=2
lfu.put(3, 3);   // 2 is the LFU key because cnt(2)=1 is the smallest, invalidate 2.
&nbsp;                // cache=[3,1], cnt(3)=1, cnt(1)=2
lfu.get(2);      // return -1 (not found)
lfu.get(3);      // return 3
                 // cache=[3,1], cnt(3)=2, cnt(1)=2
lfu.put(4, 4);   // Both 1 and 3 have the same cnt, but 1 is LRU, invalidate 1.
                 // cache=[4,3], cnt(4)=1, cnt(3)=2
lfu.get(1);      // return -1 (not found)
lfu.get(3);      // return 3
                 // cache=[3,4], cnt(4)=1, cnt(3)=3
lfu.get(4);      // return 4
                 // cache=[4,3], cnt(4)=2, cnt(3)=3
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= capacity&nbsp;&lt;= 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= key &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= value &lt;= 10<sup style="user-select: auto;">9</sup></code></li>
	<li style="user-select: auto;">At most <code style="user-select: auto;">2 * 10<sup style="user-select: auto;">5</sup></code>&nbsp;calls will be made to <code style="user-select: auto;">get</code> and <code style="user-select: auto;">put</code>.</li>
</ul>

<p style="user-select: auto;">&nbsp;</p>
<span style="display: none; user-select: auto;">&nbsp;</span></div>