package com.cloudframe.app.gdgpgm2.file.records;

/**
*  The class FsOutrec1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:17. using version 5.0.0.254
**/


import com.cloudframe.app.gdgpgm2.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FsOutrec1 extends FsOutrec1Serialized {
   

						private char[] fsOutrec1String = Field.fillLowValue(80);
	
	/**
	* Constructor for FsOutrec1
	**/
    public FsOutrec1() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of fsOutrec1String
	 *	@return fsOutrec1String
	 */
   public char[] getFsOutrec1String() throws CFException{
     if (isFsOutrec1StringModified()) { 
        fsOutrec1String = refreshFsOutrec1String();
     }
   		return fsOutrec1String;
   }

  
	/**
	*  set variable fsOutrec1String
	*  Corresponding COBOL Variable is FS-OUTREC1-STRING
	*  @param value
	**/
   public void setFsOutrec1String(char[] value) {
      fsOutrec1String = checkFsOutrec1StringConstraints(value);
      serializeFsOutrec1String(fsOutrec1String);
   } 

     /**
	 * 	Update FsOutrec1String 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFsOutrec1String(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFsOutrec1String,fsOutrec1String.length);
   	
   }
   
   public void setFsOutrec1String(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFsOutrec1String,fsOutrec1String.length);
   	
   }
   
     /**
	 * 	Update FsOutrec1String 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFsOutrec1String(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFsOutrec1String+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FsOutrec1String with another Field
	 *	@param value
	 */
   public void setFsOutrec1String(Field source) {
       replace(source,0,source.length(),beginFsOutrec1String,FS_OUTREC_1_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update FsOutrec1String 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFsOutrec1String(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFsOutrec1String,FS_OUTREC_1_STRING_LEN);
   	
   }
   
     /**
	 * 	Update FsOutrec1String 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFsOutrec1String(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFsOutrec1String+targetIndex,targetLen);
    
   }

	
	
	

		public static int getFsOutrec1FieldLength() {
			return FS_OUTREC_1_LENGTH;
		}

}
  
