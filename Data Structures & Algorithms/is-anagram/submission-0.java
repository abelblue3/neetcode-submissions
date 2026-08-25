class Solution {
    public boolean isAnagram(String s, String t) {
        Map<String, Integer> tMap = new HashMap<>();
        Map<String, Integer> sMap = new HashMap<>();
        
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0 ; i < s.length(); i++) {
            String tChar = t.substring(i, i + 1);
            String sChar = s.substring(i, i + 1);
            if (tMap.containsKey(tChar)) {
                tMap.put(tChar, tMap.get(tChar) + 1);
            } else {
                tMap.put(tChar, 1);
            }
            if (sMap.containsKey(sChar)) {
                sMap.put(sChar, sMap.get(sChar) + 1);
            } else {
                sMap.put(sChar, 1);
            }
        }

        return tMap.equals(sMap);
    }
}
