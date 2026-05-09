class Solution {
    public int evalRPN(String[] tokens) {
        Stack <Integer> st = new Stack<>();

        for(int i = 0; i < tokens.length; i++){
            // int val  = Integer.parseInt(tokens[i]);

            if(tokens[i].equals("+")){
                int a = st.pop();
                int b = st.pop();
                int ans = b + a;
                st.push(ans);
            }else if(tokens[i].equals("-")){
                int a = st.pop();
                int b = st.pop();
                int ans = b - a;
                st.push(ans);
            }else if(tokens[i].equals("*")){
                int a = st.pop();
                int b = st.pop();
                int ans = b * a;
                st.push(ans);
            }else if(tokens[i].equals("/")){
                int a = st.pop();
                int b = st.pop();
                int ans = b / a;
                st.push(ans);
            }else{
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        return st.peek();
    }
}
