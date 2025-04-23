package com.cloudframe.app.vsammon4.dto;

/**
*  The class InsallData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:01. using version 5.0.0.254
**/


import com.cloudframe.app.vsammon4.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class InsallData extends InsallDataSerialized { 
   

								private long iInsertCnt;
	
	/**
	* Constructor for InsallData
	**/
    public InsallData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for InsallData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public InsallData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of iInsertCnt
	 *	@return iInsertCnt
	 */
	public long getIInsertCnt() throws CFException {
       if (isIInsertCntModified()) { 
           iInsertCnt = refreshIInsertCnt();
        }
   		return iInsertCnt;
	}
	

	
	   
	/**
	 * 	Update IInsertCnt with the passed value
	 *  Corresponding COBOL Variable is WS-I-INSERT-CNT
	 *	@param number
	 */
	public void setIInsertCnt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    iInsertCnt = checkIInsertCntMaxLimit(number); 
		serializeIInsertCnt(iInsertCnt);
	}
	

	/**
	 * 	Update IInsertCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setIInsertCnt(char[] value) throws CFException {
		 iInsertCnt = serializeIInsertCnt(value);
	}
	/**
	 * 	Update IInsertCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIInsertCntString(char[] value) throws CFException {
		 setIInsertCnt(value);
	}

	
	
	

		public static int getInsallDataFieldLength() {
			return INSALL_DATA_LENGTH;
		}

}
  
