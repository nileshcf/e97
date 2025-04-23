package com.cloudframe.app.ip989010.dto.serialize;

/**
*  The class Ip98901PaymentFileDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:31. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip98901PaymentFileDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip98901PaymentFileDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_98901_PAYMENT_FILE_DATA_LENGTH = 200;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp98901TransactionAmount;
            protected  int beginIp98901Merchant;
            protected  int beginIp98901BankNetReference;
            protected  int beginIp98901BankNetDate;
            protected  int beginIp98901IssuerIca;
            protected  int beginIp98901AcquirerIca;
            protected  int beginIp98901PanAlias;
            protected  int beginIp98901ProductCode;
	
	/**
	* Constructor for Ip98901PaymentFileDataSerialized
	**/
    public Ip98901PaymentFileDataSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip98901PaymentFileDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_98901_PAYMENT_FILE_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginIp98901TransactionAmount = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp98901Merchant = getStartOffset() + 24;	// set offset for serialization
  
             beginIp98901BankNetReference = getStartOffset() + 49;	// set offset for serialization
  
             beginIp98901BankNetDate = getStartOffset() + 58;	// set offset for serialization
  
             beginIp98901IssuerIca = getStartOffset() + 62;	// set offset for serialization
  
             beginIp98901AcquirerIca = getStartOffset() + 73;	// set offset for serialization
  
             beginIp98901PanAlias = getStartOffset() + 84;	// set offset for serialization
  
             beginIp98901ProductCode = getStartOffset() + 120;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localIp98901TransactionAmountCounter = -1;
     public boolean isIp98901TransactionAmountModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp98901TransactionAmountCounter != sharedCounter;
         localIp98901TransactionAmountCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_98901_TRANSACTION_AMOUNT_LEN = 12;
	/**
	 * 	serialize this Ip98901TransactionAmount
	 */
   protected void serializeIp98901TransactionAmount(char[] ip98901TransactionAmount) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip98901TransactionAmount,0,getStringValue(),beginIp98901TransactionAmount,IP_98901_TRANSACTION_AMOUNT_LEN);
       localIp98901TransactionAmountCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp98901TransactionAmountConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshIp98901TransactionAmount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp98901TransactionAmount() {	 
   		return (substring(getStringValue(),beginIp98901TransactionAmount,beginIp98901TransactionAmount + IP_98901_TRANSACTION_AMOUNT_LEN));
   	}
     int localIp98901MerchantCounter = -1;
     public boolean isIp98901MerchantModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp98901MerchantCounter != sharedCounter;
         localIp98901MerchantCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_98901_MERCHANT_LEN = 25;
	/**
	 * 	serialize this Ip98901Merchant
	 */
   protected void serializeIp98901Merchant(char[] ip98901Merchant) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip98901Merchant,0,getStringValue(),beginIp98901Merchant,IP_98901_MERCHANT_LEN);
       localIp98901MerchantCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp98901MerchantConstraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
    /**
	 *	refreshIp98901Merchant is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp98901Merchant() {	 
   		return (substring(getStringValue(),beginIp98901Merchant,beginIp98901Merchant + IP_98901_MERCHANT_LEN));
   	}
     int localIp98901BankNetReferenceCounter = -1;
     public boolean isIp98901BankNetReferenceModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp98901BankNetReferenceCounter != sharedCounter;
         localIp98901BankNetReferenceCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_98901_BANK_NET_REFERENCE_LEN = 9;
	/**
	 * 	serialize this Ip98901BankNetReference
	 */
   protected void serializeIp98901BankNetReference(char[] ip98901BankNetReference) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip98901BankNetReference,0,getStringValue(),beginIp98901BankNetReference,IP_98901_BANK_NET_REFERENCE_LEN);
       localIp98901BankNetReferenceCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp98901BankNetReferenceConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshIp98901BankNetReference is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp98901BankNetReference() {	 
   		return (substring(getStringValue(),beginIp98901BankNetReference,beginIp98901BankNetReference + IP_98901_BANK_NET_REFERENCE_LEN));
   	}
     int localIp98901BankNetDateCounter = -1;
     public boolean isIp98901BankNetDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp98901BankNetDateCounter != sharedCounter;
         localIp98901BankNetDateCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_98901_BANK_NET_DATE_LEN = 4;
	/**
	 * 	serialize this Ip98901BankNetDate
	 */
   protected void serializeIp98901BankNetDate(char[] ip98901BankNetDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip98901BankNetDate,0,getStringValue(),beginIp98901BankNetDate,IP_98901_BANK_NET_DATE_LEN);
       localIp98901BankNetDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp98901BankNetDateConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp98901BankNetDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp98901BankNetDate() {	 
   		return (substring(getStringValue(),beginIp98901BankNetDate,beginIp98901BankNetDate + IP_98901_BANK_NET_DATE_LEN));
   	}
     int localIp98901IssuerIcaCounter = -1;
     public boolean isIp98901IssuerIcaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp98901IssuerIcaCounter != sharedCounter;
         localIp98901IssuerIcaCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip98901IssuerIca
	 *	@return ip98901IssuerIca
	 */
	public char[]  getIp98901IssuerIcaString() {
	     return getCharArray(beginIp98901IssuerIca,IP_98901_ISSUER_ICA_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip98901IssuerIcaIsNumeric() {
	    return isNumeric(beginIp98901IssuerIca
	                    ,beginIp98901IssuerIca + IP_98901_ISSUER_ICA_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_98901_ISSUER_ICA_LEN = 11;
  	/**
	 * serializeIp98901IssuerIca
	 */
	protected void serializeIp98901IssuerIca(long ip98901IssuerIca) {
		 putNumber(beginIp98901IssuerIca,ip98901IssuerIca,IP_98901_ISSUER_ICA_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp98901IssuerIcaCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp98901IssuerIca
	 */
   	protected  long serializeIp98901IssuerIca(char[] value) {
	    long  ip98901IssuerIca;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip98901IssuerIca = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,false/*isSigned?*/)
		       ,beginIp98901IssuerIca
		       ,11
		      );
		 localIp98901IssuerIcaCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip98901IssuerIca;
    }

   protected long checkIp98901IssuerIcaMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp98901IssuerIca is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp98901IssuerIca() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp98901IssuerIca
			                 ,IP_98901_ISSUER_ICA_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip98901IssuerIca", beginIp98901IssuerIca,IP_98901_ISSUER_ICA_LEN);
    }
   	}
     int localIp98901AcquirerIcaCounter = -1;
     public boolean isIp98901AcquirerIcaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp98901AcquirerIcaCounter != sharedCounter;
         localIp98901AcquirerIcaCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip98901AcquirerIca
	 *	@return ip98901AcquirerIca
	 */
	public char[]  getIp98901AcquirerIcaString() {
	     return getCharArray(beginIp98901AcquirerIca,IP_98901_ACQUIRER_ICA_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip98901AcquirerIcaIsNumeric() {
	    return isNumeric(beginIp98901AcquirerIca
	                    ,beginIp98901AcquirerIca + IP_98901_ACQUIRER_ICA_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_98901_ACQUIRER_ICA_LEN = 11;
  	/**
	 * serializeIp98901AcquirerIca
	 */
	protected void serializeIp98901AcquirerIca(long ip98901AcquirerIca) {
		 putNumber(beginIp98901AcquirerIca,ip98901AcquirerIca,IP_98901_ACQUIRER_ICA_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp98901AcquirerIcaCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp98901AcquirerIca
	 */
   	protected  long serializeIp98901AcquirerIca(char[] value) {
	    long  ip98901AcquirerIca;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip98901AcquirerIca = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,false/*isSigned?*/)
		       ,beginIp98901AcquirerIca
		       ,11
		      );
		 localIp98901AcquirerIcaCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip98901AcquirerIca;
    }

   protected long checkIp98901AcquirerIcaMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp98901AcquirerIca is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp98901AcquirerIca() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp98901AcquirerIca
			                 ,IP_98901_ACQUIRER_ICA_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip98901AcquirerIca", beginIp98901AcquirerIca,IP_98901_ACQUIRER_ICA_LEN);
    }
   	}
     int localIp98901PanAliasCounter = -1;
     public boolean isIp98901PanAliasModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp98901PanAliasCounter != sharedCounter;
         localIp98901PanAliasCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_98901_PAN_ALIAS_LEN = 36;
	/**
	 * 	serialize this Ip98901PanAlias
	 */
   protected void serializeIp98901PanAlias(char[] ip98901PanAlias) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip98901PanAlias,0,getStringValue(),beginIp98901PanAlias,IP_98901_PAN_ALIAS_LEN);
       localIp98901PanAliasCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp98901PanAliasConstraints(char[] value) {
   			return super.checkConstraints(value , 36 ,false, false);
   }
    /**
	 *	refreshIp98901PanAlias is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp98901PanAlias() {	 
   		return (substring(getStringValue(),beginIp98901PanAlias,beginIp98901PanAlias + IP_98901_PAN_ALIAS_LEN));
   	}
     int localIp98901ProductCodeCounter = -1;
     public boolean isIp98901ProductCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp98901ProductCodeCounter != sharedCounter;
         localIp98901ProductCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_98901_PRODUCT_CODE_LEN = 3;
	/**
	 * 	serialize this Ip98901ProductCode
	 */
   protected void serializeIp98901ProductCode(char[] ip98901ProductCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip98901ProductCode,0,getStringValue(),beginIp98901ProductCode,IP_98901_PRODUCT_CODE_LEN);
       localIp98901ProductCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp98901ProductCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp98901ProductCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp98901ProductCode() {	 
   		return (substring(getStringValue(),beginIp98901ProductCode,beginIp98901ProductCode + IP_98901_PRODUCT_CODE_LEN));
   	}




}
  
