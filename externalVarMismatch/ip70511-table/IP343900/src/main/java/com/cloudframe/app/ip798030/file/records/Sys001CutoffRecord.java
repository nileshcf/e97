package com.cloudframe.app.ip798030.file.records;

/**
*  The class Sys001CutoffRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/


import com.cloudframe.app.ip798030.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys001CutoffRecord extends Sys001CutoffRecordSerialized {
   

						private char[] sys001CutoffRecordString = Field.fillLowValue(182);
	
	/**
	* Constructor for Sys001CutoffRecord
	**/
    public Sys001CutoffRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sys001CutoffRecordString
	 *	@return sys001CutoffRecordString
	 */
   public char[] getSys001CutoffRecordString() throws CFException{
     if (isSys001CutoffRecordStringModified()) { 
        sys001CutoffRecordString = refreshSys001CutoffRecordString();
     }
   		return sys001CutoffRecordString;
   }

  
	/**
	*  set variable sys001CutoffRecordString
	*  Corresponding COBOL Variable is SYS001-CUTOFF-RECORD-STRING
	*  @param value
	**/
   public void setSys001CutoffRecordString(char[] value) {
      sys001CutoffRecordString = checkSys001CutoffRecordStringConstraints(value);
      serializeSys001CutoffRecordString(sys001CutoffRecordString);
   } 

     /**
	 * 	Update Sys001CutoffRecordString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001CutoffRecordString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys001CutoffRecordString,sys001CutoffRecordString.length);
   	
   }
   
   public void setSys001CutoffRecordString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys001CutoffRecordString,sys001CutoffRecordString.length);
   	
   }
   
     /**
	 * 	Update Sys001CutoffRecordString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001CutoffRecordString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001CutoffRecordString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys001CutoffRecordString with another Field
	 *	@param value
	 */
   public void setSys001CutoffRecordString(Field source) {
       replace(source,0,source.length(),beginSys001CutoffRecordString,SYS_001_CUTOFF_RECORD_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update Sys001CutoffRecordString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001CutoffRecordString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys001CutoffRecordString,SYS_001_CUTOFF_RECORD_STRING_LEN);
   	
   }
   
     /**
	 * 	Update Sys001CutoffRecordString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001CutoffRecordString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001CutoffRecordString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys001CutoffRecordFieldLength() {
			return SYS_001_CUTOFF_RECORD_LENGTH;
		}

}
  
