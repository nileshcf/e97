package com.cloudframe.app.ip989010.dto;

/**
*  The class ErrorMsg6003003 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:34. using version 5.0.0.254
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ErrorMsg6003003 extends ErrorMsg6003003Serialized {
   


						private char[] fileDd6003003 = new char[6];


						private char[] fileStat6003003 = new char[2];
	
	/**
	* Constructor for ErrorMsg6003003
	**/
    public ErrorMsg6003003() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("ERROR OPENING OUTPUT FILE ").toCharArray()
             , getStartOffset() + 0
             ,26
             );
								setFileDd6003003(fillSpace(6));
       replaceValue( // serialize and save the value
             (", FILE STATUS = ").toCharArray()
             , getStartOffset() + 32
             ,16
             );
								setFileStat6003003(fillSpace(2));
    }


 

	/**
	 *	Returns the value of fileDd6003003
	 *	@return fileDd6003003
	 */
   public char[] getFileDd6003003() throws CFException{
     if (isFileDd6003003Modified()) { 
        fileDd6003003 = refreshFileDd6003003();
     }
   		return fileDd6003003;
   }

  
	/**
	*  set variable fileDd6003003
	*  Corresponding COBOL Variable is 600-3003-FILE-DD
	*  @param value
	**/
   public void setFileDd6003003(char[] value) {
      fileDd6003003 = checkFileDd6003003Constraints(value);
      serializeFileDd6003003(fileDd6003003);
   } 

     /**
	 * 	Update FileDd6003003 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFileDd6003003(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFileDd6003003,fileDd6003003.length);
   	
   }
   
   public void setFileDd6003003(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFileDd6003003,fileDd6003003.length);
   	
   }
   
     /**
	 * 	Update FileDd6003003 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFileDd6003003(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileDd6003003+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FileDd6003003 with another Field
	 *	@param value
	 */
   public void setFileDd6003003(Field source) {
       replace(source,0,source.length(),beginFileDd6003003,FILE_DD_6003003_LEN);
   	
   }  
   
     /**
	 * 	Update FileDd6003003 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFileDd6003003(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFileDd6003003,FILE_DD_6003003_LEN);
   	
   }
   
     /**
	 * 	Update FileDd6003003 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFileDd6003003(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileDd6003003+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fileStat6003003
	 *	@return fileStat6003003
	 */
   public char[] getFileStat6003003() throws CFException{
     if (isFileStat6003003Modified()) { 
        fileStat6003003 = refreshFileStat6003003();
     }
   		return fileStat6003003;
   }

  
	/**
	*  set variable fileStat6003003
	*  Corresponding COBOL Variable is 600-3003-FILE-STAT
	*  @param value
	**/
   public void setFileStat6003003(char[] value) {
      fileStat6003003 = checkFileStat6003003Constraints(value);
      serializeFileStat6003003(fileStat6003003);
   } 

     /**
	 * 	Update FileStat6003003 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFileStat6003003(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFileStat6003003,fileStat6003003.length);
   	
   }
   
   public void setFileStat6003003(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFileStat6003003,fileStat6003003.length);
   	
   }
   
     /**
	 * 	Update FileStat6003003 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFileStat6003003(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileStat6003003+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FileStat6003003 with another Field
	 *	@param value
	 */
   public void setFileStat6003003(Field source) {
       replace(source,0,source.length(),beginFileStat6003003,FILE_STAT_6003003_LEN);
   	
   }  
   
     /**
	 * 	Update FileStat6003003 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFileStat6003003(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFileStat6003003,FILE_STAT_6003003_LEN);
   	
   }
   
     /**
	 * 	Update FileStat6003003 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFileStat6003003(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileStat6003003+targetIndex,targetLen);
    
   }

	
	
	

		public static int getErrorMsg6003003FieldLength() {
			return ERROR_MSG_6003003_LENGTH;
		}

}
  
