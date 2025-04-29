package com.cloudframe.app.ip989010.dto;

/**
*  The class ErrorMsg6003005 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ErrorMsg6003005 extends ErrorMsg6003005Serialized {
   


						private char[] fileDd6003005 = new char[6];

	
	/**
	* Constructor for ErrorMsg6003005
	**/
    public ErrorMsg6003005() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("FILE ").toCharArray()
             , getStartOffset() + 0
             ,5
             );
								setFileDd6003005(fillSpace(6));
       replaceValue( // serialize and save the value
             (" IS EMPTY").toCharArray()
             , getStartOffset() + 11
             ,9
             );
    }


 

	/**
	 *	Returns the value of fileDd6003005
	 *	@return fileDd6003005
	 */
   public char[] getFileDd6003005() throws CFException{
     if (isFileDd6003005Modified()) { 
        fileDd6003005 = refreshFileDd6003005();
     }
   		return fileDd6003005;
   }

  
	/**
	*  set variable fileDd6003005
	*  Corresponding COBOL Variable is 600-3005-FILE-DD
	*  @param value
	**/
   public void setFileDd6003005(char[] value) {
      fileDd6003005 = checkFileDd6003005Constraints(value);
      serializeFileDd6003005(fileDd6003005);
   } 

     /**
	 * 	Update FileDd6003005 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFileDd6003005(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFileDd6003005,fileDd6003005.length);
   	
   }
   
   public void setFileDd6003005(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFileDd6003005,fileDd6003005.length);
   	
   }
   
     /**
	 * 	Update FileDd6003005 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFileDd6003005(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileDd6003005+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FileDd6003005 with another Field
	 *	@param value
	 */
   public void setFileDd6003005(Field source) {
       replace(source,0,source.length(),beginFileDd6003005,FILE_DD_6003005_LEN);
   	
   }  
   
     /**
	 * 	Update FileDd6003005 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFileDd6003005(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFileDd6003005,FILE_DD_6003005_LEN);
   	
   }
   
     /**
	 * 	Update FileDd6003005 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFileDd6003005(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileDd6003005+targetIndex,targetLen);
    
   }

	
	
	

		public static int getErrorMsg6003005FieldLength() {
			return ERROR_MSG_6003005_LENGTH;
		}

}
  
