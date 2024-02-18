class Solution {
    public int minAddToMakeValid(String s) {

        Stack<Character> st = new Stack<Character>();
        int count = 0;

        for( int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '('){
                st.push(s.charAt(i));
            } else if(s.charAt(i) == ')' && !st.isEmpty()){
               st.pop();
            }else{
                if(s.charAt(i) == ')' && st.isEmpty()){
                  ++count;   
                }
            }
        }
       return Math.abs(count+ st.size());
    }
}