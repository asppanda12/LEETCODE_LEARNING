class Trie
{
    class Trie1
    {
        Trie1 a[];
        int flag;
        Trie1()
        {
            a=new Trie1[26];
            flag=0;
            Arrays.fill(a,null);
        }
    }
    Trie1 root;
    public Trie()
    {
        root=new Trie1();
    }
    
    public void insert(String word) 
    {
        int n=word.length();
        Trie1 root1=root;
        for(int i=0;i<n;i++)
        {
            char ch=word.charAt(i);
            int val=(int)(ch-'a');
            if(root1.a[val]==null)
            {
                Trie1 newtrie=new Trie1();
                root1.a[val]=newtrie;
                root1=root1.a[val];
            }
            else
            {
                root1=root1.a[val];
            }
        }
         root1.flag=1;
    }
    
    public boolean search(String word)
    {
         int n=word.length();
         Trie1 root1=root;
        for(int i=0;i<n;i++)
        {
              char ch=word.charAt(i);
            int val=(int)(ch-'a');
             if(root1.a[val]==null)
            {
                 return false;
            }
            else
            {
                root1=root1.a[val];
            }
        }
        return  root1 != null && root1.flag==1?true:false;
        
    }
    
    public boolean startsWith(String prefix) {
        int n=prefix.length();
         Trie1 root1=root;
        for(int i=0;i<n;i++)
        {
            char ch=prefix.charAt(i);
            int val=(int)(ch-'a');
             if(root1.a[val]==null)
            {
                 return false;
            }
            else
            {
                root1=root1.a[val];
            }
        }
        return root1!=null;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */