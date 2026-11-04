class BrowserHistory {
 Deque<String> currHistory;
 Deque<String> forwardHistory;
    public BrowserHistory(String homepage) {
        currHistory = new ArrayDeque<>();
        forwardHistory = new  ArrayDeque<>();
        // initially curr history me homepage bhi insert karno hai
        currHistory .push(homepage);
        
    }
    
    public void visit(String url) {
        currHistory.push(url);
        while(!forwardHistory.isEmpty()){
            forwardHistory.pop();
        }
    }
    
    public String back(int steps) {
        //homepage se back nahi karunge rest normally back krete rahu
        while(steps > 0){
            if(currHistory.size() >1){
             //main back
             String backtab = currHistory.pop();
             forwardHistory.push(backtab);

            }
         else{
            //back nahi kr skta hu
            break;
         }
           steps-- ;  
        }
        return currHistory.peek();
    }
    
    public String forward(int steps) {
        while(steps > 0){
            if(forwardHistory.size() > 0){
                String forwardtab = forwardHistory.pop();
                currHistory.push(forwardtab);
            }
            else{
                break;
            }
            steps--;
        }
        return currHistory.peek();
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */