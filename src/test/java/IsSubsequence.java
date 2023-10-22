
public class IsSubsequence {
	
	public static boolean isSubsequence(String s, String t) {
        int i=0, j=0 ;
        while(i<t.length()&&j<s.length())
        {
            if(s.charAt(j)==t.charAt(i))
            {
                i++ ; j++  ;
            }
            else{
                i++ ;
            }
        }
        if(j==s.length())
        return true ;

        return false ;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="axc";
		String t="ahbgdc";			
		boolean bool=isSubsequence(s,t);
		System.out.println(bool);
	}

}
