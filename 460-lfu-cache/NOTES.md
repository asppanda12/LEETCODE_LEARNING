}
if(dq.containsKey(redirect+1)==false)
{
dq.put(redirect+1,new ArrayDeque<Integer>());
}
dq.get(redirect+1).offerLast(key);
fre.put(key,redirect+1);
map.put(key,value);
}
else
{
if(size==0)
{
return;
}
if(c==size)
{
c--;
int redirect=dq.firstKey();
int kapa=dq.get(redirect).getFirst();
dq.get(redirect).pollFirst();
if(dq.get(redirect).size()==0)
{
dq.remove(redirect);
}
fre.remove(kapa);
map.remove(kapa);
}
int redirect=1;
c++;
if(dq.containsKey(redirect)==false)
{
dq.put(redirect,new ArrayDeque<Integer>());
}
dq.get(redirect).offerLast(key);
fre.put(key,redirect);
map.put(key,value);
}
​
}
}
​
/**
* Your LFUCache object will be instantiated and called as such:
* LFUCache obj = new LFUCache(capacity);
* int param_1 = obj.get(key);
* obj.put(key,value);
*/
```