class Solution {
    public String removeDuplicates(String s) {
      
        Stack<Character> stack = new Stack<Character>();

            for(int i=0;i<s.length();i++){

            if(!stack.empty() && s.charAt(i)==stack.peek())
            {
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }

        }

        StringBuilder str = new StringBuilder();

        for(Character c : stack){
            str.append(c);
        }

        return str.toString();
     
    }
}