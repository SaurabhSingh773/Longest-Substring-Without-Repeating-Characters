class Solution {
    public int lengthOfLongestSubstring(String s) {
  if (s == null || s.length() == 0) return 0;
        
        
        Map<Character, Integer> charMap = new HashMap<>();
        
        int max = 0;  
        int start = 0; 
        
        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            
          
            if (charMap.containsKey(currentChar) && charMap.get(currentChar) >= start) {
               
                start = charMap.get(currentChar) + 1;
            }
            
            
            charMap.put(currentChar, end);
            
            
            max = Math.max(max, end - start + 1);
        }
        
        return max;
    }
}