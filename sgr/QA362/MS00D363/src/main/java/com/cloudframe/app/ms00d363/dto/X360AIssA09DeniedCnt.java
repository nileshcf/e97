package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360AIssA09DeniedCnt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class X360AIssA09DeniedCnt extends X360AIssA09DeniedCntSerialized { 
   

								private int x360AIssA09DeniedCntCr;

								private int x360AIssA09DeniedCntDb;
	
	/**
	* Constructor for X360AIssA09DeniedCnt
	**/
    public X360AIssA09DeniedCnt() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for X360AIssA09DeniedCnt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360AIssA09DeniedCnt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	public int getX360AIssA09DeniedCntCr() throws CFException {
        if (isX360AIssA09DeniedCntCrModified()) { 
           x360AIssA09DeniedCntCr = refreshX360AIssA09DeniedCntCr();
        }
   		return x360AIssA09DeniedCntCr;
	}
	
	/**
	 * 	Update X360AIssA09DeniedCntCr with the passed value
	 *  Corresponding COBOL Variable is X360-A-ISS-A09-DENIED-CNT-CR
	 *	@param number
	 */
	public void setX360AIssA09DeniedCntCr(int number) {
			x360AIssA09DeniedCntCr = checkX360AIssA09DeniedCntCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AIssA09DeniedCntCr(x360AIssA09DeniedCntCr);
	}


	public void setX360AIssA09DeniedCntCr(long number) {
	    number = checkX360AIssA09DeniedCntCrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360AIssA09DeniedCntCr((int)number);
	}
	
	public int getX360AIssA09DeniedCntDb() throws CFException {
        if (isX360AIssA09DeniedCntDbModified()) { 
           x360AIssA09DeniedCntDb = refreshX360AIssA09DeniedCntDb();
        }
   		return x360AIssA09DeniedCntDb;
	}
	
	/**
	 * 	Update X360AIssA09DeniedCntDb with the passed value
	 *  Corresponding COBOL Variable is X360-A-ISS-A09-DENIED-CNT-DB
	 *	@param number
	 */
	public void setX360AIssA09DeniedCntDb(int number) {
			x360AIssA09DeniedCntDb = checkX360AIssA09DeniedCntDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AIssA09DeniedCntDb(x360AIssA09DeniedCntDb);
	}


	public void setX360AIssA09DeniedCntDb(long number) {
	    number = checkX360AIssA09DeniedCntDbMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360AIssA09DeniedCntDb((int)number);
	}
	

	
	
	

		public static int getX360AIssA09DeniedCntFieldLength() {
			return X_360_AISS_A_09_DENIED_CNT_LENGTH;
		}

}
  
