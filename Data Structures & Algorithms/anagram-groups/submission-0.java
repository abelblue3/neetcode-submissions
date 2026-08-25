class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++){
            String currStrs = strs[i];
            char[] sAlpha = new char[26];
            for (int j = 0; j < currStrs.length(); j++) {
                sAlpha[currStrs.charAt(j) - 'a'] += 1;
            }

            String x = Arrays.toString(sAlpha);

            if (map.containsKey(x)) {
                map.get(x).add(currStrs);
            } else {
                List<String> newArray = new ArrayList<>();
                newArray.add(currStrs);
                map.put(x, newArray);
            }
        }
        return new ArrayList(map.values());
    }
}
