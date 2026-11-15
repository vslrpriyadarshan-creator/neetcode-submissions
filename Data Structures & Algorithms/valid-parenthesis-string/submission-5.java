class Solution {
    public boolean checkValidString(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        Deque<Integer> starStack = new ArrayDeque<>();
        for(int i = 0; i< s.length(); i++){

            if(s.charAt(i) == '('){
                stack.push(i);
            }
            else if(s.charAt(i) == '*'){
                starStack.push(i);
            }
            else{
                if(!stack.isEmpty()) stack.pop();
                else if( !starStack.isEmpty()) starStack.pop();
                else return false;
            }

        }
        while(!stack.isEmpty() && !starStack.isEmpty() && stack.peek() < starStack.peek()) {

            stack.pop();
            starStack.pop();
        }
        if(!stack.isEmpty()){
            return false;
        }
        else {
            return true;
        }
    }
    
}
