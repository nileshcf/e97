package com.cloudframe.app.gdgpgm2.file.records;

/**
*  The class FsRecord2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:08. using version 5.0.0.254
**/


import com.cloudframe.app.gdgpgm2.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FsRecord2 extends FsRecord2Serialized {
   

						private char[] fsRecord2String = Field.fillLowValue(80);
	
	/**
	* Constructor for FsRecord2
	**/
    public FsRecord2() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of fsRecord2String
	 *	@return fsRecord2String
	 */
   public char[] getFsRecord2String() throws CFException{
     if (isFsRecord2StringModified()) { 
        fsRecord2String = refreshFsRecord2String();
     }
   		return fsRecord2String;
   }

  
	/**
	*  set variable fsRecord2String
	*  Corresponding COBOL Variable is FS-RECORD2-STRING
	*  @param value
	**/
   public void setFsRecord2String(char[] value) {
      fsRecord2String = checkFsRecord2StringConstraints(value);
      serializeFsRecord2String(fsRecord2String);
   } 

     /**
	 * 	Update FsRecord2String 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFsRecord2String(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFsRecord2String,fsRecord2String.length);
   	
   }
   
   public void setFsRecord2String(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFsRecord2String,fsRecord2String.length);
   	
   }
   
     /**
	 * 	Update FsRecord2String 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFsRecord2String(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFsRecord2String+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FsRecord2String with another Field
	 *	@param value
	 */
   public void setFsRecord2String(Field source) {
       replace(source,0,source.length(),beginFsRecord2String,FS_RECORD_2_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update FsRecord2String 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFsRecord2String(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFsRecord2String,FS_RECORD_2_STRING_LEN);
   	
   }
   
     /**
	 * 	Update FsRecord2String 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFsRecord2String(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFsRecord2String+targetIndex,targetLen);
    
   }

	
	
	

		public static int getFsRecord2FieldLength() {
			return FS_RECORD_2_LENGTH;
		}

}
  
