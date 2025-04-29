package com.cloudframe.app.ip343690.dto;

/**
*  The class Sys001ErrMsgTxt600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/


import com.cloudframe.app.ip343690.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys001ErrMsgTxt600 extends Sys001ErrMsgTxt600Serialized {
   

						private char[] pmmWorkFileMsgDetail600 = new char[28];


						private char[] sys001Status600 = new char[2];
	
	/**
	* Constructor for Sys001ErrMsgTxt600
	**/
    public Sys001ErrMsgTxt600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setPmmWorkFileMsgDetail600(fillSpace(28));
       replaceValue( // serialize and save the value
             ("STATUS:  ").toCharArray()
             , getStartOffset() + 28
             ,9
             );
								setSys001Status600(fillSpace(2));
    }


 

	/**
	 *	Returns the value of pmmWorkFileMsgDetail600
	 *	@return pmmWorkFileMsgDetail600
	 */
   public char[] getPmmWorkFileMsgDetail600() throws CFException{
     if (isPmmWorkFileMsgDetail600Modified()) { 
        pmmWorkFileMsgDetail600 = refreshPmmWorkFileMsgDetail600();
     }
   		return pmmWorkFileMsgDetail600;
   }

  
	/**
	*  set variable pmmWorkFileMsgDetail600
	*  Corresponding COBOL Variable is 600-PMM-WORK-FILE-MSG-DETAIL
	*  @param value
	**/
   public void setPmmWorkFileMsgDetail600(char[] value) {
      pmmWorkFileMsgDetail600 = checkPmmWorkFileMsgDetail600Constraints(value);
      serializePmmWorkFileMsgDetail600(pmmWorkFileMsgDetail600);
   } 

     /**
	 * 	Update PmmWorkFileMsgDetail600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPmmWorkFileMsgDetail600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPmmWorkFileMsgDetail600,pmmWorkFileMsgDetail600.length);
   	
   }
   
   public void setPmmWorkFileMsgDetail600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPmmWorkFileMsgDetail600,pmmWorkFileMsgDetail600.length);
   	
   }
   
     /**
	 * 	Update PmmWorkFileMsgDetail600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPmmWorkFileMsgDetail600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPmmWorkFileMsgDetail600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PmmWorkFileMsgDetail600 with another Field
	 *	@param value
	 */
   public void setPmmWorkFileMsgDetail600(Field source) {
       replace(source,0,source.length(),beginPmmWorkFileMsgDetail600,PMM_WORK_FILE_MSG_DETAIL_600_LEN);
   	
   }  
   
     /**
	 * 	Update PmmWorkFileMsgDetail600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPmmWorkFileMsgDetail600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPmmWorkFileMsgDetail600,PMM_WORK_FILE_MSG_DETAIL_600_LEN);
   	
   }
   
     /**
	 * 	Update PmmWorkFileMsgDetail600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPmmWorkFileMsgDetail600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPmmWorkFileMsgDetail600+targetIndex,targetLen);
    
   }
	char[] sys001OpenErrTxt8860088Value = "ERROR OPENING INPUT SYS001  ".toCharArray();
	/**
	 *	Test condition "ERROR OPENING INPUT SYS001  " for isSys001OpenErrTxt88600()
	 *	@return  Returns true if isSys001OpenErrTxt88600() is "ERROR OPENING INPUT SYS001  "
	 */
   public boolean isSys001OpenErrTxt88600() throws CFException {
      return (  compareChars( getPmmWorkFileMsgDetail600() , sys001OpenErrTxt8860088Value)  == 0  );
   }


	/**
	*  set values "ERROR OPENING INPUT SYS001  "
	*/
   	public void setSys001OpenErrTxt88600True() {  			
    	setPmmWorkFileMsgDetail600( sys001OpenErrTxt8860088Value);
   	}
	char[] sys001ReadErrTxt8860088Value = "ERROR READING INPUT SYS001  ".toCharArray();
	/**
	 *	Test condition "ERROR READING INPUT SYS001  " for isSys001ReadErrTxt88600()
	 *	@return  Returns true if isSys001ReadErrTxt88600() is "ERROR READING INPUT SYS001  "
	 */
   public boolean isSys001ReadErrTxt88600() throws CFException {
      return (  compareChars( getPmmWorkFileMsgDetail600() , sys001ReadErrTxt8860088Value)  == 0  );
   }


	/**
	*  set values "ERROR READING INPUT SYS001  "
	*/
   	public void setSys001ReadErrTxt88600True() {  			
    	setPmmWorkFileMsgDetail600( sys001ReadErrTxt8860088Value);
   	}
	char[] sys001CloseErrTxt8860088Value = "ERROR CLOSING INPUT SYS001  ".toCharArray();
	/**
	 *	Test condition "ERROR CLOSING INPUT SYS001  " for isSys001CloseErrTxt88600()
	 *	@return  Returns true if isSys001CloseErrTxt88600() is "ERROR CLOSING INPUT SYS001  "
	 */
   public boolean isSys001CloseErrTxt88600() throws CFException {
      return (  compareChars( getPmmWorkFileMsgDetail600() , sys001CloseErrTxt8860088Value)  == 0  );
   }


	/**
	*  set values "ERROR CLOSING INPUT SYS001  "
	*/
   	public void setSys001CloseErrTxt88600True() {  			
    	setPmmWorkFileMsgDetail600( sys001CloseErrTxt8860088Value);
   	}
	/**
	 *	Returns the value of sys001Status600
	 *	@return sys001Status600
	 */
   public char[] getSys001Status600() throws CFException{
     if (isSys001Status600Modified()) { 
        sys001Status600 = refreshSys001Status600();
     }
   		return sys001Status600;
   }

  
	/**
	*  set variable sys001Status600
	*  Corresponding COBOL Variable is 600-SYS001-STATUS
	*  @param value
	**/
   public void setSys001Status600(char[] value) {
      sys001Status600 = checkSys001Status600Constraints(value);
      serializeSys001Status600(sys001Status600);
   } 

     /**
	 * 	Update Sys001Status600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001Status600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys001Status600,sys001Status600.length);
   	
   }
   
   public void setSys001Status600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys001Status600,sys001Status600.length);
   	
   }
   
     /**
	 * 	Update Sys001Status600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001Status600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001Status600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys001Status600 with another Field
	 *	@param value
	 */
   public void setSys001Status600(Field source) {
       replace(source,0,source.length(),beginSys001Status600,SYS_001_STATUS_600_LEN);
   	
   }  
   
     /**
	 * 	Update Sys001Status600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001Status600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys001Status600,SYS_001_STATUS_600_LEN);
   	
   }
   
     /**
	 * 	Update Sys001Status600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001Status600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001Status600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys001ErrMsgTxt600FieldLength() {
			return SYS_001_ERR_MSG_TXT_600_LENGTH;
		}

}
  
