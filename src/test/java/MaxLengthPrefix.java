/*
 * Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

 
 * 
 */

import java.util.*;
public class MaxLengthPrefix {
	
	public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s="";
        int n=strs.length ;
        String s1=strs[0];
        String s2=strs[n-1];
        for(int i=0 ; i<s1.length() && i<s2.length() ; i++)
        {
            if(s1.charAt(i)==s2.charAt(i))
                s=s+s1.charAt(i);
            else
                break ;
        }
        return s ;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]str= {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(str));

	}

}
