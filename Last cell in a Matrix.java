

//User function Template for Java

class Solution{
    static int [] endPoints(int [][]arr, int m, int n){
        //code here
        int i=0,j=0;
        
        //+1=up -1=down +2=right -2=left
        
        int direction=2;
        for(int t=0;t<m*n;t++){
            
            if(arr[i][j]==1){
                arr[i][j]=0;
                if(direction==1) direction=2;
                else if(direction==2) direction=-1;
                else if(direction==-1) direction=-2;
                else direction=1;
            }
            
            int[] temp = move(i,j,direction);
            i=temp[0];
            j=temp[1];
            
            if(!inrange(i,j,m,n))break;
        }
        
        if(i<0)
            i=0;
        else if(i>=m) 
            i=m-1;
        else if(j<0) 
            j=0;
        else if(j>=n) 
            j=n-1;
        return new int[]{i,j};
    }
    
    static int[] move(int i,int j,int direction){
        if(direction==2)
            j++;
        if(direction==-2)
            j--;
        if(direction==1) 
            i--;
        if(direction==-1)
            i++;
        return  new int[]{i,j};
    }
    
    static boolean inrange(int i,int j,int m,int n){
        if(i<0 || i>=m || j<0 || j>=n) return false;
        return true;
    }
}
