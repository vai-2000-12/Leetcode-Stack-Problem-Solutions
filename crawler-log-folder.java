import java.util.Stack;

class Solution {
    public int minOperations(String[] logs) {
        Stack<String> st = new Stack<String>();
        for (String lg : logs) {
            if (lg.equals("../")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else if (!lg.equals("./")) {
                st.push(lg);
            }
        }
        return st.size();
    }
}