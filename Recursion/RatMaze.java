//Rat in a maze problem
class RatMaze{
    public static void main(String args[]){
        int n=4;
        int[][] matrix = {{1, 0, 0, 0},
                          {1, 1, 0, 1},
                          {1, 1, 0, 0},
                          {0, 1, 1, 1}};
                          findPath(n, matrix);
    }
    public static void findPath(int n, int[][] matrix){
        int[][] vis = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                vis[i][j]=0;
            }
        }
        solve(0,0,matrix,n,"",vis);
        //return ans
    }
    public static void solve(int i, int j, int[][] matrix, int n, String move, int[][] vis){
        if(i==n-1 && j==n-1){
            System.out.println(move+" ");
            return;
        }
        //DLRU
        //downward
        if(i+1 < n && vis[i+1][j]==0 && matrix[i+1][j]==1){
            vis[i][j]=1;
            solve(i+1, j, matrix, n, move+"D", vis);
            vis[i][j]=0;
        }
        //leftward
        if(j-1 >=0 && vis[i][j-1]==0 && matrix[i][j-1]==1){
            vis[i][j]=1;
            solve(i, j-1, matrix, n, move+"L", vis);
            vis[i][j]=0;
        }
        //rightward
        if(j+1 < n && vis[i][j+1]==0 && matrix[i][j+1]==1){
            vis[i][j]=1;
            solve(i, j+1, matrix, n, move+"R", vis);
            vis[i][j]=0;
        }
        //upward
        if(i-1>=0 && vis[i-1][j]==0 && matrix[i-1][j]==1){
            vis[i][j]=1;
            solve(i-1, j, matrix, n, move+"U", vis);
            vis[i][j]=0;
        }
        return;
    }
}