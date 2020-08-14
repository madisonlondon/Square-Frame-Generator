import java.io.*;
import java.util.*;

public class Solution {
    public static String[] squareFrameGenerator(int n) {
        String[] foo = new String[n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == 0 || j == 0) {
                    foo[i] += '*'; // We want * printed if it is in the first row or first column
                }
                else if(i == n - 1 || j == n - 1) {
                    foo[j] += '*'; // We want * printed if it is in the last row or last column
                }
                else { 
                    foo[i] += ' '; // These are the values in the middle of our edges
                }
            }
        }
        for(int i = 0; i < n; i++) {
            foo[i] = foo[i].substring(4); // Getting rid of null values stored in string from initialization 
        }
        return foo; 
    }

    public static void main(String []args) {
        Scanner s = new Scanner(System.in); 
        int n = Integer.parseInt(s.next()); 
        Solution foo = new Solution(); 
        String [] response = foo.squareFrameGenerator(n);
        for(int i = 0; i < response.length; i++) {
            System.out.println(response[i]);
        }
     }
}