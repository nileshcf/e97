package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360AIssA15ApprovedCnt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:35. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class X360AIssA15ApprovedCnt extends X360AIssA15ApprovedCntSerialized { 
   

								private long x360AIssA15ApprovedCntCr;

								private long x360AIssA15ApprovedCntDb;
	
	/**
	* Constructor for X360AIssA15ApprovedCnt
	**/
    public X360AIssA15ApprovedCnt() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for X360AIssA15ApprovedCnt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360AIssA15ApprovedCnt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of x360AIssA15ApprovedCntCr
	 *	@return x360AIssA15ApprovedCntCr
	 */
	public long getX360AIssA15ApprovedCntCr() throws CFException {
       if (isX360AIssA15ApprovedCntCrModified()) { 
           x360AIssA15ApprovedCntCr = refreshX360AIssA15ApprovedCntCr();
        }
   		return x360AIssA15ApprovedCntCr;
	}
	

	
	   
	/**
	 * 	Update X360AIssA15ApprovedCntCr with the passed value
	 *  Corresponding COBOL Variable is X360-A-ISS-A15-APPROVED-CNT-CR
	 *	@param number
	 */
	public void setX360AIssA15ApprovedCntCr(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360AIssA15ApprovedCntCr = checkX360AIssA15ApprovedCntCrMaxLimit(number); 
		serializeX360AIssA15ApprovedCntCr(x360AIssA15ApprovedCntCr);
	}
	

	/**
	 * 	Update X360AIssA15ApprovedCntCr with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360AIssA15ApprovedCntCr(char[] value) throws CFException {
		 x360AIssA15ApprovedCntCr = serializeX360AIssA15ApprovedCntCr(value);
	}
	/**
	 * 	Update X360AIssA15ApprovedCntCr with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360AIssA15ApprovedCntCrString(char[] value) throws CFException {
		 setX360AIssA15ApprovedCntCr(value);
	}
	/**
	 *	Returns the value of x360AIssA15ApprovedCntDb
	 *	@return x360AIssA15ApprovedCntDb
	 */
	public long getX360AIssA15ApprovedCntDb() throws CFException {
       if (isX360AIssA15ApprovedCntDbModified()) { 
           x360AIssA15ApprovedCntDb = refreshX360AIssA15ApprovedCntDb();
        }
   		return x360AIssA15ApprovedCntDb;
	}
	

	
	   
	/**
	 * 	Update X360AIssA15ApprovedCntDb with the passed value
	 *  Corresponding COBOL Variable is X360-A-ISS-A15-APPROVED-CNT-DB
	 *	@param number
	 */
	public void setX360AIssA15ApprovedCntDb(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360AIssA15ApprovedCntDb = checkX360AIssA15ApprovedCntDbMaxLimit(number); 
		serializeX360AIssA15ApprovedCntDb(x360AIssA15ApprovedCntDb);
	}
	

	/**
	 * 	Update X360AIssA15ApprovedCntDb with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360AIssA15ApprovedCntDb(char[] value) throws CFException {
		 x360AIssA15ApprovedCntDb = serializeX360AIssA15ApprovedCntDb(value);
	}
	/**
	 * 	Update X360AIssA15ApprovedCntDb with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360AIssA15ApprovedCntDbString(char[] value) throws CFException {
		 setX360AIssA15ApprovedCntDb(value);
	}

	
	
	

		public static int getX360AIssA15ApprovedCntFieldLength() {
			return X_360_AISS_A_15_APPROVED_CNT_LENGTH;
		}

}
  
