
import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
                
        //Solution 1: 
        //1. make string into array
        //2. sort and compare if same then true. 
        //12 May 2025 - Runtime: 72ms , Memory: 54.93mb


        String[] sArray = s.split("");
        String[] tArray = t.split("");

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return(Arrays.equals(sArray, tArray));


        //Solution 2:
        // Can use Hash map then compare the numbers. 

  
    }
}