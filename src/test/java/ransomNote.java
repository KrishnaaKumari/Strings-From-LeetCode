import java.util.* ;
public class ransomNote {
	
	public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        for(int i=0 ; i<magazine.length() ; i++)
        {
            if(!hm.containsKey(magazine.charAt(i)))
            {
                hm.put(magazine.charAt(i),1);
            }
            else{
                int c=hm.get(magazine.charAt(i));
                hm.put(magazine.charAt(i),c+1);
            }
        }

        for(int i=0 ; i<ransomNote.length() ; i++)
        {
            if(hm.containsKey(ransomNote.charAt(i)))
            {
                int c = hm.get(ransomNote.charAt(i));
                if(c==1)
                hm.remove(ransomNote.charAt(i));
                else
                hm.put(ransomNote.charAt(i),c-1);
            }
            else{
                return false ;
            }
        }
        return true ;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
