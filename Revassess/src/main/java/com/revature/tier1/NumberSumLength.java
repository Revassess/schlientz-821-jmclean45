package com.revature.tier1;

public class NumberSumLength {
	public static void main(String[] args) {
		System.out.println(checkNumberPowerLength(153));
	}

	public static boolean checkNumberPowerLength(long num) {
		int sum=0;
		String a = Long.toString(num);
		for(int i=0;i<a.length();i++) {
			int l=a.length();
			int b=(int) Math.pow(a.charAt(i),l);
			
			sum+=b;
		}
        if (sum==(int) num) {
    	  
    	  
    	  return true;
}else {
	return false;
}
	}
}
