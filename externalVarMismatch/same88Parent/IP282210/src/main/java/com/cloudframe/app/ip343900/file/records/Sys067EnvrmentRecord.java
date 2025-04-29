package com.cloudframe.app.ip343900.file.records;

/**
*  The class Sys067EnvrmentRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:33. using version 5.0.0.254
**/


import com.cloudframe.app.ip343900.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys067EnvrmentRecord extends Sys067EnvrmentRecordSerialized {
   

						private char[] sys067EnvrmentRecordString = Field.fillLowValue(80);
	
	/**
	* Constructor for Sys067EnvrmentRecord
	**/
    public Sys067EnvrmentRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sys067EnvrmentRecordString
	 *	@return sys067EnvrmentRecordString
	 */
   public char[] getSys067EnvrmentRecordString() throws CFException{
     if (isSys067EnvrmentRecordStringModified()) { 
        sys067EnvrmentRecordString = refreshSys067EnvrmentRecordString();
     }
   		return sys067EnvrmentRecordString;
   }

  
	/**
	*  set variable sys067EnvrmentRecordString
	*  Corresponding COBOL Variable is SYS067-ENVRMENT-RECORD-STRING
	*  @param value
	**/
   public void setSys067EnvrmentRecordString(char[] value) {
      sys067EnvrmentRecordString = checkSys067EnvrmentRecordStringConstraints(value);
      serializeSys067EnvrmentRecordString(sys067EnvrmentRecordString);
   } 

     /**
	 * 	Update Sys067EnvrmentRecordString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys067EnvrmentRecordString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys067EnvrmentRecordString,sys067EnvrmentRecordString.length);
   	
   }
   
   public void setSys067EnvrmentRecordString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys067EnvrmentRecordString,sys067EnvrmentRecordString.length);
   	
   }
   
     /**
	 * 	Update Sys067EnvrmentRecordString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys067EnvrmentRecordString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys067EnvrmentRecordString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys067EnvrmentRecordString with another Field
	 *	@param value
	 */
   public void setSys067EnvrmentRecordString(Field source) {
       replace(source,0,source.length(),beginSys067EnvrmentRecordString,SYS_067_ENVRMENT_RECORD_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update Sys067EnvrmentRecordString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys067EnvrmentRecordString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys067EnvrmentRecordString,SYS_067_ENVRMENT_RECORD_STRING_LEN);
   	
   }
   
     /**
	 * 	Update Sys067EnvrmentRecordString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys067EnvrmentRecordString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys067EnvrmentRecordString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys067EnvrmentRecordFieldLength() {
			return SYS_067_ENVRMENT_RECORD_LENGTH;
		}

}
  
