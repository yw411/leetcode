package leetcode;

public class problem9 {
	public static boolean isHuiwen(int x){
		int yuan=x;
		long temp=0;
		while(true){
			int result=x%10;
			temp=temp*10+result;
			x=x/10;
			if(x==0)
				break;
		}
		if(temp==yuan)
			return true;
		else
			return false;
		
	}
}
