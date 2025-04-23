package com.cloudframe.app.ar640010.dto;

/**
*  The class RenameFileMsg608 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.data.Field;


public class RenameFileMsg608 extends RenameFileMsg608Serialized {
   


								private char[] renameFileRecords608 = new char[13];
							


								private char[] renameFileBytes608 = new char[13];
							
	
	/**
	* Constructor for RenameFileMsg608
	**/
    public RenameFileMsg608() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("0081-SOURCE/TARGET RECORDS: ").toCharArray()
             , getStartOffset() + 0
             ,28
             );
								setRenameFileRecords608(fillSpace(13));
       replaceValue( // serialize and save the value
             ("; BYTES: ").toCharArray()
             , getStartOffset() + 41
             ,9
             );
								setRenameFileBytes608(fillSpace(13));
    }


 

	/**
	 *	Returns the value of renameFileRecords608
	 *	@return renameFileRecords608
	 */
   public char[] getRenameFileRecords608() throws CFException{
     if (isRenameFileRecords608Modified()) { 
        renameFileRecords608 = refreshRenameFileRecords608();
     }
   		return renameFileRecords608;
   }

  
	/**
	*  set variable renameFileRecords608
	*  Corresponding COBOL Variable is 608-RENAME-FILE-RECORDS
	*  @param value
	**/
   public void setRenameFileRecords608(char[] value) {
      renameFileRecords608 = checkRenameFileRecords608Constraints(value);
      serializeRenameFileRecords608(renameFileRecords608);
   } 

     /**
	 * 	Update RenameFileRecords608 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRenameFileRecords608(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRenameFileRecords608,renameFileRecords608.length);
   	
   }
   
   public void setRenameFileRecords608(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRenameFileRecords608,renameFileRecords608.length);
   	
   }
   
     /**
	 * 	Update RenameFileRecords608 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRenameFileRecords608(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRenameFileRecords608+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RenameFileRecords608 with another Field
	 *	@param value
	 */
   public void setRenameFileRecords608(Field source) {
       replace(source,0,source.length(),beginRenameFileRecords608,RENAME_FILE_RECORDS_608_LEN);
   	
   }  
   
     /**
	 * 	Update RenameFileRecords608 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRenameFileRecords608(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRenameFileRecords608,RENAME_FILE_RECORDS_608_LEN);
   	
   }
   
     /**
	 * 	Update RenameFileRecords608 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRenameFileRecords608(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRenameFileRecords608+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of renameFileBytes608
	 *	@return renameFileBytes608
	 */
   public char[] getRenameFileBytes608() throws CFException{
     if (isRenameFileBytes608Modified()) { 
        renameFileBytes608 = refreshRenameFileBytes608();
     }
   		return renameFileBytes608;
   }

  
	/**
	*  set variable renameFileBytes608
	*  Corresponding COBOL Variable is 608-RENAME-FILE-BYTES
	*  @param value
	**/
   public void setRenameFileBytes608(char[] value) {
      renameFileBytes608 = checkRenameFileBytes608Constraints(value);
      serializeRenameFileBytes608(renameFileBytes608);
   } 

     /**
	 * 	Update RenameFileBytes608 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRenameFileBytes608(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRenameFileBytes608,renameFileBytes608.length);
   	
   }
   
   public void setRenameFileBytes608(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRenameFileBytes608,renameFileBytes608.length);
   	
   }
   
     /**
	 * 	Update RenameFileBytes608 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRenameFileBytes608(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRenameFileBytes608+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RenameFileBytes608 with another Field
	 *	@param value
	 */
   public void setRenameFileBytes608(Field source) {
       replace(source,0,source.length(),beginRenameFileBytes608,RENAME_FILE_BYTES_608_LEN);
   	
   }  
   
     /**
	 * 	Update RenameFileBytes608 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRenameFileBytes608(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRenameFileBytes608,RENAME_FILE_BYTES_608_LEN);
   	
   }
   
     /**
	 * 	Update RenameFileBytes608 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRenameFileBytes608(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRenameFileBytes608+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRenameFileMsg608FieldLength() {
			return RENAME_FILE_MSG_608_LENGTH;
		}

}
  
