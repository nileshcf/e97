package com.cloudframe.app.usbaeext.file.records;

/**
*  The class Adjtable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/


import com.cloudframe.app.usbaeext.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Adjtable extends AdjtableSerialized {
   

						private char[] adjtblColumn1 = Field.fillLowValue(1);

						private char[] adjtblCpcsSite = Field.fillLowValue(3);

						private char[] adjtblAdjustmentCode = Field.fillLowValue(3);

						private char[] adjtblSortType = Field.fillLowValue(3);

						private char[] adjtblBankNumber = Field.fillLowValue(3);

						private char[] adjtblDeptNumber = Field.fillLowValue(2);

						private char[] adjtblAccountCode = Field.fillLowValue(2);

						private char[] adjtblTypeCode = Field.fillLowValue(2);

						private char[] adjtblClerkId = Field.fillLowValue(8);

						private char[] adjtblSrcReceiptCd = Field.fillLowValue(6);

						private char[] adjtblSrcErrorCd = Field.fillLowValue(6);
	
	/**
	* Constructor for Adjtable
	**/
    public Adjtable() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of adjtblColumn1
	 *	@return adjtblColumn1
	 */
   public char[] getAdjtblColumn1() throws CFException{
     if (isAdjtblColumn1Modified()) { 
        adjtblColumn1 = refreshAdjtblColumn1();
     }
   		return adjtblColumn1;
   }

  
	/**
	*  set variable adjtblColumn1
	*  Corresponding COBOL Variable is ADJTBL-COLUMN-1
	*  @param value
	**/
   public void setAdjtblColumn1(char[] value) {
      adjtblColumn1 = checkAdjtblColumn1Constraints(value);
      serializeAdjtblColumn1(adjtblColumn1);
   } 

     /**
	 * 	Update AdjtblColumn1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAdjtblColumn1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAdjtblColumn1,adjtblColumn1.length);
   	
   }
   
   public void setAdjtblColumn1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAdjtblColumn1,adjtblColumn1.length);
   	
   }
   
     /**
	 * 	Update AdjtblColumn1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblColumn1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAdjtblColumn1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AdjtblColumn1 with another Field
	 *	@param value
	 */
   public void setAdjtblColumn1(Field source) {
       replace(source,0,source.length(),beginAdjtblColumn1,ADJTBL_COLUMN_1_LEN);
   	
   }  
   
     /**
	 * 	Update AdjtblColumn1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAdjtblColumn1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAdjtblColumn1,ADJTBL_COLUMN_1_LEN);
   	
   }
   
     /**
	 * 	Update AdjtblColumn1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblColumn1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAdjtblColumn1+targetIndex,targetLen);
    
   }
	char[] adjtblCommentLine88Value = "*".toCharArray();
	/**
	 *	Test condition "*" for isAdjtblCommentLine()
	 *	@return  Returns true if isAdjtblCommentLine() is "*"
	 */
   public boolean isAdjtblCommentLine() throws CFException {
      return (  compareChars( getAdjtblColumn1() , adjtblCommentLine88Value)  == 0  );
   }


	/**
	*  set values "*"
	*/
   	public void setAdjtblCommentLineTrue() {  			
    	setAdjtblColumn1( adjtblCommentLine88Value);
   	}
	char[] adjtblDataLine88Value = " ".toCharArray();
	/**
	 *	Test condition " " for isAdjtblDataLine()
	 *	@return  Returns true if isAdjtblDataLine() is " "
	 */
   public boolean isAdjtblDataLine() throws CFException {
      return (  compareChars( getAdjtblColumn1() , adjtblDataLine88Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setAdjtblDataLineTrue() {  			
    	setAdjtblColumn1( adjtblDataLine88Value);
   	}
	/**
	 *	Returns the value of adjtblCpcsSite
	 *	@return adjtblCpcsSite
	 */
   public char[] getAdjtblCpcsSite() throws CFException{
     if (isAdjtblCpcsSiteModified()) { 
        adjtblCpcsSite = refreshAdjtblCpcsSite();
     }
   		return adjtblCpcsSite;
   }

  
	/**
	*  set variable adjtblCpcsSite
	*  Corresponding COBOL Variable is ADJTBL-CPCS-SITE
	*  @param value
	**/
   public void setAdjtblCpcsSite(char[] value) {
      adjtblCpcsSite = checkAdjtblCpcsSiteConstraints(value);
      serializeAdjtblCpcsSite(adjtblCpcsSite);
   } 

     /**
	 * 	Update AdjtblCpcsSite 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAdjtblCpcsSite(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAdjtblCpcsSite,adjtblCpcsSite.length);
   	
   }
   
   public void setAdjtblCpcsSite(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAdjtblCpcsSite,adjtblCpcsSite.length);
   	
   }
   
     /**
	 * 	Update AdjtblCpcsSite 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblCpcsSite(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAdjtblCpcsSite+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AdjtblCpcsSite with another Field
	 *	@param value
	 */
   public void setAdjtblCpcsSite(Field source) {
       replace(source,0,source.length(),beginAdjtblCpcsSite,ADJTBL_CPCS_SITE_LEN);
   	
   }  
   
     /**
	 * 	Update AdjtblCpcsSite 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAdjtblCpcsSite(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAdjtblCpcsSite,ADJTBL_CPCS_SITE_LEN);
   	
   }
   
     /**
	 * 	Update AdjtblCpcsSite 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblCpcsSite(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAdjtblCpcsSite+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of adjtblAdjustmentCode
	 *	@return adjtblAdjustmentCode
	 */
   public char[] getAdjtblAdjustmentCode() throws CFException{
     if (isAdjtblAdjustmentCodeModified()) { 
        adjtblAdjustmentCode = refreshAdjtblAdjustmentCode();
     }
   		return adjtblAdjustmentCode;
   }

  
	/**
	*  set variable adjtblAdjustmentCode
	*  Corresponding COBOL Variable is ADJTBL-ADJUSTMENT-CODE
	*  @param value
	**/
   public void setAdjtblAdjustmentCode(char[] value) {
      adjtblAdjustmentCode = checkAdjtblAdjustmentCodeConstraints(value);
      serializeAdjtblAdjustmentCode(adjtblAdjustmentCode);
   } 

     /**
	 * 	Update AdjtblAdjustmentCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAdjtblAdjustmentCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAdjtblAdjustmentCode,adjtblAdjustmentCode.length);
   	
   }
   
   public void setAdjtblAdjustmentCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAdjtblAdjustmentCode,adjtblAdjustmentCode.length);
   	
   }
   
     /**
	 * 	Update AdjtblAdjustmentCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblAdjustmentCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAdjtblAdjustmentCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AdjtblAdjustmentCode with another Field
	 *	@param value
	 */
   public void setAdjtblAdjustmentCode(Field source) {
       replace(source,0,source.length(),beginAdjtblAdjustmentCode,ADJTBL_ADJUSTMENT_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update AdjtblAdjustmentCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAdjtblAdjustmentCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAdjtblAdjustmentCode,ADJTBL_ADJUSTMENT_CODE_LEN);
   	
   }
   
     /**
	 * 	Update AdjtblAdjustmentCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblAdjustmentCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAdjtblAdjustmentCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of adjtblSortType
	 *	@return adjtblSortType
	 */
   public char[] getAdjtblSortType() throws CFException{
     if (isAdjtblSortTypeModified()) { 
        adjtblSortType = refreshAdjtblSortType();
     }
   		return adjtblSortType;
   }

  
	/**
	*  set variable adjtblSortType
	*  Corresponding COBOL Variable is ADJTBL-SORT-TYPE
	*  @param value
	**/
   public void setAdjtblSortType(char[] value) {
      adjtblSortType = checkAdjtblSortTypeConstraints(value);
      serializeAdjtblSortType(adjtblSortType);
   } 

     /**
	 * 	Update AdjtblSortType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAdjtblSortType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAdjtblSortType,adjtblSortType.length);
   	
   }
   
   public void setAdjtblSortType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAdjtblSortType,adjtblSortType.length);
   	
   }
   
     /**
	 * 	Update AdjtblSortType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblSortType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAdjtblSortType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AdjtblSortType with another Field
	 *	@param value
	 */
   public void setAdjtblSortType(Field source) {
       replace(source,0,source.length(),beginAdjtblSortType,ADJTBL_SORT_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update AdjtblSortType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAdjtblSortType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAdjtblSortType,ADJTBL_SORT_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update AdjtblSortType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblSortType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAdjtblSortType+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of adjtblBankNumber
	 *	@return adjtblBankNumber
	 */
   public char[] getAdjtblBankNumber() throws CFException{
     if (isAdjtblBankNumberModified()) { 
        adjtblBankNumber = refreshAdjtblBankNumber();
     }
   		return adjtblBankNumber;
   }

  
	/**
	*  set variable adjtblBankNumber
	*  Corresponding COBOL Variable is ADJTBL-BANK-NUMBER
	*  @param value
	**/
   public void setAdjtblBankNumber(char[] value) {
      adjtblBankNumber = checkAdjtblBankNumberConstraints(value);
      serializeAdjtblBankNumber(adjtblBankNumber);
   } 

     /**
	 * 	Update AdjtblBankNumber 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAdjtblBankNumber(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAdjtblBankNumber,adjtblBankNumber.length);
   	
   }
   
   public void setAdjtblBankNumber(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAdjtblBankNumber,adjtblBankNumber.length);
   	
   }
   
     /**
	 * 	Update AdjtblBankNumber 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblBankNumber(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAdjtblBankNumber+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AdjtblBankNumber with another Field
	 *	@param value
	 */
   public void setAdjtblBankNumber(Field source) {
       replace(source,0,source.length(),beginAdjtblBankNumber,ADJTBL_BANK_NUMBER_LEN);
   	
   }  
   
     /**
	 * 	Update AdjtblBankNumber 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAdjtblBankNumber(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAdjtblBankNumber,ADJTBL_BANK_NUMBER_LEN);
   	
   }
   
     /**
	 * 	Update AdjtblBankNumber 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblBankNumber(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAdjtblBankNumber+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of adjtblDeptNumber
	 *	@return adjtblDeptNumber
	 */
   public char[] getAdjtblDeptNumber() throws CFException{
     if (isAdjtblDeptNumberModified()) { 
        adjtblDeptNumber = refreshAdjtblDeptNumber();
     }
   		return adjtblDeptNumber;
   }

  
	/**
	*  set variable adjtblDeptNumber
	*  Corresponding COBOL Variable is ADJTBL-DEPT-NUMBER
	*  @param value
	**/
   public void setAdjtblDeptNumber(char[] value) {
      adjtblDeptNumber = checkAdjtblDeptNumberConstraints(value);
      serializeAdjtblDeptNumber(adjtblDeptNumber);
   } 

     /**
	 * 	Update AdjtblDeptNumber 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAdjtblDeptNumber(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAdjtblDeptNumber,adjtblDeptNumber.length);
   	
   }
   
   public void setAdjtblDeptNumber(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAdjtblDeptNumber,adjtblDeptNumber.length);
   	
   }
   
     /**
	 * 	Update AdjtblDeptNumber 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblDeptNumber(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAdjtblDeptNumber+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AdjtblDeptNumber with another Field
	 *	@param value
	 */
   public void setAdjtblDeptNumber(Field source) {
       replace(source,0,source.length(),beginAdjtblDeptNumber,ADJTBL_DEPT_NUMBER_LEN);
   	
   }  
   
     /**
	 * 	Update AdjtblDeptNumber 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAdjtblDeptNumber(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAdjtblDeptNumber,ADJTBL_DEPT_NUMBER_LEN);
   	
   }
   
     /**
	 * 	Update AdjtblDeptNumber 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblDeptNumber(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAdjtblDeptNumber+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of adjtblAccountCode
	 *	@return adjtblAccountCode
	 */
   public char[] getAdjtblAccountCode() throws CFException{
     if (isAdjtblAccountCodeModified()) { 
        adjtblAccountCode = refreshAdjtblAccountCode();
     }
   		return adjtblAccountCode;
   }

  
	/**
	*  set variable adjtblAccountCode
	*  Corresponding COBOL Variable is ADJTBL-ACCOUNT-CODE
	*  @param value
	**/
   public void setAdjtblAccountCode(char[] value) {
      adjtblAccountCode = checkAdjtblAccountCodeConstraints(value);
      serializeAdjtblAccountCode(adjtblAccountCode);
   } 

     /**
	 * 	Update AdjtblAccountCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAdjtblAccountCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAdjtblAccountCode,adjtblAccountCode.length);
   	
   }
   
   public void setAdjtblAccountCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAdjtblAccountCode,adjtblAccountCode.length);
   	
   }
   
     /**
	 * 	Update AdjtblAccountCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblAccountCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAdjtblAccountCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AdjtblAccountCode with another Field
	 *	@param value
	 */
   public void setAdjtblAccountCode(Field source) {
       replace(source,0,source.length(),beginAdjtblAccountCode,ADJTBL_ACCOUNT_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update AdjtblAccountCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAdjtblAccountCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAdjtblAccountCode,ADJTBL_ACCOUNT_CODE_LEN);
   	
   }
   
     /**
	 * 	Update AdjtblAccountCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblAccountCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAdjtblAccountCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of adjtblTypeCode
	 *	@return adjtblTypeCode
	 */
   public char[] getAdjtblTypeCode() throws CFException{
     if (isAdjtblTypeCodeModified()) { 
        adjtblTypeCode = refreshAdjtblTypeCode();
     }
   		return adjtblTypeCode;
   }

  
	/**
	*  set variable adjtblTypeCode
	*  Corresponding COBOL Variable is ADJTBL-TYPE-CODE
	*  @param value
	**/
   public void setAdjtblTypeCode(char[] value) {
      adjtblTypeCode = checkAdjtblTypeCodeConstraints(value);
      serializeAdjtblTypeCode(adjtblTypeCode);
   } 

     /**
	 * 	Update AdjtblTypeCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAdjtblTypeCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAdjtblTypeCode,adjtblTypeCode.length);
   	
   }
   
   public void setAdjtblTypeCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAdjtblTypeCode,adjtblTypeCode.length);
   	
   }
   
     /**
	 * 	Update AdjtblTypeCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblTypeCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAdjtblTypeCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AdjtblTypeCode with another Field
	 *	@param value
	 */
   public void setAdjtblTypeCode(Field source) {
       replace(source,0,source.length(),beginAdjtblTypeCode,ADJTBL_TYPE_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update AdjtblTypeCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAdjtblTypeCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAdjtblTypeCode,ADJTBL_TYPE_CODE_LEN);
   	
   }
   
     /**
	 * 	Update AdjtblTypeCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblTypeCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAdjtblTypeCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of adjtblClerkId
	 *	@return adjtblClerkId
	 */
   public char[] getAdjtblClerkId() throws CFException{
     if (isAdjtblClerkIdModified()) { 
        adjtblClerkId = refreshAdjtblClerkId();
     }
   		return adjtblClerkId;
   }

  
	/**
	*  set variable adjtblClerkId
	*  Corresponding COBOL Variable is ADJTBL-CLERK-ID
	*  @param value
	**/
   public void setAdjtblClerkId(char[] value) {
      adjtblClerkId = checkAdjtblClerkIdConstraints(value);
      serializeAdjtblClerkId(adjtblClerkId);
   } 

     /**
	 * 	Update AdjtblClerkId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAdjtblClerkId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAdjtblClerkId,adjtblClerkId.length);
   	
   }
   
   public void setAdjtblClerkId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAdjtblClerkId,adjtblClerkId.length);
   	
   }
   
     /**
	 * 	Update AdjtblClerkId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblClerkId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAdjtblClerkId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AdjtblClerkId with another Field
	 *	@param value
	 */
   public void setAdjtblClerkId(Field source) {
       replace(source,0,source.length(),beginAdjtblClerkId,ADJTBL_CLERK_ID_LEN);
   	
   }  
   
     /**
	 * 	Update AdjtblClerkId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAdjtblClerkId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAdjtblClerkId,ADJTBL_CLERK_ID_LEN);
   	
   }
   
     /**
	 * 	Update AdjtblClerkId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblClerkId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAdjtblClerkId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of adjtblSrcReceiptCd
	 *	@return adjtblSrcReceiptCd
	 */
   public char[] getAdjtblSrcReceiptCd() throws CFException{
     if (isAdjtblSrcReceiptCdModified()) { 
        adjtblSrcReceiptCd = refreshAdjtblSrcReceiptCd();
     }
   		return adjtblSrcReceiptCd;
   }

  
	/**
	*  set variable adjtblSrcReceiptCd
	*  Corresponding COBOL Variable is ADJTBL-SRC-RECEIPT-CD
	*  @param value
	**/
   public void setAdjtblSrcReceiptCd(char[] value) {
      adjtblSrcReceiptCd = checkAdjtblSrcReceiptCdConstraints(value);
      serializeAdjtblSrcReceiptCd(adjtblSrcReceiptCd);
   } 

     /**
	 * 	Update AdjtblSrcReceiptCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAdjtblSrcReceiptCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAdjtblSrcReceiptCd,adjtblSrcReceiptCd.length);
   	
   }
   
   public void setAdjtblSrcReceiptCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAdjtblSrcReceiptCd,adjtblSrcReceiptCd.length);
   	
   }
   
     /**
	 * 	Update AdjtblSrcReceiptCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblSrcReceiptCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAdjtblSrcReceiptCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AdjtblSrcReceiptCd with another Field
	 *	@param value
	 */
   public void setAdjtblSrcReceiptCd(Field source) {
       replace(source,0,source.length(),beginAdjtblSrcReceiptCd,ADJTBL_SRC_RECEIPT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update AdjtblSrcReceiptCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAdjtblSrcReceiptCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAdjtblSrcReceiptCd,ADJTBL_SRC_RECEIPT_CD_LEN);
   	
   }
   
     /**
	 * 	Update AdjtblSrcReceiptCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblSrcReceiptCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAdjtblSrcReceiptCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of adjtblSrcErrorCd
	 *	@return adjtblSrcErrorCd
	 */
   public char[] getAdjtblSrcErrorCd() throws CFException{
     if (isAdjtblSrcErrorCdModified()) { 
        adjtblSrcErrorCd = refreshAdjtblSrcErrorCd();
     }
   		return adjtblSrcErrorCd;
   }

  
	/**
	*  set variable adjtblSrcErrorCd
	*  Corresponding COBOL Variable is ADJTBL-SRC-ERROR-CD
	*  @param value
	**/
   public void setAdjtblSrcErrorCd(char[] value) {
      adjtblSrcErrorCd = checkAdjtblSrcErrorCdConstraints(value);
      serializeAdjtblSrcErrorCd(adjtblSrcErrorCd);
   } 

     /**
	 * 	Update AdjtblSrcErrorCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAdjtblSrcErrorCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAdjtblSrcErrorCd,adjtblSrcErrorCd.length);
   	
   }
   
   public void setAdjtblSrcErrorCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAdjtblSrcErrorCd,adjtblSrcErrorCd.length);
   	
   }
   
     /**
	 * 	Update AdjtblSrcErrorCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblSrcErrorCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAdjtblSrcErrorCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AdjtblSrcErrorCd with another Field
	 *	@param value
	 */
   public void setAdjtblSrcErrorCd(Field source) {
       replace(source,0,source.length(),beginAdjtblSrcErrorCd,ADJTBL_SRC_ERROR_CD_LEN);
   	
   }  
   
     /**
	 * 	Update AdjtblSrcErrorCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAdjtblSrcErrorCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAdjtblSrcErrorCd,ADJTBL_SRC_ERROR_CD_LEN);
   	
   }
   
     /**
	 * 	Update AdjtblSrcErrorCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAdjtblSrcErrorCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAdjtblSrcErrorCd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getAdjtableFieldLength() {
			return ADJTABLE_LENGTH;
		}

}
  
