package com.cloudframe.app.ip989010.dto;

/**
*  The class ErrorMsg6003002 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:31. using version 5.0.0.254
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ErrorMsg6003002 extends ErrorMsg6003002Serialized {
   


						private char[] fileDd6003002 = new char[6];


						private char[] fileStat6003002 = new char[2];
	
	/**
	* Constructor for ErrorMsg6003002
	**/
    public ErrorMsg6003002() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("ERROR OPENING INPUT FILE ").toCharArray()
             , getStartOffset() + 0
             ,25
             );
								setFileDd6003002(fillSpace(6));
       replaceValue( // serialize and save the value
             (", FILE STATUS = ").toCharArray()
             , getStartOffset() + 31
             ,16
             );
								setFileStat6003002(fillSpace(2));
    }


 

	/**
	 *	Returns the value of fileDd6003002
	 *	@return fileDd6003002
	 */
   public char[] getFileDd6003002() throws CFException{
     if (isFileDd6003002Modified()) { 
        fileDd6003002 = refreshFileDd6003002();
     }
   		return fileDd6003002;
   }

  
	/**
	*  set variable fileDd6003002
	*  Corresponding COBOL Variable is 600-3002-FILE-DD
	*  @param value
	**/
   public void setFileDd6003002(char[] value) {
      fileDd6003002 = checkFileDd6003002Constraints(value);
      serializeFileDd6003002(fileDd6003002);
   } 

     /**
	 * 	Update FileDd6003002 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFileDd6003002(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFileDd6003002,fileDd6003002.length);
   	
   }
   
   public void setFileDd6003002(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFileDd6003002,fileDd6003002.length);
   	
   }
   
     /**
	 * 	Update FileDd6003002 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFileDd6003002(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileDd6003002+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FileDd6003002 with another Field
	 *	@param value
	 */
   public void setFileDd6003002(Field source) {
       replace(source,0,source.length(),beginFileDd6003002,FILE_DD_6003002_LEN);
   	
   }  
   
     /**
	 * 	Update FileDd6003002 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFileDd6003002(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFileDd6003002,FILE_DD_6003002_LEN);
   	
   }
   
     /**
	 * 	Update FileDd6003002 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFileDd6003002(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileDd6003002+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fileStat6003002
	 *	@return fileStat6003002
	 */
   public char[] getFileStat6003002() throws CFException{
     if (isFileStat6003002Modified()) { 
        fileStat6003002 = refreshFileStat6003002();
     }
   		return fileStat6003002;
   }

  
	/**
	*  set variable fileStat6003002
	*  Corresponding COBOL Variable is 600-3002-FILE-STAT
	*  @param value
	**/
   public void setFileStat6003002(char[] value) {
      fileStat6003002 = checkFileStat6003002Constraints(value);
      serializeFileStat6003002(fileStat6003002);
   } 

     /**
	 * 	Update FileStat6003002 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFileStat6003002(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFileStat6003002,fileStat6003002.length);
   	
   }
   
   public void setFileStat6003002(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFileStat6003002,fileStat6003002.length);
   	
   }
   
     /**
	 * 	Update FileStat6003002 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFileStat6003002(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileStat6003002+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FileStat6003002 with another Field
	 *	@param value
	 */
   public void setFileStat6003002(Field source) {
       replace(source,0,source.length(),beginFileStat6003002,FILE_STAT_6003002_LEN);
   	
   }  
   
     /**
	 * 	Update FileStat6003002 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFileStat6003002(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFileStat6003002,FILE_STAT_6003002_LEN);
   	
   }
   
     /**
	 * 	Update FileStat6003002 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFileStat6003002(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileStat6003002+targetIndex,targetLen);
    
   }

	
	
	

		public static int getErrorMsg6003002FieldLength() {
			return ERROR_MSG_6003002_LENGTH;
		}

}
  
