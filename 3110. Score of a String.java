class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        for(int i=0;i<s.length()-1;i++)
        {
            int x=(int)s.charAt(i);
            int y=(int)s.charAt(i+1);
            sum+=Math.abs(x-y);

        }
        return sum;

        
    }
}