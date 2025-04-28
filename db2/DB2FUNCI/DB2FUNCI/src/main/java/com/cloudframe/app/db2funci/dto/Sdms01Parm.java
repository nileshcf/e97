package com.cloudframe.app.db2funci.dto;

/**
*  The class Sdms01Parm is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sdms01Parm extends Sdms01ParmSerialized {
   

								private short sdms01ParmLen;

						private char[] sdms01ParmData = Field.fillLowValue(7000);
	
	/**
	* Constructor for Sdms01Parm
	**/
    public Sdms01Parm() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sdms01ParmLen
	 *	@return sdms01ParmLen
	 */
	public short getSdms01ParmLen() throws CFException {
        if (isSdms01ParmLenModified()) { 
           sdms01ParmLen = refreshSdms01ParmLen();
        }
   		return sdms01ParmLen;
	}
	
	/**
	 * 	Update Sdms01ParmLen with the passed value
	 *  Corresponding COBOL Variable is SDMS01-PARM-LEN
	 *	@param number
	 */
	public void setSdms01ParmLen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    sdms01ParmLen = checkSdms01ParmLenMaxLimit(number); 
		serializeSdms01ParmLen(sdms01ParmLen);
	}

	public void setSdms01ParmLen(int number) {
	    number = checkSdms01ParmLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSdms01ParmLen((short)number);
	}
	public void setSdms01ParmLen(long number) {
	    number = checkSdms01ParmLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSdms01ParmLen((short)number);
	}
	

	/**
	 *	Returns the value of sdms01ParmData
	 *	@return sdms01ParmData
	 */
   public char[] getSdms01ParmData() throws CFException{
     if (isSdms01ParmDataModified()) { 
        sdms01ParmData = refreshSdms01ParmData();
     }
   		return sdms01ParmData;
   }

  
	/**
	*  set variable sdms01ParmData
	*  Corresponding COBOL Variable is SDMS01-PARM-DATA
	*  @param value
	**/
   public void setSdms01ParmData(char[] value) {
      sdms01ParmData = checkSdms01ParmDataConstraints(value);
      serializeSdms01ParmData(sdms01ParmData);
   } 

     /**
	 * 	Update Sdms01ParmData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSdms01ParmData(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSdms01ParmData,sdms01ParmData.length);
   	
   }
   
   public void setSdms01ParmData(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSdms01ParmData,sdms01ParmData.length);
   	
   }
   
     /**
	 * 	Update Sdms01ParmData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSdms01ParmData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSdms01ParmData+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sdms01ParmData with another Field
	 *	@param value
	 */
   public void setSdms01ParmData(Field source) {
       replace(source,0,source.length(),beginSdms01ParmData,SDMS_01_PARM_DATA_LEN);
   	
   }  
   
     /**
	 * 	Update Sdms01ParmData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSdms01ParmData(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSdms01ParmData,SDMS_01_PARM_DATA_LEN);
   	
   }
   
     /**
	 * 	Update Sdms01ParmData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSdms01ParmData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSdms01ParmData+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSdms01ParmFieldLength() {
			return SDMS_01_PARM_LENGTH;
		}

}
  
