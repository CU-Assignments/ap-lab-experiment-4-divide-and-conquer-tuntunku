class Solution {
    public String longestNiceSubstring(String s) {
        int n = s.length();
        String result = "";
        
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                String sub = s.substring(i, j + 1);
                if (isNice(sub) && sub.length() > result.length()) {
                    result = sub;
                }
            }
        }
        
        return result;
    }

    private boolean isNice(String s) {
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c) && !s.contains(Character.toString(Character.toUpperCase(c)))) {
                return false;
            }
            if (Character.isUpperCase(c) && !s.contains(Character.toString(Character.toLowerCase(c)))) {
                return false;
            }
        }
        return true;
    }
}


//s =
//"YazaAay"
//Output
//"aAa"
//Expected
//"aAa"
