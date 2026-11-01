class Solution {
    public boolean isValid(String s) {
        
        Deque<Character> stack = new ArrayDeque<>();
        boolean result = false;
        for(int i = 0; i< s.length(); i++){

            if(s.charAt(i)== '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }
            if(stack.isEmpty()){
                return false;
            }
            if(s.charAt(i) == ')' && !stack.isEmpty() && stack.pop() != '('){
                return false;
            }

            if(s.charAt(i) == '}' && !stack.isEmpty() && stack.pop() != '{'){
                return false;
            }

            if(s.charAt(i) == ']' && !stack.isEmpty() && stack.pop() != '['){
                return false;
            }

            result = true;
        }

        return stack.isEmpty() == true && result == true ? true : false;
    }
}
