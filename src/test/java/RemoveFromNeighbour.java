
public class RemoveFromNeighbour {
	
	public static boolean winnerOfGame(String colors) {
        int acount=0, bcount=0;
        for(int i=1 ; i<colors.length()-1 ; i++)
        {
            char curr=colors.charAt(i);
            char prev=colors.charAt(i-1);
            char next=colors.charAt(i+1);
            if(curr=='A' && next=='A'&& prev=='A')
                acount++ ;
            if(curr=='B'&& next=='B' && prev=='B')
                bcount++ ;
        }
        if(acount>bcount)
        return true ;
        else
        return false ;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="AAABABB";
		System.out.println(winnerOfGame(s));

	}

}
