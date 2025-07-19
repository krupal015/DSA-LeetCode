class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
          Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            // Convert string to char array, sort it, and convert back to string
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            // Add to map
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(str);
        }

        // Return all the grouped anagrams as a list
        return new ArrayList<>(map.values());
    }
}