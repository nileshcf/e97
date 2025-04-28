package com.cloudframe.app.usbaeext.file.records;

/**
*  The class TmRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:04. using version 5.0.0.256
**/


import com.cloudframe.app.usbaeext.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class TmRecord extends TmRecordSerialized { 
   

						private char[] tmRecordString = Field.fillLowValue(3996);
	
	/**
	* Constructor for TmRecord
	**/
    public TmRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of tmRecordString
	 *	@return tmRecordString
	 */
   public char[] getTmRecordString() throws CFException{
     if (isTmRecordStringModified()) { 
        tmRecordString = refreshTmRecordString();
     }
   		return tmRecordString;
   }

  
	/**
	*  set variable tmRecordString
	*  Corresponding COBOL Variable is TM-RECORD-STRING
	*  @param value
	**/
   public void setTmRecordString(char[] value) {
      tmRecordString = checkTmRecordStringConstraints(value);
      serializeTmRecordString(tmRecordString);
   } 

     /**
	 * 	Update TmRecordString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTmRecordString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTmRecordString,tmRecordString.length);
   	
   }
   
   public void setTmRecordString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTmRecordString,tmRecordString.length);
   	
   }
   
     /**
	 * 	Update TmRecordString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTmRecordString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTmRecordString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TmRecordString with another Field
	 *	@param value
	 */
   public void setTmRecordString(Field source) {
       replace(source,0,source.length(),beginTmRecordString,TM_RECORD_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update TmRecordString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTmRecordString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTmRecordString,TM_RECORD_STRING_LEN);
   	
   }
   
     /**
	 * 	Update TmRecordString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTmRecordString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTmRecordString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getTmRecordFieldLength() {
			return TM_RECORD_LENGTH;
		}

}
  
