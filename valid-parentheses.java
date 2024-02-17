class Solution {
    public boolean isValid(String s) {
        Stack < Character > stack = new Stack();
        for (char i: s.toCharArray()) {
            if (isBracketOpen(i)) {
                stack.push(i);
            } else if (stack.isEmpty()) {
                return false;
            } else {
                if (areBracketsMatching(stack.peek(), i)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }

    private boolean isBracketOpen(char c) {
        switch (c) {
            case '(':
            case '[':
            case '{':
                return true;
            default:
                return false;
        }
    }

    private boolean areBracketsMatching(char c, char d) {
        if (c == '(' && d == ')') {
            return true;
        } else if (c == '{' && d == '}') {
            return true;
        } else if (c == '[' && d == ']') {
            return true;
        } else {
            return false;
        }
    }
    
}