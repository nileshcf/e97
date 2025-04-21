package com.cloudframe.app.mcissues.dto;

/**
*  The class DtlCntZ800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/


import com.cloudframe.app.mcissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DtlCntZ800 extends DtlCntZ800Serialized { 
   

								private long dtlCntZo800;
	
	/**
	* Constructor for DtlCntZ800
	**/
    public DtlCntZ800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for DtlCntZ800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DtlCntZ800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of dtlCntZo800
	 *	@return dtlCntZo800
	 */
	public long getDtlCntZo800() throws CFException {
       if (isDtlCntZo800Modified()) { 
           dtlCntZo800 = refreshDtlCntZo800();
        }
   		return dtlCntZo800;
	}
	

	
	   
	/**
	 * 	Update DtlCntZo800 with the passed value
	 *  Corresponding COBOL Variable is 800-DTL-CNT-ZO
	 *	@param number
	 */
	public void setDtlCntZo800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    dtlCntZo800 = checkDtlCntZo800MaxLimit(number); 
		serializeDtlCntZo800(dtlCntZo800);
	}
	

	/**
	 * 	Update DtlCntZo800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setDtlCntZo800(char[] value) throws CFException {
		 dtlCntZo800 = serializeDtlCntZo800(value);
	}
	/**
	 * 	Update DtlCntZo800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDtlCntZo800String(char[] value) throws CFException {
		 setDtlCntZo800(value);
	}

	
	
	

		public static int getDtlCntZ800FieldLength() {
			return DTL_CNT_Z_800_LENGTH;
		}

}
  
