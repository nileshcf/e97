package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip30331FaFileIdStatusTbl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:57. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip30331FaFileIdStatusTbl extends Ip30331FaFileIdStatusTblSerialized { 
   

								private long ip30331MessageNumber;
				private Ip30331ErrorInfo ip30331ErrorInfo = new Ip30331ErrorInfo();
				private Ip30331Pds501Value ip30331Pds501Value = new Ip30331Pds501Value();

						private char[] ip30331EditStatus = Field.fillLowValue(1);

						private char[] ip30331CorpIncentFlag = Field.fillLowValue(1);

						private char[] ip303312ndlvlCorpIncntFlag = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip30331FaFileIdStatusTbl
	**/
    public Ip30331FaFileIdStatusTbl() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip30331FaFileIdStatusTbl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip30331FaFileIdStatusTbl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip30331ErrorInfo.setParent(this,getStartOffset() + 8);
	       			ip30331Pds501Value.setParent(this,getStartOffset() + 18);
    } 

	/**
	 *	Returns the value of ip30331MessageNumber
	 *	@return ip30331MessageNumber
	 */
	public long getIp30331MessageNumber() throws CFException {
       if (isIp30331MessageNumberModified()) { 
           ip30331MessageNumber = refreshIp30331MessageNumber();
        }
   		return ip30331MessageNumber;
	}
	

	
	   
	/**
	 * 	Update Ip30331MessageNumber with the passed value
	 *  Corresponding COBOL Variable is IP30331-MESSAGE-NUMBER
	 *	@param number
	 */
	public void setIp30331MessageNumber(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip30331MessageNumber = checkIp30331MessageNumberMaxLimit(number); 
		serializeIp30331MessageNumber(ip30331MessageNumber);
	}
	

	/**
	 * 	Update Ip30331MessageNumber with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp30331MessageNumber(char[] value) throws CFException {
		 ip30331MessageNumber = serializeIp30331MessageNumber(value);
	}
	/**
	 * 	Update Ip30331MessageNumber with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp30331MessageNumberString(char[] value) throws CFException {
		 setIp30331MessageNumber(value);
	}
	/**
	 *	Returns the value of ip30331ErrorInfo
	 *	@return ip30331ErrorInfo
	 */   
	 public Ip30331ErrorInfo getIp30331ErrorInfo() {
   	return ip30331ErrorInfo;
   }
   /**
	* 	Update Ip30331ErrorInfo with the passed value
	*   Corresponding COBOL Variable is IP30331-ERROR-INFO
	*	@param value
	*/
   public void setIp30331ErrorInfo(char[] value) {
      ip30331ErrorInfo.setString(value); 
   }   
    
     /**
	 * 	Update Ip30331ErrorInfo 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp30331ErrorInfo(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip30331ErrorInfo.begin,ip30331ErrorInfo.length());
   }
   
     /**
	 * 	Update Ip30331ErrorInfo 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp30331ErrorInfo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip30331ErrorInfo.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip30331ErrorInfo with another Field
	 *	@param value
	 */
   public void setIp30331ErrorInfo(Field source) {
   	replace(source,0,source.length(),ip30331ErrorInfo.begin,ip30331ErrorInfo.length());
   }  
   
     /**
	 * 	Update Ip30331ErrorInfo 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp30331ErrorInfo(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip30331ErrorInfo.begin,ip30331ErrorInfo.length());
   }
   
     /**
	 * 	Update Ip30331ErrorInfo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp30331ErrorInfo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip30331ErrorInfo.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip30331Pds501Value
	 *	@return ip30331Pds501Value
	 */   
	 public Ip30331Pds501Value getIp30331Pds501Value() {
   	return ip30331Pds501Value;
   }
   /**
	* 	Update Ip30331Pds501Value with the passed value
	*   Corresponding COBOL Variable is IP30331-PDS501-VALUE
	*	@param value
	*/
   public void setIp30331Pds501Value(char[] value) {
      ip30331Pds501Value.setString(value); 
   }   
    
     /**
	 * 	Update Ip30331Pds501Value 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp30331Pds501Value(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip30331Pds501Value.begin,ip30331Pds501Value.length());
   }
   
     /**
	 * 	Update Ip30331Pds501Value 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp30331Pds501Value(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip30331Pds501Value.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip30331Pds501Value with another Field
	 *	@param value
	 */
   public void setIp30331Pds501Value(Field source) {
   	replace(source,0,source.length(),ip30331Pds501Value.begin,ip30331Pds501Value.length());
   }  
   
     /**
	 * 	Update Ip30331Pds501Value 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp30331Pds501Value(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip30331Pds501Value.begin,ip30331Pds501Value.length());
   }
   
     /**
	 * 	Update Ip30331Pds501Value 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp30331Pds501Value(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip30331Pds501Value.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip30331EditStatus
	 *	@return ip30331EditStatus
	 */
   public char[] getIp30331EditStatus() throws CFException{
     if (isIp30331EditStatusModified()) { 
        ip30331EditStatus = refreshIp30331EditStatus();
     }
   		return ip30331EditStatus;
   }

  
	/**
	*  set variable ip30331EditStatus
	*  Corresponding COBOL Variable is IP30331-EDIT-STATUS
	*  @param value
	**/
   public void setIp30331EditStatus(char[] value) {
      ip30331EditStatus = checkIp30331EditStatusConstraints(value);
      serializeIp30331EditStatus(ip30331EditStatus);
   } 

     /**
	 * 	Update Ip30331EditStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp30331EditStatus(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp30331EditStatus,ip30331EditStatus.length);
   	
   }
   
   public void setIp30331EditStatus(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp30331EditStatus,ip30331EditStatus.length);
   	
   }
   
     /**
	 * 	Update Ip30331EditStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp30331EditStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp30331EditStatus+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip30331EditStatus with another Field
	 *	@param value
	 */
   public void setIp30331EditStatus(Field source) {
       replace(source,0,source.length(),beginIp30331EditStatus,IP_30331_EDIT_STATUS_LEN);
   	
   }  
   
     /**
	 * 	Update Ip30331EditStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp30331EditStatus(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp30331EditStatus,IP_30331_EDIT_STATUS_LEN);
   	
   }
   
     /**
	 * 	Update Ip30331EditStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp30331EditStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp30331EditStatus+targetIndex,targetLen);
    
   }
	char[] ip30331AddndmInError8888Value = "R".toCharArray();
	/**
	 *	Test condition "R" for isIp30331AddndmInError88()
	 *	@return  Returns true if isIp30331AddndmInError88() is "R"
	 */
   public boolean isIp30331AddndmInError88() throws CFException {
      return (  compareChars( getIp30331EditStatus() , ip30331AddndmInError8888Value)  == 0  );
   }


	/**
	*  set values "R"
	*/
   	public void setIp30331AddndmInError88True() {  			
    	setIp30331EditStatus( ip30331AddndmInError8888Value);
   	}
	char[] ip30331AddndmCausedError8888Value = "A".toCharArray();
	/**
	 *	Test condition "A" for isIp30331AddndmCausedError88()
	 *	@return  Returns true if isIp30331AddndmCausedError88() is "A"
	 */
   public boolean isIp30331AddndmCausedError88() throws CFException {
      return (  compareChars( getIp30331EditStatus() , ip30331AddndmCausedError8888Value)  == 0  );
   }


	/**
	*  set values "A"
	*/
   	public void setIp30331AddndmCausedError88True() {  			
    	setIp30331EditStatus( ip30331AddndmCausedError8888Value);
   	}
	/**
	 *	Returns the value of ip30331CorpIncentFlag
	 *	@return ip30331CorpIncentFlag
	 */
   public char[] getIp30331CorpIncentFlag() throws CFException{
     if (isIp30331CorpIncentFlagModified()) { 
        ip30331CorpIncentFlag = refreshIp30331CorpIncentFlag();
     }
   		return ip30331CorpIncentFlag;
   }

  
	/**
	*  set variable ip30331CorpIncentFlag
	*  Corresponding COBOL Variable is IP30331-CORP-INCENT-FLAG
	*  @param value
	**/
   public void setIp30331CorpIncentFlag(char[] value) {
      ip30331CorpIncentFlag = checkIp30331CorpIncentFlagConstraints(value);
      serializeIp30331CorpIncentFlag(ip30331CorpIncentFlag);
   } 

     /**
	 * 	Update Ip30331CorpIncentFlag 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp30331CorpIncentFlag(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp30331CorpIncentFlag,ip30331CorpIncentFlag.length);
   	
   }
   
   public void setIp30331CorpIncentFlag(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp30331CorpIncentFlag,ip30331CorpIncentFlag.length);
   	
   }
   
     /**
	 * 	Update Ip30331CorpIncentFlag 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp30331CorpIncentFlag(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp30331CorpIncentFlag+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip30331CorpIncentFlag with another Field
	 *	@param value
	 */
   public void setIp30331CorpIncentFlag(Field source) {
       replace(source,0,source.length(),beginIp30331CorpIncentFlag,IP_30331_CORP_INCENT_FLAG_LEN);
   	
   }  
   
     /**
	 * 	Update Ip30331CorpIncentFlag 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp30331CorpIncentFlag(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp30331CorpIncentFlag,IP_30331_CORP_INCENT_FLAG_LEN);
   	
   }
   
     /**
	 * 	Update Ip30331CorpIncentFlag 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp30331CorpIncentFlag(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp30331CorpIncentFlag+targetIndex,targetLen);
    
   }
	char[] ip30331ApplyCorpincent8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp30331ApplyCorpincent88()
	 *	@return  Returns true if isIp30331ApplyCorpincent88() is "Y"
	 */
   public boolean isIp30331ApplyCorpincent88() throws CFException {
      return (  compareChars( getIp30331CorpIncentFlag() , ip30331ApplyCorpincent8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp30331ApplyCorpincent88True() {  			
    	setIp30331CorpIncentFlag( ip30331ApplyCorpincent8888Value);
   	}
	char[] ip30331DontApplyCorpinc8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp30331DontApplyCorpinc88()
	 *	@return  Returns true if isIp30331DontApplyCorpinc88() is "N"
	 */
   public boolean isIp30331DontApplyCorpinc88() throws CFException {
      return (  compareChars( getIp30331CorpIncentFlag() , ip30331DontApplyCorpinc8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp30331DontApplyCorpinc88True() {  			
    	setIp30331CorpIncentFlag( ip30331DontApplyCorpinc8888Value);
   	}
	/**
	 *	Returns the value of ip303312ndlvlCorpIncntFlag
	 *	@return ip303312ndlvlCorpIncntFlag
	 */
   public char[] getIp303312ndlvlCorpIncntFlag() throws CFException{
     if (isIp303312ndlvlCorpIncntFlagModified()) { 
        ip303312ndlvlCorpIncntFlag = refreshIp303312ndlvlCorpIncntFlag();
     }
   		return ip303312ndlvlCorpIncntFlag;
   }

  
	/**
	*  set variable ip303312ndlvlCorpIncntFlag
	*  Corresponding COBOL Variable is IP30331-2NDLVL-CORP-INCNT-FLAG
	*  @param value
	**/
   public void setIp303312ndlvlCorpIncntFlag(char[] value) {
      ip303312ndlvlCorpIncntFlag = checkIp303312ndlvlCorpIncntFlagConstraints(value);
      serializeIp303312ndlvlCorpIncntFlag(ip303312ndlvlCorpIncntFlag);
   } 

     /**
	 * 	Update Ip303312ndlvlCorpIncntFlag 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp303312ndlvlCorpIncntFlag(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp303312ndlvlCorpIncntFlag,ip303312ndlvlCorpIncntFlag.length);
   	
   }
   
   public void setIp303312ndlvlCorpIncntFlag(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp303312ndlvlCorpIncntFlag,ip303312ndlvlCorpIncntFlag.length);
   	
   }
   
     /**
	 * 	Update Ip303312ndlvlCorpIncntFlag 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp303312ndlvlCorpIncntFlag(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp303312ndlvlCorpIncntFlag+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip303312ndlvlCorpIncntFlag with another Field
	 *	@param value
	 */
   public void setIp303312ndlvlCorpIncntFlag(Field source) {
       replace(source,0,source.length(),beginIp303312ndlvlCorpIncntFlag,IP_303312NDLVL_CORP_INCNT_FLAG_LEN);
   	
   }  
   
     /**
	 * 	Update Ip303312ndlvlCorpIncntFlag 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp303312ndlvlCorpIncntFlag(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp303312ndlvlCorpIncntFlag,IP_303312NDLVL_CORP_INCNT_FLAG_LEN);
   	
   }
   
     /**
	 * 	Update Ip303312ndlvlCorpIncntFlag 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp303312ndlvlCorpIncntFlag(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp303312ndlvlCorpIncntFlag+targetIndex,targetLen);
    
   }
	char[] ip303312lvlAplyCorpincY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp303312lvlAplyCorpincY88()
	 *	@return  Returns true if isIp303312lvlAplyCorpincY88() is "Y"
	 */
   public boolean isIp303312lvlAplyCorpincY88() throws CFException {
      return (  compareChars( getIp303312ndlvlCorpIncntFlag() , ip303312lvlAplyCorpincY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp303312lvlAplyCorpincY88True() {  			
    	setIp303312ndlvlCorpIncntFlag( ip303312lvlAplyCorpincY8888Value);
   	}
	char[] ip303312lvlAplyCorpincN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp303312lvlAplyCorpincN88()
	 *	@return  Returns true if isIp303312lvlAplyCorpincN88() is "N"
	 */
   public boolean isIp303312lvlAplyCorpincN88() throws CFException {
      return (  compareChars( getIp303312ndlvlCorpIncntFlag() , ip303312lvlAplyCorpincN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp303312lvlAplyCorpincN88True() {  			
    	setIp303312ndlvlCorpIncntFlag( ip303312lvlAplyCorpincN8888Value);
   	}

	
	
	
	/**
	 * 	initializes Ip30331FaFileIdStatusTbl
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp30331MessageNumber(0);
          ip30331ErrorInfo.initialize();
     
          ip30331Pds501Value.initialize();
     
         setIp30331EditStatus(CONSTANTS.SPACE);
         setIp30331CorpIncentFlag(CONSTANTS.SPACE);
         setIp303312ndlvlCorpIncntFlag(CONSTANTS.SPACE);
   }

		public static int getIp30331FaFileIdStatusTblFieldLength() {
			return IP_30331_FA_FILE_ID_STATUS_TBL_LENGTH;
		}

}
  
