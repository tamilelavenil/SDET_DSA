package mandatoryHomework.week6;

import org.junit.Assert;
import org.junit.Test;
import java.util.*;

public class Two_Sum {
	
//	@Test    
//    public void sumEqualsTarget(){
//    	 int [] nums = {3,3};
//         int target = 6;
//         int[] outArr = new int[2];
//        
//        for(int i=0; i<nums.length; i++){
//            for(int j=1; j<nums.length; j++){
//                if(i!=j && nums[i]+nums[j]==target){
//                    outArr[0] = i;
//                    outArr[1] = j;
//                    break;  
//                }   
//            }
//        }
//      // System.out.println(Arrays.toString(outArr));   
//    }
	
	@Test
	public void sumOfIndices() {
//		Input: nums = [2,7,11,15], target = 9
//				Output: [0,1]
		 int [] nums = {2,7,11,15};
         int target = 9;
         int[] outArr = new int[2];
         int left = 0, right = nums.length-1;
         while(left<right) {
        	 if(nums[left]+nums[right]>target) {
        		 right--;
        	 }
        	 else if(nums[left]+nums[right]<target) {
        		 left++;
        	 }
        	 else {
        		 outArr[0]=  left;
        		 outArr[1] = right;
        		 break;
        	 }
        	 
         }
         
         System.out.println(Arrays.toString(outArr));   
		
	}
}
