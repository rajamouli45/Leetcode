class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        List<Integer> res= new ArrayList<>();
        int top=0,left=0,right=n-1,bottom=m-1;
        while(top<= bottom && left<=right){
            for(int j=left;j<=right;j++)
                res.add(matrix[top][j]);
            top++;

            
            for(int j=top;j<=bottom;j++)
                res.add(matrix[j][right]);
            right--;
            
            if(top<=bottom){
                for(int j=right;j>=left;j--)
                    res.add(matrix[bottom][j]);
                bottom--;
            }

            if(left<=right){
                for(int j=bottom;j>=top;j--)
                    res.add(matrix[j][left]);
                left++;
            }
        }
        return res;
    }
}