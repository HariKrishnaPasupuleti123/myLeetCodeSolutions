class Solution {
    public String longestCommonPrefix(String[] strs) {
     Arrays.sort(strs);
     String t="";
     for(int i=0;i<strs[0].length();i++){
        if(strs[0].charAt(i)==strs[strs.length-1].charAt(i)){
            t+=strs[0].charAt(i);
        }
        else break;
        
     } 
     return t;
    }
}
