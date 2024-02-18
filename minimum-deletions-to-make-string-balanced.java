class Solution {
    public int minimumDeletions(String s) {
        int count = 0;
        int len = s.length();
         
        Stack<Character> st = new Stack<Character>(); 
         if (s == null || s.isEmpty()) return 0;

        for( int i = 0 ; i < len ; i++){
          char c  = s.charAt(i);

         if(!st.isEmpty() && c == 'a'){
             st.pop();
             count++;
         }
         if(c == 'b'){
             st.push(c);
          }
        }  
         return count;
    }
}