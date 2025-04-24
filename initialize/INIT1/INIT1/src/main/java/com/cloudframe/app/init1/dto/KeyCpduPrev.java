package com.cloudframe.app.init1.dto;

/**
*  The class KeyCpduPrev is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class KeyCpduPrev extends KeyCpduPrevSerialized { 
   

						private char[] cpduPrvRefRecType = new char[1];
				private CpduPrvCustAcct cpduPrvCustAcct = new CpduPrvCustAcct();
				private CpduPrvMtn cpduPrvMtn = new CpduPrvMtn();

						private char[] cpduPrvOffrTypeCd = new char[2];

								private int cpduPrvOffrTypeId;

						private char[] cpduPrvProdSeq = new char[9];

						private char[] cpduPrvEventDiscId = new char[9];

						private char[] cpduPrvPeriodNum = new char[9];

						private char[] cpduPrvEventDiscCd = new char[3];

						private char[] cpduPrvUbOrigInstance = new char[3];

						private char[] cpduPrvPlanStartDt = new char[10];

						private char[] cpduPrvPlanEndDt = new char[10];

								private long cpduPrvTotalDiscUsage;
	
	/**
	* Constructor for KeyCpduPrev
	**/
    public KeyCpduPrev() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for KeyCpduPrev. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public KeyCpduPrev(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			cpduPrvCustAcct.setParent(this,getStartOffset() + 1);
	       			cpduPrvMtn.setParent(this,getStartOffset() + 9);
								setCpduPrvRefRecType(fillSpace(1));
								setCpduPrvOffrTypeCd(fillSpace(2));
								setCpduPrvOffrTypeId(0);
								setCpduPrvProdSeq(fillSpace(9));
								setCpduPrvEventDiscId(fillSpace(9));
								setCpduPrvPeriodNum(fillSpace(9));
								setCpduPrvEventDiscCd(fillSpace(3));
								setCpduPrvUbOrigInstance(fillSpace(3));
								setCpduPrvPlanStartDt(fillSpace(10));
								setCpduPrvPlanEndDt(fillSpace(10));
								setCpduPrvTotalDiscUsage(0L);
    } 

	/**
	 *	Returns the value of cpduPrvRefRecType
	 *	@return cpduPrvRefRecType
	 */
   public char[] getCpduPrvRefRecType() throws CFException{
     if (isCpduPrvRefRecTypeModified()) { 
        cpduPrvRefRecType = refreshCpduPrvRefRecType();
     }
   		return cpduPrvRefRecType;
   }

  
	/**
	*  set variable cpduPrvRefRecType
	*  Corresponding COBOL Variable is WS-CPDU-PRV-REF-REC-TYPE
	*  @param value
	**/
   public void setCpduPrvRefRecType(char[] value) {
      cpduPrvRefRecType = checkCpduPrvRefRecTypeConstraints(value);
      serializeCpduPrvRefRecType(cpduPrvRefRecType);
   } 

     /**
	 * 	Update CpduPrvRefRecType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCpduPrvRefRecType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCpduPrvRefRecType,cpduPrvRefRecType.length);
   	
   }
   
   public void setCpduPrvRefRecType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCpduPrvRefRecType,cpduPrvRefRecType.length);
   	
   }
   
     /**
	 * 	Update CpduPrvRefRecType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCpduPrvRefRecType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpduPrvRefRecType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CpduPrvRefRecType with another Field
	 *	@param value
	 */
   public void setCpduPrvRefRecType(Field source) {
       replace(source,0,source.length(),beginCpduPrvRefRecType,CPDU_PRV_REF_REC_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update CpduPrvRefRecType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCpduPrvRefRecType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCpduPrvRefRecType,CPDU_PRV_REF_REC_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update CpduPrvRefRecType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCpduPrvRefRecType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpduPrvRefRecType+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cpduPrvCustAcct
	 *	@return cpduPrvCustAcct
	 */   
	 public CpduPrvCustAcct getCpduPrvCustAcct() {
   	return cpduPrvCustAcct;
   }
   /**
	* 	Update CpduPrvCustAcct with the passed value
	*   Corresponding COBOL Variable is WS-CPDU-PRV-CUST-ACCT
	*	@param value
	*/
   public void setCpduPrvCustAcct(char[] value) {
      cpduPrvCustAcct.setString(value); 
   }   
    
     /**
	 * 	Update CpduPrvCustAcct 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCpduPrvCustAcct(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cpduPrvCustAcct.begin,cpduPrvCustAcct.length());
   }
   
     /**
	 * 	Update CpduPrvCustAcct 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCpduPrvCustAcct(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cpduPrvCustAcct.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CpduPrvCustAcct with another Field
	 *	@param value
	 */
   public void setCpduPrvCustAcct(Field source) {
   	replace(source,0,source.length(),cpduPrvCustAcct.begin,cpduPrvCustAcct.length());
   }  
   
     /**
	 * 	Update CpduPrvCustAcct 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCpduPrvCustAcct(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cpduPrvCustAcct.begin,cpduPrvCustAcct.length());
   }
   
     /**
	 * 	Update CpduPrvCustAcct 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCpduPrvCustAcct(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cpduPrvCustAcct.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of cpduPrvMtn
	 *	@return cpduPrvMtn
	 */   
	 public CpduPrvMtn getCpduPrvMtn() {
   	return cpduPrvMtn;
   }
   /**
	* 	Update CpduPrvMtn with the passed value
	*   Corresponding COBOL Variable is WS-CPDU-PRV-MTN
	*	@param value
	*/
   public void setCpduPrvMtn(char[] value) {
      cpduPrvMtn.setString(value); 
   }   
    
     /**
	 * 	Update CpduPrvMtn 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCpduPrvMtn(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cpduPrvMtn.begin,cpduPrvMtn.length());
   }
   
     /**
	 * 	Update CpduPrvMtn 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCpduPrvMtn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cpduPrvMtn.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CpduPrvMtn with another Field
	 *	@param value
	 */
   public void setCpduPrvMtn(Field source) {
   	replace(source,0,source.length(),cpduPrvMtn.begin,cpduPrvMtn.length());
   }  
   
     /**
	 * 	Update CpduPrvMtn 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCpduPrvMtn(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cpduPrvMtn.begin,cpduPrvMtn.length());
   }
   
     /**
	 * 	Update CpduPrvMtn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCpduPrvMtn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cpduPrvMtn.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of cpduPrvOffrTypeCd
	 *	@return cpduPrvOffrTypeCd
	 */
   public char[] getCpduPrvOffrTypeCd() throws CFException{
     if (isCpduPrvOffrTypeCdModified()) { 
        cpduPrvOffrTypeCd = refreshCpduPrvOffrTypeCd();
     }
   		return cpduPrvOffrTypeCd;
   }

  
	/**
	*  set variable cpduPrvOffrTypeCd
	*  Corresponding COBOL Variable is WS-CPDU-PRV-OFFR-TYPE-CD
	*  @param value
	**/
   public void setCpduPrvOffrTypeCd(char[] value) {
      cpduPrvOffrTypeCd = checkCpduPrvOffrTypeCdConstraints(value);
      serializeCpduPrvOffrTypeCd(cpduPrvOffrTypeCd);
   } 

     /**
	 * 	Update CpduPrvOffrTypeCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCpduPrvOffrTypeCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCpduPrvOffrTypeCd,cpduPrvOffrTypeCd.length);
   	
   }
   
   public void setCpduPrvOffrTypeCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCpduPrvOffrTypeCd,cpduPrvOffrTypeCd.length);
   	
   }
   
     /**
	 * 	Update CpduPrvOffrTypeCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCpduPrvOffrTypeCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpduPrvOffrTypeCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CpduPrvOffrTypeCd with another Field
	 *	@param value
	 */
   public void setCpduPrvOffrTypeCd(Field source) {
       replace(source,0,source.length(),beginCpduPrvOffrTypeCd,CPDU_PRV_OFFR_TYPE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update CpduPrvOffrTypeCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCpduPrvOffrTypeCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCpduPrvOffrTypeCd,CPDU_PRV_OFFR_TYPE_CD_LEN);
   	
   }
   
     /**
	 * 	Update CpduPrvOffrTypeCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCpduPrvOffrTypeCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpduPrvOffrTypeCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cpduPrvOffrTypeId
	 *	@return cpduPrvOffrTypeId
	 */
	public int getCpduPrvOffrTypeId() throws CFException {
        if (isCpduPrvOffrTypeIdModified()) { 
           cpduPrvOffrTypeId = refreshCpduPrvOffrTypeId();
        }
   		return cpduPrvOffrTypeId;
	}
	
	/**
	 * 	Update CpduPrvOffrTypeId with the passed value
	 *  Corresponding COBOL Variable is WS-CPDU-PRV-OFFR-TYPE-ID
	 *	@param number
	 */
	public void setCpduPrvOffrTypeId(int number) {
	     // Truncate if the number is beyond +/- Max range
	    cpduPrvOffrTypeId = checkCpduPrvOffrTypeIdMaxLimit(number); 
		serializeCpduPrvOffrTypeId(cpduPrvOffrTypeId);
	}


	public void setCpduPrvOffrTypeId(long number) {
	    number = checkCpduPrvOffrTypeIdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCpduPrvOffrTypeId((int)number);
	}
	
	/**
	 *	Returns the value of cpduPrvProdSeq
	 *	@return cpduPrvProdSeq
	 */
   public char[] getCpduPrvProdSeq() throws CFException{
     if (isCpduPrvProdSeqModified()) { 
        cpduPrvProdSeq = refreshCpduPrvProdSeq();
     }
   		return cpduPrvProdSeq;
   }

  
	/**
	*  set variable cpduPrvProdSeq
	*  Corresponding COBOL Variable is WS-CPDU-PRV-PROD-SEQ
	*  @param value
	**/
   public void setCpduPrvProdSeq(char[] value) {
      cpduPrvProdSeq = checkCpduPrvProdSeqConstraints(value);
      serializeCpduPrvProdSeq(cpduPrvProdSeq);
   } 

     /**
	 * 	Update CpduPrvProdSeq 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCpduPrvProdSeq(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCpduPrvProdSeq,cpduPrvProdSeq.length);
   	
   }
   
   public void setCpduPrvProdSeq(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCpduPrvProdSeq,cpduPrvProdSeq.length);
   	
   }
   
     /**
	 * 	Update CpduPrvProdSeq 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCpduPrvProdSeq(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpduPrvProdSeq+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CpduPrvProdSeq with another Field
	 *	@param value
	 */
   public void setCpduPrvProdSeq(Field source) {
       replace(source,0,source.length(),beginCpduPrvProdSeq,CPDU_PRV_PROD_SEQ_LEN);
   	
   }  
   
     /**
	 * 	Update CpduPrvProdSeq 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCpduPrvProdSeq(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCpduPrvProdSeq,CPDU_PRV_PROD_SEQ_LEN);
   	
   }
   
     /**
	 * 	Update CpduPrvProdSeq 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCpduPrvProdSeq(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpduPrvProdSeq+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cpduPrvEventDiscId
	 *	@return cpduPrvEventDiscId
	 */
   public char[] getCpduPrvEventDiscId() throws CFException{
     if (isCpduPrvEventDiscIdModified()) { 
        cpduPrvEventDiscId = refreshCpduPrvEventDiscId();
     }
   		return cpduPrvEventDiscId;
   }

  
	/**
	*  set variable cpduPrvEventDiscId
	*  Corresponding COBOL Variable is WS-CPDU-PRV-EVENT-DISC-ID
	*  @param value
	**/
   public void setCpduPrvEventDiscId(char[] value) {
      cpduPrvEventDiscId = checkCpduPrvEventDiscIdConstraints(value);
      serializeCpduPrvEventDiscId(cpduPrvEventDiscId);
   } 

     /**
	 * 	Update CpduPrvEventDiscId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCpduPrvEventDiscId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCpduPrvEventDiscId,cpduPrvEventDiscId.length);
   	
   }
   
   public void setCpduPrvEventDiscId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCpduPrvEventDiscId,cpduPrvEventDiscId.length);
   	
   }
   
     /**
	 * 	Update CpduPrvEventDiscId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCpduPrvEventDiscId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpduPrvEventDiscId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CpduPrvEventDiscId with another Field
	 *	@param value
	 */
   public void setCpduPrvEventDiscId(Field source) {
       replace(source,0,source.length(),beginCpduPrvEventDiscId,CPDU_PRV_EVENT_DISC_ID_LEN);
   	
   }  
   
     /**
	 * 	Update CpduPrvEventDiscId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCpduPrvEventDiscId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCpduPrvEventDiscId,CPDU_PRV_EVENT_DISC_ID_LEN);
   	
   }
   
     /**
	 * 	Update CpduPrvEventDiscId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCpduPrvEventDiscId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpduPrvEventDiscId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cpduPrvPeriodNum
	 *	@return cpduPrvPeriodNum
	 */
   public char[] getCpduPrvPeriodNum() throws CFException{
     if (isCpduPrvPeriodNumModified()) { 
        cpduPrvPeriodNum = refreshCpduPrvPeriodNum();
     }
   		return cpduPrvPeriodNum;
   }

  
	/**
	*  set variable cpduPrvPeriodNum
	*  Corresponding COBOL Variable is WS-CPDU-PRV-PERIOD-NUM
	*  @param value
	**/
   public void setCpduPrvPeriodNum(char[] value) {
      cpduPrvPeriodNum = checkCpduPrvPeriodNumConstraints(value);
      serializeCpduPrvPeriodNum(cpduPrvPeriodNum);
   } 

     /**
	 * 	Update CpduPrvPeriodNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCpduPrvPeriodNum(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCpduPrvPeriodNum,cpduPrvPeriodNum.length);
   	
   }
   
   public void setCpduPrvPeriodNum(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCpduPrvPeriodNum,cpduPrvPeriodNum.length);
   	
   }
   
     /**
	 * 	Update CpduPrvPeriodNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCpduPrvPeriodNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpduPrvPeriodNum+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CpduPrvPeriodNum with another Field
	 *	@param value
	 */
   public void setCpduPrvPeriodNum(Field source) {
       replace(source,0,source.length(),beginCpduPrvPeriodNum,CPDU_PRV_PERIOD_NUM_LEN);
   	
   }  
   
     /**
	 * 	Update CpduPrvPeriodNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCpduPrvPeriodNum(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCpduPrvPeriodNum,CPDU_PRV_PERIOD_NUM_LEN);
   	
   }
   
     /**
	 * 	Update CpduPrvPeriodNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCpduPrvPeriodNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpduPrvPeriodNum+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cpduPrvEventDiscCd
	 *	@return cpduPrvEventDiscCd
	 */
   public char[] getCpduPrvEventDiscCd() throws CFException{
     if (isCpduPrvEventDiscCdModified()) { 
        cpduPrvEventDiscCd = refreshCpduPrvEventDiscCd();
     }
   		return cpduPrvEventDiscCd;
   }

  
	/**
	*  set variable cpduPrvEventDiscCd
	*  Corresponding COBOL Variable is WS-CPDU-PRV-EVENT-DISC-CD
	*  @param value
	**/
   public void setCpduPrvEventDiscCd(char[] value) {
      cpduPrvEventDiscCd = checkCpduPrvEventDiscCdConstraints(value);
      serializeCpduPrvEventDiscCd(cpduPrvEventDiscCd);
   } 

     /**
	 * 	Update CpduPrvEventDiscCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCpduPrvEventDiscCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCpduPrvEventDiscCd,cpduPrvEventDiscCd.length);
   	
   }
   
   public void setCpduPrvEventDiscCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCpduPrvEventDiscCd,cpduPrvEventDiscCd.length);
   	
   }
   
     /**
	 * 	Update CpduPrvEventDiscCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCpduPrvEventDiscCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpduPrvEventDiscCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CpduPrvEventDiscCd with another Field
	 *	@param value
	 */
   public void setCpduPrvEventDiscCd(Field source) {
       replace(source,0,source.length(),beginCpduPrvEventDiscCd,CPDU_PRV_EVENT_DISC_CD_LEN);
   	
   }  
   
     /**
	 * 	Update CpduPrvEventDiscCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCpduPrvEventDiscCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCpduPrvEventDiscCd,CPDU_PRV_EVENT_DISC_CD_LEN);
   	
   }
   
     /**
	 * 	Update CpduPrvEventDiscCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCpduPrvEventDiscCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpduPrvEventDiscCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cpduPrvUbOrigInstance
	 *	@return cpduPrvUbOrigInstance
	 */
   public char[] getCpduPrvUbOrigInstance() throws CFException{
     if (isCpduPrvUbOrigInstanceModified()) { 
        cpduPrvUbOrigInstance = refreshCpduPrvUbOrigInstance();
     }
   		return cpduPrvUbOrigInstance;
   }

  
	/**
	*  set variable cpduPrvUbOrigInstance
	*  Corresponding COBOL Variable is WS-CPDU-PRV-UB-ORIG-INSTANCE
	*  @param value
	**/
   public void setCpduPrvUbOrigInstance(char[] value) {
      cpduPrvUbOrigInstance = checkCpduPrvUbOrigInstanceConstraints(value);
      serializeCpduPrvUbOrigInstance(cpduPrvUbOrigInstance);
   } 

     /**
	 * 	Update CpduPrvUbOrigInstance 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCpduPrvUbOrigInstance(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCpduPrvUbOrigInstance,cpduPrvUbOrigInstance.length);
   	
   }
   
   public void setCpduPrvUbOrigInstance(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCpduPrvUbOrigInstance,cpduPrvUbOrigInstance.length);
   	
   }
   
     /**
	 * 	Update CpduPrvUbOrigInstance 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCpduPrvUbOrigInstance(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpduPrvUbOrigInstance+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CpduPrvUbOrigInstance with another Field
	 *	@param value
	 */
   public void setCpduPrvUbOrigInstance(Field source) {
       replace(source,0,source.length(),beginCpduPrvUbOrigInstance,CPDU_PRV_UB_ORIG_INSTANCE_LEN);
   	
   }  
   
     /**
	 * 	Update CpduPrvUbOrigInstance 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCpduPrvUbOrigInstance(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCpduPrvUbOrigInstance,CPDU_PRV_UB_ORIG_INSTANCE_LEN);
   	
   }
   
     /**
	 * 	Update CpduPrvUbOrigInstance 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCpduPrvUbOrigInstance(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpduPrvUbOrigInstance+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cpduPrvPlanStartDt
	 *	@return cpduPrvPlanStartDt
	 */
   public char[] getCpduPrvPlanStartDt() throws CFException{
     if (isCpduPrvPlanStartDtModified()) { 
        cpduPrvPlanStartDt = refreshCpduPrvPlanStartDt();
     }
   		return cpduPrvPlanStartDt;
   }

  
	/**
	*  set variable cpduPrvPlanStartDt
	*  Corresponding COBOL Variable is WS-CPDU-PRV-PLAN-START-DT
	*  @param value
	**/
   public void setCpduPrvPlanStartDt(char[] value) {
      cpduPrvPlanStartDt = checkCpduPrvPlanStartDtConstraints(value);
      serializeCpduPrvPlanStartDt(cpduPrvPlanStartDt);
   } 

     /**
	 * 	Update CpduPrvPlanStartDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCpduPrvPlanStartDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCpduPrvPlanStartDt,cpduPrvPlanStartDt.length);
   	
   }
   
   public void setCpduPrvPlanStartDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCpduPrvPlanStartDt,cpduPrvPlanStartDt.length);
   	
   }
   
     /**
	 * 	Update CpduPrvPlanStartDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCpduPrvPlanStartDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpduPrvPlanStartDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CpduPrvPlanStartDt with another Field
	 *	@param value
	 */
   public void setCpduPrvPlanStartDt(Field source) {
       replace(source,0,source.length(),beginCpduPrvPlanStartDt,CPDU_PRV_PLAN_START_DT_LEN);
   	
   }  
   
     /**
	 * 	Update CpduPrvPlanStartDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCpduPrvPlanStartDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCpduPrvPlanStartDt,CPDU_PRV_PLAN_START_DT_LEN);
   	
   }
   
     /**
	 * 	Update CpduPrvPlanStartDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCpduPrvPlanStartDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpduPrvPlanStartDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cpduPrvPlanEndDt
	 *	@return cpduPrvPlanEndDt
	 */
   public char[] getCpduPrvPlanEndDt() throws CFException{
     if (isCpduPrvPlanEndDtModified()) { 
        cpduPrvPlanEndDt = refreshCpduPrvPlanEndDt();
     }
   		return cpduPrvPlanEndDt;
   }

  
	/**
	*  set variable cpduPrvPlanEndDt
	*  Corresponding COBOL Variable is WS-CPDU-PRV-PLAN-END-DT
	*  @param value
	**/
   public void setCpduPrvPlanEndDt(char[] value) {
      cpduPrvPlanEndDt = checkCpduPrvPlanEndDtConstraints(value);
      serializeCpduPrvPlanEndDt(cpduPrvPlanEndDt);
   } 

     /**
	 * 	Update CpduPrvPlanEndDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCpduPrvPlanEndDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCpduPrvPlanEndDt,cpduPrvPlanEndDt.length);
   	
   }
   
   public void setCpduPrvPlanEndDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCpduPrvPlanEndDt,cpduPrvPlanEndDt.length);
   	
   }
   
     /**
	 * 	Update CpduPrvPlanEndDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCpduPrvPlanEndDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpduPrvPlanEndDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CpduPrvPlanEndDt with another Field
	 *	@param value
	 */
   public void setCpduPrvPlanEndDt(Field source) {
       replace(source,0,source.length(),beginCpduPrvPlanEndDt,CPDU_PRV_PLAN_END_DT_LEN);
   	
   }  
   
     /**
	 * 	Update CpduPrvPlanEndDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCpduPrvPlanEndDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCpduPrvPlanEndDt,CPDU_PRV_PLAN_END_DT_LEN);
   	
   }
   
     /**
	 * 	Update CpduPrvPlanEndDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCpduPrvPlanEndDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpduPrvPlanEndDt+targetIndex,targetLen);
    
   }
	public long getCpduPrvTotalDiscUsage() throws CFException {
        if (isCpduPrvTotalDiscUsageModified()) { 
           cpduPrvTotalDiscUsage = refreshCpduPrvTotalDiscUsage();
        }
   		return cpduPrvTotalDiscUsage;
	}
	
	/**
	 * 	Update CpduPrvTotalDiscUsage with the passed value
	 *  Corresponding COBOL Variable is WS-CPDU-PRV-TOTAL-DISC-USAGE
	 *	@param number
	 */
	public void setCpduPrvTotalDiscUsage(long number) {
			cpduPrvTotalDiscUsage = checkCpduPrvTotalDiscUsageMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeCpduPrvTotalDiscUsage(cpduPrvTotalDiscUsage);
	}



	
	
	
	/**
	 * 	initializes KeyCpduPrev
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setCpduPrvRefRecType(CONSTANTS.SPACE);
          cpduPrvCustAcct.initialize();
     
          cpduPrvMtn.initialize();
     
         setCpduPrvOffrTypeCd(CONSTANTS.SPACE_2);
                     setCpduPrvOffrTypeId(0);
         setCpduPrvProdSeq(CONSTANTS.SPACE_9);
         setCpduPrvEventDiscId(CONSTANTS.SPACE_9);
         setCpduPrvPeriodNum(CONSTANTS.SPACE_9);
         setCpduPrvEventDiscCd(CONSTANTS.SPACE_3);
         setCpduPrvUbOrigInstance(CONSTANTS.SPACE_3);
         setCpduPrvPlanStartDt(CONSTANTS.SPACE_10);
         setCpduPrvPlanEndDt(CONSTANTS.SPACE_10);
                     setCpduPrvTotalDiscUsage(0);
   }

		public static int getKeyCpduPrevFieldLength() {
			return KEY_CPDU_PREV_LENGTH;
		}

}
  
