package com.cloudframe.app.sf320010.file.records;

/**
*  The class Sys203EmailFileOutRcd is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:08. using version 5.0.0.256
**/


import com.cloudframe.app.sf320010.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys203EmailFileOutRcd extends Sys203EmailFileOutRcdSerialized {
   

						private char[] sys203EmailFileOutRcdString = Field.fillLowValue(145);
	
	/**
	* Constructor for Sys203EmailFileOutRcd
	**/
    public Sys203EmailFileOutRcd() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sys203EmailFileOutRcdString
	 *	@return sys203EmailFileOutRcdString
	 */
   public char[] getSys203EmailFileOutRcdString() throws CFException{
     if (isSys203EmailFileOutRcdStringModified()) { 
        sys203EmailFileOutRcdString = refreshSys203EmailFileOutRcdString();
     }
   		return sys203EmailFileOutRcdString;
   }

  
	/**
	*  set variable sys203EmailFileOutRcdString
	*  Corresponding COBOL Variable is SYS203-EMAIL-FILE-OUT-RCD-STRING
	*  @param value
	**/
   public void setSys203EmailFileOutRcdString(char[] value) {
      sys203EmailFileOutRcdString = checkSys203EmailFileOutRcdStringConstraints(value);
      serializeSys203EmailFileOutRcdString(sys203EmailFileOutRcdString);
   } 

     /**
	 * 	Update Sys203EmailFileOutRcdString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys203EmailFileOutRcdString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys203EmailFileOutRcdString,sys203EmailFileOutRcdString.length);
   	
   }
   
   public void setSys203EmailFileOutRcdString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys203EmailFileOutRcdString,sys203EmailFileOutRcdString.length);
   	
   }
   
     /**
	 * 	Update Sys203EmailFileOutRcdString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys203EmailFileOutRcdString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys203EmailFileOutRcdString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys203EmailFileOutRcdString with another Field
	 *	@param value
	 */
   public void setSys203EmailFileOutRcdString(Field source) {
       replace(source,0,source.length(),beginSys203EmailFileOutRcdString,SYS_203_EMAIL_FILE_OUT_RCD_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update Sys203EmailFileOutRcdString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys203EmailFileOutRcdString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys203EmailFileOutRcdString,SYS_203_EMAIL_FILE_OUT_RCD_STRING_LEN);
   	
   }
   
     /**
	 * 	Update Sys203EmailFileOutRcdString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys203EmailFileOutRcdString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys203EmailFileOutRcdString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys203EmailFileOutRcdFieldLength() {
			return SYS_203_EMAIL_FILE_OUT_RCD_LENGTH;
		}

}
  
