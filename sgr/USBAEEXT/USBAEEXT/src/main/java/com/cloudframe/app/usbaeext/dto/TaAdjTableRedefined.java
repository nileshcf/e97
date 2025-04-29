package com.cloudframe.app.usbaeext.dto;

/**
*  The class TaAdjTableRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/


import com.cloudframe.app.usbaeext.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class TaAdjTableRedefined extends TaAdjTableRedefinedSerialized { 
   

						private char[] taSiteCode = Field.fillLowValue(3);

						private char[] taAdjCode = Field.fillLowValue(3);

						private char[] taSortType = Field.fillLowValue(3);

						private char[] taBankNo = Field.fillLowValue(3);

						private char[] taDeptNo = Field.fillLowValue(2);

						private char[] taAcctCd = Field.fillLowValue(2);

						private char[] taTypeCd = Field.fillLowValue(2);

						private char[] taClerkId = Field.fillLowValue(8);

						private char[] taSrcReceiptCd = Field.fillLowValue(6);

						private char[] taSrcErrorCd = Field.fillLowValue(6);

								private int taAdjCodeCnt;
	
	/**
	* Constructor for TaAdjTableRedefined
	**/
    public TaAdjTableRedefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for TaAdjTableRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TaAdjTableRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of taSiteCode
	 *	@return taSiteCode
	 */
   public char[] getTaSiteCode() throws CFException{
     if (isTaSiteCodeModified()) { 
        taSiteCode = refreshTaSiteCode();
     }
   		return taSiteCode;
   }

  
	/**
	*  set variable taSiteCode
	*  Corresponding COBOL Variable is TA-SITE-CODE
	*  @param value
	**/
   public void setTaSiteCode(char[] value) {
      taSiteCode = checkTaSiteCodeConstraints(value);
      serializeTaSiteCode(taSiteCode);
   } 

     /**
	 * 	Update TaSiteCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaSiteCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaSiteCode,taSiteCode.length);
   	
   }
   
   public void setTaSiteCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaSiteCode,taSiteCode.length);
   	
   }
   
     /**
	 * 	Update TaSiteCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaSiteCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaSiteCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaSiteCode with another Field
	 *	@param value
	 */
   public void setTaSiteCode(Field source) {
       replace(source,0,source.length(),beginTaSiteCode,TA_SITE_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update TaSiteCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaSiteCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaSiteCode,TA_SITE_CODE_LEN);
   	
   }
   
     /**
	 * 	Update TaSiteCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaSiteCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaSiteCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taAdjCode
	 *	@return taAdjCode
	 */
   public char[] getTaAdjCode() throws CFException{
     if (isTaAdjCodeModified()) { 
        taAdjCode = refreshTaAdjCode();
     }
   		return taAdjCode;
   }

  
	/**
	*  set variable taAdjCode
	*  Corresponding COBOL Variable is TA-ADJ-CODE
	*  @param value
	**/
   public void setTaAdjCode(char[] value) {
      taAdjCode = checkTaAdjCodeConstraints(value);
      serializeTaAdjCode(taAdjCode);
   } 

     /**
	 * 	Update TaAdjCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaAdjCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaAdjCode,taAdjCode.length);
   	
   }
   
   public void setTaAdjCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaAdjCode,taAdjCode.length);
   	
   }
   
     /**
	 * 	Update TaAdjCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaAdjCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaAdjCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaAdjCode with another Field
	 *	@param value
	 */
   public void setTaAdjCode(Field source) {
       replace(source,0,source.length(),beginTaAdjCode,TA_ADJ_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update TaAdjCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaAdjCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaAdjCode,TA_ADJ_CODE_LEN);
   	
   }
   
     /**
	 * 	Update TaAdjCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaAdjCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaAdjCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taSortType
	 *	@return taSortType
	 */
   public char[] getTaSortType() throws CFException{
     if (isTaSortTypeModified()) { 
        taSortType = refreshTaSortType();
     }
   		return taSortType;
   }

  
	/**
	*  set variable taSortType
	*  Corresponding COBOL Variable is TA-SORT-TYPE
	*  @param value
	**/
   public void setTaSortType(char[] value) {
      taSortType = checkTaSortTypeConstraints(value);
      serializeTaSortType(taSortType);
   } 

     /**
	 * 	Update TaSortType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaSortType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaSortType,taSortType.length);
   	
   }
   
   public void setTaSortType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaSortType,taSortType.length);
   	
   }
   
     /**
	 * 	Update TaSortType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaSortType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaSortType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaSortType with another Field
	 *	@param value
	 */
   public void setTaSortType(Field source) {
       replace(source,0,source.length(),beginTaSortType,TA_SORT_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update TaSortType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaSortType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaSortType,TA_SORT_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update TaSortType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaSortType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaSortType+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taBankNo
	 *	@return taBankNo
	 */
   public char[] getTaBankNo() throws CFException{
     if (isTaBankNoModified()) { 
        taBankNo = refreshTaBankNo();
     }
   		return taBankNo;
   }

  
	/**
	*  set variable taBankNo
	*  Corresponding COBOL Variable is TA-BANK-NO
	*  @param value
	**/
   public void setTaBankNo(char[] value) {
      taBankNo = checkTaBankNoConstraints(value);
      serializeTaBankNo(taBankNo);
   } 

     /**
	 * 	Update TaBankNo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaBankNo(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaBankNo,taBankNo.length);
   	
   }
   
   public void setTaBankNo(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaBankNo,taBankNo.length);
   	
   }
   
     /**
	 * 	Update TaBankNo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaBankNo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaBankNo+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaBankNo with another Field
	 *	@param value
	 */
   public void setTaBankNo(Field source) {
       replace(source,0,source.length(),beginTaBankNo,TA_BANK_NO_LEN);
   	
   }  
   
     /**
	 * 	Update TaBankNo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaBankNo(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaBankNo,TA_BANK_NO_LEN);
   	
   }
   
     /**
	 * 	Update TaBankNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaBankNo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaBankNo+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taDeptNo
	 *	@return taDeptNo
	 */
   public char[] getTaDeptNo() throws CFException{
     if (isTaDeptNoModified()) { 
        taDeptNo = refreshTaDeptNo();
     }
   		return taDeptNo;
   }

  
	/**
	*  set variable taDeptNo
	*  Corresponding COBOL Variable is TA-DEPT-NO
	*  @param value
	**/
   public void setTaDeptNo(char[] value) {
      taDeptNo = checkTaDeptNoConstraints(value);
      serializeTaDeptNo(taDeptNo);
   } 

     /**
	 * 	Update TaDeptNo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaDeptNo(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaDeptNo,taDeptNo.length);
   	
   }
   
   public void setTaDeptNo(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaDeptNo,taDeptNo.length);
   	
   }
   
     /**
	 * 	Update TaDeptNo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaDeptNo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaDeptNo+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaDeptNo with another Field
	 *	@param value
	 */
   public void setTaDeptNo(Field source) {
       replace(source,0,source.length(),beginTaDeptNo,TA_DEPT_NO_LEN);
   	
   }  
   
     /**
	 * 	Update TaDeptNo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaDeptNo(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaDeptNo,TA_DEPT_NO_LEN);
   	
   }
   
     /**
	 * 	Update TaDeptNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaDeptNo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaDeptNo+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taAcctCd
	 *	@return taAcctCd
	 */
   public char[] getTaAcctCd() throws CFException{
     if (isTaAcctCdModified()) { 
        taAcctCd = refreshTaAcctCd();
     }
   		return taAcctCd;
   }

  
	/**
	*  set variable taAcctCd
	*  Corresponding COBOL Variable is TA-ACCT-CD
	*  @param value
	**/
   public void setTaAcctCd(char[] value) {
      taAcctCd = checkTaAcctCdConstraints(value);
      serializeTaAcctCd(taAcctCd);
   } 

     /**
	 * 	Update TaAcctCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaAcctCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaAcctCd,taAcctCd.length);
   	
   }
   
   public void setTaAcctCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaAcctCd,taAcctCd.length);
   	
   }
   
     /**
	 * 	Update TaAcctCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaAcctCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaAcctCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaAcctCd with another Field
	 *	@param value
	 */
   public void setTaAcctCd(Field source) {
       replace(source,0,source.length(),beginTaAcctCd,TA_ACCT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update TaAcctCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaAcctCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaAcctCd,TA_ACCT_CD_LEN);
   	
   }
   
     /**
	 * 	Update TaAcctCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaAcctCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaAcctCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taTypeCd
	 *	@return taTypeCd
	 */
   public char[] getTaTypeCd() throws CFException{
     if (isTaTypeCdModified()) { 
        taTypeCd = refreshTaTypeCd();
     }
   		return taTypeCd;
   }

  
	/**
	*  set variable taTypeCd
	*  Corresponding COBOL Variable is TA-TYPE-CD
	*  @param value
	**/
   public void setTaTypeCd(char[] value) {
      taTypeCd = checkTaTypeCdConstraints(value);
      serializeTaTypeCd(taTypeCd);
   } 

     /**
	 * 	Update TaTypeCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaTypeCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaTypeCd,taTypeCd.length);
   	
   }
   
   public void setTaTypeCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaTypeCd,taTypeCd.length);
   	
   }
   
     /**
	 * 	Update TaTypeCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaTypeCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaTypeCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaTypeCd with another Field
	 *	@param value
	 */
   public void setTaTypeCd(Field source) {
       replace(source,0,source.length(),beginTaTypeCd,TA_TYPE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update TaTypeCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaTypeCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaTypeCd,TA_TYPE_CD_LEN);
   	
   }
   
     /**
	 * 	Update TaTypeCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaTypeCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaTypeCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taClerkId
	 *	@return taClerkId
	 */
   public char[] getTaClerkId() throws CFException{
     if (isTaClerkIdModified()) { 
        taClerkId = refreshTaClerkId();
     }
   		return taClerkId;
   }

  
	/**
	*  set variable taClerkId
	*  Corresponding COBOL Variable is TA-CLERK-ID
	*  @param value
	**/
   public void setTaClerkId(char[] value) {
      taClerkId = checkTaClerkIdConstraints(value);
      serializeTaClerkId(taClerkId);
   } 

     /**
	 * 	Update TaClerkId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaClerkId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaClerkId,taClerkId.length);
   	
   }
   
   public void setTaClerkId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaClerkId,taClerkId.length);
   	
   }
   
     /**
	 * 	Update TaClerkId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaClerkId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaClerkId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaClerkId with another Field
	 *	@param value
	 */
   public void setTaClerkId(Field source) {
       replace(source,0,source.length(),beginTaClerkId,TA_CLERK_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TaClerkId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaClerkId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaClerkId,TA_CLERK_ID_LEN);
   	
   }
   
     /**
	 * 	Update TaClerkId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaClerkId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaClerkId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taSrcReceiptCd
	 *	@return taSrcReceiptCd
	 */
   public char[] getTaSrcReceiptCd() throws CFException{
     if (isTaSrcReceiptCdModified()) { 
        taSrcReceiptCd = refreshTaSrcReceiptCd();
     }
   		return taSrcReceiptCd;
   }

  
	/**
	*  set variable taSrcReceiptCd
	*  Corresponding COBOL Variable is TA-SRC-RECEIPT-CD
	*  @param value
	**/
   public void setTaSrcReceiptCd(char[] value) {
      taSrcReceiptCd = checkTaSrcReceiptCdConstraints(value);
      serializeTaSrcReceiptCd(taSrcReceiptCd);
   } 

     /**
	 * 	Update TaSrcReceiptCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaSrcReceiptCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaSrcReceiptCd,taSrcReceiptCd.length);
   	
   }
   
   public void setTaSrcReceiptCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaSrcReceiptCd,taSrcReceiptCd.length);
   	
   }
   
     /**
	 * 	Update TaSrcReceiptCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaSrcReceiptCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaSrcReceiptCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaSrcReceiptCd with another Field
	 *	@param value
	 */
   public void setTaSrcReceiptCd(Field source) {
       replace(source,0,source.length(),beginTaSrcReceiptCd,TA_SRC_RECEIPT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update TaSrcReceiptCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaSrcReceiptCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaSrcReceiptCd,TA_SRC_RECEIPT_CD_LEN);
   	
   }
   
     /**
	 * 	Update TaSrcReceiptCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaSrcReceiptCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaSrcReceiptCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taSrcErrorCd
	 *	@return taSrcErrorCd
	 */
   public char[] getTaSrcErrorCd() throws CFException{
     if (isTaSrcErrorCdModified()) { 
        taSrcErrorCd = refreshTaSrcErrorCd();
     }
   		return taSrcErrorCd;
   }

  
	/**
	*  set variable taSrcErrorCd
	*  Corresponding COBOL Variable is TA-SRC-ERROR-CD
	*  @param value
	**/
   public void setTaSrcErrorCd(char[] value) {
      taSrcErrorCd = checkTaSrcErrorCdConstraints(value);
      serializeTaSrcErrorCd(taSrcErrorCd);
   } 

     /**
	 * 	Update TaSrcErrorCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaSrcErrorCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaSrcErrorCd,taSrcErrorCd.length);
   	
   }
   
   public void setTaSrcErrorCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaSrcErrorCd,taSrcErrorCd.length);
   	
   }
   
     /**
	 * 	Update TaSrcErrorCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaSrcErrorCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaSrcErrorCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaSrcErrorCd with another Field
	 *	@param value
	 */
   public void setTaSrcErrorCd(Field source) {
       replace(source,0,source.length(),beginTaSrcErrorCd,TA_SRC_ERROR_CD_LEN);
   	
   }  
   
     /**
	 * 	Update TaSrcErrorCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaSrcErrorCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaSrcErrorCd,TA_SRC_ERROR_CD_LEN);
   	
   }
   
     /**
	 * 	Update TaSrcErrorCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaSrcErrorCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaSrcErrorCd+targetIndex,targetLen);
    
   }
	public int getTaAdjCodeCnt() throws CFException {
        if (isTaAdjCodeCntModified()) { 
           taAdjCodeCnt = refreshTaAdjCodeCnt();
        }
   		return taAdjCodeCnt;
	}
	
	/**
	 * 	Update TaAdjCodeCnt with the passed value
	 *  Corresponding COBOL Variable is TA-ADJ-CODE-CNT
	 *	@param number
	 */
	public void setTaAdjCodeCnt(int number) {
			taAdjCodeCnt = checkTaAdjCodeCntMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTaAdjCodeCnt(taAdjCodeCnt);
	}


	public void setTaAdjCodeCnt(long number) {
	    number = checkTaAdjCodeCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTaAdjCodeCnt((int)number);
	}
	

	
	
	

		public static int getTaAdjTableRedefinedFieldLength() {
			return TA_ADJ_TABLE_REDEFINED_LENGTH;
		}

}
  
