package com.cloudframe.app.oldnew.file.records;

/**
*  The class FsRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:12. using version 5.0.0.254
**/


import com.cloudframe.app.oldnew.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FsRecord extends FsRecordSerialized {
   

						private char[] fsRecordString = Field.fillLowValue(80);
	
	/**
	* Constructor for FsRecord
	**/
    public FsRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of fsRecordString
	 *	@return fsRecordString
	 */
   public char[] getFsRecordString() throws CFException{
     if (isFsRecordStringModified()) { 
        fsRecordString = refreshFsRecordString();
     }
   		return fsRecordString;
   }

  
	/**
	*  set variable fsRecordString
	*  Corresponding COBOL Variable is FS-RECORD-STRING
	*  @param value
	**/
   public void setFsRecordString(char[] value) {
      fsRecordString = checkFsRecordStringConstraints(value);
      serializeFsRecordString(fsRecordString);
   } 

     /**
	 * 	Update FsRecordString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFsRecordString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFsRecordString,fsRecordString.length);
   	
   }
   
   public void setFsRecordString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFsRecordString,fsRecordString.length);
   	
   }
   
     /**
	 * 	Update FsRecordString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFsRecordString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFsRecordString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FsRecordString with another Field
	 *	@param value
	 */
   public void setFsRecordString(Field source) {
       replace(source,0,source.length(),beginFsRecordString,FS_RECORD_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update FsRecordString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFsRecordString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFsRecordString,FS_RECORD_STRING_LEN);
   	
   }
   
     /**
	 * 	Update FsRecordString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFsRecordString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFsRecordString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getFsRecordFieldLength() {
			return FS_RECORD_LENGTH;
		}

}
  
