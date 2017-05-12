package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*
 *  Given nums = [2, 7, 11, 15], target = 9,
	Because nums[0] + nums[1] = 2 + 7 = 9,
	return [0, 1].
 */
public class problem1 {
    public static int[] twoSum(int[] numbers, int target) {        
        /*if(numbers.length>=2)
        {
            HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
            for(int i=0; i<numbers.length; i++){
                if(!h.isEmpty() && h.containsKey(target-numbers[i]))
                {
                    int[] k = {h.get(target-numbers[i])+1,i+1};
                    return k;
                }
                
                h.put(numbers[i],i);
            }
        }        
        int[] k = {-1,-1};
        return k;*/
    	int k[]=new int[2];
    	Map<Integer,Integer> data=new HashMap<Integer,Integer>();
    	long start=System.currentTimeMillis();
        for(int i=0;i<numbers.length;i++){
            if(!data.isEmpty() && data.containsKey(target-numbers[i])){
                k[0]=data.get(target-numbers[i]);
                k[1]=i;
                return k;
              
            }
            else
                data.put(numbers[i],i);
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);
        return k;
    }
}
