package com.cloudframe.app.ip989010.dto;

/**
*  The class Ip9890hPaymentFileData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:31. using version 5.0.0.254
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip9890hPaymentFileData extends Ip9890hPaymentFileDataSerialized {
   
				private Ip9890hClearingDate ip9890hClearingDate = new Ip9890hClearingDate();

						private char[] ip9890hTransactionAmount = Field.fillLowValue(12);
				private Ip9890hTransactionDate ip9890hTransactionDate = new Ip9890hTransactionDate();

						private char[] ip9890hMerchant = Field.fillLowValue(25);

						private char[] ip9890hBankNetReference = Field.fillLowValue(9);

						private char[] ip9890hBankNetDate = Field.fillLowValue(4);

								private long ip9890hIssuerIca;

								private long ip9890hAcquirerIca;

						private char[] ip9890hPanAlias = Field.fillLowValue(36);

						private char[] ip9890hProductCode = Field.fillLowValue(3);

	
	/**
	* Constructor for Ip9890hPaymentFileData
	**/
    public Ip9890hPaymentFileData() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			ip9890hClearingDate.setParent(this,getStartOffset() + 0);
	       			ip9890hTransactionDate.setParent(this,getStartOffset() + 18);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ip9890hClearingDate
	 *	@return ip9890hClearingDate
	 */   
	 public Ip9890hClearingDate getIp9890hClearingDate() {
   	return ip9890hClearingDate;
   }
   /**
	* 	Update Ip9890hClearingDate with the passed value
	*   Corresponding COBOL Variable is IP9890H-CLEARING-DATE
	*	@param value
	*/
   public void setIp9890hClearingDate(char[] value) {
      ip9890hClearingDate.setString(value); 
   }   
    
     /**
	 * 	Update Ip9890hClearingDate 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp9890hClearingDate(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip9890hClearingDate.begin,ip9890hClearingDate.length());
   }
   
     /**
	 * 	Update Ip9890hClearingDate 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp9890hClearingDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip9890hClearingDate.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip9890hClearingDate with another Field
	 *	@param value
	 */
   public void setIp9890hClearingDate(Field source) {
   	replace(source,0,source.length(),ip9890hClearingDate.begin,ip9890hClearingDate.length());
   }  
   
     /**
	 * 	Update Ip9890hClearingDate 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp9890hClearingDate(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip9890hClearingDate.begin,ip9890hClearingDate.length());
   }
   
     /**
	 * 	Update Ip9890hClearingDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp9890hClearingDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip9890hClearingDate.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip9890hTransactionAmount
	 *	@return ip9890hTransactionAmount
	 */
   public char[] getIp9890hTransactionAmount() throws CFException{
     if (isIp9890hTransactionAmountModified()) { 
        ip9890hTransactionAmount = refreshIp9890hTransactionAmount();
     }
   		return ip9890hTransactionAmount;
   }

  
	/**
	*  set variable ip9890hTransactionAmount
	*  Corresponding COBOL Variable is IP9890H-TRANSACTION-AMOUNT
	*  @param value
	**/
   public void setIp9890hTransactionAmount(char[] value) {
      ip9890hTransactionAmount = checkIp9890hTransactionAmountConstraints(value);
      serializeIp9890hTransactionAmount(ip9890hTransactionAmount);
   } 

     /**
	 * 	Update Ip9890hTransactionAmount 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp9890hTransactionAmount(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp9890hTransactionAmount,ip9890hTransactionAmount.length);
   	
   }
   
   public void setIp9890hTransactionAmount(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp9890hTransactionAmount,ip9890hTransactionAmount.length);
   	
   }
   
     /**
	 * 	Update Ip9890hTransactionAmount 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp9890hTransactionAmount(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp9890hTransactionAmount+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip9890hTransactionAmount with another Field
	 *	@param value
	 */
   public void setIp9890hTransactionAmount(Field source) {
       replace(source,0,source.length(),beginIp9890hTransactionAmount,IP_9890H_TRANSACTION_AMOUNT_LEN);
   	
   }  
   
     /**
	 * 	Update Ip9890hTransactionAmount 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp9890hTransactionAmount(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp9890hTransactionAmount,IP_9890H_TRANSACTION_AMOUNT_LEN);
   	
   }
   
     /**
	 * 	Update Ip9890hTransactionAmount 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp9890hTransactionAmount(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp9890hTransactionAmount+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip9890hTransactionDate
	 *	@return ip9890hTransactionDate
	 */   
	 public Ip9890hTransactionDate getIp9890hTransactionDate() {
   	return ip9890hTransactionDate;
   }
   /**
	* 	Update Ip9890hTransactionDate with the passed value
	*   Corresponding COBOL Variable is IP9890H-TRANSACTION-DATE
	*	@param value
	*/
   public void setIp9890hTransactionDate(char[] value) {
      ip9890hTransactionDate.setString(value); 
   }   
    
     /**
	 * 	Update Ip9890hTransactionDate 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp9890hTransactionDate(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip9890hTransactionDate.begin,ip9890hTransactionDate.length());
   }
   
     /**
	 * 	Update Ip9890hTransactionDate 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp9890hTransactionDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip9890hTransactionDate.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip9890hTransactionDate with another Field
	 *	@param value
	 */
   public void setIp9890hTransactionDate(Field source) {
   	replace(source,0,source.length(),ip9890hTransactionDate.begin,ip9890hTransactionDate.length());
   }  
   
     /**
	 * 	Update Ip9890hTransactionDate 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp9890hTransactionDate(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip9890hTransactionDate.begin,ip9890hTransactionDate.length());
   }
   
     /**
	 * 	Update Ip9890hTransactionDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp9890hTransactionDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip9890hTransactionDate.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip9890hMerchant
	 *	@return ip9890hMerchant
	 */
   public char[] getIp9890hMerchant() throws CFException{
     if (isIp9890hMerchantModified()) { 
        ip9890hMerchant = refreshIp9890hMerchant();
     }
   		return ip9890hMerchant;
   }

  
	/**
	*  set variable ip9890hMerchant
	*  Corresponding COBOL Variable is IP9890H-MERCHANT
	*  @param value
	**/
   public void setIp9890hMerchant(char[] value) {
      ip9890hMerchant = checkIp9890hMerchantConstraints(value);
      serializeIp9890hMerchant(ip9890hMerchant);
   } 

     /**
	 * 	Update Ip9890hMerchant 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp9890hMerchant(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp9890hMerchant,ip9890hMerchant.length);
   	
   }
   
   public void setIp9890hMerchant(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp9890hMerchant,ip9890hMerchant.length);
   	
   }
   
     /**
	 * 	Update Ip9890hMerchant 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp9890hMerchant(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp9890hMerchant+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip9890hMerchant with another Field
	 *	@param value
	 */
   public void setIp9890hMerchant(Field source) {
       replace(source,0,source.length(),beginIp9890hMerchant,IP_9890H_MERCHANT_LEN);
   	
   }  
   
     /**
	 * 	Update Ip9890hMerchant 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp9890hMerchant(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp9890hMerchant,IP_9890H_MERCHANT_LEN);
   	
   }
   
     /**
	 * 	Update Ip9890hMerchant 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp9890hMerchant(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp9890hMerchant+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip9890hBankNetReference
	 *	@return ip9890hBankNetReference
	 */
   public char[] getIp9890hBankNetReference() throws CFException{
     if (isIp9890hBankNetReferenceModified()) { 
        ip9890hBankNetReference = refreshIp9890hBankNetReference();
     }
   		return ip9890hBankNetReference;
   }

  
	/**
	*  set variable ip9890hBankNetReference
	*  Corresponding COBOL Variable is IP9890H-BANK-NET-REFERENCE
	*  @param value
	**/
   public void setIp9890hBankNetReference(char[] value) {
      ip9890hBankNetReference = checkIp9890hBankNetReferenceConstraints(value);
      serializeIp9890hBankNetReference(ip9890hBankNetReference);
   } 

     /**
	 * 	Update Ip9890hBankNetReference 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp9890hBankNetReference(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp9890hBankNetReference,ip9890hBankNetReference.length);
   	
   }
   
   public void setIp9890hBankNetReference(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp9890hBankNetReference,ip9890hBankNetReference.length);
   	
   }
   
     /**
	 * 	Update Ip9890hBankNetReference 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp9890hBankNetReference(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp9890hBankNetReference+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip9890hBankNetReference with another Field
	 *	@param value
	 */
   public void setIp9890hBankNetReference(Field source) {
       replace(source,0,source.length(),beginIp9890hBankNetReference,IP_9890H_BANK_NET_REFERENCE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip9890hBankNetReference 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp9890hBankNetReference(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp9890hBankNetReference,IP_9890H_BANK_NET_REFERENCE_LEN);
   	
   }
   
     /**
	 * 	Update Ip9890hBankNetReference 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp9890hBankNetReference(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp9890hBankNetReference+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip9890hBankNetDate
	 *	@return ip9890hBankNetDate
	 */
   public char[] getIp9890hBankNetDate() throws CFException{
     if (isIp9890hBankNetDateModified()) { 
        ip9890hBankNetDate = refreshIp9890hBankNetDate();
     }
   		return ip9890hBankNetDate;
   }

  
	/**
	*  set variable ip9890hBankNetDate
	*  Corresponding COBOL Variable is IP9890H-BANK-NET-DATE
	*  @param value
	**/
   public void setIp9890hBankNetDate(char[] value) {
      ip9890hBankNetDate = checkIp9890hBankNetDateConstraints(value);
      serializeIp9890hBankNetDate(ip9890hBankNetDate);
   } 

     /**
	 * 	Update Ip9890hBankNetDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp9890hBankNetDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp9890hBankNetDate,ip9890hBankNetDate.length);
   	
   }
   
   public void setIp9890hBankNetDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp9890hBankNetDate,ip9890hBankNetDate.length);
   	
   }
   
     /**
	 * 	Update Ip9890hBankNetDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp9890hBankNetDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp9890hBankNetDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip9890hBankNetDate with another Field
	 *	@param value
	 */
   public void setIp9890hBankNetDate(Field source) {
       replace(source,0,source.length(),beginIp9890hBankNetDate,IP_9890H_BANK_NET_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip9890hBankNetDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp9890hBankNetDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp9890hBankNetDate,IP_9890H_BANK_NET_DATE_LEN);
   	
   }
   
     /**
	 * 	Update Ip9890hBankNetDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp9890hBankNetDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp9890hBankNetDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip9890hIssuerIca
	 *	@return ip9890hIssuerIca
	 */
	public long getIp9890hIssuerIca() throws CFException {
       if (isIp9890hIssuerIcaModified()) { 
           ip9890hIssuerIca = refreshIp9890hIssuerIca();
        }
   		return ip9890hIssuerIca;
	}
	

	
	   
	/**
	 * 	Update Ip9890hIssuerIca with the passed value
	 *  Corresponding COBOL Variable is IP9890H-ISSUER-ICA
	 *	@param number
	 */
	public void setIp9890hIssuerIca(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip9890hIssuerIca = checkIp9890hIssuerIcaMaxLimit(number); 
		serializeIp9890hIssuerIca(ip9890hIssuerIca);
	}
	

	/**
	 * 	Update Ip9890hIssuerIca with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp9890hIssuerIca(char[] value) throws CFException {
		 ip9890hIssuerIca = serializeIp9890hIssuerIca(value);
	}
	/**
	 * 	Update Ip9890hIssuerIca with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp9890hIssuerIcaString(char[] value) throws CFException {
		 setIp9890hIssuerIca(value);
	}
	/**
	 *	Returns the value of ip9890hAcquirerIca
	 *	@return ip9890hAcquirerIca
	 */
	public long getIp9890hAcquirerIca() throws CFException {
       if (isIp9890hAcquirerIcaModified()) { 
           ip9890hAcquirerIca = refreshIp9890hAcquirerIca();
        }
   		return ip9890hAcquirerIca;
	}
	

	
	   
	/**
	 * 	Update Ip9890hAcquirerIca with the passed value
	 *  Corresponding COBOL Variable is IP9890H-ACQUIRER-ICA
	 *	@param number
	 */
	public void setIp9890hAcquirerIca(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip9890hAcquirerIca = checkIp9890hAcquirerIcaMaxLimit(number); 
		serializeIp9890hAcquirerIca(ip9890hAcquirerIca);
	}
	

	/**
	 * 	Update Ip9890hAcquirerIca with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp9890hAcquirerIca(char[] value) throws CFException {
		 ip9890hAcquirerIca = serializeIp9890hAcquirerIca(value);
	}
	/**
	 * 	Update Ip9890hAcquirerIca with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp9890hAcquirerIcaString(char[] value) throws CFException {
		 setIp9890hAcquirerIca(value);
	}
	/**
	 *	Returns the value of ip9890hPanAlias
	 *	@return ip9890hPanAlias
	 */
   public char[] getIp9890hPanAlias() throws CFException{
     if (isIp9890hPanAliasModified()) { 
        ip9890hPanAlias = refreshIp9890hPanAlias();
     }
   		return ip9890hPanAlias;
   }

  
	/**
	*  set variable ip9890hPanAlias
	*  Corresponding COBOL Variable is IP9890H-PAN-ALIAS
	*  @param value
	**/
   public void setIp9890hPanAlias(char[] value) {
      ip9890hPanAlias = checkIp9890hPanAliasConstraints(value);
      serializeIp9890hPanAlias(ip9890hPanAlias);
   } 

     /**
	 * 	Update Ip9890hPanAlias 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp9890hPanAlias(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp9890hPanAlias,ip9890hPanAlias.length);
   	
   }
   
   public void setIp9890hPanAlias(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp9890hPanAlias,ip9890hPanAlias.length);
   	
   }
   
     /**
	 * 	Update Ip9890hPanAlias 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp9890hPanAlias(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp9890hPanAlias+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip9890hPanAlias with another Field
	 *	@param value
	 */
   public void setIp9890hPanAlias(Field source) {
       replace(source,0,source.length(),beginIp9890hPanAlias,IP_9890H_PAN_ALIAS_LEN);
   	
   }  
   
     /**
	 * 	Update Ip9890hPanAlias 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp9890hPanAlias(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp9890hPanAlias,IP_9890H_PAN_ALIAS_LEN);
   	
   }
   
     /**
	 * 	Update Ip9890hPanAlias 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp9890hPanAlias(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp9890hPanAlias+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip9890hProductCode
	 *	@return ip9890hProductCode
	 */
   public char[] getIp9890hProductCode() throws CFException{
     if (isIp9890hProductCodeModified()) { 
        ip9890hProductCode = refreshIp9890hProductCode();
     }
   		return ip9890hProductCode;
   }

  
	/**
	*  set variable ip9890hProductCode
	*  Corresponding COBOL Variable is IP9890H-PRODUCT-CODE
	*  @param value
	**/
   public void setIp9890hProductCode(char[] value) {
      ip9890hProductCode = checkIp9890hProductCodeConstraints(value);
      serializeIp9890hProductCode(ip9890hProductCode);
   } 

     /**
	 * 	Update Ip9890hProductCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp9890hProductCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp9890hProductCode,ip9890hProductCode.length);
   	
   }
   
   public void setIp9890hProductCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp9890hProductCode,ip9890hProductCode.length);
   	
   }
   
     /**
	 * 	Update Ip9890hProductCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp9890hProductCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp9890hProductCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip9890hProductCode with another Field
	 *	@param value
	 */
   public void setIp9890hProductCode(Field source) {
       replace(source,0,source.length(),beginIp9890hProductCode,IP_9890H_PRODUCT_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip9890hProductCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp9890hProductCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp9890hProductCode,IP_9890H_PRODUCT_CODE_LEN);
   	
   }
   
     /**
	 * 	Update Ip9890hProductCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp9890hProductCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp9890hProductCode+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip9890hPaymentFileData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip9890hClearingDate.initialize();
     
         setIp9890hTransactionAmount(CONSTANTS.SPACE_12);
          ip9890hTransactionDate.initialize();
     
         setIp9890hMerchant(CONSTANTS.SPACE_25);
         setIp9890hBankNetReference(CONSTANTS.SPACE_9);
         setIp9890hBankNetDate(CONSTANTS.SPACE_4);
                     setIp9890hIssuerIca(0);
                     setIp9890hAcquirerIca(0);
         setIp9890hPanAlias(CONSTANTS.SPACE_36);
         setIp9890hProductCode(CONSTANTS.SPACE_3);
   }

		public static int getIp9890hPaymentFileDataFieldLength() {
			return IP_9890H_PAYMENT_FILE_DATA_LENGTH;
		}

}
  
