//8 May 2025 - Runtime: nil , Memory: nil (Unable to solve it without help);
class Solution {
    public char findTheDifference(String s, String t) {

    // This answer does not work with duplicated characters.  
    //    for(int i=0; i<t.length(); i++)
    //         {
    //             char current = t.charAt(i);
    //             if(!(s.contains(String.valueOf(current))))
    //             {
    //                 return(current);
    //             }
    //         }

    //Learning point:
    //1. use hash map and get difference in count of the character. 
    //2. use XOR. 


    //XOR: will only work with there is 1 character different. 
    char answer = 0;

    for(int i=0; i < s.length();i++)
    {
        answer ^= s.charAt(i);
    }

    for(int x=0; x < t.length(); x++)
    {
        answer ^=t.charAt(x);
    }

    return(answer);




    }

}