class Solution {
    public int evalRPN(String[] tokens) {
        
        Deque<Integer> stack = new ArrayDeque<>();
        int sum = 0;
        int sub = 0;
        int product = 1;
        int remainder = 1;
        for(int i = 0; i < tokens.length; i++){

            if(!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*") 
            && !tokens[i].equals("/")) {

                stack.push(Integer.valueOf(tokens[i]));

            } else if (tokens[i].equals("+")){

                    
                    int first = stack.pop();
                    int second = stack.pop();

                    stack.push(second + first);
            }
            else if( tokens[i].equals("-")){
                    int first = stack.pop();
                    int second = stack.pop();
                    stack.push(second - first);
            }
            else if(tokens[i].equals("*")) {
                    int first = stack.pop();
                    int second = stack.pop();
                    stack.push(second * first);
            }

            else if(tokens[i].equals("/")){
                    int first = stack.pop();
                    int second = stack.pop();
                    stack.push(second / first);
            }
        }

        return  stack.peek();
    }
}
