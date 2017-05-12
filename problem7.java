package leetcode;

public class problem7 {
	 public static int reverse(int x) {		
	        int result=0;
	        String re=new String();
	        String a=String.valueOf(x);
	        int len=a.length();
	        if(a.charAt(0)=='-'){
	        	for(int i=len-1;i>=1;i--){
	        		re+=a.charAt(i);
	        	}
	        	re='-'+re;
	        	
	        	String min=String.valueOf(Integer.MIN_VALUE);
	        	System.out.println(min.length());
	        	if(re.length()<min.length() || re.compareTo(min)<=0)
	        		result=Integer.parseInt(re);
	        	else
	        		result=0;
	        }
	        else{
	        	for(int i=len-1;i>=0;i--){
	        		re+=a.charAt(i);
	        	}
	        	System.out.println(re);
	        	String max=String.valueOf(Integer.MAX_VALUE);
	        	if(re.length()<max.length() || re.compareTo(max)<=0)
	        		result=Integer.parseInt(re);
	        	else
	        		result=0;
	        }	        
	        return result;
	}
}
