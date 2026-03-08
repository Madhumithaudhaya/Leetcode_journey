class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> lay = new HashMap<>();
        for( String s: strs)
        {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key= new String(chars);
            if(!lay.containsKey(key))
            {
                lay.put(key, new ArrayList<>());
            }
            lay.get(key).add(s);
        } 
        return new ArrayList<>(lay.values());
    }
}