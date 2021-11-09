class Solution680{
    public boolean validPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(right>=left){
            if(s.charAt(left)!=s.charAt(right)){
                   return isPalindrome(s,left+1,right)||isPalindrome(s,left,right-1);
               
           }
            right--;
            left++;
        }
       return true;
       }
       //helper
       public boolean isPalindrome(String s,int l,int r){
           int left=l;
           int right=r;
           while(right>=left){
               if(s.charAt(left)!=s.charAt(right)){
                   return false;
               }
               right--;
               left++;
           }
           return true;
       }
       
   }