package com.cloudframe.app.ip989010.file.records;

/**
*  The class Sys004TagData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:34. using version 5.0.0.254
**/


import com.cloudframe.app.ip989010.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys004TagData extends Sys004TagDataSerialized { 
   

								private int sys004TagLen;

						private char[] sys004TagValue = Field.fillLowValue(57);
	
	/**
	* Constructor for Sys004TagData
	**/
    public Sys004TagData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sys004TagData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sys004TagData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sys004TagLen
	 *	@return sys004TagLen
	 */
	public int getSys004TagLen() throws CFException {
       if (isSys004TagLenModified()) { 
           sys004TagLen = refreshSys004TagLen();
        }
   		return sys004TagLen;
	}
	

	
	   
	/**
	 * 	Update Sys004TagLen with the passed value
	 *  Corresponding COBOL Variable is SYS004-TAG-LEN
	 *	@param number
	 */
	public void setSys004TagLen(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    sys004TagLen = checkSys004TagLenMaxLimit(number); 
		serializeSys004TagLen(sys004TagLen);
	}
	

	public void setSys004TagLen(long number) {
	    number = checkSys004TagLenMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSys004TagLen((int)number);
	}
	
	/**
	 * 	Update Sys004TagLen with the passed value
	 *	@param value (String or char[])
	 */
	public void setSys004TagLen(char[] value) throws CFException {
		 sys004TagLen = serializeSys004TagLen(value);
	}
	/**
	 * 	Update Sys004TagLen with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSys004TagLenString(char[] value) throws CFException {
		 setSys004TagLen(value);
	}
	/**
	 *	Returns the value of sys004TagValue
	 *	@return sys004TagValue
	 */
   public char[] getSys004TagValue() throws CFException{
     if (isSys004TagValueModified()) { 
        sys004TagValue = refreshSys004TagValue();
     }
   		return sys004TagValue;
   }

  
	/**
	*  set variable sys004TagValue
	*  Corresponding COBOL Variable is SYS004-TAG-VALUE
	*  @param value
	**/
   public void setSys004TagValue(char[] value) {
      sys004TagValue = checkSys004TagValueConstraints(value);
      serializeSys004TagValue(sys004TagValue);
   } 

     /**
	 * 	Update Sys004TagValue 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys004TagValue(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys004TagValue,sys004TagValue.length);
   	
   }
   
   public void setSys004TagValue(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys004TagValue,sys004TagValue.length);
   	
   }
   
     /**
	 * 	Update Sys004TagValue 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys004TagValue(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys004TagValue+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys004TagValue with another Field
	 *	@param value
	 */
   public void setSys004TagValue(Field source) {
       replace(source,0,source.length(),beginSys004TagValue,SYS_004_TAG_VALUE_LEN);
   	
   }  
   
     /**
	 * 	Update Sys004TagValue 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys004TagValue(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys004TagValue,SYS_004_TAG_VALUE_LEN);
   	
   }
   
     /**
	 * 	Update Sys004TagValue 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys004TagValue(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys004TagValue+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys004TagDataFieldLength() {
			return SYS_004_TAG_DATA_LENGTH;
		}

}
  
