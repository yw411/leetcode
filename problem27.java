package leetcode;
/*
* ����ָ�룬ͷ��β�����Ͻ��и���
*/
public class problem27 {
	public static int removeElement(int[] nums, int val) {
		int end=nums.length-1;
        if(nums.length==0){
        	return 0;
        }
        else{
        	for(int i=0;i<=end;i++){
        		if(nums[i]==val){  //��end����,��i��endǰ��
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
