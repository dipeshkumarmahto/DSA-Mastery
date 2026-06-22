class Solution {
    public int maxArea(int[] height) {
         int ans = 0;
        int n = height.length;

        int i=0;
        int j=n-1;
        int minheight=0;
        int max=0;
        int diff=0;

        while(i<j){
            diff=j-i;
            minheight=Math.min(height[i], height[j]);
            max = Math.max(max, minheight*diff);
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
            }
            return max;
    }
}