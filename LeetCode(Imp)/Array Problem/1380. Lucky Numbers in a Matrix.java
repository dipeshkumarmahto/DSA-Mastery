
class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
/*




        List<Integer> ans = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                boolean rowMin = true;
                boolean colMax = true;

                for (int k = 0; k < n; k++) {
                    if (matrix[i][k] < matrix[i][j]) {
                        rowMin = false;
                        break;
                    }
                }

                for (int k = 0; k < m; k++) {
                    if (matrix[k][j] > matrix[i][j]) {
                        colMax = false;
                        break;
                    }z
                }

                if (rowMin && colMax) {
                    ans.add(matrix[i][j]);
                }
            }
        }
        return ans;

        */


       int rowminmax=Integer.MIN_VALUE;
       int columnmaxmin=Integer.MAX_VALUE;
       int n=matrix.length;
       int m=matrix[0].length;
       for(int i=0;i<n;i++)
       {
        int mini=Integer.MAX_VALUE;
        for(int j=0;j<m;j++)
        {
         mini=Math.min(matrix[i][j],mini);
        }
        rowminmax=Math.max(rowminmax,mini);
       }
       for(int i=0;i<m;i++)
       {
       int maxi=Integer.MIN_VALUE;
        for(int j=0;j<n;j++)
        {
            maxi=Math.max(matrix[j][i],maxi);
        }
        columnmaxmin=Math.min(columnmaxmin,maxi);
       }
       ArrayList<Integer> ans=new ArrayList<>();

    if(rowminmax==columnmaxmin)
    {
 ans.add(rowminmax);
    }
    return ans;
    
    }
}