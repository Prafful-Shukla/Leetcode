import java.util.*;
class Solution {
    public String minWindow(String s, String t) {
      
        Map<Character, Integer> fmap = new HashMap<>();
        for(int i = 0; i < t.length(); i++){
            fmap.put(t.charAt(i), fmap.getOrDefault(t.charAt(i), 0) + 1);
        }
        
        
        int minSize = Integer.MAX_VALUE;
        int matchCount = 0;
        int start = 0;
        int end = 0;
        int minStart = 0;
        int minEnd = 0;
        
        
        for(end = 0; end < s.length(); end++)
        {
            char c = s.charAt(end);
            if(fmap.containsKey(c)) {
                if(fmap.get(c) == 1)
                    matchCount++;
                fmap.put(c, fmap.get(c) - 1);
            }
            while(matchCount >= fmap.size()) {
                int curLen = end - start + 1;
                char startChar = s.charAt(start);
                if(curLen < minSize) {
                    minSize = curLen;
                    minStart = start;
                    minEnd = end + 1;
                }
                if(fmap.containsKey(startChar)) {
                    if(fmap.get(startChar) == 0)
                        matchCount--;
                    fmap.put(startChar, fmap.get(startChar) + 1);
                }
                start++;
            }
            
        }
        return s.substring(minStart, minEnd);
    }
}
