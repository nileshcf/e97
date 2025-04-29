package com.cloudframe.app.ip829010.dto;

/**
*  The class ErrorMsg6003011 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/


import com.cloudframe.app.ip829010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ErrorMsg6003011 extends ErrorMsg6003011Serialized {
   


						private char[] fileDd6003011 = new char[8];


						private char[] fileStat6003011 = new char[2];
	
	/**
	* Constructor for ErrorMsg6003011
	**/
    public ErrorMsg6003011() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("ERROR WRITING FILE ").toCharArray()
             , getStartOffset() + 0
             ,19
             );
								setFileDd6003011(fillSpace(8));
       replaceValue( // serialize and save the value
             (", FILE STATUS = ").toCharArray()
             , getStartOffset() + 27
             ,16
             );
								setFileStat6003011(fillSpace(2));
    }


 

	/**
	 *	Returns the value of fileDd6003011
	 *	@return fileDd6003011
	 */
   public char[] getFileDd6003011() throws CFException{
     if (isFileDd6003011Modified()) { 
        fileDd6003011 = refreshFileDd6003011();
     }
   		return fileDd6003011;
   }

  
	/**
	*  set variable fileDd6003011
	*  Corresponding COBOL Variable is 600-3011-FILE-DD
	*  @param value
	**/
   public void setFileDd6003011(char[] value) {
      fileDd6003011 = checkFileDd6003011Constraints(value);
      serializeFileDd6003011(fileDd6003011);
   } 

     /**
	 * 	Update FileDd6003011 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFileDd6003011(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFileDd6003011,fileDd6003011.length);
   	
   }
   
   public void setFileDd6003011(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFileDd6003011,fileDd6003011.length);
   	
   }
   
     /**
	 * 	Update FileDd6003011 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFileDd6003011(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileDd6003011+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FileDd6003011 with another Field
	 *	@param value
	 */
   public void setFileDd6003011(Field source) {
       replace(source,0,source.length(),beginFileDd6003011,FILE_DD_6003011_LEN);
   	
   }  
   
     /**
	 * 	Update FileDd6003011 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFileDd6003011(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFileDd6003011,FILE_DD_6003011_LEN);
   	
   }
   
     /**
	 * 	Update FileDd6003011 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFileDd6003011(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileDd6003011+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fileStat6003011
	 *	@return fileStat6003011
	 */
   public char[] getFileStat6003011() throws CFException{
     if (isFileStat6003011Modified()) { 
        fileStat6003011 = refreshFileStat6003011();
     }
   		return fileStat6003011;
   }

  
	/**
	*  set variable fileStat6003011
	*  Corresponding COBOL Variable is 600-3011-FILE-STAT
	*  @param value
	**/
   public void setFileStat6003011(char[] value) {
      fileStat6003011 = checkFileStat6003011Constraints(value);
      serializeFileStat6003011(fileStat6003011);
   } 

     /**
	 * 	Update FileStat6003011 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFileStat6003011(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFileStat6003011,fileStat6003011.length);
   	
   }
   
   public void setFileStat6003011(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFileStat6003011,fileStat6003011.length);
   	
   }
   
     /**
	 * 	Update FileStat6003011 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFileStat6003011(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileStat6003011+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FileStat6003011 with another Field
	 *	@param value
	 */
   public void setFileStat6003011(Field source) {
       replace(source,0,source.length(),beginFileStat6003011,FILE_STAT_6003011_LEN);
   	
   }  
   
     /**
	 * 	Update FileStat6003011 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFileStat6003011(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFileStat6003011,FILE_STAT_6003011_LEN);
   	
   }
   
     /**
	 * 	Update FileStat6003011 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFileStat6003011(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileStat6003011+targetIndex,targetLen);
    
   }

	
	
	

		public static int getErrorMsg6003011FieldLength() {
			return ERROR_MSG_6003011_LENGTH;
		}

}
  
