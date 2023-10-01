
public class ReverseWordWise {
	
	public static String reverseWords(String s) {
        String str="";
        String ans="";
        s=s+" ";
        for(int i=0 ; i<s.length() ; i++)
        {
            if(s.charAt(i)==' ')
            {
                ans=ans+str+" " ;
                str="";
            }
            else
            {
                str=s.charAt(i)+str ;
            }
                
        }
        ans=ans.substring(0,ans.length()-1);
        return ans ;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Krishnaa kumari sahoo";
		System.out.println(reverseWords(str));
	}

}
