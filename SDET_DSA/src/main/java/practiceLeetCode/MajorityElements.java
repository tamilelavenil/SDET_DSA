package practiceLeetCode;

import java.util.Arrays;

public class MajorityElements {

	public static void main(String[] args) {
				int[] nums = {3,2,3};
		        int curr = 0, maj =0, currele =0, maxele=0;
		        Arrays.sort(nums);
		        for(int i=1; i<nums.length; i++){
		            //currele = nums[i];
		            if(nums[i]==nums[i-1]){
		                curr++;
		            }
		            if(nums[i]!=nums[i-1]){
		                if(curr>maj){
		                    maj=curr;
		                    maxele=nums[i];
		                }
		            }
		            
		        }
		        System.out.println(maxele);
		        //return maxele;

	}

}
