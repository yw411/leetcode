package leetcode;

public class problem38 {
	public static String countAndSay(int n) {
        String num=String.valueOf(1);
        String newn="";
        int start=0;
        int i=0;
        int l=0;
        for(int j=0;j<n-1;j++){
          newn="";
          start=0;
        for(i=0;i<num.length()-1;i++){
        	if(num.charAt(i)!=num.charAt(i+1)){
        		//0到i
        		l=i-start+1;
        		newn+=String.valueOf(l)+num.substring(i, i+1);
        		start=i+1;
        	}
        	else
        		continue;
        }
        //最后一个
        l=i-start+1;
        newn+=String.valueOf(l)+num.substring(i, i+1);
        num=newn;
        System.out.println(num);
        }
        return num;
    }
}
