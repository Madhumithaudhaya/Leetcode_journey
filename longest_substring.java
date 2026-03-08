class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left =0;
        int maxLength=0;
        HashSet<Character> lay= new HashSet<>();
        for(int right=0;right<s.length();right++)
        {
            while(lay.contains(s.charAt(right)))
            {
                lay.remove(s.charAt(left));
                left++;
            }
            lay.add(s.charAt(right));
            maxLength=Math.max(maxLength,right-left+1);
        }
      return maxLength; 
    }
}