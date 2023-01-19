//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            int H = Integer.parseInt(S[0]);
            int M = Integer.parseInt(S[1]);

            Solution ob = new Solution();
            System.out.println(ob.getAngle(H,M));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int getAngle(int H , int M) {
        // code here
           float a = (float) Math.abs(6*(5*H-M) + 0.5*M);
       if (a > 180){
           return (int) (360- a);
       }
       return (int) a;
    }
    }