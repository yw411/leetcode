package leetcode;

import java.util.HashMap;

public class problem12 {
	public void problem122(int num){
	//int to s
			String element[]={"I","V", "X", "L", "C", "D", "M"};
			int number[]=    {1 ,  5 ,  10 , 50 ,100, 500 ,1000};
			HashMap<Integer, String> map = new HashMap<Integer,String>();
			for(int i=0;i<number.length;i++){
				map.put(number[i],element[i]);
			}
			
			 
			String nums=String.valueOf(num);
			String result="";
			for(int i=0;i<nums.length();i++){
				char cur=nums.charAt(i);
				int curi=cur-'0';
				int j=nums.length()-1-i;
				
				if(cur=='4' || cur=='9'){
					int curr=(int) (Math.pow(10, j)*(curi+1));
					int curl=(int) (Math.pow(10, j));
					result+=map.get(curl)+map.get(curr);
				}
				else if(curi>5){
					int yu=curi%5;
					int curl=(int) (Math.pow(10, j)*5);
					int curr=(int) (Math.pow(10, j));
					result+=map.get(curl);
					for(int h=1;h<=yu;h++){
						result+=map.get(curr);
					}
				}
				else if(curi>0){
					int yu=curi%5;
					int curr=(int) (Math.pow(10, j));
					for(int h=1;h<=yu;h++){
						result+=map.get(curr);
					}
				}
				else
					continue;
			}
			System.out.println(result);
	}
}
