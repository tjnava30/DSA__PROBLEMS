class Solution {
    public String addBinary(String a, String b) {
        String s="";

        int sum=0;
        int carry=0;
        int j=a.length()-1;
        int c=b.length()-1;

        while(j>=0 || c>=0){
            char ch1;
            char ch2;
            if(j<0){
                ch1='0';
            }else{
            ch1=a.charAt(j);}
            if(c<0){
                ch2='0';
            }else{
            ch2=b.charAt(c);}

            sum = (ch1-'0') + (ch2-'0') + carry;
            carry= sum/2;
            sum %= 2;
            
            s += sum;
            j--;
            c--;

        }
        if(carry==1){
            s += carry;
        }
        String x="";
        for(int i=s.length()-1;i>=0;i--){
            x += s.charAt(i);
        }
        return x;
        
    }
}