package com.cloudframe.app.gdgpgm2.file.records;

/**
*  The class FsOutrec2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:10. using version 5.0.0.256
**/


import com.cloudframe.app.gdgpgm2.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FsOutrec2 extends FsOutrec2Serialized {
   

						private char[] fsOutrec2String = Field.fillLowValue(80);
	
	/**
	* Constructor for FsOutrec2
	**/
    public FsOutrec2() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of fsOutrec2String
	 *	@return fsOutrec2String
	 */
   public char[] getFsOutrec2String() throws CFException{
     if (isFsOutrec2StringModified()) { 
        fsOutrec2String = refreshFsOutrec2String();
     }
   		return fsOutrec2String;
   }

  
	/**
	*  set variable fsOutrec2String
	*  Corresponding COBOL Variable is FS-OUTREC2-STRING
	*  @param value
	**/
   public void setFsOutrec2String(char[] value) {
      fsOutrec2String = checkFsOutrec2StringConstraints(value);
      serializeFsOutrec2String(fsOutrec2String);
   } 

     /**
	 * 	Update FsOutrec2String 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFsOutrec2String(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFsOutrec2String,fsOutrec2String.length);
   	
   }
   
   public void setFsOutrec2String(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFsOutrec2String,fsOutrec2String.length);
   	
   }
   
     /**
	 * 	Update FsOutrec2String 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFsOutrec2String(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFsOutrec2String+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FsOutrec2String with another Field
	 *	@param value
	 */
   public void setFsOutrec2String(Field source) {
       replace(source,0,source.length(),beginFsOutrec2String,FS_OUTREC_2_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update FsOutrec2String 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFsOutrec2String(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFsOutrec2String,FS_OUTREC_2_STRING_LEN);
   	
   }
   
     /**
	 * 	Update FsOutrec2String 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFsOutrec2String(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFsOutrec2String+targetIndex,targetLen);
    
   }

	
	
	

		public static int getFsOutrec2FieldLength() {
			return FS_OUTREC_2_LENGTH;
		}

}
  
