package com.cloudframe.app.ip829010.dto;

/**
*  The class ErrorMsg6003012 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:26. using version 5.0.0.257
**/


import com.cloudframe.app.ip829010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ErrorMsg6003012 extends ErrorMsg6003012Serialized {
   


						private char[] fileDd6003012 = new char[8];


						private char[] fileStat6003012 = new char[2];
	
	/**
	* Constructor for ErrorMsg6003012
	**/
    public ErrorMsg6003012() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("ERROR CLOSING FILE ").toCharArray()
             , getStartOffset() + 0
             ,19
             );
								setFileDd6003012(fillSpace(8));
       replaceValue( // serialize and save the value
             (", FILE STATUS = ").toCharArray()
             , getStartOffset() + 27
             ,16
             );
								setFileStat6003012(fillSpace(2));
    }


 

	/**
	 *	Returns the value of fileDd6003012
	 *	@return fileDd6003012
	 */
   public char[] getFileDd6003012() throws CFException{
     if (isFileDd6003012Modified()) { 
        fileDd6003012 = refreshFileDd6003012();
     }
   		return fileDd6003012;
   }

  
	/**
	*  set variable fileDd6003012
	*  Corresponding COBOL Variable is 600-3012-FILE-DD
	*  @param value
	**/
   public void setFileDd6003012(char[] value) {
      fileDd6003012 = checkFileDd6003012Constraints(value);
      serializeFileDd6003012(fileDd6003012);
   } 

     /**
	 * 	Update FileDd6003012 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFileDd6003012(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFileDd6003012,fileDd6003012.length);
   	
   }
   
   public void setFileDd6003012(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFileDd6003012,fileDd6003012.length);
   	
   }
   
     /**
	 * 	Update FileDd6003012 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFileDd6003012(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileDd6003012+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FileDd6003012 with another Field
	 *	@param value
	 */
   public void setFileDd6003012(Field source) {
       replace(source,0,source.length(),beginFileDd6003012,FILE_DD_6003012_LEN);
   	
   }  
   
     /**
	 * 	Update FileDd6003012 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFileDd6003012(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFileDd6003012,FILE_DD_6003012_LEN);
   	
   }
   
     /**
	 * 	Update FileDd6003012 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFileDd6003012(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileDd6003012+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fileStat6003012
	 *	@return fileStat6003012
	 */
   public char[] getFileStat6003012() throws CFException{
     if (isFileStat6003012Modified()) { 
        fileStat6003012 = refreshFileStat6003012();
     }
   		return fileStat6003012;
   }

  
	/**
	*  set variable fileStat6003012
	*  Corresponding COBOL Variable is 600-3012-FILE-STAT
	*  @param value
	**/
   public void setFileStat6003012(char[] value) {
      fileStat6003012 = checkFileStat6003012Constraints(value);
      serializeFileStat6003012(fileStat6003012);
   } 

     /**
	 * 	Update FileStat6003012 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFileStat6003012(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFileStat6003012,fileStat6003012.length);
   	
   }
   
   public void setFileStat6003012(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFileStat6003012,fileStat6003012.length);
   	
   }
   
     /**
	 * 	Update FileStat6003012 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFileStat6003012(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileStat6003012+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FileStat6003012 with another Field
	 *	@param value
	 */
   public void setFileStat6003012(Field source) {
       replace(source,0,source.length(),beginFileStat6003012,FILE_STAT_6003012_LEN);
   	
   }  
   
     /**
	 * 	Update FileStat6003012 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFileStat6003012(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFileStat6003012,FILE_STAT_6003012_LEN);
   	
   }
   
     /**
	 * 	Update FileStat6003012 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFileStat6003012(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileStat6003012+targetIndex,targetLen);
    
   }

	
	
	

		public static int getErrorMsg6003012FieldLength() {
			return ERROR_MSG_6003012_LENGTH;
		}

}
  
