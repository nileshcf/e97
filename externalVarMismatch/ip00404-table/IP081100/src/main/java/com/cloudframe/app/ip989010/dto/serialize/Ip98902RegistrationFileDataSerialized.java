package com.cloudframe.app.ip989010.dto.serialize;

/**
*  The class Ip98902RegistrationFileDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:31. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip98902RegistrationFileDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip98902RegistrationFileDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_98902_REGISTRATION_FILE_DATA_LENGTH = 200;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp98902PanAlias;
            protected  int beginIp98902Pan;
            protected  int beginIp98902Status;
            protected  int beginIp98902DonationAmount;
            protected  int beginIp98902DonationUpperLimit;
            protected  int beginIp98902CharityIca;
	
	/**
	* Constructor for Ip98902RegistrationFileDataSerialized
	**/
    public Ip98902RegistrationFileDataSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip98902RegistrationFileDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_98902_REGISTRATION_FILE_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp98902PanAlias = getStartOffset() + 0;	// set offset for serialization
  
             beginIp98902Pan = getStartOffset() + 36;	// set offset for serialization
  
             beginIp98902Status = getStartOffset() + 52;	// set offset for serialization
  
             beginIp98902DonationAmount = getStartOffset() + 56;	// set offset for serialization
  
             beginIp98902DonationUpperLimit = getStartOffset() + 59;	// set offset for serialization
  
             beginIp98902CharityIca = getStartOffset() + 75;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp98902PanAliasCounter = -1;
     public boolean isIp98902PanAliasModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp98902PanAliasCounter != sharedCounter;
         localIp98902PanAliasCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_98902_PAN_ALIAS_LEN = 36;
	/**
	 * 	serialize this Ip98902PanAlias
	 */
   protected void serializeIp98902PanAlias(char[] ip98902PanAlias) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip98902PanAlias,0,getStringValue(),beginIp98902PanAlias,IP_98902_PAN_ALIAS_LEN);
       localIp98902PanAliasCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp98902PanAliasConstraints(char[] value) {
   			return super.checkConstraints(value , 36 ,false, false);
   }
    /**
	 *	refreshIp98902PanAlias is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp98902PanAlias() {	 
   		return (substring(getStringValue(),beginIp98902PanAlias,beginIp98902PanAlias + IP_98902_PAN_ALIAS_LEN));
   	}
     int localIp98902PanCounter = -1;
     public boolean isIp98902PanModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp98902PanCounter != sharedCounter;
         localIp98902PanCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_98902_PAN_LEN = 16;
	/**
	 * 	serialize this Ip98902Pan
	 */
   protected void serializeIp98902Pan(char[] ip98902Pan) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip98902Pan,0,getStringValue(),beginIp98902Pan,IP_98902_PAN_LEN);
       localIp98902PanCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp98902PanConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshIp98902Pan is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp98902Pan() {	 
   		return (substring(getStringValue(),beginIp98902Pan,beginIp98902Pan + IP_98902_PAN_LEN));
   	}
     int localIp98902StatusCounter = -1;
     public boolean isIp98902StatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp98902StatusCounter != sharedCounter;
         localIp98902StatusCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_98902_STATUS_LEN = 1;
	/**
	 * 	serialize this Ip98902Status
	 */
   protected void serializeIp98902Status(char[] ip98902Status) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip98902Status,0,getStringValue(),beginIp98902Status,IP_98902_STATUS_LEN);
       localIp98902StatusCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp98902StatusConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp98902Status is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp98902Status() {	 
   		return (substring(getStringValue(),beginIp98902Status,beginIp98902Status + IP_98902_STATUS_LEN));
   	}
     int localIp98902DonationAmountCounter = -1;
     public boolean isIp98902DonationAmountModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp98902DonationAmountCounter != sharedCounter;
         localIp98902DonationAmountCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip98902DonationAmount
	 *	@return ip98902DonationAmount
	 */
	public char[]  getIp98902DonationAmountString() {
	     return getCharArray(beginIp98902DonationAmount,IP_98902_DONATION_AMOUNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip98902DonationAmountIsNumeric() {
	    return isNumeric(beginIp98902DonationAmount
	                    ,beginIp98902DonationAmount + IP_98902_DONATION_AMOUNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_98902_DONATION_AMOUNT_LEN = 3;
  	/**
	 * serializeIp98902DonationAmount
	 */
	protected void serializeIp98902DonationAmount(int ip98902DonationAmount) {
		 putNumber(beginIp98902DonationAmount,ip98902DonationAmount,IP_98902_DONATION_AMOUNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp98902DonationAmountCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp98902DonationAmount
	 */
   	protected  int serializeIp98902DonationAmount(char[] value) {
	    int  ip98902DonationAmount;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip98902DonationAmount = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp98902DonationAmount
		       ,3
		      );
		 localIp98902DonationAmountCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip98902DonationAmount;
    }

   protected int checkIp98902DonationAmountMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp98902DonationAmount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp98902DonationAmount() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp98902DonationAmount
			                 ,IP_98902_DONATION_AMOUNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip98902DonationAmount", beginIp98902DonationAmount,IP_98902_DONATION_AMOUNT_LEN);
    }
   	}
     int localIp98902DonationUpperLimitCounter = -1;
     public boolean isIp98902DonationUpperLimitModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp98902DonationUpperLimitCounter != sharedCounter;
         localIp98902DonationUpperLimitCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip98902DonationUpperLimit
	 *	@return ip98902DonationUpperLimit
	 */
	public char[]  getIp98902DonationUpperLimitString() {
	     return getCharArray(beginIp98902DonationUpperLimit,IP_98902_DONATION_UPPER_LIMIT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip98902DonationUpperLimitIsNumeric() {
	    return isNumeric(beginIp98902DonationUpperLimit
	                    ,beginIp98902DonationUpperLimit + IP_98902_DONATION_UPPER_LIMIT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_98902_DONATION_UPPER_LIMIT_LEN = 3;
  	/**
	 * serializeIp98902DonationUpperLimit
	 */
	protected void serializeIp98902DonationUpperLimit(int ip98902DonationUpperLimit) {
		 putNumber(beginIp98902DonationUpperLimit,ip98902DonationUpperLimit,IP_98902_DONATION_UPPER_LIMIT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp98902DonationUpperLimitCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp98902DonationUpperLimit
	 */
   	protected  int serializeIp98902DonationUpperLimit(char[] value) {
	    int  ip98902DonationUpperLimit;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip98902DonationUpperLimit = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp98902DonationUpperLimit
		       ,3
		      );
		 localIp98902DonationUpperLimitCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip98902DonationUpperLimit;
    }

   protected int checkIp98902DonationUpperLimitMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp98902DonationUpperLimit is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp98902DonationUpperLimit() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp98902DonationUpperLimit
			                 ,IP_98902_DONATION_UPPER_LIMIT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip98902DonationUpperLimit", beginIp98902DonationUpperLimit,IP_98902_DONATION_UPPER_LIMIT_LEN);
    }
   	}
     int localIp98902CharityIcaCounter = -1;
     public boolean isIp98902CharityIcaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp98902CharityIcaCounter != sharedCounter;
         localIp98902CharityIcaCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip98902CharityIca
	 *	@return ip98902CharityIca
	 */
	public char[]  getIp98902CharityIcaString() {
	     return getCharArray(beginIp98902CharityIca,IP_98902_CHARITY_ICA_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip98902CharityIcaIsNumeric() {
	    return isNumeric(beginIp98902CharityIca
	                    ,beginIp98902CharityIca + IP_98902_CHARITY_ICA_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_98902_CHARITY_ICA_LEN = 11;
  	/**
	 * serializeIp98902CharityIca
	 */
	protected void serializeIp98902CharityIca(long ip98902CharityIca) {
		 putNumber(beginIp98902CharityIca,ip98902CharityIca,IP_98902_CHARITY_ICA_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp98902CharityIcaCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp98902CharityIca
	 */
   	protected  long serializeIp98902CharityIca(char[] value) {
	    long  ip98902CharityIca;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip98902CharityIca = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,false/*isSigned?*/)
		       ,beginIp98902CharityIca
		       ,11
		      );
		 localIp98902CharityIcaCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip98902CharityIca;
    }

   protected long checkIp98902CharityIcaMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp98902CharityIca is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp98902CharityIca() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp98902CharityIca
			                 ,IP_98902_CHARITY_ICA_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip98902CharityIca", beginIp98902CharityIca,IP_98902_CHARITY_ICA_LEN);
    }
   	}




}
  
