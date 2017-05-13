package leetcode;

public class problem28 {
	public static int strStr(String haystack, String needle) {		
		int len=needle.length();
        for(int i=0;i<=haystack.length()-len;i++){
        	String linshi=haystack.substring(i, i+len);
        	if(linshi.equals(needle)){
        		return i;
        	}
        }
        return -1;
    }
}
