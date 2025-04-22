package com.cloudframe.app.ip989010.dto;

/**
*  The class Ip98901PaymentFileData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:17. using version 5.0.0.254
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip98901PaymentFileData extends Ip98901PaymentFileDataSerialized {
   
				private Ip98901ClearingDate ip98901ClearingDate = new Ip98901ClearingDate();

						private char[] ip98901TransactionAmount = Field.fillLowValue(12);
				private Ip98901TransactionDate ip98901TransactionDate = new Ip98901TransactionDate();

						private char[] ip98901Merchant = Field.fillLowValue(25);

						private char[] ip98901BankNetReference = Field.fillLowValue(9);

						private char[] ip98901BankNetDate = Field.fillLowValue(4);

								private long ip98901IssuerIca;

								private long ip98901AcquirerIca;

						private char[] ip98901PanAlias = Field.fillLowValue(36);

						private char[] ip98901ProductCode = Field.fillLowValue(3);

	
	/**
	* Constructor for Ip98901PaymentFileData
	**/
    public Ip98901PaymentFileData() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			ip98901ClearingDate.setParent(this,getStartOffset() + 0);
	       			ip98901TransactionDate.setParent(this,getStartOffset() + 18);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ip98901ClearingDate
	 *	@return ip98901ClearingDate
	 */   
	 public Ip98901ClearingDate getIp98901ClearingDate() {
   	return ip98901ClearingDate;
   }
   /**
	* 	Update Ip98901ClearingDate with the passed value
	*   Corresponding COBOL Variable is IP98901-CLEARING-DATE
	*	@param value
	*/
   public void setIp98901ClearingDate(char[] value) {
      ip98901ClearingDate.setString(value); 
   }   
    
     /**
	 * 	Update Ip98901ClearingDate 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp98901ClearingDate(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip98901ClearingDate.begin,ip98901ClearingDate.length());
   }
   
     /**
	 * 	Update Ip98901ClearingDate 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98901ClearingDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip98901ClearingDate.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip98901ClearingDate with another Field
	 *	@param value
	 */
   public void setIp98901ClearingDate(Field source) {
   	replace(source,0,source.length(),ip98901ClearingDate.begin,ip98901ClearingDate.length());
   }  
   
     /**
	 * 	Update Ip98901ClearingDate 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp98901ClearingDate(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip98901ClearingDate.begin,ip98901ClearingDate.length());
   }
   
     /**
	 * 	Update Ip98901ClearingDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98901ClearingDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip98901ClearingDate.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip98901TransactionAmount
	 *	@return ip98901TransactionAmount
	 */
   public char[] getIp98901TransactionAmount() throws CFException{
     if (isIp98901TransactionAmountModified()) { 
        ip98901TransactionAmount = refreshIp98901TransactionAmount();
     }
   		return ip98901TransactionAmount;
   }

  
	/**
	*  set variable ip98901TransactionAmount
	*  Corresponding COBOL Variable is IP98901-TRANSACTION-AMOUNT
	*  @param value
	**/
   public void setIp98901TransactionAmount(char[] value) {
      ip98901TransactionAmount = checkIp98901TransactionAmountConstraints(value);
      serializeIp98901TransactionAmount(ip98901TransactionAmount);
   } 

     /**
	 * 	Update Ip98901TransactionAmount 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98901TransactionAmount(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp98901TransactionAmount,ip98901TransactionAmount.length);
   	
   }
   
   public void setIp98901TransactionAmount(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp98901TransactionAmount,ip98901TransactionAmount.length);
   	
   }
   
     /**
	 * 	Update Ip98901TransactionAmount 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98901TransactionAmount(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98901TransactionAmount+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip98901TransactionAmount with another Field
	 *	@param value
	 */
   public void setIp98901TransactionAmount(Field source) {
       replace(source,0,source.length(),beginIp98901TransactionAmount,IP_98901_TRANSACTION_AMOUNT_LEN);
   	
   }  
   
     /**
	 * 	Update Ip98901TransactionAmount 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98901TransactionAmount(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp98901TransactionAmount,IP_98901_TRANSACTION_AMOUNT_LEN);
   	
   }
   
     /**
	 * 	Update Ip98901TransactionAmount 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98901TransactionAmount(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98901TransactionAmount+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip98901TransactionDate
	 *	@return ip98901TransactionDate
	 */   
	 public Ip98901TransactionDate getIp98901TransactionDate() {
   	return ip98901TransactionDate;
   }
   /**
	* 	Update Ip98901TransactionDate with the passed value
	*   Corresponding COBOL Variable is IP98901-TRANSACTION-DATE
	*	@param value
	*/
   public void setIp98901TransactionDate(char[] value) {
      ip98901TransactionDate.setString(value); 
   }   
    
     /**
	 * 	Update Ip98901TransactionDate 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp98901TransactionDate(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip98901TransactionDate.begin,ip98901TransactionDate.length());
   }
   
     /**
	 * 	Update Ip98901TransactionDate 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98901TransactionDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip98901TransactionDate.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip98901TransactionDate with another Field
	 *	@param value
	 */
   public void setIp98901TransactionDate(Field source) {
   	replace(source,0,source.length(),ip98901TransactionDate.begin,ip98901TransactionDate.length());
   }  
   
     /**
	 * 	Update Ip98901TransactionDate 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp98901TransactionDate(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip98901TransactionDate.begin,ip98901TransactionDate.length());
   }
   
     /**
	 * 	Update Ip98901TransactionDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98901TransactionDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip98901TransactionDate.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip98901Merchant
	 *	@return ip98901Merchant
	 */
   public char[] getIp98901Merchant() throws CFException{
     if (isIp98901MerchantModified()) { 
        ip98901Merchant = refreshIp98901Merchant();
     }
   		return ip98901Merchant;
   }

  
	/**
	*  set variable ip98901Merchant
	*  Corresponding COBOL Variable is IP98901-MERCHANT
	*  @param value
	**/
   public void setIp98901Merchant(char[] value) {
      ip98901Merchant = checkIp98901MerchantConstraints(value);
      serializeIp98901Merchant(ip98901Merchant);
   } 

     /**
	 * 	Update Ip98901Merchant 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98901Merchant(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp98901Merchant,ip98901Merchant.length);
   	
   }
   
   public void setIp98901Merchant(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp98901Merchant,ip98901Merchant.length);
   	
   }
   
     /**
	 * 	Update Ip98901Merchant 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98901Merchant(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98901Merchant+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip98901Merchant with another Field
	 *	@param value
	 */
   public void setIp98901Merchant(Field source) {
       replace(source,0,source.length(),beginIp98901Merchant,IP_98901_MERCHANT_LEN);
   	
   }  
   
     /**
	 * 	Update Ip98901Merchant 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98901Merchant(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp98901Merchant,IP_98901_MERCHANT_LEN);
   	
   }
   
     /**
	 * 	Update Ip98901Merchant 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98901Merchant(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98901Merchant+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip98901BankNetReference
	 *	@return ip98901BankNetReference
	 */
   public char[] getIp98901BankNetReference() throws CFException{
     if (isIp98901BankNetReferenceModified()) { 
        ip98901BankNetReference = refreshIp98901BankNetReference();
     }
   		return ip98901BankNetReference;
   }

  
	/**
	*  set variable ip98901BankNetReference
	*  Corresponding COBOL Variable is IP98901-BANK-NET-REFERENCE
	*  @param value
	**/
   public void setIp98901BankNetReference(char[] value) {
      ip98901BankNetReference = checkIp98901BankNetReferenceConstraints(value);
      serializeIp98901BankNetReference(ip98901BankNetReference);
   } 

     /**
	 * 	Update Ip98901BankNetReference 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98901BankNetReference(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp98901BankNetReference,ip98901BankNetReference.length);
   	
   }
   
   public void setIp98901BankNetReference(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp98901BankNetReference,ip98901BankNetReference.length);
   	
   }
   
     /**
	 * 	Update Ip98901BankNetReference 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98901BankNetReference(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98901BankNetReference+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip98901BankNetReference with another Field
	 *	@param value
	 */
   public void setIp98901BankNetReference(Field source) {
       replace(source,0,source.length(),beginIp98901BankNetReference,IP_98901_BANK_NET_REFERENCE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip98901BankNetReference 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98901BankNetReference(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp98901BankNetReference,IP_98901_BANK_NET_REFERENCE_LEN);
   	
   }
   
     /**
	 * 	Update Ip98901BankNetReference 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98901BankNetReference(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98901BankNetReference+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip98901BankNetDate
	 *	@return ip98901BankNetDate
	 */
   public char[] getIp98901BankNetDate() throws CFException{
     if (isIp98901BankNetDateModified()) { 
        ip98901BankNetDate = refreshIp98901BankNetDate();
     }
   		return ip98901BankNetDate;
   }

  
	/**
	*  set variable ip98901BankNetDate
	*  Corresponding COBOL Variable is IP98901-BANK-NET-DATE
	*  @param value
	**/
   public void setIp98901BankNetDate(char[] value) {
      ip98901BankNetDate = checkIp98901BankNetDateConstraints(value);
      serializeIp98901BankNetDate(ip98901BankNetDate);
   } 

     /**
	 * 	Update Ip98901BankNetDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98901BankNetDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp98901BankNetDate,ip98901BankNetDate.length);
   	
   }
   
   public void setIp98901BankNetDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp98901BankNetDate,ip98901BankNetDate.length);
   	
   }
   
     /**
	 * 	Update Ip98901BankNetDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98901BankNetDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98901BankNetDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip98901BankNetDate with another Field
	 *	@param value
	 */
   public void setIp98901BankNetDate(Field source) {
       replace(source,0,source.length(),beginIp98901BankNetDate,IP_98901_BANK_NET_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip98901BankNetDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98901BankNetDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp98901BankNetDate,IP_98901_BANK_NET_DATE_LEN);
   	
   }
   
     /**
	 * 	Update Ip98901BankNetDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98901BankNetDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98901BankNetDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip98901IssuerIca
	 *	@return ip98901IssuerIca
	 */
	public long getIp98901IssuerIca() throws CFException {
       if (isIp98901IssuerIcaModified()) { 
           ip98901IssuerIca = refreshIp98901IssuerIca();
        }
   		return ip98901IssuerIca;
	}
	

	
	   
	/**
	 * 	Update Ip98901IssuerIca with the passed value
	 *  Corresponding COBOL Variable is IP98901-ISSUER-ICA
	 *	@param number
	 */
	public void setIp98901IssuerIca(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip98901IssuerIca = checkIp98901IssuerIcaMaxLimit(number); 
		serializeIp98901IssuerIca(ip98901IssuerIca);
	}
	

	/**
	 * 	Update Ip98901IssuerIca with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp98901IssuerIca(char[] value) throws CFException {
		 ip98901IssuerIca = serializeIp98901IssuerIca(value);
	}
	/**
	 * 	Update Ip98901IssuerIca with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp98901IssuerIcaString(char[] value) throws CFException {
		 setIp98901IssuerIca(value);
	}
	/**
	 *	Returns the value of ip98901AcquirerIca
	 *	@return ip98901AcquirerIca
	 */
	public long getIp98901AcquirerIca() throws CFException {
       if (isIp98901AcquirerIcaModified()) { 
           ip98901AcquirerIca = refreshIp98901AcquirerIca();
        }
   		return ip98901AcquirerIca;
	}
	

	
	   
	/**
	 * 	Update Ip98901AcquirerIca with the passed value
	 *  Corresponding COBOL Variable is IP98901-ACQUIRER-ICA
	 *	@param number
	 */
	public void setIp98901AcquirerIca(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip98901AcquirerIca = checkIp98901AcquirerIcaMaxLimit(number); 
		serializeIp98901AcquirerIca(ip98901AcquirerIca);
	}
	

	/**
	 * 	Update Ip98901AcquirerIca with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp98901AcquirerIca(char[] value) throws CFException {
		 ip98901AcquirerIca = serializeIp98901AcquirerIca(value);
	}
	/**
	 * 	Update Ip98901AcquirerIca with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp98901AcquirerIcaString(char[] value) throws CFException {
		 setIp98901AcquirerIca(value);
	}
	/**
	 *	Returns the value of ip98901PanAlias
	 *	@return ip98901PanAlias
	 */
   public char[] getIp98901PanAlias() throws CFException{
     if (isIp98901PanAliasModified()) { 
        ip98901PanAlias = refreshIp98901PanAlias();
     }
   		return ip98901PanAlias;
   }

  
	/**
	*  set variable ip98901PanAlias
	*  Corresponding COBOL Variable is IP98901-PAN-ALIAS
	*  @param value
	**/
   public void setIp98901PanAlias(char[] value) {
      ip98901PanAlias = checkIp98901PanAliasConstraints(value);
      serializeIp98901PanAlias(ip98901PanAlias);
   } 

     /**
	 * 	Update Ip98901PanAlias 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98901PanAlias(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp98901PanAlias,ip98901PanAlias.length);
   	
   }
   
   public void setIp98901PanAlias(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp98901PanAlias,ip98901PanAlias.length);
   	
   }
   
     /**
	 * 	Update Ip98901PanAlias 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98901PanAlias(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98901PanAlias+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip98901PanAlias with another Field
	 *	@param value
	 */
   public void setIp98901PanAlias(Field source) {
       replace(source,0,source.length(),beginIp98901PanAlias,IP_98901_PAN_ALIAS_LEN);
   	
   }  
   
     /**
	 * 	Update Ip98901PanAlias 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98901PanAlias(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp98901PanAlias,IP_98901_PAN_ALIAS_LEN);
   	
   }
   
     /**
	 * 	Update Ip98901PanAlias 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98901PanAlias(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98901PanAlias+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip98901ProductCode
	 *	@return ip98901ProductCode
	 */
   public char[] getIp98901ProductCode() throws CFException{
     if (isIp98901ProductCodeModified()) { 
        ip98901ProductCode = refreshIp98901ProductCode();
     }
   		return ip98901ProductCode;
   }

  
	/**
	*  set variable ip98901ProductCode
	*  Corresponding COBOL Variable is IP98901-PRODUCT-CODE
	*  @param value
	**/
   public void setIp98901ProductCode(char[] value) {
      ip98901ProductCode = checkIp98901ProductCodeConstraints(value);
      serializeIp98901ProductCode(ip98901ProductCode);
   } 

     /**
	 * 	Update Ip98901ProductCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98901ProductCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp98901ProductCode,ip98901ProductCode.length);
   	
   }
   
   public void setIp98901ProductCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp98901ProductCode,ip98901ProductCode.length);
   	
   }
   
     /**
	 * 	Update Ip98901ProductCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98901ProductCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98901ProductCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip98901ProductCode with another Field
	 *	@param value
	 */
   public void setIp98901ProductCode(Field source) {
       replace(source,0,source.length(),beginIp98901ProductCode,IP_98901_PRODUCT_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip98901ProductCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98901ProductCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp98901ProductCode,IP_98901_PRODUCT_CODE_LEN);
   	
   }
   
     /**
	 * 	Update Ip98901ProductCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98901ProductCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98901ProductCode+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip98901PaymentFileData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip98901ClearingDate.initialize();
     
         setIp98901TransactionAmount(CONSTANTS.SPACE_12);
          ip98901TransactionDate.initialize();
     
         setIp98901Merchant(CONSTANTS.SPACE_25);
         setIp98901BankNetReference(CONSTANTS.SPACE_9);
         setIp98901BankNetDate(CONSTANTS.SPACE_4);
                     setIp98901IssuerIca(0);
                     setIp98901AcquirerIca(0);
         setIp98901PanAlias(CONSTANTS.SPACE_36);
         setIp98901ProductCode(CONSTANTS.SPACE_3);
   }

		public static int getIp98901PaymentFileDataFieldLength() {
			return IP_98901_PAYMENT_FILE_DATA_LENGTH;
		}

}
  
