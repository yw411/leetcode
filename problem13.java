package leetcode;

import java.util.HashMap;

public class problem13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * TODO Auto-generated method stub
		Given a roman numeral, convert it to an integer.
		Input is guaranteed to be within the range from 1 to 3999.
		�����ַ�	
        I V X L C D M
                     ��Ӧ�İ��������ֱ�ʾΪ	
        1 5 10 50 100 500 1000
        
        1�� ��ͬ��������д������ʾ����������Щ������ӵõ��������磺��=3��
        2��С�������ڴ�����ֵ��ұߡ�����ʾ����������Щ������ӵõ������� �磺��=8����=12��
        3��С�����֣����� I��X �� C���ڴ�����ֵ���ߡ�����ʾ�������ڴ�����С���õ��������磺��=4����=9��
        4������ʹ��ʱ����д�������ظ����ó������Σ�
        5����һ���������滭һ�����ߡ���ʾ��������� 1000 ����
		*
		*/
		String s="CMXCIV";
		String element[]={"I","V", "X", "L", "C", "D", "M"};
		int number[]=    {1 ,  5 ,  10 , 50 ,100, 500 ,1000};
		HashMap<String , Integer> map = new HashMap<String ,Integer>();
		for(int i=0;i<number.length;i++){
			map.put(element[i], number[i]);
		}

		//����s
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
		
		
		//��һ�ָ��Ӷȸ���
		/*String s="CMIX";
		String element[]={"I","V", "X", "L", "C", "D", "M"};
		int number[]=    {1 ,  5 ,  10 , 50 ,100, 500 ,1000};
		HashMap<String , Integer> map = new HashMap<String ,Integer>();
		for(int i=0;i<number.length;i++){
			map.put(element[i], number[i]);
		}

		//����s
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
