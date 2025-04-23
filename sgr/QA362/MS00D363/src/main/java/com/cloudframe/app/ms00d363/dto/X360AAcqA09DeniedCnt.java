package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360AAcqA09DeniedCnt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class X360AAcqA09DeniedCnt extends X360AAcqA09DeniedCntSerialized { 
   

								private int x360AAcqA09DeniedCntCr;

								private int x360AAcqA09DeniedCntDb;
	
	/**
	* Constructor for X360AAcqA09DeniedCnt
	**/
    public X360AAcqA09DeniedCnt() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for X360AAcqA09DeniedCnt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360AAcqA09DeniedCnt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	public int getX360AAcqA09DeniedCntCr() throws CFException {
        if (isX360AAcqA09DeniedCntCrModified()) { 
           x360AAcqA09DeniedCntCr = refreshX360AAcqA09DeniedCntCr();
        }
   		return x360AAcqA09DeniedCntCr;
	}
	
	/**
	 * 	Update X360AAcqA09DeniedCntCr with the passed value
	 *  Corresponding COBOL Variable is X360-A-ACQ-A09-DENIED-CNT-CR
	 *	@param number
	 */
	public void setX360AAcqA09DeniedCntCr(int number) {
			x360AAcqA09DeniedCntCr = checkX360AAcqA09DeniedCntCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AAcqA09DeniedCntCr(x360AAcqA09DeniedCntCr);
	}


	public void setX360AAcqA09DeniedCntCr(long number) {
	    number = checkX360AAcqA09DeniedCntCrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360AAcqA09DeniedCntCr((int)number);
	}
	
	public int getX360AAcqA09DeniedCntDb() throws CFException {
        if (isX360AAcqA09DeniedCntDbModified()) { 
           x360AAcqA09DeniedCntDb = refreshX360AAcqA09DeniedCntDb();
        }
   		return x360AAcqA09DeniedCntDb;
	}
	
	/**
	 * 	Update X360AAcqA09DeniedCntDb with the passed value
	 *  Corresponding COBOL Variable is X360-A-ACQ-A09-DENIED-CNT-DB
	 *	@param number
	 */
	public void setX360AAcqA09DeniedCntDb(int number) {
			x360AAcqA09DeniedCntDb = checkX360AAcqA09DeniedCntDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AAcqA09DeniedCntDb(x360AAcqA09DeniedCntDb);
	}


	public void setX360AAcqA09DeniedCntDb(long number) {
	    number = checkX360AAcqA09DeniedCntDbMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360AAcqA09DeniedCntDb((int)number);
	}
	

	
	
	

		public static int getX360AAcqA09DeniedCntFieldLength() {
			return X_360_AACQ_A_09_DENIED_CNT_LENGTH;
		}

}
  
