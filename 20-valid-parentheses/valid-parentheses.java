class Solution {
    public boolean isValid(String s) {
          Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // If opening bracket, push to stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            // If closing bracket, check for matching opening
            else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // Valid if stack is empty at the end
        return stack.isEmpty();
    }
}