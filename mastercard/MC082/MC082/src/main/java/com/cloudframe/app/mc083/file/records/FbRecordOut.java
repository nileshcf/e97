package com.cloudframe.app.mc083.file.records;

/**
*  The class FbRecordOut is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:06. using version 5.0.0.254
**/


import com.cloudframe.app.mc083.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FbRecordOut extends FbRecordOutSerialized {
   

						private char[] fbRecordOutString = Field.fillLowValue(80);
	
	/**
	* Constructor for FbRecordOut
	**/
    public FbRecordOut() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of fbRecordOutString
	 *	@return fbRecordOutString
	 */
   public char[] getFbRecordOutString() throws CFException{
     if (isFbRecordOutStringModified()) { 
        fbRecordOutString = refreshFbRecordOutString();
     }
   		return fbRecordOutString;
   }

  
	/**
	*  set variable fbRecordOutString
	*  Corresponding COBOL Variable is FB-RECORD-OUT-STRING
	*  @param value
	**/
   public void setFbRecordOutString(char[] value) {
      fbRecordOutString = checkFbRecordOutStringConstraints(value);
      serializeFbRecordOutString(fbRecordOutString);
   } 

     /**
	 * 	Update FbRecordOutString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFbRecordOutString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFbRecordOutString,fbRecordOutString.length);
   	
   }
   
   public void setFbRecordOutString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFbRecordOutString,fbRecordOutString.length);
   	
   }
   
     /**
	 * 	Update FbRecordOutString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFbRecordOutString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFbRecordOutString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FbRecordOutString with another Field
	 *	@param value
	 */
   public void setFbRecordOutString(Field source) {
       replace(source,0,source.length(),beginFbRecordOutString,FB_RECORD_OUT_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update FbRecordOutString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFbRecordOutString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFbRecordOutString,FB_RECORD_OUT_STRING_LEN);
   	
   }
   
     /**
	 * 	Update FbRecordOutString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFbRecordOutString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFbRecordOutString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getFbRecordOutFieldLength() {
			return FB_RECORD_OUT_LENGTH;
		}

}
  
