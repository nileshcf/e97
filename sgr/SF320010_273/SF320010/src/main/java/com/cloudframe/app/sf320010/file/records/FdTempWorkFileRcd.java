package com.cloudframe.app.sf320010.file.records;

/**
*  The class FdTempWorkFileRcd is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:37. using version 5.0.0.254
**/


import com.cloudframe.app.sf320010.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FdTempWorkFileRcd extends FdTempWorkFileRcdSerialized {
   

						private char[] fdTempWorkFileRcdString = Field.fillLowValue(397);
	
	/**
	* Constructor for FdTempWorkFileRcd
	**/
    public FdTempWorkFileRcd() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of fdTempWorkFileRcdString
	 *	@return fdTempWorkFileRcdString
	 */
   public char[] getFdTempWorkFileRcdString() throws CFException{
     if (isFdTempWorkFileRcdStringModified()) { 
        fdTempWorkFileRcdString = refreshFdTempWorkFileRcdString();
     }
   		return fdTempWorkFileRcdString;
   }

  
	/**
	*  set variable fdTempWorkFileRcdString
	*  Corresponding COBOL Variable is FD-TEMP-WORK-FILE-RCD-STRING
	*  @param value
	**/
   public void setFdTempWorkFileRcdString(char[] value) {
      fdTempWorkFileRcdString = checkFdTempWorkFileRcdStringConstraints(value);
      serializeFdTempWorkFileRcdString(fdTempWorkFileRcdString);
   } 

     /**
	 * 	Update FdTempWorkFileRcdString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFdTempWorkFileRcdString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFdTempWorkFileRcdString,fdTempWorkFileRcdString.length);
   	
   }
   
   public void setFdTempWorkFileRcdString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFdTempWorkFileRcdString,fdTempWorkFileRcdString.length);
   	
   }
   
     /**
	 * 	Update FdTempWorkFileRcdString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFdTempWorkFileRcdString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFdTempWorkFileRcdString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FdTempWorkFileRcdString with another Field
	 *	@param value
	 */
   public void setFdTempWorkFileRcdString(Field source) {
       replace(source,0,source.length(),beginFdTempWorkFileRcdString,FD_TEMP_WORK_FILE_RCD_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update FdTempWorkFileRcdString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFdTempWorkFileRcdString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFdTempWorkFileRcdString,FD_TEMP_WORK_FILE_RCD_STRING_LEN);
   	
   }
   
     /**
	 * 	Update FdTempWorkFileRcdString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFdTempWorkFileRcdString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFdTempWorkFileRcdString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getFdTempWorkFileRcdFieldLength() {
			return FD_TEMP_WORK_FILE_RCD_LENGTH;
		}

}
  
