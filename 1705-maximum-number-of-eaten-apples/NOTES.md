}
​
}
​
int day=n;
while(pq.isEmpty()==false)
{
int start=pq.peek().x;
int end=pq.peek().y;
pq.poll();
if(start+day<end)
{
t+=start;
day=start+day;
}
else
{
t+=end-day;
day=end;
}
}
return t;
}
}
​