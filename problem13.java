package leetcode;

import java.util.HashMap;

public class problem13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * TODO Auto-generated method stub
		Given a roman numeral, convert it to an integer.
		Input is guaranteed to be within the range from 1 to 3999.
		基本字符	
        I V X L C D M
                     相应的阿拉伯数字表示为	
        1 5 10 50 100 500 1000
        
        1、 相同的数字连写、所表示的数等于这些数字相加得到的数、如：Ⅲ=3；
        2、小的数字在大的数字的右边、所表示的数等于这些数字相加得到的数、 如：Ⅷ=8、Ⅻ=12；
        3、小的数字（限于 I、X 和 C）在大的数字的左边、所表示的数等于大数减小数得到的数、如：Ⅳ=4、Ⅸ=9；
        4、正常使用时、连写的数字重复不得超过三次；
        5、在一个数的上面画一条横线、表示这个数扩大 1000 倍。
		*
		*/
		String s="CMXCIV";
		String element[]={"I","V", "X", "L", "C", "D", "M"};
		int number[]=    {1 ,  5 ,  10 , 50 ,100, 500 ,1000};
		HashMap<String , Integer> map = new HashMap<String ,Integer>();
		for(int i=0;i<number.length;i++){
			map.put(element[i], number[i]);
		}

		//分析s
		int sum=0;
		int j=0;
		int start=0;
		int cur=0;
		/*while(end<s.length()){
			String ends=s.substring(end,end+1);
			String endsnext=s.substring(end+1, end+2);
			if(map.get(ends)<map.get(endsnext)){
				
			}
		}*/
		while(cur<s.length()){
			if(cur==s.length()-1){
				j=start;
				while(j<s.length()){
					sum+=map.get(s.substring(j, j+1));
					j++;
				}
				//start-cur
				break;
			}
			else{
				String curs=s.substring(cur, cur+1);
				String cursnest=s.substring(cur+1, cur+2);
				if(map.get(curs)<map.get(cursnest)){
					//start-cur-1
					if(start<=cur-1){
						j=start;
						while(j<=cur-1){
							sum+=map.get(s.substring(j, j+1));
							j++;
						}
					}
					//curs-curs+1
					sum=sum+map.get(cursnest)-map.get(curs);
					start=cur+2;
					cur=start;
				}
				else{
					cur++;
				}
			}
			
		}
		System.out.println(sum);
		
		
		//另一种复杂度更低
		/*String s="CMIX";
		String element[]={"I","V", "X", "L", "C", "D", "M"};
		int number[]=    {1 ,  5 ,  10 , 50 ,100, 500 ,1000};
		HashMap<String , Integer> map = new HashMap<String ,Integer>();
		for(int i=0;i<number.length;i++){
			map.put(element[i], number[i]);
		}

		//分析s
		int sum=0;
		int j=0;
		int start=0;
		int cur=0;
		while(cur<s.length()){
			if(cur==s.length()-1){
				j=start;
				while(j<s.length()){
					sum+=map.get(s.substring(j, j+1));
					j++;
				}
				//start-cur
				break;
				sum=sum+map.get(s.substring(cur, cur+1));
				break;
			}
			else{
				String curs=s.substring(cur, cur+1);
				String cursnest=s.substring(cur+1, cur+2);
				if(map.get(curs)<map.get(cursnest)){
					//start-cur-1
					if(start<=cur-1){
						j=start;
						while(j<=cur-1){
							sum+=map.get(s.substring(j, j+1));
							j++;
						}
					}
					//curs-curs+1
					sum=sum+map.get(cursnest)-map.get(curs);
					start=cur+2;
					cur=start;
				}
				else{
					sum=sum+map.get(s.substring(cur, cur+1));
					cur++;
				}
			}
			
		}
		System.out.println(sum);*/
	}

}
