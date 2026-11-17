class MyQueue {
     Deque <Integer> s1;
     Deque <Integer> s2;
    public MyQueue() {
      s1= new ArrayDeque<>();   
      s2= new ArrayDeque<>();  
    }
    
    public void push(int x) {
        //step1: shift all element on stack s2
        while(!s1.isEmpty()){
            int topelement  = s1.peek();
            s1.pop();
            s2.push(topelement);
        }
        //step2 : insert x into s1
        s1.push(x);
        //step 3: shift all elements from s2 to s1
         while(!s2.isEmpty()){
            int topelement  = s2.peek();
            s2.pop();
            s1.push(topelement);
        }
    }
    
    public int pop() {
        return s1.pop();
    }
    
    public int peek() {
        return s1.peek();
    }
    
    public boolean empty() {
        return s1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */