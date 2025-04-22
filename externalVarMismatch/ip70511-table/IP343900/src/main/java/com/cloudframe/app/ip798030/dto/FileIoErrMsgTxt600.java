package com.cloudframe.app.ip798030.dto;

/**
*  The class FileIoErrMsgTxt600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:15. using version 5.0.0.254
**/


import com.cloudframe.app.ip798030.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FileIoErrMsgTxt600 extends FileIoErrMsgTxt600Serialized {
   

							private char[] fileIoErrMsgTxt600ConditionGroup1 = new char[14];
						

						private char[] fileName600 = new char[30];


						private char[] fileStatus600 = new char[2];
	
	/**
	* Constructor for FileIoErrMsgTxt600
	**/
    public FileIoErrMsgTxt600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(14)
             , getStartOffset() + 0
             ,14
             );
								setFileName600(fillSpace(30));
       replaceValue( // serialize and save the value
             ("FILE STATUS :").toCharArray()
             , getStartOffset() + 44
             ,13
             );
								setFileStatus600(fillSpace(2));
    }


 

	/**
	 *	Returns the value of fileIoErrMsgTxt600ConditionGroup1
	 *	@return fileIoErrMsgTxt600ConditionGroup1
	 */
   public char[] getFileIoErrMsgTxt600ConditionGroup1() throws CFException{
     if (isFileIoErrMsgTxt600ConditionGroup1Modified()) { 
        fileIoErrMsgTxt600ConditionGroup1 = refreshFileIoErrMsgTxt600ConditionGroup1();
     }
   		return fileIoErrMsgTxt600ConditionGroup1;
   }

  
	/**
	*  set variable fileIoErrMsgTxt600ConditionGroup1
	*  Corresponding COBOL Variable is FILLER
	*  @param value
	**/
   public void setFileIoErrMsgTxt600ConditionGroup1(char[] value) {
      fileIoErrMsgTxt600ConditionGroup1 = checkFileIoErrMsgTxt600ConditionGroup1Constraints(value);
      serializeFileIoErrMsgTxt600ConditionGroup1(fileIoErrMsgTxt600ConditionGroup1);
   } 

     /**
	 * 	Update FileIoErrMsgTxt600ConditionGroup1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFileIoErrMsgTxt600ConditionGroup1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFileIoErrMsgTxt600ConditionGroup1,fileIoErrMsgTxt600ConditionGroup1.length);
   	
   }
   
   public void setFileIoErrMsgTxt600ConditionGroup1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFileIoErrMsgTxt600ConditionGroup1,fileIoErrMsgTxt600ConditionGroup1.length);
   	
   }
   
     /**
	 * 	Update FileIoErrMsgTxt600ConditionGroup1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFileIoErrMsgTxt600ConditionGroup1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileIoErrMsgTxt600ConditionGroup1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FileIoErrMsgTxt600ConditionGroup1 with another Field
	 *	@param value
	 */
   public void setFileIoErrMsgTxt600ConditionGroup1(Field source) {
       replace(source,0,source.length(),beginFileIoErrMsgTxt600ConditionGroup1,FILE_IO_ERR_MSG_TXT_600_CONDITION_GROUP_1_LEN);
   	
   }  
   
     /**
	 * 	Update FileIoErrMsgTxt600ConditionGroup1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFileIoErrMsgTxt600ConditionGroup1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFileIoErrMsgTxt600ConditionGroup1,FILE_IO_ERR_MSG_TXT_600_CONDITION_GROUP_1_LEN);
   	
   }
   
     /**
	 * 	Update FileIoErrMsgTxt600ConditionGroup1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFileIoErrMsgTxt600ConditionGroup1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileIoErrMsgTxt600ConditionGroup1+targetIndex,targetLen);
    
   }
	char[] fileOpenErr8860088Value = "ERROR OPENING ".toCharArray();
	/**
	 *	Test condition "ERROR OPENING " for isFileOpenErr88600()
	 *	@return  Returns true if isFileOpenErr88600() is "ERROR OPENING "
	 */
   public boolean isFileOpenErr88600() throws CFException {
      return (  compareChars( getFileIoErrMsgTxt600ConditionGroup1() , fileOpenErr8860088Value)  == 0  );
   }


	/**
	*  set values "ERROR OPENING "
	*/
   	public void setFileOpenErr88600True() {  			
    	setFileIoErrMsgTxt600ConditionGroup1( fileOpenErr8860088Value);
   	}
	char[] fileReadErr8860088Value = "ERROR READING ".toCharArray();
	/**
	 *	Test condition "ERROR READING " for isFileReadErr88600()
	 *	@return  Returns true if isFileReadErr88600() is "ERROR READING "
	 */
   public boolean isFileReadErr88600() throws CFException {
      return (  compareChars( getFileIoErrMsgTxt600ConditionGroup1() , fileReadErr8860088Value)  == 0  );
   }


	/**
	*  set values "ERROR READING "
	*/
   	public void setFileReadErr88600True() {  			
    	setFileIoErrMsgTxt600ConditionGroup1( fileReadErr8860088Value);
   	}
	char[] fileWriteErr8860088Value = "ERROR WRITING ".toCharArray();
	/**
	 *	Test condition "ERROR WRITING " for isFileWriteErr88600()
	 *	@return  Returns true if isFileWriteErr88600() is "ERROR WRITING "
	 */
   public boolean isFileWriteErr88600() throws CFException {
      return (  compareChars( getFileIoErrMsgTxt600ConditionGroup1() , fileWriteErr8860088Value)  == 0  );
   }


	/**
	*  set values "ERROR WRITING "
	*/
   	public void setFileWriteErr88600True() {  			
    	setFileIoErrMsgTxt600ConditionGroup1( fileWriteErr8860088Value);
   	}
	char[] fileCloseErr8860088Value = "ERROR CLOSING ".toCharArray();
	/**
	 *	Test condition "ERROR CLOSING " for isFileCloseErr88600()
	 *	@return  Returns true if isFileCloseErr88600() is "ERROR CLOSING "
	 */
   public boolean isFileCloseErr88600() throws CFException {
      return (  compareChars( getFileIoErrMsgTxt600ConditionGroup1() , fileCloseErr8860088Value)  == 0  );
   }


	/**
	*  set values "ERROR CLOSING "
	*/
   	public void setFileCloseErr88600True() {  			
    	setFileIoErrMsgTxt600ConditionGroup1( fileCloseErr8860088Value);
   	}
	char[] fileEmptyErr8860088Value = "EMPTY INPUT   ".toCharArray();
	/**
	 *	Test condition "EMPTY INPUT   " for isFileEmptyErr88600()
	 *	@return  Returns true if isFileEmptyErr88600() is "EMPTY INPUT   "
	 */
   public boolean isFileEmptyErr88600() throws CFException {
      return (  compareChars( getFileIoErrMsgTxt600ConditionGroup1() , fileEmptyErr8860088Value)  == 0  );
   }


	/**
	*  set values "EMPTY INPUT   "
	*/
   	public void setFileEmptyErr88600True() {  			
    	setFileIoErrMsgTxt600ConditionGroup1( fileEmptyErr8860088Value);
   	}
	/**
	 *	Returns the value of fileName600
	 *	@return fileName600
	 */
   public char[] getFileName600() throws CFException{
     if (isFileName600Modified()) { 
        fileName600 = refreshFileName600();
     }
   		return fileName600;
   }

  
	/**
	*  set variable fileName600
	*  Corresponding COBOL Variable is 600-FILE-NAME
	*  @param value
	**/
   public void setFileName600(char[] value) {
      fileName600 = checkFileName600Constraints(value);
      serializeFileName600(fileName600);
   } 

     /**
	 * 	Update FileName600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFileName600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFileName600,fileName600.length);
   	
   }
   
   public void setFileName600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFileName600,fileName600.length);
   	
   }
   
     /**
	 * 	Update FileName600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFileName600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileName600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FileName600 with another Field
	 *	@param value
	 */
   public void setFileName600(Field source) {
       replace(source,0,source.length(),beginFileName600,FILE_NAME_600_LEN);
   	
   }  
   
     /**
	 * 	Update FileName600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFileName600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFileName600,FILE_NAME_600_LEN);
   	
   }
   
     /**
	 * 	Update FileName600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFileName600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileName600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fileStatus600
	 *	@return fileStatus600
	 */
   public char[] getFileStatus600() throws CFException{
     if (isFileStatus600Modified()) { 
        fileStatus600 = refreshFileStatus600();
     }
   		return fileStatus600;
   }

  
	/**
	*  set variable fileStatus600
	*  Corresponding COBOL Variable is 600-FILE-STATUS
	*  @param value
	**/
   public void setFileStatus600(char[] value) {
      fileStatus600 = checkFileStatus600Constraints(value);
      serializeFileStatus600(fileStatus600);
   } 

     /**
	 * 	Update FileStatus600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFileStatus600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFileStatus600,fileStatus600.length);
   	
   }
   
   public void setFileStatus600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFileStatus600,fileStatus600.length);
   	
   }
   
     /**
	 * 	Update FileStatus600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFileStatus600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileStatus600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FileStatus600 with another Field
	 *	@param value
	 */
   public void setFileStatus600(Field source) {
       replace(source,0,source.length(),beginFileStatus600,FILE_STATUS_600_LEN);
   	
   }  
   
     /**
	 * 	Update FileStatus600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFileStatus600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFileStatus600,FILE_STATUS_600_LEN);
   	
   }
   
     /**
	 * 	Update FileStatus600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFileStatus600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileStatus600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getFileIoErrMsgTxt600FieldLength() {
			return FILE_IO_ERR_MSG_TXT_600_LENGTH;
		}

}
  
