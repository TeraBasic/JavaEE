import java.util.ArrayList;

public class Solution {
	
	
	
	/**
	 * 3. Longest Substring Without Repeating Characters
	 * @param s
	 * @return
	 */
	public static int lengthOfLongestSubstring(String s) {
		ArrayList<Character> charList = new ArrayList<Character>();
		for(int i=0; i<s.length(); i++) {
			charList.add(s.charAt(i));
		}
		int maxLength = 0;
		for(int i=0; i<charList.size(); i++) {
			ArrayList<Character> temp = new ArrayList<Character>();
			temp.add(charList.get(i));
			for(int j=i+1; j<charList.size(); j++) {
				if(!temp.contains(charList.get(j))) {
					temp.add(charList.get(j));
				} else {
					break;
				}
			}
			if(maxLength < temp.size()) {
				maxLength = temp.size();
			}
		}
		return maxLength;
        
    }
	
	
	
	
	
	public static void main(String[] args) {
		// test 3
		System.out.println(Solution.lengthOfLongestSubstring("Hellohelel"));
		
		
		
	}

}
