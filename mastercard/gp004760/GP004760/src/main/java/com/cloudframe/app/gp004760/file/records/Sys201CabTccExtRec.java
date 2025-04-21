package com.cloudframe.app.gp004760.file.records;

/**
*  The class Sys201CabTccExtRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:55. using version 5.0.0.256
**/


import com.cloudframe.app.gp004760.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys201CabTccExtRec extends Sys201CabTccExtRecSerialized {
   

						private char[] sys201CabTccExtRecString = Field.fillLowValue(256);
	
	/**
	* Constructor for Sys201CabTccExtRec
	**/
    public Sys201CabTccExtRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sys201CabTccExtRecString
	 *	@return sys201CabTccExtRecString
	 */
   public char[] getSys201CabTccExtRecString() throws CFException{
     if (isSys201CabTccExtRecStringModified()) { 
        sys201CabTccExtRecString = refreshSys201CabTccExtRecString();
     }
   		return sys201CabTccExtRecString;
   }

  
	/**
	*  set variable sys201CabTccExtRecString
	*  Corresponding COBOL Variable is SYS201-CAB-TCC-EXT-REC-STRING
	*  @param value
	**/
   public void setSys201CabTccExtRecString(char[] value) {
      sys201CabTccExtRecString = checkSys201CabTccExtRecStringConstraints(value);
      serializeSys201CabTccExtRecString(sys201CabTccExtRecString);
   } 

     /**
	 * 	Update Sys201CabTccExtRecString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys201CabTccExtRecString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys201CabTccExtRecString,sys201CabTccExtRecString.length);
   	
   }
   
   public void setSys201CabTccExtRecString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys201CabTccExtRecString,sys201CabTccExtRecString.length);
   	
   }
   
     /**
	 * 	Update Sys201CabTccExtRecString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys201CabTccExtRecString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys201CabTccExtRecString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys201CabTccExtRecString with another Field
	 *	@param value
	 */
   public void setSys201CabTccExtRecString(Field source) {
       replace(source,0,source.length(),beginSys201CabTccExtRecString,SYS_201_CAB_TCC_EXT_REC_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update Sys201CabTccExtRecString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys201CabTccExtRecString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys201CabTccExtRecString,SYS_201_CAB_TCC_EXT_REC_STRING_LEN);
   	
   }
   
     /**
	 * 	Update Sys201CabTccExtRecString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys201CabTccExtRecString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys201CabTccExtRecString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys201CabTccExtRecFieldLength() {
			return SYS_201_CAB_TCC_EXT_REC_LENGTH;
		}

}
  
