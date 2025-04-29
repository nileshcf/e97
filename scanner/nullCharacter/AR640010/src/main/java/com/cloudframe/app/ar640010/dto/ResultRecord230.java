package com.cloudframe.app.ar640010.dto;

/**
*  The class ResultRecord230 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ResultRecord230 extends ResultRecord230Serialized {
   

						private char[] resultJobTs230 = new char[19];

						private char[] resultJobName230 = new char[8];

						private char[] resultStepName230 = new char[8];

						private char[] resultProcStep230 = new char[8];

						private char[] resultJobId230 = new char[8];

						private char[] resultDbId230 = new char[8];

						private char[] resultDbPkg230 = new char[16];

						private char[] resultCpuId230 = new char[8];

								private int resultRequest230;

						private char[] resultEndptId230 = new char[7];

						private char[] resultBulkId230 = new char[4];

								private short resultCyclNum230;

						private char[] resultStatus230 = new char[6];

						private char[] resultReason230 = new char[30];

						private char[] resultTs230 = new char[26];

						private char[] resultListDd230 = new char[8];

						private char[] resultListDsn230 = new char[54];

						private char[] resultExitNam230 = new char[8];

						private char[] resultExitDsn230 = new char[44];

						private char[] resultCodeExit230 = new char[1];
	
	/**
	* Constructor for ResultRecord230
	**/
    public ResultRecord230() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setResultJobTs230(fillSpace(19));
								setResultJobName230(fillSpace(8));
								setResultStepName230(fillSpace(8));
								setResultProcStep230(fillSpace(8));
								setResultJobId230(fillSpace(8));
								setResultDbId230(fillSpace(8));
								setResultDbPkg230(fillSpace(16));
								setResultCpuId230(fillSpace(8));
								setResultRequest230(0);
								setResultEndptId230(fillSpace(7));
								setResultBulkId230(fillSpace(4));
								setResultCyclNum230((short)0);
								setResultStatus230(fillSpace(6));
								setResultReason230(fillSpace(30));
								setResultTs230(fillSpace(26));
								setResultListDd230(fillSpace(8));
								setResultListDsn230(fillSpace(54));
								setResultExitNam230(fillSpace(8));
								setResultExitDsn230(fillSpace(44));
								setResultCodeExit230(fillSpace(1));
    }


 

	/**
	 *	Returns the value of resultJobTs230
	 *	@return resultJobTs230
	 */
   public char[] getResultJobTs230() throws CFException{
     if (isResultJobTs230Modified()) { 
        resultJobTs230 = refreshResultJobTs230();
     }
   		return resultJobTs230;
   }

  
	/**
	*  set variable resultJobTs230
	*  Corresponding COBOL Variable is 230-RESULT-JOB-TS
	*  @param value
	**/
   public void setResultJobTs230(char[] value) {
      resultJobTs230 = checkResultJobTs230Constraints(value);
      serializeResultJobTs230(resultJobTs230);
   } 

     /**
	 * 	Update ResultJobTs230 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setResultJobTs230(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginResultJobTs230,resultJobTs230.length);
   	
   }
   
   public void setResultJobTs230(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginResultJobTs230,resultJobTs230.length);
   	
   }
   
     /**
	 * 	Update ResultJobTs230 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setResultJobTs230(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResultJobTs230+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ResultJobTs230 with another Field
	 *	@param value
	 */
   public void setResultJobTs230(Field source) {
       replace(source,0,source.length(),beginResultJobTs230,RESULT_JOB_TS_230_LEN);
   	
   }  
   
     /**
	 * 	Update ResultJobTs230 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setResultJobTs230(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginResultJobTs230,RESULT_JOB_TS_230_LEN);
   	
   }
   
     /**
	 * 	Update ResultJobTs230 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setResultJobTs230(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResultJobTs230+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of resultJobName230
	 *	@return resultJobName230
	 */
   public char[] getResultJobName230() throws CFException{
     if (isResultJobName230Modified()) { 
        resultJobName230 = refreshResultJobName230();
     }
   		return resultJobName230;
   }

  
	/**
	*  set variable resultJobName230
	*  Corresponding COBOL Variable is 230-RESULT-JOB-NAME
	*  @param value
	**/
   public void setResultJobName230(char[] value) {
      resultJobName230 = checkResultJobName230Constraints(value);
      serializeResultJobName230(resultJobName230);
   } 

     /**
	 * 	Update ResultJobName230 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setResultJobName230(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginResultJobName230,resultJobName230.length);
   	
   }
   
   public void setResultJobName230(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginResultJobName230,resultJobName230.length);
   	
   }
   
     /**
	 * 	Update ResultJobName230 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setResultJobName230(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResultJobName230+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ResultJobName230 with another Field
	 *	@param value
	 */
   public void setResultJobName230(Field source) {
       replace(source,0,source.length(),beginResultJobName230,RESULT_JOB_NAME_230_LEN);
   	
   }  
   
     /**
	 * 	Update ResultJobName230 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setResultJobName230(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginResultJobName230,RESULT_JOB_NAME_230_LEN);
   	
   }
   
     /**
	 * 	Update ResultJobName230 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setResultJobName230(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResultJobName230+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of resultStepName230
	 *	@return resultStepName230
	 */
   public char[] getResultStepName230() throws CFException{
     if (isResultStepName230Modified()) { 
        resultStepName230 = refreshResultStepName230();
     }
   		return resultStepName230;
   }

  
	/**
	*  set variable resultStepName230
	*  Corresponding COBOL Variable is 230-RESULT-STEP-NAME
	*  @param value
	**/
   public void setResultStepName230(char[] value) {
      resultStepName230 = checkResultStepName230Constraints(value);
      serializeResultStepName230(resultStepName230);
   } 

     /**
	 * 	Update ResultStepName230 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setResultStepName230(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginResultStepName230,resultStepName230.length);
   	
   }
   
   public void setResultStepName230(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginResultStepName230,resultStepName230.length);
   	
   }
   
     /**
	 * 	Update ResultStepName230 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setResultStepName230(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResultStepName230+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ResultStepName230 with another Field
	 *	@param value
	 */
   public void setResultStepName230(Field source) {
       replace(source,0,source.length(),beginResultStepName230,RESULT_STEP_NAME_230_LEN);
   	
   }  
   
     /**
	 * 	Update ResultStepName230 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setResultStepName230(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginResultStepName230,RESULT_STEP_NAME_230_LEN);
   	
   }
   
     /**
	 * 	Update ResultStepName230 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setResultStepName230(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResultStepName230+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of resultProcStep230
	 *	@return resultProcStep230
	 */
   public char[] getResultProcStep230() throws CFException{
     if (isResultProcStep230Modified()) { 
        resultProcStep230 = refreshResultProcStep230();
     }
   		return resultProcStep230;
   }

  
	/**
	*  set variable resultProcStep230
	*  Corresponding COBOL Variable is 230-RESULT-PROC-STEP
	*  @param value
	**/
   public void setResultProcStep230(char[] value) {
      resultProcStep230 = checkResultProcStep230Constraints(value);
      serializeResultProcStep230(resultProcStep230);
   } 

     /**
	 * 	Update ResultProcStep230 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setResultProcStep230(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginResultProcStep230,resultProcStep230.length);
   	
   }
   
   public void setResultProcStep230(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginResultProcStep230,resultProcStep230.length);
   	
   }
   
     /**
	 * 	Update ResultProcStep230 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setResultProcStep230(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResultProcStep230+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ResultProcStep230 with another Field
	 *	@param value
	 */
   public void setResultProcStep230(Field source) {
       replace(source,0,source.length(),beginResultProcStep230,RESULT_PROC_STEP_230_LEN);
   	
   }  
   
     /**
	 * 	Update ResultProcStep230 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setResultProcStep230(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginResultProcStep230,RESULT_PROC_STEP_230_LEN);
   	
   }
   
     /**
	 * 	Update ResultProcStep230 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setResultProcStep230(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResultProcStep230+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of resultJobId230
	 *	@return resultJobId230
	 */
   public char[] getResultJobId230() throws CFException{
     if (isResultJobId230Modified()) { 
        resultJobId230 = refreshResultJobId230();
     }
   		return resultJobId230;
   }

  
	/**
	*  set variable resultJobId230
	*  Corresponding COBOL Variable is 230-RESULT-JOB-ID
	*  @param value
	**/
   public void setResultJobId230(char[] value) {
      resultJobId230 = checkResultJobId230Constraints(value);
      serializeResultJobId230(resultJobId230);
   } 

     /**
	 * 	Update ResultJobId230 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setResultJobId230(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginResultJobId230,resultJobId230.length);
   	
   }
   
   public void setResultJobId230(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginResultJobId230,resultJobId230.length);
   	
   }
   
     /**
	 * 	Update ResultJobId230 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setResultJobId230(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResultJobId230+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ResultJobId230 with another Field
	 *	@param value
	 */
   public void setResultJobId230(Field source) {
       replace(source,0,source.length(),beginResultJobId230,RESULT_JOB_ID_230_LEN);
   	
   }  
   
     /**
	 * 	Update ResultJobId230 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setResultJobId230(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginResultJobId230,RESULT_JOB_ID_230_LEN);
   	
   }
   
     /**
	 * 	Update ResultJobId230 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setResultJobId230(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResultJobId230+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of resultDbId230
	 *	@return resultDbId230
	 */
   public char[] getResultDbId230() throws CFException{
     if (isResultDbId230Modified()) { 
        resultDbId230 = refreshResultDbId230();
     }
   		return resultDbId230;
   }

  
	/**
	*  set variable resultDbId230
	*  Corresponding COBOL Variable is 230-RESULT-DB-ID
	*  @param value
	**/
   public void setResultDbId230(char[] value) {
      resultDbId230 = checkResultDbId230Constraints(value);
      serializeResultDbId230(resultDbId230);
   } 

     /**
	 * 	Update ResultDbId230 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setResultDbId230(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginResultDbId230,resultDbId230.length);
   	
   }
   
   public void setResultDbId230(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginResultDbId230,resultDbId230.length);
   	
   }
   
     /**
	 * 	Update ResultDbId230 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setResultDbId230(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResultDbId230+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ResultDbId230 with another Field
	 *	@param value
	 */
   public void setResultDbId230(Field source) {
       replace(source,0,source.length(),beginResultDbId230,RESULT_DB_ID_230_LEN);
   	
   }  
   
     /**
	 * 	Update ResultDbId230 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setResultDbId230(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginResultDbId230,RESULT_DB_ID_230_LEN);
   	
   }
   
     /**
	 * 	Update ResultDbId230 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setResultDbId230(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResultDbId230+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of resultDbPkg230
	 *	@return resultDbPkg230
	 */
   public char[] getResultDbPkg230() throws CFException{
     if (isResultDbPkg230Modified()) { 
        resultDbPkg230 = refreshResultDbPkg230();
     }
   		return resultDbPkg230;
   }

  
	/**
	*  set variable resultDbPkg230
	*  Corresponding COBOL Variable is 230-RESULT-DB-PKG
	*  @param value
	**/
   public void setResultDbPkg230(char[] value) {
      resultDbPkg230 = checkResultDbPkg230Constraints(value);
      serializeResultDbPkg230(resultDbPkg230);
   } 

     /**
	 * 	Update ResultDbPkg230 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setResultDbPkg230(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginResultDbPkg230,resultDbPkg230.length);
   	
   }
   
   public void setResultDbPkg230(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginResultDbPkg230,resultDbPkg230.length);
   	
   }
   
     /**
	 * 	Update ResultDbPkg230 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setResultDbPkg230(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResultDbPkg230+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ResultDbPkg230 with another Field
	 *	@param value
	 */
   public void setResultDbPkg230(Field source) {
       replace(source,0,source.length(),beginResultDbPkg230,RESULT_DB_PKG_230_LEN);
   	
   }  
   
     /**
	 * 	Update ResultDbPkg230 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setResultDbPkg230(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginResultDbPkg230,RESULT_DB_PKG_230_LEN);
   	
   }
   
     /**
	 * 	Update ResultDbPkg230 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setResultDbPkg230(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResultDbPkg230+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of resultCpuId230
	 *	@return resultCpuId230
	 */
   public char[] getResultCpuId230() throws CFException{
     if (isResultCpuId230Modified()) { 
        resultCpuId230 = refreshResultCpuId230();
     }
   		return resultCpuId230;
   }

  
	/**
	*  set variable resultCpuId230
	*  Corresponding COBOL Variable is 230-RESULT-CPU-ID
	*  @param value
	**/
   public void setResultCpuId230(char[] value) {
      resultCpuId230 = checkResultCpuId230Constraints(value);
      serializeResultCpuId230(resultCpuId230);
   } 

     /**
	 * 	Update ResultCpuId230 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setResultCpuId230(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginResultCpuId230,resultCpuId230.length);
   	
   }
   
   public void setResultCpuId230(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginResultCpuId230,resultCpuId230.length);
   	
   }
   
     /**
	 * 	Update ResultCpuId230 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setResultCpuId230(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResultCpuId230+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ResultCpuId230 with another Field
	 *	@param value
	 */
   public void setResultCpuId230(Field source) {
       replace(source,0,source.length(),beginResultCpuId230,RESULT_CPU_ID_230_LEN);
   	
   }  
   
     /**
	 * 	Update ResultCpuId230 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setResultCpuId230(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginResultCpuId230,RESULT_CPU_ID_230_LEN);
   	
   }
   
     /**
	 * 	Update ResultCpuId230 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setResultCpuId230(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResultCpuId230+targetIndex,targetLen);
    
   }
	public int getResultRequest230() throws CFException {
        if (isResultRequest230Modified()) { 
           resultRequest230 = refreshResultRequest230();
        }
   		return resultRequest230;
	}
	
	/**
	 * 	Update ResultRequest230 with the passed value
	 *  Corresponding COBOL Variable is 230-RESULT-REQUEST
	 *	@param number
	 */
	public void setResultRequest230(int number) {
			resultRequest230 = checkResultRequest230MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeResultRequest230(resultRequest230);
	}


	public void setResultRequest230(long number) {
	    number = checkResultRequest230MaxLimit(number); // Truncate if value is beyond +/- Max range
		setResultRequest230((int)number);
	}
	
	/**
	 *	Returns the value of resultEndptId230
	 *	@return resultEndptId230
	 */
   public char[] getResultEndptId230() throws CFException{
     if (isResultEndptId230Modified()) { 
        resultEndptId230 = refreshResultEndptId230();
     }
   		return resultEndptId230;
   }

  
	/**
	*  set variable resultEndptId230
	*  Corresponding COBOL Variable is 230-RESULT-ENDPT-ID
	*  @param value
	**/
   public void setResultEndptId230(char[] value) {
      resultEndptId230 = checkResultEndptId230Constraints(value);
      serializeResultEndptId230(resultEndptId230);
   } 

     /**
	 * 	Update ResultEndptId230 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setResultEndptId230(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginResultEndptId230,resultEndptId230.length);
   	
   }
   
   public void setResultEndptId230(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginResultEndptId230,resultEndptId230.length);
   	
   }
   
     /**
	 * 	Update ResultEndptId230 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setResultEndptId230(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResultEndptId230+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ResultEndptId230 with another Field
	 *	@param value
	 */
   public void setResultEndptId230(Field source) {
       replace(source,0,source.length(),beginResultEndptId230,RESULT_ENDPT_ID_230_LEN);
   	
   }  
   
     /**
	 * 	Update ResultEndptId230 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setResultEndptId230(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginResultEndptId230,RESULT_ENDPT_ID_230_LEN);
   	
   }
   
     /**
	 * 	Update ResultEndptId230 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setResultEndptId230(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResultEndptId230+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of resultBulkId230
	 *	@return resultBulkId230
	 */
   public char[] getResultBulkId230() throws CFException{
     if (isResultBulkId230Modified()) { 
        resultBulkId230 = refreshResultBulkId230();
     }
   		return resultBulkId230;
   }

  
	/**
	*  set variable resultBulkId230
	*  Corresponding COBOL Variable is 230-RESULT-BULK-ID
	*  @param value
	**/
   public void setResultBulkId230(char[] value) {
      resultBulkId230 = checkResultBulkId230Constraints(value);
      serializeResultBulkId230(resultBulkId230);
   } 

     /**
	 * 	Update ResultBulkId230 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setResultBulkId230(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginResultBulkId230,resultBulkId230.length);
   	
   }
   
   public void setResultBulkId230(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginResultBulkId230,resultBulkId230.length);
   	
   }
   
     /**
	 * 	Update ResultBulkId230 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setResultBulkId230(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResultBulkId230+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ResultBulkId230 with another Field
	 *	@param value
	 */
   public void setResultBulkId230(Field source) {
       replace(source,0,source.length(),beginResultBulkId230,RESULT_BULK_ID_230_LEN);
   	
   }  
   
     /**
	 * 	Update ResultBulkId230 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setResultBulkId230(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginResultBulkId230,RESULT_BULK_ID_230_LEN);
   	
   }
   
     /**
	 * 	Update ResultBulkId230 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setResultBulkId230(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResultBulkId230+targetIndex,targetLen);
    
   }
	public short getResultCyclNum230() throws CFException {
        if (isResultCyclNum230Modified()) { 
           resultCyclNum230 = refreshResultCyclNum230();
        }
   		return resultCyclNum230;
	}
	
	/**
	 * 	Update ResultCyclNum230 with the passed value
	 *  Corresponding COBOL Variable is 230-RESULT-CYCL-NUM
	 *	@param number
	 */
	public void setResultCyclNum230(short number) {
			resultCyclNum230 = checkResultCyclNum230MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeResultCyclNum230(resultCyclNum230);
	}

	public void setResultCyclNum230(int number) {
	    number = checkResultCyclNum230MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setResultCyclNum230((short)number);
	}
	public void setResultCyclNum230(long number) {
	    number = checkResultCyclNum230MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setResultCyclNum230((short)number);
	}
	

	/**
	 *	Returns the value of resultStatus230
	 *	@return resultStatus230
	 */
   public char[] getResultStatus230() throws CFException{
     if (isResultStatus230Modified()) { 
        resultStatus230 = refreshResultStatus230();
     }
   		return resultStatus230;
   }

  
	/**
	*  set variable resultStatus230
	*  Corresponding COBOL Variable is 230-RESULT-STATUS
	*  @param value
	**/
   public void setResultStatus230(char[] value) {
      resultStatus230 = checkResultStatus230Constraints(value);
      serializeResultStatus230(resultStatus230);
   } 

     /**
	 * 	Update ResultStatus230 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setResultStatus230(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginResultStatus230,resultStatus230.length);
   	
   }
   
   public void setResultStatus230(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginResultStatus230,resultStatus230.length);
   	
   }
   
     /**
	 * 	Update ResultStatus230 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setResultStatus230(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResultStatus230+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ResultStatus230 with another Field
	 *	@param value
	 */
   public void setResultStatus230(Field source) {
       replace(source,0,source.length(),beginResultStatus230,RESULT_STATUS_230_LEN);
   	
   }  
   
     /**
	 * 	Update ResultStatus230 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setResultStatus230(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginResultStatus230,RESULT_STATUS_230_LEN);
   	
   }
   
     /**
	 * 	Update ResultStatus230 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setResultStatus230(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResultStatus230+targetIndex,targetLen);
    
   }
	char[] resultStatusPosted8823088Value = "POSTED".toCharArray();
	/**
	 *	Test condition "POSTED" for isResultStatusPosted88230()
	 *	@return  Returns true if isResultStatusPosted88230() is "POSTED"
	 */
   public boolean isResultStatusPosted88230() throws CFException {
      return (  compareChars( getResultStatus230() , resultStatusPosted8823088Value)  == 0  );
   }


	/**
	*  set values "POSTED"
	*/
   	public void setResultStatusPosted88230True() {  			
    	setResultStatus230( resultStatusPosted8823088Value);
   	}
	char[] resultStatusQuiesc8823088Value = "QUIESC".toCharArray();
	/**
	 *	Test condition "QUIESC" for isResultStatusQuiesc88230()
	 *	@return  Returns true if isResultStatusQuiesc88230() is "QUIESC"
	 */
   public boolean isResultStatusQuiesc88230() throws CFException {
      return (  compareChars( getResultStatus230() , resultStatusQuiesc8823088Value)  == 0  );
   }


	/**
	*  set values "QUIESC"
	*/
   	public void setResultStatusQuiesc88230True() {  			
    	setResultStatus230( resultStatusQuiesc8823088Value);
   	}
	char[] resultStatusRepeat8823088Value = "REPEAT".toCharArray();
	/**
	 *	Test condition "REPEAT" for isResultStatusRepeat88230()
	 *	@return  Returns true if isResultStatusRepeat88230() is "REPEAT"
	 */
   public boolean isResultStatusRepeat88230() throws CFException {
      return (  compareChars( getResultStatus230() , resultStatusRepeat8823088Value)  == 0  );
   }


	/**
	*  set values "REPEAT"
	*/
   	public void setResultStatusRepeat88230True() {  			
    	setResultStatus230( resultStatusRepeat8823088Value);
   	}
	char[] resultStatusWaited8823088Value = "WAITED".toCharArray();
	/**
	 *	Test condition "WAITED" for isResultStatusWaited88230()
	 *	@return  Returns true if isResultStatusWaited88230() is "WAITED"
	 */
   public boolean isResultStatusWaited88230() throws CFException {
      return (  compareChars( getResultStatus230() , resultStatusWaited8823088Value)  == 0  );
   }


	/**
	*  set values "WAITED"
	*/
   	public void setResultStatusWaited88230True() {  			
    	setResultStatus230( resultStatusWaited8823088Value);
   	}
	char[] resultStatusRouted8823088Value = "ROUTED".toCharArray();
	/**
	 *	Test condition "ROUTED" for isResultStatusRouted88230()
	 *	@return  Returns true if isResultStatusRouted88230() is "ROUTED"
	 */
   public boolean isResultStatusRouted88230() throws CFException {
      return (  compareChars( getResultStatus230() , resultStatusRouted8823088Value)  == 0  );
   }


	/**
	*  set values "ROUTED"
	*/
   	public void setResultStatusRouted88230True() {  			
    	setResultStatus230( resultStatusRouted8823088Value);
   	}
	char[] resultStatusFailed8823088Value = "FAILED".toCharArray();
	/**
	 *	Test condition "FAILED" for isResultStatusFailed88230()
	 *	@return  Returns true if isResultStatusFailed88230() is "FAILED"
	 */
   public boolean isResultStatusFailed88230() throws CFException {
      return (  compareChars( getResultStatus230() , resultStatusFailed8823088Value)  == 0  );
   }


	/**
	*  set values "FAILED"
	*/
   	public void setResultStatusFailed88230True() {  			
    	setResultStatus230( resultStatusFailed8823088Value);
   	}
	/**
	 *	Returns the value of resultReason230
	 *	@return resultReason230
	 */
   public char[] getResultReason230() throws CFException{
     if (isResultReason230Modified()) { 
        resultReason230 = refreshResultReason230();
     }
   		return resultReason230;
   }

  
	/**
	*  set variable resultReason230
	*  Corresponding COBOL Variable is 230-RESULT-REASON
	*  @param value
	**/
   public void setResultReason230(char[] value) {
      resultReason230 = checkResultReason230Constraints(value);
      serializeResultReason230(resultReason230);
   } 

     /**
	 * 	Update ResultReason230 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setResultReason230(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginResultReason230,resultReason230.length);
   	
   }
   
   public void setResultReason230(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginResultReason230,resultReason230.length);
   	
   }
   
     /**
	 * 	Update ResultReason230 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setResultReason230(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResultReason230+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ResultReason230 with another Field
	 *	@param value
	 */
   public void setResultReason230(Field source) {
       replace(source,0,source.length(),beginResultReason230,RESULT_REASON_230_LEN);
   	
   }  
   
     /**
	 * 	Update ResultReason230 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setResultReason230(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginResultReason230,RESULT_REASON_230_LEN);
   	
   }
   
     /**
	 * 	Update ResultReason230 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setResultReason230(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResultReason230+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of resultTs230
	 *	@return resultTs230
	 */
   public char[] getResultTs230() throws CFException{
     if (isResultTs230Modified()) { 
        resultTs230 = refreshResultTs230();
     }
   		return resultTs230;
   }

  
	/**
	*  set variable resultTs230
	*  Corresponding COBOL Variable is 230-RESULT-TS
	*  @param value
	**/
   public void setResultTs230(char[] value) {
      resultTs230 = checkResultTs230Constraints(value);
      serializeResultTs230(resultTs230);
   } 

     /**
	 * 	Update ResultTs230 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setResultTs230(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginResultTs230,resultTs230.length);
   	
   }
   
   public void setResultTs230(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginResultTs230,resultTs230.length);
   	
   }
   
     /**
	 * 	Update ResultTs230 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setResultTs230(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResultTs230+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ResultTs230 with another Field
	 *	@param value
	 */
   public void setResultTs230(Field source) {
       replace(source,0,source.length(),beginResultTs230,RESULT_TS_230_LEN);
   	
   }  
   
     /**
	 * 	Update ResultTs230 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setResultTs230(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginResultTs230,RESULT_TS_230_LEN);
   	
   }
   
     /**
	 * 	Update ResultTs230 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setResultTs230(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResultTs230+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of resultListDd230
	 *	@return resultListDd230
	 */
   public char[] getResultListDd230() throws CFException{
     if (isResultListDd230Modified()) { 
        resultListDd230 = refreshResultListDd230();
     }
   		return resultListDd230;
   }

  
	/**
	*  set variable resultListDd230
	*  Corresponding COBOL Variable is 230-RESULT-LIST-DD
	*  @param value
	**/
   public void setResultListDd230(char[] value) {
      resultListDd230 = checkResultListDd230Constraints(value);
      serializeResultListDd230(resultListDd230);
   } 

     /**
	 * 	Update ResultListDd230 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setResultListDd230(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginResultListDd230,resultListDd230.length);
   	
   }
   
   public void setResultListDd230(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginResultListDd230,resultListDd230.length);
   	
   }
   
     /**
	 * 	Update ResultListDd230 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setResultListDd230(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResultListDd230+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ResultListDd230 with another Field
	 *	@param value
	 */
   public void setResultListDd230(Field source) {
       replace(source,0,source.length(),beginResultListDd230,RESULT_LIST_DD_230_LEN);
   	
   }  
   
     /**
	 * 	Update ResultListDd230 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setResultListDd230(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginResultListDd230,RESULT_LIST_DD_230_LEN);
   	
   }
   
     /**
	 * 	Update ResultListDd230 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setResultListDd230(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResultListDd230+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of resultListDsn230
	 *	@return resultListDsn230
	 */
   public char[] getResultListDsn230() throws CFException{
     if (isResultListDsn230Modified()) { 
        resultListDsn230 = refreshResultListDsn230();
     }
   		return resultListDsn230;
   }

  
	/**
	*  set variable resultListDsn230
	*  Corresponding COBOL Variable is 230-RESULT-LIST-DSN
	*  @param value
	**/
   public void setResultListDsn230(char[] value) {
      resultListDsn230 = checkResultListDsn230Constraints(value);
      serializeResultListDsn230(resultListDsn230);
   } 

     /**
	 * 	Update ResultListDsn230 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setResultListDsn230(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginResultListDsn230,resultListDsn230.length);
   	
   }
   
   public void setResultListDsn230(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginResultListDsn230,resultListDsn230.length);
   	
   }
   
     /**
	 * 	Update ResultListDsn230 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setResultListDsn230(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResultListDsn230+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ResultListDsn230 with another Field
	 *	@param value
	 */
   public void setResultListDsn230(Field source) {
       replace(source,0,source.length(),beginResultListDsn230,RESULT_LIST_DSN_230_LEN);
   	
   }  
   
     /**
	 * 	Update ResultListDsn230 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setResultListDsn230(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginResultListDsn230,RESULT_LIST_DSN_230_LEN);
   	
   }
   
     /**
	 * 	Update ResultListDsn230 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setResultListDsn230(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResultListDsn230+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of resultExitNam230
	 *	@return resultExitNam230
	 */
   public char[] getResultExitNam230() throws CFException{
     if (isResultExitNam230Modified()) { 
        resultExitNam230 = refreshResultExitNam230();
     }
   		return resultExitNam230;
   }

  
	/**
	*  set variable resultExitNam230
	*  Corresponding COBOL Variable is 230-RESULT-EXIT-NAM
	*  @param value
	**/
   public void setResultExitNam230(char[] value) {
      resultExitNam230 = checkResultExitNam230Constraints(value);
      serializeResultExitNam230(resultExitNam230);
   } 

     /**
	 * 	Update ResultExitNam230 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setResultExitNam230(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginResultExitNam230,resultExitNam230.length);
   	
   }
   
   public void setResultExitNam230(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginResultExitNam230,resultExitNam230.length);
   	
   }
   
     /**
	 * 	Update ResultExitNam230 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setResultExitNam230(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResultExitNam230+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ResultExitNam230 with another Field
	 *	@param value
	 */
   public void setResultExitNam230(Field source) {
       replace(source,0,source.length(),beginResultExitNam230,RESULT_EXIT_NAM_230_LEN);
   	
   }  
   
     /**
	 * 	Update ResultExitNam230 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setResultExitNam230(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginResultExitNam230,RESULT_EXIT_NAM_230_LEN);
   	
   }
   
     /**
	 * 	Update ResultExitNam230 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setResultExitNam230(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResultExitNam230+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of resultExitDsn230
	 *	@return resultExitDsn230
	 */
   public char[] getResultExitDsn230() throws CFException{
     if (isResultExitDsn230Modified()) { 
        resultExitDsn230 = refreshResultExitDsn230();
     }
   		return resultExitDsn230;
   }

  
	/**
	*  set variable resultExitDsn230
	*  Corresponding COBOL Variable is 230-RESULT-EXIT-DSN
	*  @param value
	**/
   public void setResultExitDsn230(char[] value) {
      resultExitDsn230 = checkResultExitDsn230Constraints(value);
      serializeResultExitDsn230(resultExitDsn230);
   } 

     /**
	 * 	Update ResultExitDsn230 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setResultExitDsn230(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginResultExitDsn230,resultExitDsn230.length);
   	
   }
   
   public void setResultExitDsn230(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginResultExitDsn230,resultExitDsn230.length);
   	
   }
   
     /**
	 * 	Update ResultExitDsn230 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setResultExitDsn230(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResultExitDsn230+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ResultExitDsn230 with another Field
	 *	@param value
	 */
   public void setResultExitDsn230(Field source) {
       replace(source,0,source.length(),beginResultExitDsn230,RESULT_EXIT_DSN_230_LEN);
   	
   }  
   
     /**
	 * 	Update ResultExitDsn230 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setResultExitDsn230(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginResultExitDsn230,RESULT_EXIT_DSN_230_LEN);
   	
   }
   
     /**
	 * 	Update ResultExitDsn230 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setResultExitDsn230(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResultExitDsn230+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of resultCodeExit230
	 *	@return resultCodeExit230
	 */
   public char[] getResultCodeExit230() throws CFException{
     if (isResultCodeExit230Modified()) { 
        resultCodeExit230 = refreshResultCodeExit230();
     }
   		return resultCodeExit230;
   }

  
	/**
	*  set variable resultCodeExit230
	*  Corresponding COBOL Variable is 230-RESULT-CODE-EXIT
	*  @param value
	**/
   public void setResultCodeExit230(char[] value) {
      resultCodeExit230 = checkResultCodeExit230Constraints(value);
      serializeResultCodeExit230(resultCodeExit230);
   } 

     /**
	 * 	Update ResultCodeExit230 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setResultCodeExit230(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginResultCodeExit230,resultCodeExit230.length);
   	
   }
   
   public void setResultCodeExit230(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginResultCodeExit230,resultCodeExit230.length);
   	
   }
   
     /**
	 * 	Update ResultCodeExit230 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setResultCodeExit230(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResultCodeExit230+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ResultCodeExit230 with another Field
	 *	@param value
	 */
   public void setResultCodeExit230(Field source) {
       replace(source,0,source.length(),beginResultCodeExit230,RESULT_CODE_EXIT_230_LEN);
   	
   }  
   
     /**
	 * 	Update ResultCodeExit230 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setResultCodeExit230(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginResultCodeExit230,RESULT_CODE_EXIT_230_LEN);
   	
   }
   
     /**
	 * 	Update ResultCodeExit230 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setResultCodeExit230(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResultCodeExit230+targetIndex,targetLen);
    
   }
	char[] resultCodePreExit8823088Value = "I".toCharArray();
	/**
	 *	Test condition "I" for isResultCodePreExit88230()
	 *	@return  Returns true if isResultCodePreExit88230() is "I"
	 */
   public boolean isResultCodePreExit88230() throws CFException {
      return (  compareChars( getResultCodeExit230() , resultCodePreExit8823088Value)  == 0  );
   }


	/**
	*  set values "I"
	*/
   	public void setResultCodePreExit88230True() {  			
    	setResultCodeExit230( resultCodePreExit8823088Value);
   	}
	char[] resultCodePostExit8823088Value = "O".toCharArray();
	/**
	 *	Test condition "O" for isResultCodePostExit88230()
	 *	@return  Returns true if isResultCodePostExit88230() is "O"
	 */
   public boolean isResultCodePostExit88230() throws CFException {
      return (  compareChars( getResultCodeExit230() , resultCodePostExit8823088Value)  == 0  );
   }


	/**
	*  set values "O"
	*/
   	public void setResultCodePostExit88230True() {  			
    	setResultCodeExit230( resultCodePostExit8823088Value);
   	}

	
	
	

		public static int getResultRecord230FieldLength() {
			return RESULT_RECORD_230_LENGTH;
		}

}
  
