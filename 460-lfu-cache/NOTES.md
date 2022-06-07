same as lru but the only change here u have to make is you have to keep track of frequency so make an map of frequency of dque keeptrack of element with there frequency no like if1 has frequency 2 then link 1--->2 so go on
​
```
class LFUCache {
TreeMap<Integer,Deque<Integer>> dq;
HashMap<Integer,Integer> map;
HashMap<Integer,Integer> fre;
int size;int c=0;
public LFUCache(int capacity) {
dq=new TreeMap<Integer,Deque<Integer>>();
map=new HashMap<Integer,Integer>();
fre=new HashMap<Integer,Integer>();
size=capacity;
}
public int get(int key)
{
if(map.containsKey(key))
{
int redirect=fre.get(key);
dq.get(redirect).remove(key);
if(dq.get(redirect).size()==0)
{
dq.remove(redirect);