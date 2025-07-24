class Solution {
    public String countAndSay(int n) {
         if (n == 1) return "1";  // Base case

        String result = "1"; // start with first term

        for (int i = 2; i <= n; i++) {
            result = getNext(result);
        }

        return result;
    }

    private String getNext(String s) {
        StringBuilder sb = new StringBuilder();

        int count = 1;
        char currentChar = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == currentChar) {
                count++;
            } else {
                sb.append(count).append(currentChar);
                currentChar = s.charAt(i);
                count = 1;
            }
        }
        sb.append(count).append(currentChar); // append last group

        return sb.toString();
    }
    }
