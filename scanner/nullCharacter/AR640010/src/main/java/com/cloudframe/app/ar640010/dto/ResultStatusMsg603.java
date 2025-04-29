package com.cloudframe.app.ar640010.dto;

/**
*  The class ResultStatusMsg603 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:41. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ResultStatusMsg603 extends ResultStatusMsg603Serialized {
   


							private char[] resultStatusMsg603ConditionGroup2 = new char[14];
						


						private char[] resultEndptId603 = new char[7];


						private char[] resultStatus603 = new char[6];
	
	/**
	* Constructor for ResultStatusMsg603
	**/
    public ResultStatusMsg603() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("0021-").toCharArray()
             , getStartOffset() + 0
             ,5
             );
       replaceValue( // serialize and save the value
             fillSpace(14)
             , getStartOffset() + 5
             ,14
             );
       replaceValue( // serialize and save the value
             (" ENDPOINT ").toCharArray()
             , getStartOffset() + 19
             ,10
             );
								setResultEndptId603(fillSpace(7));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 36
             ,1
             );
								setResultStatus603(fillSpace(6));
    }


 

	/**
	 *	Returns the value of resultStatusMsg603ConditionGroup2
	 *	@return resultStatusMsg603ConditionGroup2
	 */
   public char[] getResultStatusMsg603ConditionGroup2() throws CFException{
     if (isResultStatusMsg603ConditionGroup2Modified()) { 
        resultStatusMsg603ConditionGroup2 = refreshResultStatusMsg603ConditionGroup2();
     }
   		return resultStatusMsg603ConditionGroup2;
   }

  
	/**
	*  set variable resultStatusMsg603ConditionGroup2
	*  Corresponding COBOL Variable is FILLER
	*  @param value
	**/
   public void setResultStatusMsg603ConditionGroup2(char[] value) {
      resultStatusMsg603ConditionGroup2 = checkResultStatusMsg603ConditionGroup2Constraints(value);
      serializeResultStatusMsg603ConditionGroup2(resultStatusMsg603ConditionGroup2);
   } 

     /**
	 * 	Update ResultStatusMsg603ConditionGroup2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setResultStatusMsg603ConditionGroup2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginResultStatusMsg603ConditionGroup2,resultStatusMsg603ConditionGroup2.length);
   	
   }
   
   public void setResultStatusMsg603ConditionGroup2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginResultStatusMsg603ConditionGroup2,resultStatusMsg603ConditionGroup2.length);
   	
   }
   
     /**
	 * 	Update ResultStatusMsg603ConditionGroup2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setResultStatusMsg603ConditionGroup2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResultStatusMsg603ConditionGroup2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ResultStatusMsg603ConditionGroup2 with another Field
	 *	@param value
	 */
   public void setResultStatusMsg603ConditionGroup2(Field source) {
       replace(source,0,source.length(),beginResultStatusMsg603ConditionGroup2,RESULT_STATUS_MSG_603_CONDITION_GROUP_2_LEN);
   	
   }  
   
     /**
	 * 	Update ResultStatusMsg603ConditionGroup2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setResultStatusMsg603ConditionGroup2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginResultStatusMsg603ConditionGroup2,RESULT_STATUS_MSG_603_CONDITION_GROUP_2_LEN);
   	
   }
   
     /**
	 * 	Update ResultStatusMsg603ConditionGroup2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setResultStatusMsg603ConditionGroup2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResultStatusMsg603ConditionGroup2+targetIndex,targetLen);
    
   }
	char[] resultBulkBroadcast8860388Value = "BULK BROADCAST".toCharArray();
	/**
	 *	Test condition "BULK BROADCAST" for isResultBulkBroadcast88603()
	 *	@return  Returns true if isResultBulkBroadcast88603() is "BULK BROADCAST"
	 */
   public boolean isResultBulkBroadcast88603() throws CFException {
      return (  compareChars( getResultStatusMsg603ConditionGroup2() , resultBulkBroadcast8860388Value)  == 0  );
   }


	/**
	*  set values "BULK BROADCAST"
	*/
   	public void setResultBulkBroadcast88603True() {  			
    	setResultStatusMsg603ConditionGroup2( resultBulkBroadcast8860388Value);
   	}
	char[] resultListBroadcast8860388Value = "LIST BROADCAST".toCharArray();
	/**
	 *	Test condition "LIST BROADCAST" for isResultListBroadcast88603()
	 *	@return  Returns true if isResultListBroadcast88603() is "LIST BROADCAST"
	 */
   public boolean isResultListBroadcast88603() throws CFException {
      return (  compareChars( getResultStatusMsg603ConditionGroup2() , resultListBroadcast8860388Value)  == 0  );
   }


	/**
	*  set values "LIST BROADCAST"
	*/
   	public void setResultListBroadcast88603True() {  			
    	setResultStatusMsg603ConditionGroup2( resultListBroadcast8860388Value);
   	}
	char[] resultSendRequested8860388Value = "SEND REQUESTED".toCharArray();
	/**
	 *	Test condition "SEND REQUESTED" for isResultSendRequested88603()
	 *	@return  Returns true if isResultSendRequested88603() is "SEND REQUESTED"
	 */
   public boolean isResultSendRequested88603() throws CFException {
      return (  compareChars( getResultStatusMsg603ConditionGroup2() , resultSendRequested8860388Value)  == 0  );
   }


	/**
	*  set values "SEND REQUESTED"
	*/
   	public void setResultSendRequested88603True() {  			
    	setResultStatusMsg603ConditionGroup2( resultSendRequested8860388Value);
   	}
	char[] resultInstallAction8860388Value = "INSTALL ACTION".toCharArray();
	/**
	 *	Test condition "INSTALL ACTION" for isResultInstallAction88603()
	 *	@return  Returns true if isResultInstallAction88603() is "INSTALL ACTION"
	 */
   public boolean isResultInstallAction88603() throws CFException {
      return (  compareChars( getResultStatusMsg603ConditionGroup2() , resultInstallAction8860388Value)  == 0  );
   }


	/**
	*  set values "INSTALL ACTION"
	*/
   	public void setResultInstallAction88603True() {  			
    	setResultStatusMsg603ConditionGroup2( resultInstallAction8860388Value);
   	}
	char[] resultBackupReroute8860388Value = "BACKUP REROUTE".toCharArray();
	/**
	 *	Test condition "BACKUP REROUTE" for isResultBackupReroute88603()
	 *	@return  Returns true if isResultBackupReroute88603() is "BACKUP REROUTE"
	 */
   public boolean isResultBackupReroute88603() throws CFException {
      return (  compareChars( getResultStatusMsg603ConditionGroup2() , resultBackupReroute8860388Value)  == 0  );
   }


	/**
	*  set values "BACKUP REROUTE"
	*/
   	public void setResultBackupReroute88603True() {  			
    	setResultStatusMsg603ConditionGroup2( resultBackupReroute8860388Value);
   	}
	/**
	 *	Returns the value of resultEndptId603
	 *	@return resultEndptId603
	 */
   public char[] getResultEndptId603() throws CFException{
     if (isResultEndptId603Modified()) { 
        resultEndptId603 = refreshResultEndptId603();
     }
   		return resultEndptId603;
   }

  
	/**
	*  set variable resultEndptId603
	*  Corresponding COBOL Variable is 603-RESULT-ENDPT-ID
	*  @param value
	**/
   public void setResultEndptId603(char[] value) {
      resultEndptId603 = checkResultEndptId603Constraints(value);
      serializeResultEndptId603(resultEndptId603);
   } 

     /**
	 * 	Update ResultEndptId603 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setResultEndptId603(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginResultEndptId603,resultEndptId603.length);
   	
   }
   
   public void setResultEndptId603(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginResultEndptId603,resultEndptId603.length);
   	
   }
   
     /**
	 * 	Update ResultEndptId603 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setResultEndptId603(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResultEndptId603+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ResultEndptId603 with another Field
	 *	@param value
	 */
   public void setResultEndptId603(Field source) {
       replace(source,0,source.length(),beginResultEndptId603,RESULT_ENDPT_ID_603_LEN);
   	
   }  
   
     /**
	 * 	Update ResultEndptId603 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setResultEndptId603(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginResultEndptId603,RESULT_ENDPT_ID_603_LEN);
   	
   }
   
     /**
	 * 	Update ResultEndptId603 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setResultEndptId603(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResultEndptId603+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of resultStatus603
	 *	@return resultStatus603
	 */
   public char[] getResultStatus603() throws CFException{
     if (isResultStatus603Modified()) { 
        resultStatus603 = refreshResultStatus603();
     }
   		return resultStatus603;
   }

  
	/**
	*  set variable resultStatus603
	*  Corresponding COBOL Variable is 603-RESULT-STATUS
	*  @param value
	**/
   public void setResultStatus603(char[] value) {
      resultStatus603 = checkResultStatus603Constraints(value);
      serializeResultStatus603(resultStatus603);
   } 

     /**
	 * 	Update ResultStatus603 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setResultStatus603(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginResultStatus603,resultStatus603.length);
   	
   }
   
   public void setResultStatus603(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginResultStatus603,resultStatus603.length);
   	
   }
   
     /**
	 * 	Update ResultStatus603 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setResultStatus603(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResultStatus603+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ResultStatus603 with another Field
	 *	@param value
	 */
   public void setResultStatus603(Field source) {
       replace(source,0,source.length(),beginResultStatus603,RESULT_STATUS_603_LEN);
   	
   }  
   
     /**
	 * 	Update ResultStatus603 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setResultStatus603(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginResultStatus603,RESULT_STATUS_603_LEN);
   	
   }
   
     /**
	 * 	Update ResultStatus603 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setResultStatus603(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResultStatus603+targetIndex,targetLen);
    
   }
	char[] resultPosted8860388Value = "POSTED".toCharArray();
	/**
	 *	Test condition "POSTED" for isResultPosted88603()
	 *	@return  Returns true if isResultPosted88603() is "POSTED"
	 */
   public boolean isResultPosted88603() throws CFException {
      return (  compareChars( getResultStatus603() , resultPosted8860388Value)  == 0  );
   }


	/**
	*  set values "POSTED"
	*/
   	public void setResultPosted88603True() {  			
    	setResultStatus603( resultPosted8860388Value);
   	}
	char[] resultWaited8860388Value = "WAITED".toCharArray();
	/**
	 *	Test condition "WAITED" for isResultWaited88603()
	 *	@return  Returns true if isResultWaited88603() is "WAITED"
	 */
   public boolean isResultWaited88603() throws CFException {
      return (  compareChars( getResultStatus603() , resultWaited8860388Value)  == 0  );
   }


	/**
	*  set values "WAITED"
	*/
   	public void setResultWaited88603True() {  			
    	setResultStatus603( resultWaited8860388Value);
   	}
	char[] resultQuiesced8860388Value = "QUIESC".toCharArray();
	/**
	 *	Test condition "QUIESC" for isResultQuiesced88603()
	 *	@return  Returns true if isResultQuiesced88603() is "QUIESC"
	 */
   public boolean isResultQuiesced88603() throws CFException {
      return (  compareChars( getResultStatus603() , resultQuiesced8860388Value)  == 0  );
   }


	/**
	*  set values "QUIESC"
	*/
   	public void setResultQuiesced88603True() {  			
    	setResultStatus603( resultQuiesced8860388Value);
   	}
	char[] resultRouted8860388Value = "ROUTED".toCharArray();
	/**
	 *	Test condition "ROUTED" for isResultRouted88603()
	 *	@return  Returns true if isResultRouted88603() is "ROUTED"
	 */
   public boolean isResultRouted88603() throws CFException {
      return (  compareChars( getResultStatus603() , resultRouted8860388Value)  == 0  );
   }


	/**
	*  set values "ROUTED"
	*/
   	public void setResultRouted88603True() {  			
    	setResultStatus603( resultRouted8860388Value);
   	}
	char[] resultRepeat8860388Value = "REPEAT".toCharArray();
	/**
	 *	Test condition "REPEAT" for isResultRepeat88603()
	 *	@return  Returns true if isResultRepeat88603() is "REPEAT"
	 */
   public boolean isResultRepeat88603() throws CFException {
      return (  compareChars( getResultStatus603() , resultRepeat8860388Value)  == 0  );
   }


	/**
	*  set values "REPEAT"
	*/
   	public void setResultRepeat88603True() {  			
    	setResultStatus603( resultRepeat8860388Value);
   	}
	char[] resultFailed8860388Value = "FAILED".toCharArray();
	/**
	 *	Test condition "FAILED" for isResultFailed88603()
	 *	@return  Returns true if isResultFailed88603() is "FAILED"
	 */
   public boolean isResultFailed88603() throws CFException {
      return (  compareChars( getResultStatus603() , resultFailed8860388Value)  == 0  );
   }


	/**
	*  set values "FAILED"
	*/
   	public void setResultFailed88603True() {  			
    	setResultStatus603( resultFailed8860388Value);
   	}
	char[] resultEFlag8860388Value = "E FLAG".toCharArray();
	/**
	 *	Test condition "E FLAG" for isResultEFlag88603()
	 *	@return  Returns true if isResultEFlag88603() is "E FLAG"
	 */
   public boolean isResultEFlag88603() throws CFException {
      return (  compareChars( getResultStatus603() , resultEFlag8860388Value)  == 0  );
   }


	/**
	*  set values "E FLAG"
	*/
   	public void setResultEFlag88603True() {  			
    	setResultStatus603( resultEFlag8860388Value);
   	}

	
	
	

		public static int getResultStatusMsg603FieldLength() {
			return RESULT_STATUS_MSG_603_LENGTH;
		}

}
  
