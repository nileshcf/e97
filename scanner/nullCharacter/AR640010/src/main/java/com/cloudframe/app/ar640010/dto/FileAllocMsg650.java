package com.cloudframe.app.ar640010.dto;

/**
*  The class FileAllocMsg650 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FileAllocMsg650 extends FileAllocMsg650Serialized {
   


						private char[] fileAllocType650 = new char[3];

	
	/**
	* Constructor for FileAllocMsg650
	**/
    public FileAllocMsg650() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("5100-FILE ALLOC TYPE UNACCEPTABLE, TYPE: ").toCharArray()
             , getStartOffset() + 0
             ,41
             );
								setFileAllocType650(fillSpace(3));
       replaceValue( // serialize and save the value
             (", DSN: ").toCharArray()
             , getStartOffset() + 44
             ,7
             );
    }


 

	/**
	 *	Returns the value of fileAllocType650
	 *	@return fileAllocType650
	 */
   public char[] getFileAllocType650() throws CFException{
     if (isFileAllocType650Modified()) { 
        fileAllocType650 = refreshFileAllocType650();
     }
   		return fileAllocType650;
   }

  
	/**
	*  set variable fileAllocType650
	*  Corresponding COBOL Variable is 650-FILE-ALLOC-TYPE
	*  @param value
	**/
   public void setFileAllocType650(char[] value) {
      fileAllocType650 = checkFileAllocType650Constraints(value);
      serializeFileAllocType650(fileAllocType650);
   } 

     /**
	 * 	Update FileAllocType650 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFileAllocType650(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFileAllocType650,fileAllocType650.length);
   	
   }
   
   public void setFileAllocType650(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFileAllocType650,fileAllocType650.length);
   	
   }
   
     /**
	 * 	Update FileAllocType650 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFileAllocType650(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileAllocType650+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FileAllocType650 with another Field
	 *	@param value
	 */
   public void setFileAllocType650(Field source) {
       replace(source,0,source.length(),beginFileAllocType650,FILE_ALLOC_TYPE_650_LEN);
   	
   }  
   
     /**
	 * 	Update FileAllocType650 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFileAllocType650(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFileAllocType650,FILE_ALLOC_TYPE_650_LEN);
   	
   }
   
     /**
	 * 	Update FileAllocType650 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFileAllocType650(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileAllocType650+targetIndex,targetLen);
    
   }

	
	
	

		public static int getFileAllocMsg650FieldLength() {
			return FILE_ALLOC_MSG_650_LENGTH;
		}

}
  
