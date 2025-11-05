class Solution {
    public String removeStars(String s) {
        String result="";
        Stack<Character> stack= new Stack<>();
        for(char r:s.toCharArray()){
            if(r!='*'){
                stack.push(r);
            }
            if(!stack.isEmpty() && r=='*'){
                stack.pop();

            }
            
        }
        while(!stack.isEmpty()){
            result+=stack.pop();
        }
        StringBuilder sb = new StringBuilder(result);
        String reversedString = sb.reverse().toString();
        return reversedString;

        
    }
}