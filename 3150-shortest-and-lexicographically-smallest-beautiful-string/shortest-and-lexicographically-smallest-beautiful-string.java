class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String a = "";
        for(int i = 0;i < s.length();i++){
            int o = 0;
            String cur = "";
            for(int j = i; j < s.length();j++){
                cur += s.charAt(j);
                if(s.charAt(j) == '1'){
                    o++;
                }
                if(o > k){
                    break;
                }
                if(o == k){
                    if(a.isEmpty() || cur.length() < a.length() || (cur.length() == a.length() && cur.compareTo(a) < 0) ){
                        a = cur;
                    }
                }
            }
        }
        return a;
        
    }
}