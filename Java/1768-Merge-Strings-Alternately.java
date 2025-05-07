//Solved on 7 May 2025 - Runtime: 5ms , Memory: 43.07mb
//Learning points, there is no need to use Array for this, could have use something else. 
class Solution {
    public String mergeAlternately(String word1, String word2) {

         String[] word1Array = word1.split("");
         String[] word2Array = word2.split("");
         String Final="";

        if(word1.length() == word2.length())
        {
            for(int i=0; i < word1.length(); i++)
            {
                String currentText = word1Array[i]+word2Array[i];
                Final = Final.concat(currentText);
            }

            return(Final);
        }
        else{
            // This was the deciding factor that makes it work for all in the end code is too long.
            int difference =   Math.min(word1.length(), word2.length());

            for(int i=0; i < difference; i++)
            {
                String currentText = word1Array[i].concat(word2Array[i]);
                Final = Final.concat(currentText);
            }

            if(word1.length() > word2.length())
            {
            Final = Final.concat(word1.substring(difference));
            }
              if(word1.length() < word2.length())
            {
            Final = Final.concat(word2.substring(difference));
            }

            return(Final);
        }
    }
}