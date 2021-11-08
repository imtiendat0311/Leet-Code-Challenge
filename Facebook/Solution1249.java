class Solution1249 {
    public String minRemoveToMakeValid(String s) {
       StringBuilder result = new StringBuilder();
        int open=0;
        for(char a : s.toCharArray()){
            if(a=='('){
                open++;
            }else if(a==')'){
                if(open==0){continue;}
                open--;
            }
            result.append(a);
        }
        StringBuilder reverseResult = new StringBuilder();
        for(int i=result.length()-1;i>=0;i--){
            if(result.charAt(i)=='('&&open-->0){
                continue;
            }
            reverseResult.append(result.charAt(i));
        }
        return reverseResult.reverse().toString();
    }
}