package leetcode;
/*
* 两个指针，头和尾，不断进行更新
*/
public class problem27 {
	public static int removeElement(int[] nums, int val) {
		int end=nums.length-1;
        if(nums.length==0){
        	return 0;
        }
        else{
        	for(int i=0;i<=end;i++){
        		if(nums[i]==val){  //和end交换,若i在end前面
        			while(nums[end]==val && i<end){
        				end--;
        				if(end==-1){
        					return 0;
        				}
        			}
        			int temp=nums[i];
        			nums[i]=nums[end];
        			nums[end]=temp;
        			end--;
        		}
        	}
        	return end+1;
        }
    }
}
