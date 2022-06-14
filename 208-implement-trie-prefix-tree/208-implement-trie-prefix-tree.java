class Trie {
    
    private class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEnd = false;
    }
    
    private TrieNode root;
    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode currNode = root;
        
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (currNode.children[index] == null)
                currNode.children[index] = new TrieNode();
            
            currNode = currNode.children[index];
        }
        currNode.isEnd = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode currNode = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (currNode.children[index] == null)
                return false;
            
            currNode = currNode.children[index];
        }
        return currNode != null && currNode.isEnd;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode currNode = root;
        for (char c : prefix.toCharArray()) {
            int index = c - 'a';
            if (currNode.children[index] == null)
                return false;
            currNode = currNode.children[index];
        }
        
        return currNode != null;
    }
}
