class MyQueue {

    Deque <Integer> inputStack = new ArrayDeque<>();
    Deque <Integer> outputStack = new ArrayDeque<>();


    public MyQueue() {
        
    }
    
    public void push(int x) {
        inputStack.push(x);
    }
    
    public int pop() {
        if (!outputStack.isEmpty()){
            return outputStack.pop();
        }
        else{
            while(!inputStack.isEmpty()){
                outputStack.push(inputStack.pop());
            }
            return outputStack.pop();
        }
    }
    
    public int peek() {
        if (!outputStack.isEmpty()){
            return outputStack.peek();
        }
        else{
            while(!inputStack.isEmpty()){
                outputStack.push(inputStack.pop());
            }
            return outputStack.peek();
        }
    }
    
    public boolean empty() {

        if(inputStack.isEmpty() && outputStack.isEmpty()){

            return true;
        }
        else{
            return false;
        }
        
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