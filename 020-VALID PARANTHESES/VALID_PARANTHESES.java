class Solution {
    static char[] stack;
    static int top;
    public boolean isValid(String s) {
        stack=new char[s.length()];
        top=-1;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch=='(' || ch=='{' || ch=='['){
                stack[++top]=ch;
            }
            else if(ch==')' || ch=='}' || ch==']'){
                if(top==-1){
                    return false;
                }

                char c=stack[top--];
                if((ch==')' && c!='(') || (ch=='}' && c!='{') || (ch==']' && c!='[')){
                    return false;                }
            }
        }
        if(top==-1){
            return true;
        }
        return false;
        
    }
}
