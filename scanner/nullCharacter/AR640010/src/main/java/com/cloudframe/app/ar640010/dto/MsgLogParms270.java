package com.cloudframe.app.ar640010.dto;

/**
*  The class MsgLogParms270 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class MsgLogParms270 extends MsgLogParms270Serialized {
   

						private char[] opConsMsgLogInd270 = new char[1];

						private char[] jobSysoutMsgLogInd270 = new char[1];
	
	/**
	* Constructor for MsgLogParms270
	**/
    public MsgLogParms270() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setOpConsMsgLogInd270(fillSpace(1));
								setJobSysoutMsgLogInd270(fillSpace(1));
    }


 

	/**
	 *	Returns the value of opConsMsgLogInd270
	 *	@return opConsMsgLogInd270
	 */
   public char[] getOpConsMsgLogInd270() throws CFException{
     if (isOpConsMsgLogInd270Modified()) { 
        opConsMsgLogInd270 = refreshOpConsMsgLogInd270();
     }
   		return opConsMsgLogInd270;
   }

  
	/**
	*  set variable opConsMsgLogInd270
	*  Corresponding COBOL Variable is 270-OP-CONS-MSG-LOG-IND
	*  @param value
	**/
   public void setOpConsMsgLogInd270(char[] value) {
      opConsMsgLogInd270 = checkOpConsMsgLogInd270Constraints(value);
      serializeOpConsMsgLogInd270(opConsMsgLogInd270);
   } 

     /**
	 * 	Update OpConsMsgLogInd270 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOpConsMsgLogInd270(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginOpConsMsgLogInd270,opConsMsgLogInd270.length);
   	
   }
   
   public void setOpConsMsgLogInd270(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginOpConsMsgLogInd270,opConsMsgLogInd270.length);
   	
   }
   
     /**
	 * 	Update OpConsMsgLogInd270 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOpConsMsgLogInd270(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOpConsMsgLogInd270+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update OpConsMsgLogInd270 with another Field
	 *	@param value
	 */
   public void setOpConsMsgLogInd270(Field source) {
       replace(source,0,source.length(),beginOpConsMsgLogInd270,OP_CONS_MSG_LOG_IND_270_LEN);
   	
   }  
   
     /**
	 * 	Update OpConsMsgLogInd270 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOpConsMsgLogInd270(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginOpConsMsgLogInd270,OP_CONS_MSG_LOG_IND_270_LEN);
   	
   }
   
     /**
	 * 	Update OpConsMsgLogInd270 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOpConsMsgLogInd270(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOpConsMsgLogInd270+targetIndex,targetLen);
    
   }
	char[] opConsMsgLogOn8827088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isOpConsMsgLogOn88270()
	 *	@return  Returns true if isOpConsMsgLogOn88270() is "Y"
	 */
   public boolean isOpConsMsgLogOn88270() throws CFException {
      return (  compareChars( getOpConsMsgLogInd270() , opConsMsgLogOn8827088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setOpConsMsgLogOn88270True() {  			
    	setOpConsMsgLogInd270( opConsMsgLogOn8827088Value);
   	}
	char[] opConsMsgLogOff8827088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isOpConsMsgLogOff88270()
	 *	@return  Returns true if isOpConsMsgLogOff88270() is "N"
	 */
   public boolean isOpConsMsgLogOff88270() throws CFException {
      return (  compareChars( getOpConsMsgLogInd270() , opConsMsgLogOff8827088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setOpConsMsgLogOff88270True() {  			
    	setOpConsMsgLogInd270( opConsMsgLogOff8827088Value);
   	}
	/**
	 *	Returns the value of jobSysoutMsgLogInd270
	 *	@return jobSysoutMsgLogInd270
	 */
   public char[] getJobSysoutMsgLogInd270() throws CFException{
     if (isJobSysoutMsgLogInd270Modified()) { 
        jobSysoutMsgLogInd270 = refreshJobSysoutMsgLogInd270();
     }
   		return jobSysoutMsgLogInd270;
   }

  
	/**
	*  set variable jobSysoutMsgLogInd270
	*  Corresponding COBOL Variable is 270-JOB-SYSOUT-MSG-LOG-IND
	*  @param value
	**/
   public void setJobSysoutMsgLogInd270(char[] value) {
      jobSysoutMsgLogInd270 = checkJobSysoutMsgLogInd270Constraints(value);
      serializeJobSysoutMsgLogInd270(jobSysoutMsgLogInd270);
   } 

     /**
	 * 	Update JobSysoutMsgLogInd270 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setJobSysoutMsgLogInd270(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginJobSysoutMsgLogInd270,jobSysoutMsgLogInd270.length);
   	
   }
   
   public void setJobSysoutMsgLogInd270(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginJobSysoutMsgLogInd270,jobSysoutMsgLogInd270.length);
   	
   }
   
     /**
	 * 	Update JobSysoutMsgLogInd270 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setJobSysoutMsgLogInd270(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginJobSysoutMsgLogInd270+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update JobSysoutMsgLogInd270 with another Field
	 *	@param value
	 */
   public void setJobSysoutMsgLogInd270(Field source) {
       replace(source,0,source.length(),beginJobSysoutMsgLogInd270,JOB_SYSOUT_MSG_LOG_IND_270_LEN);
   	
   }  
   
     /**
	 * 	Update JobSysoutMsgLogInd270 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setJobSysoutMsgLogInd270(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginJobSysoutMsgLogInd270,JOB_SYSOUT_MSG_LOG_IND_270_LEN);
   	
   }
   
     /**
	 * 	Update JobSysoutMsgLogInd270 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setJobSysoutMsgLogInd270(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginJobSysoutMsgLogInd270+targetIndex,targetLen);
    
   }
	char[] jobSysoutMsgLogOn8827088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isJobSysoutMsgLogOn88270()
	 *	@return  Returns true if isJobSysoutMsgLogOn88270() is "Y"
	 */
   public boolean isJobSysoutMsgLogOn88270() throws CFException {
      return (  compareChars( getJobSysoutMsgLogInd270() , jobSysoutMsgLogOn8827088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setJobSysoutMsgLogOn88270True() {  			
    	setJobSysoutMsgLogInd270( jobSysoutMsgLogOn8827088Value);
   	}
	char[] jobSysoutMsgLogOff8827088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isJobSysoutMsgLogOff88270()
	 *	@return  Returns true if isJobSysoutMsgLogOff88270() is "N"
	 */
   public boolean isJobSysoutMsgLogOff88270() throws CFException {
      return (  compareChars( getJobSysoutMsgLogInd270() , jobSysoutMsgLogOff8827088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setJobSysoutMsgLogOff88270True() {  			
    	setJobSysoutMsgLogInd270( jobSysoutMsgLogOff8827088Value);
   	}

	
	
	
	/**
	 * 	initializes MsgLogParms270
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setOpConsMsgLogInd270(CONSTANTS.SPACE);
         setJobSysoutMsgLogInd270(CONSTANTS.SPACE);
   }

		public static int getMsgLogParms270FieldLength() {
			return MSG_LOG_PARMS_270_LENGTH;
		}

}
  
