package com.cloudframe.app.ms00d363.dto;

/**
*  The class BalRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BalRecord extends BalRecordSerialized {
   

						private char[] balReportType = Field.fillLowValue(10);

						private char[] balReportId = Field.fillLowValue(5);

						private char[] balCutoffNum = Field.fillLowValue(3);

						private char[] balSettlSvc = Field.fillLowValue(3);

						private char[] balProcessorId = Field.fillLowValue(10);

						private char[] balIca = Field.fillLowValue(6);

						private char[] balAcqIssFlag = Field.fillLowValue(1);

								private int balCurrCode;

								private int balCurrExp;

								private long balCmpltdAmt;

						private char[] balCmpltdAmtInd = Field.fillLowValue(1);

								private long balIntrchgAmt;

						private char[] balIntrchgAmtInd = Field.fillLowValue(1);

								private long balSettlAmt;

						private char[] balSettlAmtInd = Field.fillLowValue(1);

								private long balRecordCnt;

						private char[] balFiller = Field.fillLowValue(95);
	
	/**
	* Constructor for BalRecord
	**/
    public BalRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of balReportType
	 *	@return balReportType
	 */
   public char[] getBalReportType() throws CFException{
     if (isBalReportTypeModified()) { 
        balReportType = refreshBalReportType();
     }
   		return balReportType;
   }

  
	/**
	*  set variable balReportType
	*  Corresponding COBOL Variable is BAL-REPORT-TYPE
	*  @param value
	**/
   public void setBalReportType(char[] value) {
      balReportType = checkBalReportTypeConstraints(value);
      serializeBalReportType(balReportType);
   } 

     /**
	 * 	Update BalReportType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBalReportType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBalReportType,balReportType.length);
   	
   }
   
   public void setBalReportType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBalReportType,balReportType.length);
   	
   }
   
     /**
	 * 	Update BalReportType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBalReportType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBalReportType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BalReportType with another Field
	 *	@param value
	 */
   public void setBalReportType(Field source) {
       replace(source,0,source.length(),beginBalReportType,BAL_REPORT_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update BalReportType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBalReportType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBalReportType,BAL_REPORT_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update BalReportType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBalReportType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBalReportType+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of balReportId
	 *	@return balReportId
	 */
   public char[] getBalReportId() throws CFException{
     if (isBalReportIdModified()) { 
        balReportId = refreshBalReportId();
     }
   		return balReportId;
   }

  
	/**
	*  set variable balReportId
	*  Corresponding COBOL Variable is BAL-REPORT-ID
	*  @param value
	**/
   public void setBalReportId(char[] value) {
      balReportId = checkBalReportIdConstraints(value);
      serializeBalReportId(balReportId);
   } 

     /**
	 * 	Update BalReportId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBalReportId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBalReportId,balReportId.length);
   	
   }
   
   public void setBalReportId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBalReportId,balReportId.length);
   	
   }
   
     /**
	 * 	Update BalReportId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBalReportId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBalReportId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BalReportId with another Field
	 *	@param value
	 */
   public void setBalReportId(Field source) {
       replace(source,0,source.length(),beginBalReportId,BAL_REPORT_ID_LEN);
   	
   }  
   
     /**
	 * 	Update BalReportId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBalReportId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBalReportId,BAL_REPORT_ID_LEN);
   	
   }
   
     /**
	 * 	Update BalReportId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBalReportId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBalReportId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of balCutoffNum
	 *	@return balCutoffNum
	 */
   public char[] getBalCutoffNum() throws CFException{
     if (isBalCutoffNumModified()) { 
        balCutoffNum = refreshBalCutoffNum();
     }
   		return balCutoffNum;
   }

  
	/**
	*  set variable balCutoffNum
	*  Corresponding COBOL Variable is BAL-CUTOFF-NUM
	*  @param value
	**/
   public void setBalCutoffNum(char[] value) {
      balCutoffNum = checkBalCutoffNumConstraints(value);
      serializeBalCutoffNum(balCutoffNum);
   } 

     /**
	 * 	Update BalCutoffNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBalCutoffNum(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBalCutoffNum,balCutoffNum.length);
   	
   }
   
   public void setBalCutoffNum(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBalCutoffNum,balCutoffNum.length);
   	
   }
   
     /**
	 * 	Update BalCutoffNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBalCutoffNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBalCutoffNum+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BalCutoffNum with another Field
	 *	@param value
	 */
   public void setBalCutoffNum(Field source) {
       replace(source,0,source.length(),beginBalCutoffNum,BAL_CUTOFF_NUM_LEN);
   	
   }  
   
     /**
	 * 	Update BalCutoffNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBalCutoffNum(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBalCutoffNum,BAL_CUTOFF_NUM_LEN);
   	
   }
   
     /**
	 * 	Update BalCutoffNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBalCutoffNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBalCutoffNum+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of balSettlSvc
	 *	@return balSettlSvc
	 */
   public char[] getBalSettlSvc() throws CFException{
     if (isBalSettlSvcModified()) { 
        balSettlSvc = refreshBalSettlSvc();
     }
   		return balSettlSvc;
   }

  
	/**
	*  set variable balSettlSvc
	*  Corresponding COBOL Variable is BAL-SETTL-SVC
	*  @param value
	**/
   public void setBalSettlSvc(char[] value) {
      balSettlSvc = checkBalSettlSvcConstraints(value);
      serializeBalSettlSvc(balSettlSvc);
   } 

     /**
	 * 	Update BalSettlSvc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBalSettlSvc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBalSettlSvc,balSettlSvc.length);
   	
   }
   
   public void setBalSettlSvc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBalSettlSvc,balSettlSvc.length);
   	
   }
   
     /**
	 * 	Update BalSettlSvc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBalSettlSvc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBalSettlSvc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BalSettlSvc with another Field
	 *	@param value
	 */
   public void setBalSettlSvc(Field source) {
       replace(source,0,source.length(),beginBalSettlSvc,BAL_SETTL_SVC_LEN);
   	
   }  
   
     /**
	 * 	Update BalSettlSvc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBalSettlSvc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBalSettlSvc,BAL_SETTL_SVC_LEN);
   	
   }
   
     /**
	 * 	Update BalSettlSvc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBalSettlSvc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBalSettlSvc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of balProcessorId
	 *	@return balProcessorId
	 */
   public char[] getBalProcessorId() throws CFException{
     if (isBalProcessorIdModified()) { 
        balProcessorId = refreshBalProcessorId();
     }
   		return balProcessorId;
   }

  
	/**
	*  set variable balProcessorId
	*  Corresponding COBOL Variable is BAL-PROCESSOR-ID
	*  @param value
	**/
   public void setBalProcessorId(char[] value) {
      balProcessorId = checkBalProcessorIdConstraints(value);
      serializeBalProcessorId(balProcessorId);
   } 

     /**
	 * 	Update BalProcessorId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBalProcessorId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBalProcessorId,balProcessorId.length);
   	
   }
   
   public void setBalProcessorId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBalProcessorId,balProcessorId.length);
   	
   }
   
     /**
	 * 	Update BalProcessorId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBalProcessorId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBalProcessorId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BalProcessorId with another Field
	 *	@param value
	 */
   public void setBalProcessorId(Field source) {
       replace(source,0,source.length(),beginBalProcessorId,BAL_PROCESSOR_ID_LEN);
   	
   }  
   
     /**
	 * 	Update BalProcessorId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBalProcessorId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBalProcessorId,BAL_PROCESSOR_ID_LEN);
   	
   }
   
     /**
	 * 	Update BalProcessorId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBalProcessorId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBalProcessorId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of balIca
	 *	@return balIca
	 */
   public char[] getBalIca() throws CFException{
     if (isBalIcaModified()) { 
        balIca = refreshBalIca();
     }
   		return balIca;
   }

  
	/**
	*  set variable balIca
	*  Corresponding COBOL Variable is BAL-ICA
	*  @param value
	**/
   public void setBalIca(char[] value) {
      balIca = checkBalIcaConstraints(value);
      serializeBalIca(balIca);
   } 

     /**
	 * 	Update BalIca 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBalIca(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBalIca,balIca.length);
   	
   }
   
   public void setBalIca(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBalIca,balIca.length);
   	
   }
   
     /**
	 * 	Update BalIca 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBalIca(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBalIca+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BalIca with another Field
	 *	@param value
	 */
   public void setBalIca(Field source) {
       replace(source,0,source.length(),beginBalIca,BAL_ICA_LEN);
   	
   }  
   
     /**
	 * 	Update BalIca 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBalIca(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBalIca,BAL_ICA_LEN);
   	
   }
   
     /**
	 * 	Update BalIca 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBalIca(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBalIca+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of balAcqIssFlag
	 *	@return balAcqIssFlag
	 */
   public char[] getBalAcqIssFlag() throws CFException{
     if (isBalAcqIssFlagModified()) { 
        balAcqIssFlag = refreshBalAcqIssFlag();
     }
   		return balAcqIssFlag;
   }

  
	/**
	*  set variable balAcqIssFlag
	*  Corresponding COBOL Variable is BAL-ACQ-ISS-FLAG
	*  @param value
	**/
   public void setBalAcqIssFlag(char[] value) {
      balAcqIssFlag = checkBalAcqIssFlagConstraints(value);
      serializeBalAcqIssFlag(balAcqIssFlag);
   } 

     /**
	 * 	Update BalAcqIssFlag 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBalAcqIssFlag(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBalAcqIssFlag,balAcqIssFlag.length);
   	
   }
   
   public void setBalAcqIssFlag(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBalAcqIssFlag,balAcqIssFlag.length);
   	
   }
   
     /**
	 * 	Update BalAcqIssFlag 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBalAcqIssFlag(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBalAcqIssFlag+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BalAcqIssFlag with another Field
	 *	@param value
	 */
   public void setBalAcqIssFlag(Field source) {
       replace(source,0,source.length(),beginBalAcqIssFlag,BAL_ACQ_ISS_FLAG_LEN);
   	
   }  
   
     /**
	 * 	Update BalAcqIssFlag 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBalAcqIssFlag(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBalAcqIssFlag,BAL_ACQ_ISS_FLAG_LEN);
   	
   }
   
     /**
	 * 	Update BalAcqIssFlag 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBalAcqIssFlag(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBalAcqIssFlag+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of balCurrCode
	 *	@return balCurrCode
	 */
	public int getBalCurrCode() throws CFException {
       if (isBalCurrCodeModified()) { 
           balCurrCode = refreshBalCurrCode();
        }
   		return balCurrCode;
	}
	

	
	   
	/**
	 * 	Update BalCurrCode with the passed value
	 *  Corresponding COBOL Variable is BAL-CURR-CODE
	 *	@param number
	 */
	public void setBalCurrCode(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    balCurrCode = checkBalCurrCodeMaxLimit(number); 
		serializeBalCurrCode(balCurrCode);
	}
	

	public void setBalCurrCode(long number) {
	    number = checkBalCurrCodeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBalCurrCode((int)number);
	}
	
	/**
	 * 	Update BalCurrCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setBalCurrCode(char[] value) throws CFException {
		 balCurrCode = serializeBalCurrCode(value);
	}
	/**
	 * 	Update BalCurrCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBalCurrCodeString(char[] value) throws CFException {
		 setBalCurrCode(value);
	}
	/**
	 *	Returns the value of balCurrExp
	 *	@return balCurrExp
	 */
	public int getBalCurrExp() throws CFException {
       if (isBalCurrExpModified()) { 
           balCurrExp = refreshBalCurrExp();
        }
   		return balCurrExp;
	}
	

	
	   
	/**
	 * 	Update BalCurrExp with the passed value
	 *  Corresponding COBOL Variable is BAL-CURR-EXP
	 *	@param number
	 */
	public void setBalCurrExp(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    balCurrExp = checkBalCurrExpMaxLimit(number); 
		serializeBalCurrExp(balCurrExp);
	}
	

	public void setBalCurrExp(long number) {
	    number = checkBalCurrExpMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBalCurrExp((int)number);
	}
	
	/**
	 * 	Update BalCurrExp with the passed value
	 *	@param value (String or char[])
	 */
	public void setBalCurrExp(char[] value) throws CFException {
		 balCurrExp = serializeBalCurrExp(value);
	}
	/**
	 * 	Update BalCurrExp with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBalCurrExpString(char[] value) throws CFException {
		 setBalCurrExp(value);
	}
	/**
	 *	Returns the value of balCmpltdAmt
	 *	@return balCmpltdAmt
	 */
	public long getBalCmpltdAmt() throws CFException {
       if (isBalCmpltdAmtModified()) { 
           balCmpltdAmt = refreshBalCmpltdAmt();
        }
   		return balCmpltdAmt;
	}
	

	
	   
	/**
	 * 	Update BalCmpltdAmt with the passed value
	 *  Corresponding COBOL Variable is BAL-CMPLTD-AMT
	 *	@param number
	 */
	public void setBalCmpltdAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    balCmpltdAmt = checkBalCmpltdAmtMaxLimit(number); 
		serializeBalCmpltdAmt(balCmpltdAmt);
	}
	

	/**
	 * 	Update BalCmpltdAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setBalCmpltdAmt(char[] value) throws CFException {
		 balCmpltdAmt = serializeBalCmpltdAmt(value);
	}
	/**
	 * 	Update BalCmpltdAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBalCmpltdAmtString(char[] value) throws CFException {
		 setBalCmpltdAmt(value);
	}
	/**
	 *	Returns the value of balCmpltdAmtInd
	 *	@return balCmpltdAmtInd
	 */
   public char[] getBalCmpltdAmtInd() throws CFException{
     if (isBalCmpltdAmtIndModified()) { 
        balCmpltdAmtInd = refreshBalCmpltdAmtInd();
     }
   		return balCmpltdAmtInd;
   }

  
	/**
	*  set variable balCmpltdAmtInd
	*  Corresponding COBOL Variable is BAL-CMPLTD-AMT-IND
	*  @param value
	**/
   public void setBalCmpltdAmtInd(char[] value) {
      balCmpltdAmtInd = checkBalCmpltdAmtIndConstraints(value);
      serializeBalCmpltdAmtInd(balCmpltdAmtInd);
   } 

     /**
	 * 	Update BalCmpltdAmtInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBalCmpltdAmtInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBalCmpltdAmtInd,balCmpltdAmtInd.length);
   	
   }
   
   public void setBalCmpltdAmtInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBalCmpltdAmtInd,balCmpltdAmtInd.length);
   	
   }
   
     /**
	 * 	Update BalCmpltdAmtInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBalCmpltdAmtInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBalCmpltdAmtInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BalCmpltdAmtInd with another Field
	 *	@param value
	 */
   public void setBalCmpltdAmtInd(Field source) {
       replace(source,0,source.length(),beginBalCmpltdAmtInd,BAL_CMPLTD_AMT_IND_LEN);
   	
   }  
   
     /**
	 * 	Update BalCmpltdAmtInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBalCmpltdAmtInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBalCmpltdAmtInd,BAL_CMPLTD_AMT_IND_LEN);
   	
   }
   
     /**
	 * 	Update BalCmpltdAmtInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBalCmpltdAmtInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBalCmpltdAmtInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of balIntrchgAmt
	 *	@return balIntrchgAmt
	 */
	public long getBalIntrchgAmt() throws CFException {
       if (isBalIntrchgAmtModified()) { 
           balIntrchgAmt = refreshBalIntrchgAmt();
        }
   		return balIntrchgAmt;
	}
	

	
	   
	/**
	 * 	Update BalIntrchgAmt with the passed value
	 *  Corresponding COBOL Variable is BAL-INTRCHG-AMT
	 *	@param number
	 */
	public void setBalIntrchgAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    balIntrchgAmt = checkBalIntrchgAmtMaxLimit(number); 
		serializeBalIntrchgAmt(balIntrchgAmt);
	}
	

	/**
	 * 	Update BalIntrchgAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setBalIntrchgAmt(char[] value) throws CFException {
		 balIntrchgAmt = serializeBalIntrchgAmt(value);
	}
	/**
	 * 	Update BalIntrchgAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBalIntrchgAmtString(char[] value) throws CFException {
		 setBalIntrchgAmt(value);
	}
	/**
	 *	Returns the value of balIntrchgAmtInd
	 *	@return balIntrchgAmtInd
	 */
   public char[] getBalIntrchgAmtInd() throws CFException{
     if (isBalIntrchgAmtIndModified()) { 
        balIntrchgAmtInd = refreshBalIntrchgAmtInd();
     }
   		return balIntrchgAmtInd;
   }

  
	/**
	*  set variable balIntrchgAmtInd
	*  Corresponding COBOL Variable is BAL-INTRCHG-AMT-IND
	*  @param value
	**/
   public void setBalIntrchgAmtInd(char[] value) {
      balIntrchgAmtInd = checkBalIntrchgAmtIndConstraints(value);
      serializeBalIntrchgAmtInd(balIntrchgAmtInd);
   } 

     /**
	 * 	Update BalIntrchgAmtInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBalIntrchgAmtInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBalIntrchgAmtInd,balIntrchgAmtInd.length);
   	
   }
   
   public void setBalIntrchgAmtInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBalIntrchgAmtInd,balIntrchgAmtInd.length);
   	
   }
   
     /**
	 * 	Update BalIntrchgAmtInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBalIntrchgAmtInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBalIntrchgAmtInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BalIntrchgAmtInd with another Field
	 *	@param value
	 */
   public void setBalIntrchgAmtInd(Field source) {
       replace(source,0,source.length(),beginBalIntrchgAmtInd,BAL_INTRCHG_AMT_IND_LEN);
   	
   }  
   
     /**
	 * 	Update BalIntrchgAmtInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBalIntrchgAmtInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBalIntrchgAmtInd,BAL_INTRCHG_AMT_IND_LEN);
   	
   }
   
     /**
	 * 	Update BalIntrchgAmtInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBalIntrchgAmtInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBalIntrchgAmtInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of balSettlAmt
	 *	@return balSettlAmt
	 */
	public long getBalSettlAmt() throws CFException {
       if (isBalSettlAmtModified()) { 
           balSettlAmt = refreshBalSettlAmt();
        }
   		return balSettlAmt;
	}
	

	
	   
	/**
	 * 	Update BalSettlAmt with the passed value
	 *  Corresponding COBOL Variable is BAL-SETTL-AMT
	 *	@param number
	 */
	public void setBalSettlAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    balSettlAmt = checkBalSettlAmtMaxLimit(number); 
		serializeBalSettlAmt(balSettlAmt);
	}
	

	/**
	 * 	Update BalSettlAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setBalSettlAmt(char[] value) throws CFException {
		 balSettlAmt = serializeBalSettlAmt(value);
	}
	/**
	 * 	Update BalSettlAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBalSettlAmtString(char[] value) throws CFException {
		 setBalSettlAmt(value);
	}
	/**
	 *	Returns the value of balSettlAmtInd
	 *	@return balSettlAmtInd
	 */
   public char[] getBalSettlAmtInd() throws CFException{
     if (isBalSettlAmtIndModified()) { 
        balSettlAmtInd = refreshBalSettlAmtInd();
     }
   		return balSettlAmtInd;
   }

  
	/**
	*  set variable balSettlAmtInd
	*  Corresponding COBOL Variable is BAL-SETTL-AMT-IND
	*  @param value
	**/
   public void setBalSettlAmtInd(char[] value) {
      balSettlAmtInd = checkBalSettlAmtIndConstraints(value);
      serializeBalSettlAmtInd(balSettlAmtInd);
   } 

     /**
	 * 	Update BalSettlAmtInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBalSettlAmtInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBalSettlAmtInd,balSettlAmtInd.length);
   	
   }
   
   public void setBalSettlAmtInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBalSettlAmtInd,balSettlAmtInd.length);
   	
   }
   
     /**
	 * 	Update BalSettlAmtInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBalSettlAmtInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBalSettlAmtInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BalSettlAmtInd with another Field
	 *	@param value
	 */
   public void setBalSettlAmtInd(Field source) {
       replace(source,0,source.length(),beginBalSettlAmtInd,BAL_SETTL_AMT_IND_LEN);
   	
   }  
   
     /**
	 * 	Update BalSettlAmtInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBalSettlAmtInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBalSettlAmtInd,BAL_SETTL_AMT_IND_LEN);
   	
   }
   
     /**
	 * 	Update BalSettlAmtInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBalSettlAmtInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBalSettlAmtInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of balRecordCnt
	 *	@return balRecordCnt
	 */
	public long getBalRecordCnt() throws CFException {
       if (isBalRecordCntModified()) { 
           balRecordCnt = refreshBalRecordCnt();
        }
   		return balRecordCnt;
	}
	

	
	   
	/**
	 * 	Update BalRecordCnt with the passed value
	 *  Corresponding COBOL Variable is BAL-RECORD-CNT
	 *	@param number
	 */
	public void setBalRecordCnt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    balRecordCnt = checkBalRecordCntMaxLimit(number); 
		serializeBalRecordCnt(balRecordCnt);
	}
	

	/**
	 * 	Update BalRecordCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setBalRecordCnt(char[] value) throws CFException {
		 balRecordCnt = serializeBalRecordCnt(value);
	}
	/**
	 * 	Update BalRecordCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBalRecordCntString(char[] value) throws CFException {
		 setBalRecordCnt(value);
	}
	/**
	 *	Returns the value of balFiller
	 *	@return balFiller
	 */
   public char[] getBalFiller() throws CFException{
     if (isBalFillerModified()) { 
        balFiller = refreshBalFiller();
     }
   		return balFiller;
   }

  
	/**
	*  set variable balFiller
	*  Corresponding COBOL Variable is BAL-FILLER
	*  @param value
	**/
   public void setBalFiller(char[] value) {
      balFiller = checkBalFillerConstraints(value);
      serializeBalFiller(balFiller);
   } 

     /**
	 * 	Update BalFiller 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBalFiller(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBalFiller,balFiller.length);
   	
   }
   
   public void setBalFiller(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBalFiller,balFiller.length);
   	
   }
   
     /**
	 * 	Update BalFiller 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBalFiller(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBalFiller+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BalFiller with another Field
	 *	@param value
	 */
   public void setBalFiller(Field source) {
       replace(source,0,source.length(),beginBalFiller,BAL_FILLER_LEN);
   	
   }  
   
     /**
	 * 	Update BalFiller 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBalFiller(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBalFiller,BAL_FILLER_LEN);
   	
   }
   
     /**
	 * 	Update BalFiller 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBalFiller(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBalFiller+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BalRecord
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBalReportType(CONSTANTS.SPACE_10);
         setBalReportId(CONSTANTS.SPACE_5);
         setBalCutoffNum(CONSTANTS.SPACE_3);
         setBalSettlSvc(CONSTANTS.SPACE_3);
         setBalProcessorId(CONSTANTS.SPACE_10);
         setBalIca(CONSTANTS.SPACE_6);
         setBalAcqIssFlag(CONSTANTS.SPACE);
                     setBalCurrCode(0);
                     setBalCurrExp(0);
                     setBalCmpltdAmt(0);
         setBalCmpltdAmtInd(CONSTANTS.SPACE);
                     setBalIntrchgAmt(0);
         setBalIntrchgAmtInd(CONSTANTS.SPACE);
                     setBalSettlAmt(0);
         setBalSettlAmtInd(CONSTANTS.SPACE);
                     setBalRecordCnt(0);
         setBalFiller(CONSTANTS.SPACE_95);
   }

		public static int getBalRecordFieldLength() {
			return BAL_RECORD_LENGTH;
		}

}
  
