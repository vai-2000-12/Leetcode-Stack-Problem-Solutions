class Solution {
    public String decodeString(String s) {
        int count = 0;
        Stack<Integer> num = new Stack<Integer>();
        Stack<StringBuilder> ch = new Stack<StringBuilder>();

        StringBuilder sb = new StringBuilder();

        for(char c :  s.toCharArray()){
          if(Character.isDigit(c)){
            count = (count * 10 ) + (c - '0');
          }else if(c == '['){
            num.push(count);
            ch.push(sb);
            count = 0;
            sb = new StringBuilder();
          }  else if(c == ']'){
           int Repeatcount = num.pop();
            StringBuilder decodeString = ch.pop();
             for( int i =0 ; i < Repeatcount ; i++){
                  decodeString.append(sb);  
             }
             sb = decodeString; 
          }else{
             sb.append(c);
          }
        }
     return sb.toString();        

    }
}