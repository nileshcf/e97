package com.cloudframe.app.ip989010.dto;

/**
*  The class ErrorMsg6003004 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:17. using version 5.0.0.254
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ErrorMsg6003004 extends ErrorMsg6003004Serialized {
   


						private char[] fileDd6003004 = new char[6];


						private char[] fileStat6003004 = new char[2];
	
	/**
	* Constructor for ErrorMsg6003004
	**/
    public ErrorMsg6003004() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("ERROR WRITTING TO OUTPUT FILE ").toCharArray()
             , getStartOffset() + 0
             ,30
             );
								setFileDd6003004(fillSpace(6));
       replaceValue( // serialize and save the value
             (", FILE STATUS = ").toCharArray()
             , getStartOffset() + 36
             ,16
             );
								setFileStat6003004(fillSpace(2));
    }


 

	/**
	 *	Returns the value of fileDd6003004
	 *	@return fileDd6003004
	 */
   public char[] getFileDd6003004() throws CFException{
     if (isFileDd6003004Modified()) { 
        fileDd6003004 = refreshFileDd6003004();
     }
   		return fileDd6003004;
   }

  
	/**
	*  set variable fileDd6003004
	*  Corresponding COBOL Variable is 600-3004-FILE-DD
	*  @param value
	**/
   public void setFileDd6003004(char[] value) {
      fileDd6003004 = checkFileDd6003004Constraints(value);
      serializeFileDd6003004(fileDd6003004);
   } 

     /**
	 * 	Update FileDd6003004 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFileDd6003004(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFileDd6003004,fileDd6003004.length);
   	
   }
   
   public void setFileDd6003004(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFileDd6003004,fileDd6003004.length);
   	
   }
   
     /**
	 * 	Update FileDd6003004 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFileDd6003004(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileDd6003004+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FileDd6003004 with another Field
	 *	@param value
	 */
   public void setFileDd6003004(Field source) {
       replace(source,0,source.length(),beginFileDd6003004,FILE_DD_6003004_LEN);
   	
   }  
   
     /**
	 * 	Update FileDd6003004 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFileDd6003004(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFileDd6003004,FILE_DD_6003004_LEN);
   	
   }
   
     /**
	 * 	Update FileDd6003004 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFileDd6003004(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileDd6003004+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fileStat6003004
	 *	@return fileStat6003004
	 */
   public char[] getFileStat6003004() throws CFException{
     if (isFileStat6003004Modified()) { 
        fileStat6003004 = refreshFileStat6003004();
     }
   		return fileStat6003004;
   }

  
	/**
	*  set variable fileStat6003004
	*  Corresponding COBOL Variable is 600-3004-FILE-STAT
	*  @param value
	**/
   public void setFileStat6003004(char[] value) {
      fileStat6003004 = checkFileStat6003004Constraints(value);
      serializeFileStat6003004(fileStat6003004);
   } 

     /**
	 * 	Update FileStat6003004 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFileStat6003004(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFileStat6003004,fileStat6003004.length);
   	
   }
   
   public void setFileStat6003004(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFileStat6003004,fileStat6003004.length);
   	
   }
   
     /**
	 * 	Update FileStat6003004 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFileStat6003004(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileStat6003004+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FileStat6003004 with another Field
	 *	@param value
	 */
   public void setFileStat6003004(Field source) {
       replace(source,0,source.length(),beginFileStat6003004,FILE_STAT_6003004_LEN);
   	
   }  
   
     /**
	 * 	Update FileStat6003004 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFileStat6003004(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFileStat6003004,FILE_STAT_6003004_LEN);
   	
   }
   
     /**
	 * 	Update FileStat6003004 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFileStat6003004(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileStat6003004+targetIndex,targetLen);
    
   }

	
	
	

		public static int getErrorMsg6003004FieldLength() {
			return ERROR_MSG_6003004_LENGTH;
		}

}
  
