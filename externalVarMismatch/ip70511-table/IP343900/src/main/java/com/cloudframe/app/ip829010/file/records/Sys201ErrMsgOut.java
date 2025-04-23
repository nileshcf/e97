package com.cloudframe.app.ip829010.file.records;

/**
*  The class Sys201ErrMsgOut is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:07. using version 5.0.0.254
**/


import com.cloudframe.app.ip829010.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys201ErrMsgOut extends Sys201ErrMsgOutSerialized {
   

						private char[] sys201ErrMsgOutString = Field.fillLowValue(280);
	
	/**
	* Constructor for Sys201ErrMsgOut
	**/
    public Sys201ErrMsgOut() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sys201ErrMsgOutString
	 *	@return sys201ErrMsgOutString
	 */
   public char[] getSys201ErrMsgOutString() throws CFException{
     if (isSys201ErrMsgOutStringModified()) { 
        sys201ErrMsgOutString = refreshSys201ErrMsgOutString();
     }
   		return sys201ErrMsgOutString;
   }

  
	/**
	*  set variable sys201ErrMsgOutString
	*  Corresponding COBOL Variable is SYS201-ERR-MSG-OUT-STRING
	*  @param value
	**/
   public void setSys201ErrMsgOutString(char[] value) {
      sys201ErrMsgOutString = checkSys201ErrMsgOutStringConstraints(value);
      serializeSys201ErrMsgOutString(sys201ErrMsgOutString);
   } 

     /**
	 * 	Update Sys201ErrMsgOutString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys201ErrMsgOutString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys201ErrMsgOutString,sys201ErrMsgOutString.length);
   	
   }
   
   public void setSys201ErrMsgOutString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys201ErrMsgOutString,sys201ErrMsgOutString.length);
   	
   }
   
     /**
	 * 	Update Sys201ErrMsgOutString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys201ErrMsgOutString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys201ErrMsgOutString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys201ErrMsgOutString with another Field
	 *	@param value
	 */
   public void setSys201ErrMsgOutString(Field source) {
       replace(source,0,source.length(),beginSys201ErrMsgOutString,SYS_201_ERR_MSG_OUT_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update Sys201ErrMsgOutString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys201ErrMsgOutString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys201ErrMsgOutString,SYS_201_ERR_MSG_OUT_STRING_LEN);
   	
   }
   
     /**
	 * 	Update Sys201ErrMsgOutString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys201ErrMsgOutString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys201ErrMsgOutString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys201ErrMsgOutFieldLength() {
			return SYS_201_ERR_MSG_OUT_LENGTH;
		}

}
  
