package leetcode;

public class problem35 {
	public static int searchInsert(int[] nums, int target) {
		/*int i=0;
        for(i=0;i<nums.length;i++){
        	if(nums[i]==target){
        		return i;
        	}
        	else if(nums[i]>target){
        		return i;
        	}
        	else
        		continue;
        }
        return nums.length;*/
		
		//¶þ²æÊ÷·½·¨
		int low=0;
		int high=nums.length-1;
		int mid=0;
		while(low<=high){
			mid=(low+high)/2;
			if(nums[mid]==target)
				return mid;
			else if(nums[mid]<target)
				low=mid+1;
			else
				high=mid-1;
		}
		return high+1;
    }
}
