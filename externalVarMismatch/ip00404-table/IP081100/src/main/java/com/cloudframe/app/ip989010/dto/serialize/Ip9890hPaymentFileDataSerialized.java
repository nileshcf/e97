package com.cloudframe.app.ip989010.dto.serialize;

/**
*  The class Ip9890hPaymentFileDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip9890hPaymentFileDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip9890hPaymentFileDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_9890H_PAYMENT_FILE_DATA_LENGTH = 200;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp9890hTransactionAmount;
            protected  int beginIp9890hMerchant;
            protected  int beginIp9890hBankNetReference;
            protected  int beginIp9890hBankNetDate;
            protected  int beginIp9890hIssuerIca;
            protected  int beginIp9890hAcquirerIca;
            protected  int beginIp9890hPanAlias;
            protected  int beginIp9890hProductCode;
	
	/**
	* Constructor for Ip9890hPaymentFileDataSerialized
	**/
    public Ip9890hPaymentFileDataSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip9890hPaymentFileDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_9890H_PAYMENT_FILE_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginIp9890hTransactionAmount = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp9890hMerchant = getStartOffset() + 24;	// set offset for serialization
  
             beginIp9890hBankNetReference = getStartOffset() + 49;	// set offset for serialization
  
             beginIp9890hBankNetDate = getStartOffset() + 58;	// set offset for serialization
  
             beginIp9890hIssuerIca = getStartOffset() + 62;	// set offset for serialization
  
             beginIp9890hAcquirerIca = getStartOffset() + 73;	// set offset for serialization
  
             beginIp9890hPanAlias = getStartOffset() + 84;	// set offset for serialization
  
             beginIp9890hProductCode = getStartOffset() + 120;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localIp9890hTransactionAmountCounter = -1;
     public boolean isIp9890hTransactionAmountModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp9890hTransactionAmountCounter != sharedCounter;
         localIp9890hTransactionAmountCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_9890H_TRANSACTION_AMOUNT_LEN = 12;
	/**
	 * 	serialize this Ip9890hTransactionAmount
	 */
   protected void serializeIp9890hTransactionAmount(char[] ip9890hTransactionAmount) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip9890hTransactionAmount,0,getStringValue(),beginIp9890hTransactionAmount,IP_9890H_TRANSACTION_AMOUNT_LEN);
       localIp9890hTransactionAmountCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp9890hTransactionAmountConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshIp9890hTransactionAmount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp9890hTransactionAmount() {	 
   		return (substring(getStringValue(),beginIp9890hTransactionAmount,beginIp9890hTransactionAmount + IP_9890H_TRANSACTION_AMOUNT_LEN));
   	}
     int localIp9890hMerchantCounter = -1;
     public boolean isIp9890hMerchantModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp9890hMerchantCounter != sharedCounter;
         localIp9890hMerchantCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_9890H_MERCHANT_LEN = 25;
	/**
	 * 	serialize this Ip9890hMerchant
	 */
   protected void serializeIp9890hMerchant(char[] ip9890hMerchant) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip9890hMerchant,0,getStringValue(),beginIp9890hMerchant,IP_9890H_MERCHANT_LEN);
       localIp9890hMerchantCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp9890hMerchantConstraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
    /**
	 *	refreshIp9890hMerchant is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp9890hMerchant() {	 
   		return (substring(getStringValue(),beginIp9890hMerchant,beginIp9890hMerchant + IP_9890H_MERCHANT_LEN));
   	}
     int localIp9890hBankNetReferenceCounter = -1;
     public boolean isIp9890hBankNetReferenceModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp9890hBankNetReferenceCounter != sharedCounter;
         localIp9890hBankNetReferenceCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_9890H_BANK_NET_REFERENCE_LEN = 9;
	/**
	 * 	serialize this Ip9890hBankNetReference
	 */
   protected void serializeIp9890hBankNetReference(char[] ip9890hBankNetReference) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip9890hBankNetReference,0,getStringValue(),beginIp9890hBankNetReference,IP_9890H_BANK_NET_REFERENCE_LEN);
       localIp9890hBankNetReferenceCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp9890hBankNetReferenceConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshIp9890hBankNetReference is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp9890hBankNetReference() {	 
   		return (substring(getStringValue(),beginIp9890hBankNetReference,beginIp9890hBankNetReference + IP_9890H_BANK_NET_REFERENCE_LEN));
   	}
     int localIp9890hBankNetDateCounter = -1;
     public boolean isIp9890hBankNetDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp9890hBankNetDateCounter != sharedCounter;
         localIp9890hBankNetDateCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_9890H_BANK_NET_DATE_LEN = 4;
	/**
	 * 	serialize this Ip9890hBankNetDate
	 */
   protected void serializeIp9890hBankNetDate(char[] ip9890hBankNetDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip9890hBankNetDate,0,getStringValue(),beginIp9890hBankNetDate,IP_9890H_BANK_NET_DATE_LEN);
       localIp9890hBankNetDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp9890hBankNetDateConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp9890hBankNetDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp9890hBankNetDate() {	 
   		return (substring(getStringValue(),beginIp9890hBankNetDate,beginIp9890hBankNetDate + IP_9890H_BANK_NET_DATE_LEN));
   	}
     int localIp9890hIssuerIcaCounter = -1;
     public boolean isIp9890hIssuerIcaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp9890hIssuerIcaCounter != sharedCounter;
         localIp9890hIssuerIcaCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip9890hIssuerIca
	 *	@return ip9890hIssuerIca
	 */
	public char[]  getIp9890hIssuerIcaString() {
	     return getCharArray(beginIp9890hIssuerIca,IP_9890H_ISSUER_ICA_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip9890hIssuerIcaIsNumeric() {
	    return isNumeric(beginIp9890hIssuerIca
	                    ,beginIp9890hIssuerIca + IP_9890H_ISSUER_ICA_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_9890H_ISSUER_ICA_LEN = 11;
  	/**
	 * serializeIp9890hIssuerIca
	 */
	protected void serializeIp9890hIssuerIca(long ip9890hIssuerIca) {
		 putNumber(beginIp9890hIssuerIca,ip9890hIssuerIca,IP_9890H_ISSUER_ICA_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp9890hIssuerIcaCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp9890hIssuerIca
	 */
   	protected  long serializeIp9890hIssuerIca(char[] value) {
	    long  ip9890hIssuerIca;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip9890hIssuerIca = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,false/*isSigned?*/)
		       ,beginIp9890hIssuerIca
		       ,11
		      );
		 localIp9890hIssuerIcaCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip9890hIssuerIca;
    }

   protected long checkIp9890hIssuerIcaMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp9890hIssuerIca is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp9890hIssuerIca() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp9890hIssuerIca
			                 ,IP_9890H_ISSUER_ICA_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip9890hIssuerIca", beginIp9890hIssuerIca,IP_9890H_ISSUER_ICA_LEN);
    }
   	}
     int localIp9890hAcquirerIcaCounter = -1;
     public boolean isIp9890hAcquirerIcaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp9890hAcquirerIcaCounter != sharedCounter;
         localIp9890hAcquirerIcaCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip9890hAcquirerIca
	 *	@return ip9890hAcquirerIca
	 */
	public char[]  getIp9890hAcquirerIcaString() {
	     return getCharArray(beginIp9890hAcquirerIca,IP_9890H_ACQUIRER_ICA_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip9890hAcquirerIcaIsNumeric() {
	    return isNumeric(beginIp9890hAcquirerIca
	                    ,beginIp9890hAcquirerIca + IP_9890H_ACQUIRER_ICA_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_9890H_ACQUIRER_ICA_LEN = 11;
  	/**
	 * serializeIp9890hAcquirerIca
	 */
	protected void serializeIp9890hAcquirerIca(long ip9890hAcquirerIca) {
		 putNumber(beginIp9890hAcquirerIca,ip9890hAcquirerIca,IP_9890H_ACQUIRER_ICA_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp9890hAcquirerIcaCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp9890hAcquirerIca
	 */
   	protected  long serializeIp9890hAcquirerIca(char[] value) {
	    long  ip9890hAcquirerIca;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip9890hAcquirerIca = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,false/*isSigned?*/)
		       ,beginIp9890hAcquirerIca
		       ,11
		      );
		 localIp9890hAcquirerIcaCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip9890hAcquirerIca;
    }

   protected long checkIp9890hAcquirerIcaMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp9890hAcquirerIca is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp9890hAcquirerIca() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp9890hAcquirerIca
			                 ,IP_9890H_ACQUIRER_ICA_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip9890hAcquirerIca", beginIp9890hAcquirerIca,IP_9890H_ACQUIRER_ICA_LEN);
    }
   	}
     int localIp9890hPanAliasCounter = -1;
     public boolean isIp9890hPanAliasModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp9890hPanAliasCounter != sharedCounter;
         localIp9890hPanAliasCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_9890H_PAN_ALIAS_LEN = 36;
	/**
	 * 	serialize this Ip9890hPanAlias
	 */
   protected void serializeIp9890hPanAlias(char[] ip9890hPanAlias) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip9890hPanAlias,0,getStringValue(),beginIp9890hPanAlias,IP_9890H_PAN_ALIAS_LEN);
       localIp9890hPanAliasCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp9890hPanAliasConstraints(char[] value) {
   			return super.checkConstraints(value , 36 ,false, false);
   }
    /**
	 *	refreshIp9890hPanAlias is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp9890hPanAlias() {	 
   		return (substring(getStringValue(),beginIp9890hPanAlias,beginIp9890hPanAlias + IP_9890H_PAN_ALIAS_LEN));
   	}
     int localIp9890hProductCodeCounter = -1;
     public boolean isIp9890hProductCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp9890hProductCodeCounter != sharedCounter;
         localIp9890hProductCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_9890H_PRODUCT_CODE_LEN = 3;
	/**
	 * 	serialize this Ip9890hProductCode
	 */
   protected void serializeIp9890hProductCode(char[] ip9890hProductCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip9890hProductCode,0,getStringValue(),beginIp9890hProductCode,IP_9890H_PRODUCT_CODE_LEN);
       localIp9890hProductCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp9890hProductCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp9890hProductCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp9890hProductCode() {	 
   		return (substring(getStringValue(),beginIp9890hProductCode,beginIp9890hProductCode + IP_9890H_PRODUCT_CODE_LEN));
   	}




}
  
