**using morish traversal**
```
class Solution
{
public void flatten(TreeNode root)
{
TreeNode curr=root;
while(curr!=null)
{
if(curr.left!=null)
{
TreeNode next1=curr.left;
while(next1.right!=null)
{
next1=next1.right;
}
next1.right=curr.right;
curr.right=curr.left;
curr.left=null;
}
curr=curr.right;
}
}
}
```
![](https://drive.google.com/file/d/1_7DKKDBFzO6fNCeNzkHzEO_1rUWJMLNe/view?usp=sharing)