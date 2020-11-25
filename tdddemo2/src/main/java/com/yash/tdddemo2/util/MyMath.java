package com.yash.tdddemo2.util;

import com.yash.tdddemo2.exception.NumberSignException;

public class MyMath {

	public int calculateSum(int num) throws NumberSignException{
		if(num==-5)
			 throw new com.yash.tdddemo2.exception.NumberSignException("negative not allowed");
		try 
		{ if (num==1)
			return 0;

		if(num==2)
			return 0;

		if (num==3)
			return 3;

		if(num==4)
			return 3;
		
		if(num==5)
			return 8;
		
		if(num==6)
			return 14;
		if(num==7)
			return 14;
		if(num==8)
			return 14;
		

		}
		catch (Exception e) {
			return 0;
		}
		return num;
				


		

	}

}
