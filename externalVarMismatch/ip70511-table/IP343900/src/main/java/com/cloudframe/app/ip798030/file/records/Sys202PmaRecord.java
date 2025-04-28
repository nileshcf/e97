package com.cloudframe.app.ip798030.file.records;

/**
*  The class Sys202PmaRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/


import com.cloudframe.app.ip798030.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys202PmaRecord extends Sys202PmaRecordSerialized {
   

						private char[] sys202PmaRecordString = Field.fillLowValue(94);
	
	/**
	* Constructor for Sys202PmaRecord
	**/
    public Sys202PmaRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sys202PmaRecordString
	 *	@return sys202PmaRecordString
	 */
   public char[] getSys202PmaRecordString() throws CFException{
     if (isSys202PmaRecordStringModified()) { 
        sys202PmaRecordString = refreshSys202PmaRecordString();
     }
   		return sys202PmaRecordString;
   }

  
	/**
	*  set variable sys202PmaRecordString
	*  Corresponding COBOL Variable is SYS202-PMA-RECORD-STRING
	*  @param value
	**/
   public void setSys202PmaRecordString(char[] value) {
      sys202PmaRecordString = checkSys202PmaRecordStringConstraints(value);
      serializeSys202PmaRecordString(sys202PmaRecordString);
   } 

     /**
	 * 	Update Sys202PmaRecordString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys202PmaRecordString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys202PmaRecordString,sys202PmaRecordString.length);
   	
   }
   
   public void setSys202PmaRecordString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys202PmaRecordString,sys202PmaRecordString.length);
   	
   }
   
     /**
	 * 	Update Sys202PmaRecordString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys202PmaRecordString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys202PmaRecordString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys202PmaRecordString with another Field
	 *	@param value
	 */
   public void setSys202PmaRecordString(Field source) {
       replace(source,0,source.length(),beginSys202PmaRecordString,SYS_202_PMA_RECORD_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update Sys202PmaRecordString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys202PmaRecordString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys202PmaRecordString,SYS_202_PMA_RECORD_STRING_LEN);
   	
   }
   
     /**
	 * 	Update Sys202PmaRecordString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys202PmaRecordString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys202PmaRecordString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys202PmaRecordFieldLength() {
			return SYS_202_PMA_RECORD_LENGTH;
		}

}
  
