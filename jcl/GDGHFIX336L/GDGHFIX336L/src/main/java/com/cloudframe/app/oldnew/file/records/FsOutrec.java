package com.cloudframe.app.oldnew.file.records;

/**
*  The class FsOutrec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:12. using version 5.0.0.254
**/


import com.cloudframe.app.oldnew.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FsOutrec extends FsOutrecSerialized {
   

						private char[] fsOutrecString = Field.fillLowValue(80);
	
	/**
	* Constructor for FsOutrec
	**/
    public FsOutrec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of fsOutrecString
	 *	@return fsOutrecString
	 */
   public char[] getFsOutrecString() throws CFException{
     if (isFsOutrecStringModified()) { 
        fsOutrecString = refreshFsOutrecString();
     }
   		return fsOutrecString;
   }

  
	/**
	*  set variable fsOutrecString
	*  Corresponding COBOL Variable is FS-OUTREC-STRING
	*  @param value
	**/
   public void setFsOutrecString(char[] value) {
      fsOutrecString = checkFsOutrecStringConstraints(value);
      serializeFsOutrecString(fsOutrecString);
   } 

     /**
	 * 	Update FsOutrecString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFsOutrecString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFsOutrecString,fsOutrecString.length);
   	
   }
   
   public void setFsOutrecString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFsOutrecString,fsOutrecString.length);
   	
   }
   
     /**
	 * 	Update FsOutrecString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFsOutrecString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFsOutrecString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FsOutrecString with another Field
	 *	@param value
	 */
   public void setFsOutrecString(Field source) {
       replace(source,0,source.length(),beginFsOutrecString,FS_OUTREC_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update FsOutrecString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFsOutrecString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFsOutrecString,FS_OUTREC_STRING_LEN);
   	
   }
   
     /**
	 * 	Update FsOutrecString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFsOutrecString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFsOutrecString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getFsOutrecFieldLength() {
			return FS_OUTREC_LENGTH;
		}

}
  
