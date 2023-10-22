/*
 * Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal
substring
consisting of non-space characters only.

 

Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.

Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.

Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.

 * 
 */
public class CountLengthLastWord {
	
	public static int lengthOfLastWord(String s) {
		//without trim
        int cnt=0 ;
        int flag=1 ;
        for(int i=s.length()-1;i>=0 ; i--)
        {
            if(s.charAt(i)==' ')
            {
                if(flag==1)
                 continue ;
                else 
                break ;
            }
            else{
                cnt++ ;
                flag=0 ;
            }
        }
        return cnt ;
        // with trim
        // s=s.trim();
        // int cnt=0 ;
        // for(int i=s.length()-1 ; i>=0 ; i--)
        // {
        //     if(s.charAt(i)!=' ')
        //     cnt++ ;
        //     else
        //     break ;
        // }
        // return cnt ;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="   fly me   to   the moon  ";
		System.out.println(lengthOfLastWord(s));

	}

}
