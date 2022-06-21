TreeNode pre=cur.left;
while(pre.right!=null &&  pre.right!=cur)
{
pre=pre.right;
}
if(pre.right==null)
{
pre.right=cur;
cur=cur.left;
}
else
{
pre.right=null;
no++;
if(no==k)
{
return cur.val;
}
​
cur=cur.right;
}
}
}
return -1;
}
}
```