package com.revature.tier1;

public class SumOverArray {

	public static int IterateAndSum(int[] arr) {
		 int sum=0;
		 if(arr.equals(null)) {
			 return 0;
		 }
         for(int i =0; i<arr.length; i++){
             sum=sum+i;
         }
         return sum;
        
}
}
