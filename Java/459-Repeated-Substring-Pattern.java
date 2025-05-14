//8 May 2025 - Runtime: nil , Memory: nil (Unable to solve it without help);


//First Try
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        //Check for how many time it can be folded
        int max = Math.round(s.length()/2);
        boolean check = false;

        for(int i=1; i <= max; i++)
        {
            String currentText = s.substring(0,i);
            //cannot use contains as it is not accurate in certain instance. 
            if(s.contains(currentText))
            {
                check = true;
            }

        }

        return check;
    }
} 

// Second try. 
//Learning outcome, cannot use contains as it only works partially not all cases. 
class Solution {
    public boolean repeatedSubstringPattern(String s) {

        boolean check = false;
        int total = s.length();
        int count = 0;


       if(total % 2 == 0)
       {
        for(int i=0; i < total; i++)
        {
            if (i % 2 == 0) {
                String current = s.substring(0, i);
                String compare = s.substring(i,total);
                System.out.println(current);
                System.out.println(compare);
                if(compare.contains(current)){
                    count++;
                }

            }

        }
        }
            if(count > 0) check = true;

            return check;

     
    }
} 

