class BrowserHistory {

    Stack<String> st;
    Stack<String> st1;
    
    public BrowserHistory(String homepage)
    {
         st=new Stack<String>();
        st.add(homepage);
        st1=new Stack<String>();
    }
    
    public void visit(String url) 
    {
        st.add(url);
        st1.clear();
    }
    
    public String back(int steps) {

        while(st.size()>1 && steps>0)
        {
            st1.add(st.peek());
            st.pop();
            steps--;
        }
        return st.peek();

    }
    
    public String forward(int steps) 
    {

          while(st1.isEmpty()==false && steps>0)
        {
            st.add(st1.peek());
            st1.pop();
            steps--;
        }
        return st.peek();        
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */