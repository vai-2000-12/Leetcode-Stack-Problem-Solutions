class Solution {
    public boolean backspaceCompare(String s, String t) {
         return S(s).equals(S(t));
    }

    public String S(String s){
       Stack<Character> st1 = new Stack<Character>();

      for(char c  : s.toCharArray()){
        if(c != '#'){
           st1.push(c);
        }else if(!st1.isEmpty()){
          st1.pop();
        }
      }
        return String.valueOf(st1);
    }
}