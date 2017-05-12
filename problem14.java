package leetcode;

public class problem14 {
	public static void main(String[] args){
		String strs[]={};
		String com;
		if(strs.length==1){
			com=strs[0];
		}
		else if(strs.length==0){
			com="[]";
		}
		else{
			com=strs[0];
			int i=1;
			for(i=1;i<strs.length;i++){
				int ll=Math.min(com.length(), strs[i].length());
				int j=0;
				for(j=0;j<ll;j++){
					if(com.charAt(j)==strs[i].charAt(j))
						continue;
					else
						break;
				}
				if(j==0){
					com="[]";
					break;
				}
				else{
					com=strs[i].substring(0, j);
				}
			}
			
			
		}
		System.out.println(com);
	}
}
