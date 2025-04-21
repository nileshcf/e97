package com.cloudframe.app.gdgpgm2.file.records;

/**
*  The class FsRecord1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:10. using version 5.0.0.256
**/


import com.cloudframe.app.gdgpgm2.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FsRecord1 extends FsRecord1Serialized {
   

						private char[] fsRecord1String = Field.fillLowValue(80);
	
	/**
	* Constructor for FsRecord1
	**/
    public FsRecord1() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of fsRecord1String
	 *	@return fsRecord1String
	 */
   public char[] getFsRecord1String() throws CFException{
     if (isFsRecord1StringModified()) { 
        fsRecord1String = refreshFsRecord1String();
     }
   		return fsRecord1String;
   }

  
	/**
	*  set variable fsRecord1String
	*  Corresponding COBOL Variable is FS-RECORD1-STRING
	*  @param value
	**/
   public void setFsRecord1String(char[] value) {
      fsRecord1String = checkFsRecord1StringConstraints(value);
      serializeFsRecord1String(fsRecord1String);
   } 

     /**
	 * 	Update FsRecord1String 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFsRecord1String(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFsRecord1String,fsRecord1String.length);
   	
   }
   
   public void setFsRecord1String(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFsRecord1String,fsRecord1String.length);
   	
   }
   
     /**
	 * 	Update FsRecord1String 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFsRecord1String(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFsRecord1String+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FsRecord1String with another Field
	 *	@param value
	 */
   public void setFsRecord1String(Field source) {
       replace(source,0,source.length(),beginFsRecord1String,FS_RECORD_1_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update FsRecord1String 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFsRecord1String(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFsRecord1String,FS_RECORD_1_STRING_LEN);
   	
   }
   
     /**
	 * 	Update FsRecord1String 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFsRecord1String(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFsRecord1String+targetIndex,targetLen);
    
   }

	
	
	

		public static int getFsRecord1FieldLength() {
			return FS_RECORD_1_LENGTH;
		}

}
  
