class Solution {
    public String countAndSay(int n) {
        StringBuilder end = new StringBuilder("1");
        StringBuilder start;
        for(int i = 2; i <= n; ++i) {
            start = end;
            end = new StringBuilder();
            int j = 0;
            int count = 0;
            while(j < start.length()) {
                count++;
                if(j == start.length() - 1 || start.charAt(j) != start.charAt(j+1)) {
                    end.append(count).append(start.charAt(j));
                    count = 0;
                }
                j++;
            }
        }
     return end.toString();
    }
}
