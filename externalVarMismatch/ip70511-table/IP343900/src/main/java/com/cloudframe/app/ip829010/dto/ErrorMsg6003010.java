package com.cloudframe.app.ip829010.dto;

/**
*  The class ErrorMsg6003010 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:07. using version 5.0.0.254
**/


import com.cloudframe.app.ip829010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ErrorMsg6003010 extends ErrorMsg6003010Serialized {
   


						private char[] fileDd6003010 = new char[8];


						private char[] fileStat6003010 = new char[2];
	
	/**
	* Constructor for ErrorMsg6003010
	**/
    public ErrorMsg6003010() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("ERROR OPENING FILE ").toCharArray()
             , getStartOffset() + 0
             ,19
             );
								setFileDd6003010(fillSpace(8));
       replaceValue( // serialize and save the value
             (", FILE STATUS = ").toCharArray()
             , getStartOffset() + 27
             ,16
             );
								setFileStat6003010(fillSpace(2));
    }


 

	/**
	 *	Returns the value of fileDd6003010
	 *	@return fileDd6003010
	 */
   public char[] getFileDd6003010() throws CFException{
     if (isFileDd6003010Modified()) { 
        fileDd6003010 = refreshFileDd6003010();
     }
   		return fileDd6003010;
   }

  
	/**
	*  set variable fileDd6003010
	*  Corresponding COBOL Variable is 600-3010-FILE-DD
	*  @param value
	**/
   public void setFileDd6003010(char[] value) {
      fileDd6003010 = checkFileDd6003010Constraints(value);
      serializeFileDd6003010(fileDd6003010);
   } 

     /**
	 * 	Update FileDd6003010 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFileDd6003010(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFileDd6003010,fileDd6003010.length);
   	
   }
   
   public void setFileDd6003010(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFileDd6003010,fileDd6003010.length);
   	
   }
   
     /**
	 * 	Update FileDd6003010 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFileDd6003010(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileDd6003010+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FileDd6003010 with another Field
	 *	@param value
	 */
   public void setFileDd6003010(Field source) {
       replace(source,0,source.length(),beginFileDd6003010,FILE_DD_6003010_LEN);
   	
   }  
   
     /**
	 * 	Update FileDd6003010 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFileDd6003010(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFileDd6003010,FILE_DD_6003010_LEN);
   	
   }
   
     /**
	 * 	Update FileDd6003010 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFileDd6003010(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileDd6003010+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fileStat6003010
	 *	@return fileStat6003010
	 */
   public char[] getFileStat6003010() throws CFException{
     if (isFileStat6003010Modified()) { 
        fileStat6003010 = refreshFileStat6003010();
     }
   		return fileStat6003010;
   }

  
	/**
	*  set variable fileStat6003010
	*  Corresponding COBOL Variable is 600-3010-FILE-STAT
	*  @param value
	**/
   public void setFileStat6003010(char[] value) {
      fileStat6003010 = checkFileStat6003010Constraints(value);
      serializeFileStat6003010(fileStat6003010);
   } 

     /**
	 * 	Update FileStat6003010 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFileStat6003010(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFileStat6003010,fileStat6003010.length);
   	
   }
   
   public void setFileStat6003010(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFileStat6003010,fileStat6003010.length);
   	
   }
   
     /**
	 * 	Update FileStat6003010 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFileStat6003010(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileStat6003010+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FileStat6003010 with another Field
	 *	@param value
	 */
   public void setFileStat6003010(Field source) {
       replace(source,0,source.length(),beginFileStat6003010,FILE_STAT_6003010_LEN);
   	
   }  
   
     /**
	 * 	Update FileStat6003010 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFileStat6003010(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFileStat6003010,FILE_STAT_6003010_LEN);
   	
   }
   
     /**
	 * 	Update FileStat6003010 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFileStat6003010(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileStat6003010+targetIndex,targetLen);
    
   }

	
	
	

		public static int getErrorMsg6003010FieldLength() {
			return ERROR_MSG_6003010_LENGTH;
		}

}
  
