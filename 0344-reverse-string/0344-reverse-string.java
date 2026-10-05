class Solution {
    public void reverseString(char[] s) {
        char[] ch = new char[s.length];
        int j = 0;
        for(int i = s.length-1 ; i>=0 ;i--){
             ch[j] = s[i];
             j++;
        }
        System.arraycopy(ch, 0, s, 0, s.length);
    }
}