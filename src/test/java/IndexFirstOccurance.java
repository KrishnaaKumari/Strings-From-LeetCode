
public class IndexFirstOccurance {
	
	public static int strStr(String haystack, String needle) {
        // return haystack.indexOf(needle);

        int hlen=haystack.length();
        int nlen=needle.length();

        if(hlen<nlen) return -1 ;
        else
        for(int i=0 ; i<=hlen-nlen ; i++)
        {
            int j=0 ;
            while(j<nlen && haystack.charAt(i+j)==needle.charAt(j))
                j++;
            if(j==nlen)
                return i ;
        }
        return -1 ;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String haystack="sadbadsad";
		String needle="sad";
		System.out.println(strStr(haystack,needle));

	}

}
