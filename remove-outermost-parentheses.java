class Solution {
    public String removeOuterParentheses(String s) {
      
     int len = s.length();
     if(len<=2) return "";
     
     int open = 1;

    StringBuilder sb = new StringBuilder();

    for(int i = 1 ; i < len ; i++){  
      char[]c = s.toCharArray();
     if(c[i] == '(' ){
        open++;
        if(open > 1)sb.append('(');
      } 
      else{
       if(open > 1) sb.append(')');
        open--;
      }
    }        
    return sb.toString();
    }
}