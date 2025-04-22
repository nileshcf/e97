package com.cloudframe.app.ip809050.dto;

/**
*  The class RunControlErrMsgTxt600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:16. using version 5.0.0.254
**/


import com.cloudframe.app.ip809050.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RunControlErrMsgTxt600 extends RunControlErrMsgTxt600Serialized {
   

						private char[] runControlMsgDtl600 = new char[35];


						private char[] runCtrlFileStatus600 = new char[2];
	
	/**
	* Constructor for RunControlErrMsgTxt600
	**/
    public RunControlErrMsgTxt600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setRunControlMsgDtl600(fillSpace(35));
       replaceValue( // serialize and save the value
             (" FILE STATUS :      ").toCharArray()
             , getStartOffset() + 35
             ,20
             );
								setRunCtrlFileStatus600(fillSpace(2));
    }


 

	/**
	 *	Returns the value of runControlMsgDtl600
	 *	@return runControlMsgDtl600
	 */
   public char[] getRunControlMsgDtl600() throws CFException{
     if (isRunControlMsgDtl600Modified()) { 
        runControlMsgDtl600 = refreshRunControlMsgDtl600();
     }
   		return runControlMsgDtl600;
   }

  
	/**
	*  set variable runControlMsgDtl600
	*  Corresponding COBOL Variable is 600-RUN-CONTROL-MSG-DTL
	*  @param value
	**/
   public void setRunControlMsgDtl600(char[] value) {
      runControlMsgDtl600 = checkRunControlMsgDtl600Constraints(value);
      serializeRunControlMsgDtl600(runControlMsgDtl600);
   } 

     /**
	 * 	Update RunControlMsgDtl600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRunControlMsgDtl600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRunControlMsgDtl600,runControlMsgDtl600.length);
   	
   }
   
   public void setRunControlMsgDtl600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRunControlMsgDtl600,runControlMsgDtl600.length);
   	
   }
   
     /**
	 * 	Update RunControlMsgDtl600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRunControlMsgDtl600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRunControlMsgDtl600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RunControlMsgDtl600 with another Field
	 *	@param value
	 */
   public void setRunControlMsgDtl600(Field source) {
       replace(source,0,source.length(),beginRunControlMsgDtl600,RUN_CONTROL_MSG_DTL_600_LEN);
   	
   }  
   
     /**
	 * 	Update RunControlMsgDtl600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRunControlMsgDtl600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRunControlMsgDtl600,RUN_CONTROL_MSG_DTL_600_LEN);
   	
   }
   
     /**
	 * 	Update RunControlMsgDtl600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRunControlMsgDtl600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRunControlMsgDtl600+targetIndex,targetLen);
    
   }
	char[] runCtrlOpenErrTxt8860088Value = "ERROR OPENING RUN CONTROL FILE     ".toCharArray();
	/**
	 *	Test condition "ERROR OPENING RUN CONTROL FILE" for isRunCtrlOpenErrTxt88600()
	 *	@return  Returns true if isRunCtrlOpenErrTxt88600() is "ERROR OPENING RUN CONTROL FILE"
	 */
   public boolean isRunCtrlOpenErrTxt88600() throws CFException {
      return (  compareChars( getRunControlMsgDtl600() , runCtrlOpenErrTxt8860088Value)  == 0  );
   }


	/**
	*  set values "ERROR OPENING RUN CONTROL FILE"
	*/
   	public void setRunCtrlOpenErrTxt88600True() {  			
    	setRunControlMsgDtl600( runCtrlOpenErrTxt8860088Value);
   	}
	char[] runCtrlEmtyErrTxt8860088Value = "EMPTY RUN CONTROL FILE             ".toCharArray();
	/**
	 *	Test condition "EMPTY RUN CONTROL FILE" for isRunCtrlEmtyErrTxt88600()
	 *	@return  Returns true if isRunCtrlEmtyErrTxt88600() is "EMPTY RUN CONTROL FILE"
	 */
   public boolean isRunCtrlEmtyErrTxt88600() throws CFException {
      return (  compareChars( getRunControlMsgDtl600() , runCtrlEmtyErrTxt8860088Value)  == 0  );
   }


	/**
	*  set values "EMPTY RUN CONTROL FILE"
	*/
   	public void setRunCtrlEmtyErrTxt88600True() {  			
    	setRunControlMsgDtl600( runCtrlEmtyErrTxt8860088Value);
   	}
	char[] runCtrlCloseErrTxt8860088Value = "ERROR CLOSING RUN CONTROL FILE     ".toCharArray();
	/**
	 *	Test condition "ERROR CLOSING RUN CONTROL FILE" for isRunCtrlCloseErrTxt88600()
	 *	@return  Returns true if isRunCtrlCloseErrTxt88600() is "ERROR CLOSING RUN CONTROL FILE"
	 */
   public boolean isRunCtrlCloseErrTxt88600() throws CFException {
      return (  compareChars( getRunControlMsgDtl600() , runCtrlCloseErrTxt8860088Value)  == 0  );
   }


	/**
	*  set values "ERROR CLOSING RUN CONTROL FILE"
	*/
   	public void setRunCtrlCloseErrTxt88600True() {  			
    	setRunControlMsgDtl600( runCtrlCloseErrTxt8860088Value);
   	}
	/**
	 *	Returns the value of runCtrlFileStatus600
	 *	@return runCtrlFileStatus600
	 */
   public char[] getRunCtrlFileStatus600() throws CFException{
     if (isRunCtrlFileStatus600Modified()) { 
        runCtrlFileStatus600 = refreshRunCtrlFileStatus600();
     }
   		return runCtrlFileStatus600;
   }

  
	/**
	*  set variable runCtrlFileStatus600
	*  Corresponding COBOL Variable is 600-RUN-CTRL-FILE-STATUS
	*  @param value
	**/
   public void setRunCtrlFileStatus600(char[] value) {
      runCtrlFileStatus600 = checkRunCtrlFileStatus600Constraints(value);
      serializeRunCtrlFileStatus600(runCtrlFileStatus600);
   } 

     /**
	 * 	Update RunCtrlFileStatus600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRunCtrlFileStatus600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRunCtrlFileStatus600,runCtrlFileStatus600.length);
   	
   }
   
   public void setRunCtrlFileStatus600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRunCtrlFileStatus600,runCtrlFileStatus600.length);
   	
   }
   
     /**
	 * 	Update RunCtrlFileStatus600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRunCtrlFileStatus600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRunCtrlFileStatus600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RunCtrlFileStatus600 with another Field
	 *	@param value
	 */
   public void setRunCtrlFileStatus600(Field source) {
       replace(source,0,source.length(),beginRunCtrlFileStatus600,RUN_CTRL_FILE_STATUS_600_LEN);
   	
   }  
   
     /**
	 * 	Update RunCtrlFileStatus600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRunCtrlFileStatus600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRunCtrlFileStatus600,RUN_CTRL_FILE_STATUS_600_LEN);
   	
   }
   
     /**
	 * 	Update RunCtrlFileStatus600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRunCtrlFileStatus600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRunCtrlFileStatus600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRunControlErrMsgTxt600FieldLength() {
			return RUN_CONTROL_ERR_MSG_TXT_600_LENGTH;
		}

}
  
