package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360AAcqA15ApprovedCnt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class X360AAcqA15ApprovedCnt extends X360AAcqA15ApprovedCntSerialized { 
   

								private long x360AAcqA15ApprovedCntCr;

								private long x360AAcqA15ApprovedCntDb;
	
	/**
	* Constructor for X360AAcqA15ApprovedCnt
	**/
    public X360AAcqA15ApprovedCnt() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for X360AAcqA15ApprovedCnt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360AAcqA15ApprovedCnt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of x360AAcqA15ApprovedCntCr
	 *	@return x360AAcqA15ApprovedCntCr
	 */
	public long getX360AAcqA15ApprovedCntCr() throws CFException {
       if (isX360AAcqA15ApprovedCntCrModified()) { 
           x360AAcqA15ApprovedCntCr = refreshX360AAcqA15ApprovedCntCr();
        }
   		return x360AAcqA15ApprovedCntCr;
	}
	

	
	   
	/**
	 * 	Update X360AAcqA15ApprovedCntCr with the passed value
	 *  Corresponding COBOL Variable is X360-A-ACQ-A15-APPROVED-CNT-CR
	 *	@param number
	 */
	public void setX360AAcqA15ApprovedCntCr(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360AAcqA15ApprovedCntCr = checkX360AAcqA15ApprovedCntCrMaxLimit(number); 
		serializeX360AAcqA15ApprovedCntCr(x360AAcqA15ApprovedCntCr);
	}
	

	/**
	 * 	Update X360AAcqA15ApprovedCntCr with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360AAcqA15ApprovedCntCr(char[] value) throws CFException {
		 x360AAcqA15ApprovedCntCr = serializeX360AAcqA15ApprovedCntCr(value);
	}
	/**
	 * 	Update X360AAcqA15ApprovedCntCr with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360AAcqA15ApprovedCntCrString(char[] value) throws CFException {
		 setX360AAcqA15ApprovedCntCr(value);
	}
	/**
	 *	Returns the value of x360AAcqA15ApprovedCntDb
	 *	@return x360AAcqA15ApprovedCntDb
	 */
	public long getX360AAcqA15ApprovedCntDb() throws CFException {
       if (isX360AAcqA15ApprovedCntDbModified()) { 
           x360AAcqA15ApprovedCntDb = refreshX360AAcqA15ApprovedCntDb();
        }
   		return x360AAcqA15ApprovedCntDb;
	}
	

	
	   
	/**
	 * 	Update X360AAcqA15ApprovedCntDb with the passed value
	 *  Corresponding COBOL Variable is X360-A-ACQ-A15-APPROVED-CNT-DB
	 *	@param number
	 */
	public void setX360AAcqA15ApprovedCntDb(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360AAcqA15ApprovedCntDb = checkX360AAcqA15ApprovedCntDbMaxLimit(number); 
		serializeX360AAcqA15ApprovedCntDb(x360AAcqA15ApprovedCntDb);
	}
	

	/**
	 * 	Update X360AAcqA15ApprovedCntDb with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360AAcqA15ApprovedCntDb(char[] value) throws CFException {
		 x360AAcqA15ApprovedCntDb = serializeX360AAcqA15ApprovedCntDb(value);
	}
	/**
	 * 	Update X360AAcqA15ApprovedCntDb with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360AAcqA15ApprovedCntDbString(char[] value) throws CFException {
		 setX360AAcqA15ApprovedCntDb(value);
	}

	
	
	

		public static int getX360AAcqA15ApprovedCntFieldLength() {
			return X_360_AACQ_A_15_APPROVED_CNT_LENGTH;
		}

}
  
