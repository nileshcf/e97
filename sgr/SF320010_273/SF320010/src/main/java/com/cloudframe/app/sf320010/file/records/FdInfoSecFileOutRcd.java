package com.cloudframe.app.sf320010.file.records;

/**
*  The class FdInfoSecFileOutRcd is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:29. using version 5.0.0.257
**/


import com.cloudframe.app.sf320010.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FdInfoSecFileOutRcd extends FdInfoSecFileOutRcdSerialized {
   

						private char[] fdInfoSecFileOutRcdString = Field.fillLowValue(80);
	
	/**
	* Constructor for FdInfoSecFileOutRcd
	**/
    public FdInfoSecFileOutRcd() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of fdInfoSecFileOutRcdString
	 *	@return fdInfoSecFileOutRcdString
	 */
   public char[] getFdInfoSecFileOutRcdString() throws CFException{
     if (isFdInfoSecFileOutRcdStringModified()) { 
        fdInfoSecFileOutRcdString = refreshFdInfoSecFileOutRcdString();
     }
   		return fdInfoSecFileOutRcdString;
   }

  
	/**
	*  set variable fdInfoSecFileOutRcdString
	*  Corresponding COBOL Variable is FD-INFO-SEC-FILE-OUT-RCD-STRING
	*  @param value
	**/
   public void setFdInfoSecFileOutRcdString(char[] value) {
      fdInfoSecFileOutRcdString = checkFdInfoSecFileOutRcdStringConstraints(value);
      serializeFdInfoSecFileOutRcdString(fdInfoSecFileOutRcdString);
   } 

     /**
	 * 	Update FdInfoSecFileOutRcdString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFdInfoSecFileOutRcdString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFdInfoSecFileOutRcdString,fdInfoSecFileOutRcdString.length);
   	
   }
   
   public void setFdInfoSecFileOutRcdString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFdInfoSecFileOutRcdString,fdInfoSecFileOutRcdString.length);
   	
   }
   
     /**
	 * 	Update FdInfoSecFileOutRcdString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFdInfoSecFileOutRcdString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFdInfoSecFileOutRcdString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FdInfoSecFileOutRcdString with another Field
	 *	@param value
	 */
   public void setFdInfoSecFileOutRcdString(Field source) {
       replace(source,0,source.length(),beginFdInfoSecFileOutRcdString,FD_INFO_SEC_FILE_OUT_RCD_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update FdInfoSecFileOutRcdString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFdInfoSecFileOutRcdString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFdInfoSecFileOutRcdString,FD_INFO_SEC_FILE_OUT_RCD_STRING_LEN);
   	
   }
   
     /**
	 * 	Update FdInfoSecFileOutRcdString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFdInfoSecFileOutRcdString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFdInfoSecFileOutRcdString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getFdInfoSecFileOutRcdFieldLength() {
			return FD_INFO_SEC_FILE_OUT_RCD_LENGTH;
		}

}
  
