class Solution {
    public boolean isAnagram(String s, String t) {
       int n =s.length();
       int m =t.length();
        if(s.length() != t.length()){
                 return false;
        }
                String[] a = s.split("");
        String[] b = t.split("");

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
}