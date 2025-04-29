package com.cloudframe.app.ar640010.dto;

/**
*  The class ResultReasonMsg603 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:41. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ResultReasonMsg603 extends ResultReasonMsg603Serialized {
   

							private char[] resultReasonMsg603ConditionGroup1 = new char[9];
						

						private char[] resultReason603 = new char[29];
				private ResultReason603Redefined01 resultReason603Redefined01 = new ResultReason603Redefined01();
				private ResultReason603Redefined resultReason603Redefined = new ResultReason603Redefined();
	
	/**
	* Constructor for ResultReasonMsg603
	**/
    public ResultReasonMsg603() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			resultReason603Redefined01.setParent(this,getStartOffset() + 9);
	       			resultReason603Redefined.setParent(this,getStartOffset() + 9);
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(9)
             , getStartOffset() + 0
             ,9
             );
								setResultReason603(fillSpace(29));
    }


 

	/**
	 *	Returns the value of resultReasonMsg603ConditionGroup1
	 *	@return resultReasonMsg603ConditionGroup1
	 */
   public char[] getResultReasonMsg603ConditionGroup1() throws CFException{
     if (isResultReasonMsg603ConditionGroup1Modified()) { 
        resultReasonMsg603ConditionGroup1 = refreshResultReasonMsg603ConditionGroup1();
     }
   		return resultReasonMsg603ConditionGroup1;
   }

  
	/**
	*  set variable resultReasonMsg603ConditionGroup1
	*  Corresponding COBOL Variable is FILLER
	*  @param value
	**/
   public void setResultReasonMsg603ConditionGroup1(char[] value) {
      resultReasonMsg603ConditionGroup1 = checkResultReasonMsg603ConditionGroup1Constraints(value);
      serializeResultReasonMsg603ConditionGroup1(resultReasonMsg603ConditionGroup1);
   } 

     /**
	 * 	Update ResultReasonMsg603ConditionGroup1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setResultReasonMsg603ConditionGroup1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginResultReasonMsg603ConditionGroup1,resultReasonMsg603ConditionGroup1.length);
   	
   }
   
   public void setResultReasonMsg603ConditionGroup1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginResultReasonMsg603ConditionGroup1,resultReasonMsg603ConditionGroup1.length);
   	
   }
   
     /**
	 * 	Update ResultReasonMsg603ConditionGroup1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setResultReasonMsg603ConditionGroup1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResultReasonMsg603ConditionGroup1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ResultReasonMsg603ConditionGroup1 with another Field
	 *	@param value
	 */
   public void setResultReasonMsg603ConditionGroup1(Field source) {
       replace(source,0,source.length(),beginResultReasonMsg603ConditionGroup1,RESULT_REASON_MSG_603_CONDITION_GROUP_1_LEN);
   	
   }  
   
     /**
	 * 	Update ResultReasonMsg603ConditionGroup1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setResultReasonMsg603ConditionGroup1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginResultReasonMsg603ConditionGroup1,RESULT_REASON_MSG_603_CONDITION_GROUP_1_LEN);
   	
   }
   
     /**
	 * 	Update ResultReasonMsg603ConditionGroup1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setResultReasonMsg603ConditionGroup1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResultReasonMsg603ConditionGroup1+targetIndex,targetLen);
    
   }
	char[] resultIsReason8860388Value = " REASON: ".toCharArray();
	/**
	 *	Test condition " REASON: " for isResultIsReason88603()
	 *	@return  Returns true if isResultIsReason88603() is " REASON: "
	 */
   public boolean isResultIsReason88603() throws CFException {
      return (  compareChars( getResultReasonMsg603ConditionGroup1() , resultIsReason8860388Value)  == 0  );
   }


	/**
	*  set values " REASON: "
	*/
   	public void setResultIsReason88603True() {  			
    	setResultReasonMsg603ConditionGroup1( resultIsReason8860388Value);
   	}
	char[] resultTaraept8860388Value = " TARAEPT ".toCharArray();
	/**
	 *	Test condition " TARAEPT " for isResultTaraept88603()
	 *	@return  Returns true if isResultTaraept88603() is " TARAEPT "
	 */
   public boolean isResultTaraept88603() throws CFException {
      return (  compareChars( getResultReasonMsg603ConditionGroup1() , resultTaraept8860388Value)  == 0  );
   }


	/**
	*  set values " TARAEPT "
	*/
   	public void setResultTaraept88603True() {  			
    	setResultReasonMsg603ConditionGroup1( resultTaraept8860388Value);
   	}
	char[] resultOnHold8860388Value = "-ON HOLD ".toCharArray();
	/**
	 *	Test condition "-ON HOLD " for isResultOnHold88603()
	 *	@return  Returns true if isResultOnHold88603() is "-ON HOLD "
	 */
   public boolean isResultOnHold88603() throws CFException {
      return (  compareChars( getResultReasonMsg603ConditionGroup1() , resultOnHold8860388Value)  == 0  );
   }


	/**
	*  set values "-ON HOLD "
	*/
   	public void setResultOnHold88603True() {  			
    	setResultReasonMsg603ConditionGroup1( resultOnHold8860388Value);
   	}
	/**
	 *	Returns the value of resultReason603
	 *	@return resultReason603
	 */
   public char[] getResultReason603() throws CFException{
     if (isResultReason603Modified()) { 
        resultReason603 = refreshResultReason603();
     }
   		return resultReason603;
   }

  
	/**
	*  set variable resultReason603
	*  Corresponding COBOL Variable is 603-RESULT-REASON
	*  @param value
	**/
   public void setResultReason603(char[] value) {
      resultReason603 = checkResultReason603Constraints(value);
      serializeResultReason603(resultReason603);
   } 

     /**
	 * 	Update ResultReason603 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setResultReason603(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginResultReason603,resultReason603.length);
   	
   }
   
   public void setResultReason603(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginResultReason603,resultReason603.length);
   	
   }
   
     /**
	 * 	Update ResultReason603 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setResultReason603(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResultReason603+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ResultReason603 with another Field
	 *	@param value
	 */
   public void setResultReason603(Field source) {
       replace(source,0,source.length(),beginResultReason603,RESULT_REASON_603_LEN);
   	
   }  
   
     /**
	 * 	Update ResultReason603 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setResultReason603(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginResultReason603,RESULT_REASON_603_LEN);
   	
   }
   
     /**
	 * 	Update ResultReason603 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setResultReason603(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResultReason603+targetIndex,targetLen);
    
   }
	char[] resultEptMissing8860388Value = "TARAEPT ENDPOINT MISSING     ".toCharArray();
	/**
	 *	Test condition "TARAEPT ENDPOINT MISSING     " for isResultEptMissing88603()
	 *	@return  Returns true if isResultEptMissing88603() is "TARAEPT ENDPOINT MISSING     "
	 */
   public boolean isResultEptMissing88603() throws CFException {
      return (  compareChars( getResultReason603() , resultEptMissing8860388Value)  == 0  );
   }


	/**
	*  set values "TARAEPT ENDPOINT MISSING     "
	*/
   	public void setResultEptMissing88603True() {  			
    	setResultReason603( resultEptMissing8860388Value);
   	}
	char[] resultEptBackup8860388Value = "TARAEPT BACKUP ENDPNT MISSING".toCharArray();
	/**
	 *	Test condition "TARAEPT BACKUP ENDPNT MISSING" for isResultEptBackup88603()
	 *	@return  Returns true if isResultEptBackup88603() is "TARAEPT BACKUP ENDPNT MISSING"
	 */
   public boolean isResultEptBackup88603() throws CFException {
      return (  compareChars( getResultReason603() , resultEptBackup8860388Value)  == 0  );
   }


	/**
	*  set values "TARAEPT BACKUP ENDPNT MISSING"
	*/
   	public void setResultEptBackup88603True() {  			
    	setResultReason603( resultEptBackup8860388Value);
   	}
	char[] resultEptBroken8860388Value = "TARAEPT BACKUP CHAIN BROKEN  ".toCharArray();
	/**
	 *	Test condition "TARAEPT BACKUP CHAIN BROKEN  " for isResultEptBroken88603()
	 *	@return  Returns true if isResultEptBroken88603() is "TARAEPT BACKUP CHAIN BROKEN  "
	 */
   public boolean isResultEptBroken88603() throws CFException {
      return (  compareChars( getResultReason603() , resultEptBroken8860388Value)  == 0  );
   }


	/**
	*  set values "TARAEPT BACKUP CHAIN BROKEN  "
	*/
   	public void setResultEptBroken88603True() {  			
    	setResultReason603( resultEptBroken8860388Value);
   	}
	char[] resultEptLoops8860388Value = "TARAEPT BACKUP CHAIN LOOPS   ".toCharArray();
	/**
	 *	Test condition "TARAEPT BACKUP CHAIN LOOPS   " for isResultEptLoops88603()
	 *	@return  Returns true if isResultEptLoops88603() is "TARAEPT BACKUP CHAIN LOOPS   "
	 */
   public boolean isResultEptLoops88603() throws CFException {
      return (  compareChars( getResultReason603() , resultEptLoops8860388Value)  == 0  );
   }


	/**
	*  set values "TARAEPT BACKUP CHAIN LOOPS   "
	*/
   	public void setResultEptLoops88603True() {  			
    	setResultReason603( resultEptLoops8860388Value);
   	}
	char[] resultEfpSelect8860388Value = "TARAEFP SQL \"SELECT~quo".toCharArray();
	/**
	 *	Test condition "TARAEFP SQL \"SELECT\" ERROR   " for isResultEfpSelect88603()
	 *	@return  Returns true if isResultEfpSelect88603() is "TARAEFP SQL \"SELECT\" ERROR   "
	 */
   public boolean isResultEfpSelect88603() throws CFException {
      return (  compareChars( getResultReason603() , resultEfpSelect8860388Value)  == 0  );
   }


	/**
	*  set values "TARAEFP SQL \"SELECT\" ERROR   "
	*/
   	public void setResultEfpSelect88603True() {  			
    	setResultReason603( resultEfpSelect8860388Value);
   	}
	char[] resultEfpMissing8860388Value = "TARAEFP ENDPOINT MISSING     ".toCharArray();
	/**
	 *	Test condition "TARAEFP ENDPOINT MISSING     " for isResultEfpMissing88603()
	 *	@return  Returns true if isResultEfpMissing88603() is "TARAEFP ENDPOINT MISSING     "
	 */
   public boolean isResultEfpMissing88603() throws CFException {
      return (  compareChars( getResultReason603() , resultEfpMissing8860388Value)  == 0  );
   }


	/**
	*  set values "TARAEFP ENDPOINT MISSING     "
	*/
   	public void setResultEfpMissing88603True() {  			
    	setResultReason603( resultEfpMissing8860388Value);
   	}
	char[] resultEfpBackup8860388Value = "TARAEFP BACKUP ENDPNT MISSING".toCharArray();
	/**
	 *	Test condition "TARAEFP BACKUP ENDPNT MISSING" for isResultEfpBackup88603()
	 *	@return  Returns true if isResultEfpBackup88603() is "TARAEFP BACKUP ENDPNT MISSING"
	 */
   public boolean isResultEfpBackup88603() throws CFException {
      return (  compareChars( getResultReason603() , resultEfpBackup8860388Value)  == 0  );
   }


	/**
	*  set values "TARAEFP BACKUP ENDPNT MISSING"
	*/
   	public void setResultEfpBackup88603True() {  			
    	setResultReason603( resultEfpBackup8860388Value);
   	}
	char[] resultEfpStatus8860388Value = "PER TARAEFP STATUS CD COL = Y".toCharArray();
	/**
	 *	Test condition "PER TARAEFP STATUS CD COL = Y" for isResultEfpStatus88603()
	 *	@return  Returns true if isResultEfpStatus88603() is "PER TARAEFP STATUS CD COL = Y"
	 */
   public boolean isResultEfpStatus88603() throws CFException {
      return (  compareChars( getResultReason603() , resultEfpStatus8860388Value)  == 0  );
   }


	/**
	*  set values "PER TARAEFP STATUS CD COL = Y"
	*/
   	public void setResultEfpStatus88603True() {  			
    	setResultReason603( resultEfpStatus8860388Value);
   	}
	char[] resultFxsDupe8860388Value = "TARAFXS DUPLICATE ENDPOINT   ".toCharArray();
	/**
	 *	Test condition "TARAFXS DUPLICATE ENDPOINT   " for isResultFxsDupe88603()
	 *	@return  Returns true if isResultFxsDupe88603() is "TARAFXS DUPLICATE ENDPOINT   "
	 */
   public boolean isResultFxsDupe88603() throws CFException {
      return (  compareChars( getResultReason603() , resultFxsDupe8860388Value)  == 0  );
   }


	/**
	*  set values "TARAFXS DUPLICATE ENDPOINT   "
	*/
   	public void setResultFxsDupe88603True() {  			
    	setResultReason603( resultFxsDupe8860388Value);
   	}
	char[] resultFxsInsert8860388Value = "TARAFXS SQL \"INSERT~quo".toCharArray();
	/**
	 *	Test condition "TARAFXS SQL \"INSERT\" ERROR   " for isResultFxsInsert88603()
	 *	@return  Returns true if isResultFxsInsert88603() is "TARAFXS SQL \"INSERT\" ERROR   "
	 */
   public boolean isResultFxsInsert88603() throws CFException {
      return (  compareChars( getResultReason603() , resultFxsInsert8860388Value)  == 0  );
   }


	/**
	*  set values "TARAFXS SQL \"INSERT\" ERROR   "
	*/
   	public void setResultFxsInsert88603True() {  			
    	setResultReason603( resultFxsInsert8860388Value);
   	}
	char[] resultFxsUpdate8860388Value = "TARAFXS SQL \"UPDATE~quo".toCharArray();
	/**
	 *	Test condition "TARAFXS SQL \"UPDATE\" ERROR   " for isResultFxsUpdate88603()
	 *	@return  Returns true if isResultFxsUpdate88603() is "TARAFXS SQL \"UPDATE\" ERROR   "
	 */
   public boolean isResultFxsUpdate88603() throws CFException {
      return (  compareChars( getResultReason603() , resultFxsUpdate8860388Value)  == 0  );
   }


	/**
	*  set values "TARAFXS SQL \"UPDATE\" ERROR   "
	*/
   	public void setResultFxsUpdate88603True() {  			
    	setResultReason603( resultFxsUpdate8860388Value);
   	}
	char[] resultFxsRepeat8860388Value = "TARAFXS DUPE FTSS BULK FILEID".toCharArray();
	/**
	 *	Test condition "TARAFXS DUPE FTSS BULK FILEID" for isResultFxsRepeat88603()
	 *	@return  Returns true if isResultFxsRepeat88603() is "TARAFXS DUPE FTSS BULK FILEID"
	 */
   public boolean isResultFxsRepeat88603() throws CFException {
      return (  compareChars( getResultReason603() , resultFxsRepeat8860388Value)  == 0  );
   }


	/**
	*  set values "TARAFXS DUPE FTSS BULK FILEID"
	*/
   	public void setResultFxsRepeat88603True() {  			
    	setResultReason603( resultFxsRepeat8860388Value);
   	}
	char[] resultWaitExit8860388Value = "AWAITING APPL EXIT: XXXXXXXX ".toCharArray();
	/**
	 *	Test condition "AWAITING APPL EXIT: XXXXXXXX " for isResultWaitExit88603()
	 *	@return  Returns true if isResultWaitExit88603() is "AWAITING APPL EXIT: XXXXXXXX "
	 */
   public boolean isResultWaitExit88603() throws CFException {
      return (  compareChars( getResultReason603() , resultWaitExit8860388Value)  == 0  );
   }


	/**
	*  set values "AWAITING APPL EXIT: XXXXXXXX "
	*/
   	public void setResultWaitExit88603True() {  			
    	setResultReason603( resultWaitExit8860388Value);
   	}
	char[] resultWaitProc8860388Value = "AWAITING APPL EXIT PROCESSING".toCharArray();
	/**
	 *	Test condition "AWAITING APPL EXIT PROCESSING" for isResultWaitProc88603()
	 *	@return  Returns true if isResultWaitProc88603() is "AWAITING APPL EXIT PROCESSING"
	 */
   public boolean isResultWaitProc88603() throws CFException {
      return (  compareChars( getResultReason603() , resultWaitProc8860388Value)  == 0  );
   }


	/**
	*  set values "AWAITING APPL EXIT PROCESSING"
	*/
   	public void setResultWaitProc88603True() {  			
    	setResultReason603( resultWaitProc8860388Value);
   	}
	char[] resultBkupDest8860388Value = "BACKUP ENDPOINT DEST: XXXXXXX".toCharArray();
	/**
	 *	Test condition "BACKUP ENDPOINT DEST: XXXXXXX" for isResultBkupDest88603()
	 *	@return  Returns true if isResultBkupDest88603() is "BACKUP ENDPOINT DEST: XXXXXXX"
	 */
   public boolean isResultBkupDest88603() throws CFException {
      return (  compareChars( getResultReason603() , resultBkupDest8860388Value)  == 0  );
   }


	/**
	*  set values "BACKUP ENDPOINT DEST: XXXXXXX"
	*/
   	public void setResultBkupDest88603True() {  			
    	setResultReason603( resultBkupDest8860388Value);
   	}
	/**
	 *	Returns the value of resultReason603Redefined01
	 *	@return resultReason603Redefined01
	 */   
	 public ResultReason603Redefined01 getResultReason603Redefined01() {
   	return resultReason603Redefined01;
   }
   /**
	* 	Update ResultReason603Redefined01 with the passed value
	*   Corresponding COBOL Variable is 603-RESULT-REASON-REDEFINED
	*	@param value
	*/
   public void setResultReason603Redefined01(char[] value) {
      resultReason603Redefined01.setString(value); 
   }   
    
     /**
	 * 	Update ResultReason603Redefined01 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setResultReason603Redefined01(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,resultReason603Redefined01.begin,resultReason603Redefined01.length());
   }
   
     /**
	 * 	Update ResultReason603Redefined01 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setResultReason603Redefined01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,resultReason603Redefined01.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ResultReason603Redefined01 with another Field
	 *	@param value
	 */
   public void setResultReason603Redefined01(Field source) {
   	replace(source,0,source.length(),resultReason603Redefined01.begin,resultReason603Redefined01.length());
   }  
   
     /**
	 * 	Update ResultReason603Redefined01 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setResultReason603Redefined01(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,resultReason603Redefined01.begin,resultReason603Redefined01.length());
   }
   
     /**
	 * 	Update ResultReason603Redefined01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setResultReason603Redefined01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,resultReason603Redefined01.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of resultReason603Redefined
	 *	@return resultReason603Redefined
	 */   
	 public ResultReason603Redefined getResultReason603Redefined() {
   	return resultReason603Redefined;
   }
   /**
	* 	Update ResultReason603Redefined with the passed value
	*   Corresponding COBOL Variable is 603-RESULT-REASON-REDEFINED
	*	@param value
	*/
   public void setResultReason603Redefined(char[] value) {
      resultReason603Redefined.setString(value); 
   }   
    
     /**
	 * 	Update ResultReason603Redefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setResultReason603Redefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,resultReason603Redefined.begin,resultReason603Redefined.length());
   }
   
     /**
	 * 	Update ResultReason603Redefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setResultReason603Redefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,resultReason603Redefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ResultReason603Redefined with another Field
	 *	@param value
	 */
   public void setResultReason603Redefined(Field source) {
   	replace(source,0,source.length(),resultReason603Redefined.begin,resultReason603Redefined.length());
   }  
   
     /**
	 * 	Update ResultReason603Redefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setResultReason603Redefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,resultReason603Redefined.begin,resultReason603Redefined.length());
   }
   
     /**
	 * 	Update ResultReason603Redefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setResultReason603Redefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,resultReason603Redefined.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getResultReasonMsg603FieldLength() {
			return RESULT_REASON_MSG_603_LENGTH;
		}

}
  
