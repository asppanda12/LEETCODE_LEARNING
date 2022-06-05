using deque put  the current value at the back and the least occuring value value should be at the front and when u get an element which increases the size pop from the front
​
```
class LRUCache {
​
static int c;
static HashMap<Integer,Integer> map;
Deque<Integer> dq;
public LRUCache(int capacity)
{
dq= new ArrayDeque<Integer>();
map=new HashMap<Integer,Integer>();
c=capacity;
}
public int get(int key)
{
if(map.containsKey(key))
{
dq.remove(new Integer(key));
int t= map.get(key);
dq.offerLast(key);
return t;
}
return -1;
}
public void put(int key, int value)
{
if(map.containsKey(key)==false)
{
dq.offerLast(key);
map.put(key,value);
}
else