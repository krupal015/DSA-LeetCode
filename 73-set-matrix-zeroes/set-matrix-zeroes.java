class Solution {
    public void setZeroes(int[][] matrix ) {
        int ele0 = 1;
        int m= matrix.length;
        int n = matrix[0].length;

        for(int i = 0;i<m;i++){ // for column
            for(int j = 0 ;j<n;j++){ // for row
               if(matrix[i][j] == 0){
                matrix[i][0] =0;

                if(j!=0){
                    matrix[0][j] = 0;
                }else{
                    ele0 =0;
                }

               }
            }
        }

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j] != 0){
                   if(matrix[i][0] ==0 || matrix[0][j] ==0){
                    matrix[i][j] =0;
                   }
                }
            }
        }

        if( matrix[0][0] == 0){
            for(int j =0;j<n;j++){
                matrix[0][j] =0;
            }
        }
          if( ele0 == 0){
            for(int i =0;i<m;i++){
                matrix[i][0] =0;
            }
        }
        
    }
}