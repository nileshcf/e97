package com.cloudframe.app.sf327010.dto;

/**
*  The class DtlLine1205 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:35. using version 5.0.0.254
**/


import com.cloudframe.app.sf327010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DtlLine1205 extends DtlLine1205Serialized { 
   


						private char[] logType205 = new char[1];


						private char[] service205 = new char[4];


								private char[] totMsgCount205 = Field.fillLowValue(11);


								private char[] successfulCount205 = Field.fillLowValue(11);


								private char[] successfulPercnt205 = Field.fillLowValue(6);



								private char[] errorCount205 = Field.fillLowValue(11);


								private char[] errorPercent205 = Field.fillLowValue(6);



								private char[] avgElapsed205 = Field.fillLowValue(14);


								private char[] highElapsed205 = Field.fillLowValue(11);


								private char[] lowElapsed205 = Field.fillLowValue(11);
	
	/**
	* Constructor for DtlLine1205
	**/
    public DtlLine1205() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 0
             ,3
             );
								setLogType205(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(8)
             , getStartOffset() + 4
             ,8
             );
								setService205(fillSpace(4));
       replaceValue( // serialize and save the value
             fillSpace(10)
             , getStartOffset() + 16
             ,10
             );
       replaceValue( // serialize and save the value
             fillSpace(5)
             , getStartOffset() + 37
             ,5
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 53
             ,1
             );
       replaceValue( // serialize and save the value
             ("%").toCharArray()
             , getStartOffset() + 60
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 61
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 73
             ,1
             );
       replaceValue( // serialize and save the value
             ("%").toCharArray()
             , getStartOffset() + 80
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(4)
             , getStartOffset() + 81
             ,4
             );
       replaceValue( // serialize and save the value
             fillSpace(5)
             , getStartOffset() + 99
             ,5
             );
       replaceValue( // serialize and save the value
             fillSpace(4)
             , getStartOffset() + 115
             ,4
             );
    }


 

	/**
	 *	Returns the value of logType205
	 *	@return logType205
	 */
   public char[] getLogType205() throws CFException{
     if (isLogType205Modified()) { 
        logType205 = refreshLogType205();
     }
   		return logType205;
   }

  
	/**
	*  set variable logType205
	*  Corresponding COBOL Variable is 205-LOG-TYPE
	*  @param value
	**/
   public void setLogType205(char[] value) {
      logType205 = checkLogType205Constraints(value);
      serializeLogType205(logType205);
   } 

     /**
	 * 	Update LogType205 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLogType205(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLogType205,logType205.length);
   	
   }
   
   public void setLogType205(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLogType205,logType205.length);
   	
   }
   
     /**
	 * 	Update LogType205 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLogType205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLogType205+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LogType205 with another Field
	 *	@param value
	 */
   public void setLogType205(Field source) {
       replace(source,0,source.length(),beginLogType205,LOG_TYPE_205_LEN);
   	
   }  
   
     /**
	 * 	Update LogType205 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLogType205(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLogType205,LOG_TYPE_205_LEN);
   	
   }
   
     /**
	 * 	Update LogType205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLogType205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLogType205+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of service205
	 *	@return service205
	 */
   public char[] getService205() throws CFException{
     if (isService205Modified()) { 
        service205 = refreshService205();
     }
   		return service205;
   }

  
	/**
	*  set variable service205
	*  Corresponding COBOL Variable is 205-SERVICE
	*  @param value
	**/
   public void setService205(char[] value) {
      service205 = checkService205Constraints(value);
      serializeService205(service205);
   } 

     /**
	 * 	Update Service205 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setService205(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginService205,service205.length);
   	
   }
   
   public void setService205(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginService205,service205.length);
   	
   }
   
     /**
	 * 	Update Service205 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setService205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginService205+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Service205 with another Field
	 *	@param value
	 */
   public void setService205(Field source) {
       replace(source,0,source.length(),beginService205,SERVICE_205_LEN);
   	
   }  
   
     /**
	 * 	Update Service205 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setService205(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginService205,SERVICE_205_LEN);
   	
   }
   
     /**
	 * 	Update Service205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setService205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginService205+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of totMsgCount205
	 *	@return totMsgCount205
	 */
   public char[] getTotMsgCount205() throws CFException{
     if (isTotMsgCount205Modified()) { 
        totMsgCount205 = refreshTotMsgCount205();
     }
   		return totMsgCount205;
   }

  
	/**
	*  set variable totMsgCount205
	*  Corresponding COBOL Variable is 205-TOT-MSG-COUNT
	*  @param value
	**/
   public void setTotMsgCount205(char[] value) {
      totMsgCount205 = checkTotMsgCount205Constraints(value);
      serializeTotMsgCount205(totMsgCount205);
   } 

     /**
	 * 	Update TotMsgCount205 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTotMsgCount205(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTotMsgCount205,totMsgCount205.length);
   	
   }
   
   public void setTotMsgCount205(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTotMsgCount205,totMsgCount205.length);
   	
   }
   
     /**
	 * 	Update TotMsgCount205 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTotMsgCount205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTotMsgCount205+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TotMsgCount205 with another Field
	 *	@param value
	 */
   public void setTotMsgCount205(Field source) {
       replace(source,0,source.length(),beginTotMsgCount205,TOT_MSG_COUNT_205_LEN);
   	
   }  
   
     /**
	 * 	Update TotMsgCount205 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTotMsgCount205(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTotMsgCount205,TOT_MSG_COUNT_205_LEN);
   	
   }
   
     /**
	 * 	Update TotMsgCount205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTotMsgCount205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTotMsgCount205+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of successfulCount205
	 *	@return successfulCount205
	 */
   public char[] getSuccessfulCount205() throws CFException{
     if (isSuccessfulCount205Modified()) { 
        successfulCount205 = refreshSuccessfulCount205();
     }
   		return successfulCount205;
   }

  
	/**
	*  set variable successfulCount205
	*  Corresponding COBOL Variable is 205-SUCCESSFUL-COUNT
	*  @param value
	**/
   public void setSuccessfulCount205(char[] value) {
      successfulCount205 = checkSuccessfulCount205Constraints(value);
      serializeSuccessfulCount205(successfulCount205);
   } 

     /**
	 * 	Update SuccessfulCount205 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSuccessfulCount205(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSuccessfulCount205,successfulCount205.length);
   	
   }
   
   public void setSuccessfulCount205(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSuccessfulCount205,successfulCount205.length);
   	
   }
   
     /**
	 * 	Update SuccessfulCount205 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSuccessfulCount205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSuccessfulCount205+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SuccessfulCount205 with another Field
	 *	@param value
	 */
   public void setSuccessfulCount205(Field source) {
       replace(source,0,source.length(),beginSuccessfulCount205,SUCCESSFUL_COUNT_205_LEN);
   	
   }  
   
     /**
	 * 	Update SuccessfulCount205 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSuccessfulCount205(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSuccessfulCount205,SUCCESSFUL_COUNT_205_LEN);
   	
   }
   
     /**
	 * 	Update SuccessfulCount205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSuccessfulCount205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSuccessfulCount205+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of successfulPercnt205
	 *	@return successfulPercnt205
	 */
   public char[] getSuccessfulPercnt205() throws CFException{
     if (isSuccessfulPercnt205Modified()) { 
        successfulPercnt205 = refreshSuccessfulPercnt205();
     }
   		return successfulPercnt205;
   }

  
	/**
	*  set variable successfulPercnt205
	*  Corresponding COBOL Variable is 205-SUCCESSFUL-PERCNT
	*  @param value
	**/
   public void setSuccessfulPercnt205(char[] value) {
      successfulPercnt205 = checkSuccessfulPercnt205Constraints(value);
      serializeSuccessfulPercnt205(successfulPercnt205);
   } 

     /**
	 * 	Update SuccessfulPercnt205 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSuccessfulPercnt205(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSuccessfulPercnt205,successfulPercnt205.length);
   	
   }
   
   public void setSuccessfulPercnt205(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSuccessfulPercnt205,successfulPercnt205.length);
   	
   }
   
     /**
	 * 	Update SuccessfulPercnt205 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSuccessfulPercnt205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSuccessfulPercnt205+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SuccessfulPercnt205 with another Field
	 *	@param value
	 */
   public void setSuccessfulPercnt205(Field source) {
       replace(source,0,source.length(),beginSuccessfulPercnt205,SUCCESSFUL_PERCNT_205_LEN);
   	
   }  
   
     /**
	 * 	Update SuccessfulPercnt205 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSuccessfulPercnt205(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSuccessfulPercnt205,SUCCESSFUL_PERCNT_205_LEN);
   	
   }
   
     /**
	 * 	Update SuccessfulPercnt205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSuccessfulPercnt205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSuccessfulPercnt205+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of errorCount205
	 *	@return errorCount205
	 */
   public char[] getErrorCount205() throws CFException{
     if (isErrorCount205Modified()) { 
        errorCount205 = refreshErrorCount205();
     }
   		return errorCount205;
   }

  
	/**
	*  set variable errorCount205
	*  Corresponding COBOL Variable is 205-ERROR-COUNT
	*  @param value
	**/
   public void setErrorCount205(char[] value) {
      errorCount205 = checkErrorCount205Constraints(value);
      serializeErrorCount205(errorCount205);
   } 

     /**
	 * 	Update ErrorCount205 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setErrorCount205(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginErrorCount205,errorCount205.length);
   	
   }
   
   public void setErrorCount205(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginErrorCount205,errorCount205.length);
   	
   }
   
     /**
	 * 	Update ErrorCount205 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrorCount205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrorCount205+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ErrorCount205 with another Field
	 *	@param value
	 */
   public void setErrorCount205(Field source) {
       replace(source,0,source.length(),beginErrorCount205,ERROR_COUNT_205_LEN);
   	
   }  
   
     /**
	 * 	Update ErrorCount205 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setErrorCount205(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginErrorCount205,ERROR_COUNT_205_LEN);
   	
   }
   
     /**
	 * 	Update ErrorCount205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrorCount205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrorCount205+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of errorPercent205
	 *	@return errorPercent205
	 */
   public char[] getErrorPercent205() throws CFException{
     if (isErrorPercent205Modified()) { 
        errorPercent205 = refreshErrorPercent205();
     }
   		return errorPercent205;
   }

  
	/**
	*  set variable errorPercent205
	*  Corresponding COBOL Variable is 205-ERROR-PERCENT
	*  @param value
	**/
   public void setErrorPercent205(char[] value) {
      errorPercent205 = checkErrorPercent205Constraints(value);
      serializeErrorPercent205(errorPercent205);
   } 

     /**
	 * 	Update ErrorPercent205 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setErrorPercent205(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginErrorPercent205,errorPercent205.length);
   	
   }
   
   public void setErrorPercent205(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginErrorPercent205,errorPercent205.length);
   	
   }
   
     /**
	 * 	Update ErrorPercent205 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrorPercent205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrorPercent205+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ErrorPercent205 with another Field
	 *	@param value
	 */
   public void setErrorPercent205(Field source) {
       replace(source,0,source.length(),beginErrorPercent205,ERROR_PERCENT_205_LEN);
   	
   }  
   
     /**
	 * 	Update ErrorPercent205 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setErrorPercent205(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginErrorPercent205,ERROR_PERCENT_205_LEN);
   	
   }
   
     /**
	 * 	Update ErrorPercent205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrorPercent205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrorPercent205+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of avgElapsed205
	 *	@return avgElapsed205
	 */
   public char[] getAvgElapsed205() throws CFException{
     if (isAvgElapsed205Modified()) { 
        avgElapsed205 = refreshAvgElapsed205();
     }
   		return avgElapsed205;
   }

  
	/**
	*  set variable avgElapsed205
	*  Corresponding COBOL Variable is 205-AVG-ELAPSED
	*  @param value
	**/
   public void setAvgElapsed205(char[] value) {
      avgElapsed205 = checkAvgElapsed205Constraints(value);
      serializeAvgElapsed205(avgElapsed205);
   } 

     /**
	 * 	Update AvgElapsed205 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAvgElapsed205(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAvgElapsed205,avgElapsed205.length);
   	
   }
   
   public void setAvgElapsed205(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAvgElapsed205,avgElapsed205.length);
   	
   }
   
     /**
	 * 	Update AvgElapsed205 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAvgElapsed205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAvgElapsed205+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AvgElapsed205 with another Field
	 *	@param value
	 */
   public void setAvgElapsed205(Field source) {
       replace(source,0,source.length(),beginAvgElapsed205,AVG_ELAPSED_205_LEN);
   	
   }  
   
     /**
	 * 	Update AvgElapsed205 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAvgElapsed205(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAvgElapsed205,AVG_ELAPSED_205_LEN);
   	
   }
   
     /**
	 * 	Update AvgElapsed205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAvgElapsed205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAvgElapsed205+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of highElapsed205
	 *	@return highElapsed205
	 */
   public char[] getHighElapsed205() throws CFException{
     if (isHighElapsed205Modified()) { 
        highElapsed205 = refreshHighElapsed205();
     }
   		return highElapsed205;
   }

  
	/**
	*  set variable highElapsed205
	*  Corresponding COBOL Variable is 205-HIGH-ELAPSED
	*  @param value
	**/
   public void setHighElapsed205(char[] value) {
      highElapsed205 = checkHighElapsed205Constraints(value);
      serializeHighElapsed205(highElapsed205);
   } 

     /**
	 * 	Update HighElapsed205 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHighElapsed205(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHighElapsed205,highElapsed205.length);
   	
   }
   
   public void setHighElapsed205(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHighElapsed205,highElapsed205.length);
   	
   }
   
     /**
	 * 	Update HighElapsed205 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHighElapsed205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHighElapsed205+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HighElapsed205 with another Field
	 *	@param value
	 */
   public void setHighElapsed205(Field source) {
       replace(source,0,source.length(),beginHighElapsed205,HIGH_ELAPSED_205_LEN);
   	
   }  
   
     /**
	 * 	Update HighElapsed205 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHighElapsed205(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHighElapsed205,HIGH_ELAPSED_205_LEN);
   	
   }
   
     /**
	 * 	Update HighElapsed205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHighElapsed205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHighElapsed205+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lowElapsed205
	 *	@return lowElapsed205
	 */
   public char[] getLowElapsed205() throws CFException{
     if (isLowElapsed205Modified()) { 
        lowElapsed205 = refreshLowElapsed205();
     }
   		return lowElapsed205;
   }

  
	/**
	*  set variable lowElapsed205
	*  Corresponding COBOL Variable is 205-LOW-ELAPSED
	*  @param value
	**/
   public void setLowElapsed205(char[] value) {
      lowElapsed205 = checkLowElapsed205Constraints(value);
      serializeLowElapsed205(lowElapsed205);
   } 

     /**
	 * 	Update LowElapsed205 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLowElapsed205(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLowElapsed205,lowElapsed205.length);
   	
   }
   
   public void setLowElapsed205(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLowElapsed205,lowElapsed205.length);
   	
   }
   
     /**
	 * 	Update LowElapsed205 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLowElapsed205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLowElapsed205+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LowElapsed205 with another Field
	 *	@param value
	 */
   public void setLowElapsed205(Field source) {
       replace(source,0,source.length(),beginLowElapsed205,LOW_ELAPSED_205_LEN);
   	
   }  
   
     /**
	 * 	Update LowElapsed205 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLowElapsed205(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLowElapsed205,LOW_ELAPSED_205_LEN);
   	
   }
   
     /**
	 * 	Update LowElapsed205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLowElapsed205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLowElapsed205+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDtlLine1205FieldLength() {
			return DTL_LINE_1205_LENGTH;
		}

}
  
