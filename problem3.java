package leetcode;

import java.util.ArrayList;
import java.util.HashMap;

//寻找最长子串，子串里没有重复的字母
public class problem3 {
	public static int getLongest(String s){
		int start=0;
		int end=0;
		int longest=0;
		HashMap<String,Integer> data=new HashMap<String,Integer>();
		while(end<s.length()){
			if(data.isEmpty() || !data.containsKey(s.substring(end, end+1))){
				data.put(s.substring(end, end+1), end);
				end++;
			}
			else{
				int longlin=end-start;
				if(longlin>longest){
					longest=longlin;
				}					
				int pos=data.get(s.substring(end, end+1));
				start=Math.max(pos+1,start);
				data.put(s.substring(end,end+1),end);
				end++;
			}
		}
		if(end-start>longest){
			longest=end-start;
		}
		return longest;
	}
}
