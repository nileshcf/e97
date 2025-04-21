package com.cloudframe.app.gp004760.file.records;

/**
*  The class Sys202NspkCabTccExtRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:01. using version 5.0.0.256
**/


import com.cloudframe.app.gp004760.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys202NspkCabTccExtRec extends Sys202NspkCabTccExtRecSerialized {
   

						private char[] sys202NspkCabTccExtRecString = Field.fillLowValue(10);
	
	/**
	* Constructor for Sys202NspkCabTccExtRec
	**/
    public Sys202NspkCabTccExtRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sys202NspkCabTccExtRecString
	 *	@return sys202NspkCabTccExtRecString
	 */
   public char[] getSys202NspkCabTccExtRecString() throws CFException{
     if (isSys202NspkCabTccExtRecStringModified()) { 
        sys202NspkCabTccExtRecString = refreshSys202NspkCabTccExtRecString();
     }
   		return sys202NspkCabTccExtRecString;
   }

  
	/**
	*  set variable sys202NspkCabTccExtRecString
	*  Corresponding COBOL Variable is SYS202-NSPK-CAB-TCC-EXT-REC-STRING
	*  @param value
	**/
   public void setSys202NspkCabTccExtRecString(char[] value) {
      sys202NspkCabTccExtRecString = checkSys202NspkCabTccExtRecStringConstraints(value);
      serializeSys202NspkCabTccExtRecString(sys202NspkCabTccExtRecString);
   } 

     /**
	 * 	Update Sys202NspkCabTccExtRecString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys202NspkCabTccExtRecString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys202NspkCabTccExtRecString,sys202NspkCabTccExtRecString.length);
   	
   }
   
   public void setSys202NspkCabTccExtRecString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys202NspkCabTccExtRecString,sys202NspkCabTccExtRecString.length);
   	
   }
   
     /**
	 * 	Update Sys202NspkCabTccExtRecString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys202NspkCabTccExtRecString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys202NspkCabTccExtRecString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys202NspkCabTccExtRecString with another Field
	 *	@param value
	 */
   public void setSys202NspkCabTccExtRecString(Field source) {
       replace(source,0,source.length(),beginSys202NspkCabTccExtRecString,SYS_202_NSPK_CAB_TCC_EXT_REC_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update Sys202NspkCabTccExtRecString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys202NspkCabTccExtRecString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys202NspkCabTccExtRecString,SYS_202_NSPK_CAB_TCC_EXT_REC_STRING_LEN);
   	
   }
   
     /**
	 * 	Update Sys202NspkCabTccExtRecString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys202NspkCabTccExtRecString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys202NspkCabTccExtRecString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys202NspkCabTccExtRecFieldLength() {
			return SYS_202_NSPK_CAB_TCC_EXT_REC_LENGTH;
		}

}
  
