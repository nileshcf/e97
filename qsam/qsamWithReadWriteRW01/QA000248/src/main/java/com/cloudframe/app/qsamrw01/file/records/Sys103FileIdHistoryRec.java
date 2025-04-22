package com.cloudframe.app.qsamrw01.file.records;

/**
*  The class Sys103FileIdHistoryRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:22. using version 5.0.0.254
**/


import com.cloudframe.app.qsamrw01.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys103FileIdHistoryRec extends Sys103FileIdHistoryRecSerialized {
   

						private char[] sys103FileIdHistoryRecString = Field.fillLowValue(1020);
	
	/**
	* Constructor for Sys103FileIdHistoryRec
	**/
    public Sys103FileIdHistoryRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sys103FileIdHistoryRecString
	 *	@return sys103FileIdHistoryRecString
	 */
   public char[] getSys103FileIdHistoryRecString() throws CFException{
     if (isSys103FileIdHistoryRecStringModified()) { 
        sys103FileIdHistoryRecString = refreshSys103FileIdHistoryRecString();
     }
   		return sys103FileIdHistoryRecString;
   }

  
	/**
	*  set variable sys103FileIdHistoryRecString
	*  Corresponding COBOL Variable is SYS103-FILE-ID-HISTORY-REC-STRING
	*  @param value
	**/
   public void setSys103FileIdHistoryRecString(char[] value) {
      sys103FileIdHistoryRecString = checkSys103FileIdHistoryRecStringConstraints(value);
      serializeSys103FileIdHistoryRecString(sys103FileIdHistoryRecString);
   } 

     /**
	 * 	Update Sys103FileIdHistoryRecString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys103FileIdHistoryRecString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys103FileIdHistoryRecString,sys103FileIdHistoryRecString.length);
   	
   }
   
   public void setSys103FileIdHistoryRecString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys103FileIdHistoryRecString,sys103FileIdHistoryRecString.length);
   	
   }
   
     /**
	 * 	Update Sys103FileIdHistoryRecString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys103FileIdHistoryRecString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys103FileIdHistoryRecString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys103FileIdHistoryRecString with another Field
	 *	@param value
	 */
   public void setSys103FileIdHistoryRecString(Field source) {
       replace(source,0,source.length(),beginSys103FileIdHistoryRecString,SYS_103_FILE_ID_HISTORY_REC_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update Sys103FileIdHistoryRecString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys103FileIdHistoryRecString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys103FileIdHistoryRecString,SYS_103_FILE_ID_HISTORY_REC_STRING_LEN);
   	
   }
   
     /**
	 * 	Update Sys103FileIdHistoryRecString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys103FileIdHistoryRecString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys103FileIdHistoryRecString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys103FileIdHistoryRecFieldLength() {
			return SYS_103_FILE_ID_HISTORY_REC_LENGTH;
		}

}
  
