package com.cloudframe.app.ar640010.dto;

/**
*  The class FileIdentityMsg602 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FileIdentityMsg602 extends FileIdentityMsg602Serialized {
   


						private char[] fileDd602 = new char[8];


						private char[] fileDsn602 = new char[54];
	
	/**
	* Constructor for FileIdentityMsg602
	**/
    public FileIdentityMsg602() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("0020-FILE IDENTITY: DD=").toCharArray()
             , getStartOffset() + 0
             ,23
             );
								setFileDd602(fillSpace(8));
       replaceValue( // serialize and save the value
             (" DSN=").toCharArray()
             , getStartOffset() + 31
             ,5
             );
								setFileDsn602(fillSpace(54));
    }


 

	/**
	 *	Returns the value of fileDd602
	 *	@return fileDd602
	 */
   public char[] getFileDd602() throws CFException{
     if (isFileDd602Modified()) { 
        fileDd602 = refreshFileDd602();
     }
   		return fileDd602;
   }

  
	/**
	*  set variable fileDd602
	*  Corresponding COBOL Variable is 602-FILE-DD
	*  @param value
	**/
   public void setFileDd602(char[] value) {
      fileDd602 = checkFileDd602Constraints(value);
      serializeFileDd602(fileDd602);
   } 

     /**
	 * 	Update FileDd602 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFileDd602(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFileDd602,fileDd602.length);
   	
   }
   
   public void setFileDd602(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFileDd602,fileDd602.length);
   	
   }
   
     /**
	 * 	Update FileDd602 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFileDd602(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileDd602+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FileDd602 with another Field
	 *	@param value
	 */
   public void setFileDd602(Field source) {
       replace(source,0,source.length(),beginFileDd602,FILE_DD_602_LEN);
   	
   }  
   
     /**
	 * 	Update FileDd602 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFileDd602(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFileDd602,FILE_DD_602_LEN);
   	
   }
   
     /**
	 * 	Update FileDd602 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFileDd602(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileDd602+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fileDsn602
	 *	@return fileDsn602
	 */
   public char[] getFileDsn602() throws CFException{
     if (isFileDsn602Modified()) { 
        fileDsn602 = refreshFileDsn602();
     }
   		return fileDsn602;
   }

  
	/**
	*  set variable fileDsn602
	*  Corresponding COBOL Variable is 602-FILE-DSN
	*  @param value
	**/
   public void setFileDsn602(char[] value) {
      fileDsn602 = checkFileDsn602Constraints(value);
      serializeFileDsn602(fileDsn602);
   } 

     /**
	 * 	Update FileDsn602 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFileDsn602(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFileDsn602,fileDsn602.length);
   	
   }
   
   public void setFileDsn602(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFileDsn602,fileDsn602.length);
   	
   }
   
     /**
	 * 	Update FileDsn602 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFileDsn602(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileDsn602+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FileDsn602 with another Field
	 *	@param value
	 */
   public void setFileDsn602(Field source) {
       replace(source,0,source.length(),beginFileDsn602,FILE_DSN_602_LEN);
   	
   }  
   
     /**
	 * 	Update FileDsn602 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFileDsn602(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFileDsn602,FILE_DSN_602_LEN);
   	
   }
   
     /**
	 * 	Update FileDsn602 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFileDsn602(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileDsn602+targetIndex,targetLen);
    
   }

	
	
	

		public static int getFileIdentityMsg602FieldLength() {
			return FILE_IDENTITY_MSG_602_LENGTH;
		}

}
  
