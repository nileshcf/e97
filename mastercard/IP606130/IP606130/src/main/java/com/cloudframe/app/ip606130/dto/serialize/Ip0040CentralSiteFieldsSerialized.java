package com.cloudframe.app.ip606130.dto.serialize;

/**
*  The class Ip0040CentralSiteFieldsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:17. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip0040CentralSiteFieldsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip0040CentralSiteFieldsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_0040_CENTRAL_SITE_FIELDS_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp0040ChbConvExclId;
            protected  int beginIp0040ChbConvExclExpire;
            protected  int beginIp0040HardshipIndicator;
            protected  int beginIp0040HardshipEffective;
            protected  int beginIp0040HardshipExpiration;
            protected  int beginIp0040GamingCountrySw;
            protected  int beginIp0040CrossBorderInd;
            protected  int beginIp0040RecPaymtCanSw;
            protected  int beginIp0040DomDbtParticipSw;
            protected  int beginIp0040IpcFraudCtlSw;
            protected  int beginIp0040IccrParticipInd;
            protected  int beginIp0040RevCreditInd;
            protected  int beginIp0040ChgbkBkoutInd;
            protected  int beginIp0040RtnTrnstNum;
            protected  int beginIp0040TrueIssuerIca;
            protected  int beginIp0040MerchantTaxIdSw;
            protected  int beginIp0040InstallServSw;
            protected  int beginIp0040TokenServiceInd;
            protected  int beginIp0040GbsBillInd;
            protected  int beginIp0040InstallAuthSw;
            protected  int beginIp0040SeqServiceInd;
            protected  int beginIp0040CbfmParticipInd;
            protected  int beginIp0040CbcmParticipInd;
            protected  int beginIp0040CbfmDccSw;
            protected  int beginIp0040InstApiGcmsSw;
            protected  int beginIp0040InsEnabApiInd;
            protected  int beginIp0040InstApiUiSw;
            protected  int beginIp0040MstrpassAchProgInd;
            protected  int beginIp0040OboInd;
            protected  int beginIp0040MultCurrSw;
            protected  int beginIp0040AnonIndEffDate;
	
	/**
	* Constructor for Ip0040CentralSiteFieldsSerialized
	**/
    public Ip0040CentralSiteFieldsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip0040CentralSiteFieldsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0040CentralSiteFieldsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip0040CentralSiteFieldsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,192); // serialize this field at offset 192 by default 
    }
    
	/**
	* sets parent for this Ip0040CentralSiteFieldsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 192 by default
    }    
	/**
	* initializes the field in Ip0040CentralSiteFieldsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_0040_CENTRAL_SITE_FIELDS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp0040ChbConvExclId = getStartOffset() + 0;	// set offset for serialization
  
             beginIp0040ChbConvExclExpire = getStartOffset() + 1;	// set offset for serialization
  
             beginIp0040HardshipIndicator = getStartOffset() + 7;	// set offset for serialization
  
             beginIp0040HardshipEffective = getStartOffset() + 8;	// set offset for serialization
  
             beginIp0040HardshipExpiration = getStartOffset() + 14;	// set offset for serialization
  
             beginIp0040GamingCountrySw = getStartOffset() + 20;	// set offset for serialization
  
             beginIp0040CrossBorderInd = getStartOffset() + 21;	// set offset for serialization
  
             beginIp0040RecPaymtCanSw = getStartOffset() + 22;	// set offset for serialization
  
             beginIp0040DomDbtParticipSw = getStartOffset() + 23;	// set offset for serialization
  
  
             beginIp0040IpcFraudCtlSw = getStartOffset() + 34;	// set offset for serialization
  
             beginIp0040IccrParticipInd = getStartOffset() + 35;	// set offset for serialization
  
             beginIp0040RevCreditInd = getStartOffset() + 36;	// set offset for serialization
  
             beginIp0040ChgbkBkoutInd = getStartOffset() + 37;	// set offset for serialization
  
             beginIp0040RtnTrnstNum = getStartOffset() + 38;	// set offset for serialization
  
             beginIp0040TrueIssuerIca = getStartOffset() + 48;	// set offset for serialization
  
             beginIp0040MerchantTaxIdSw = getStartOffset() + 59;	// set offset for serialization
  
             beginIp0040InstallServSw = getStartOffset() + 60;	// set offset for serialization
  
             beginIp0040TokenServiceInd = getStartOffset() + 61;	// set offset for serialization
  
             beginIp0040GbsBillInd = getStartOffset() + 62;	// set offset for serialization
  
             beginIp0040InstallAuthSw = getStartOffset() + 63;	// set offset for serialization
  
             beginIp0040SeqServiceInd = getStartOffset() + 64;	// set offset for serialization
  
             beginIp0040CbfmParticipInd = getStartOffset() + 65;	// set offset for serialization
  
             beginIp0040CbcmParticipInd = getStartOffset() + 66;	// set offset for serialization
  
             beginIp0040CbfmDccSw = getStartOffset() + 67;	// set offset for serialization
  
             beginIp0040InstApiGcmsSw = getStartOffset() + 68;	// set offset for serialization
  
             beginIp0040InsEnabApiInd = getStartOffset() + 69;	// set offset for serialization
  
             beginIp0040InstApiUiSw = getStartOffset() + 70;	// set offset for serialization
  
             beginIp0040MstrpassAchProgInd = getStartOffset() + 71;	// set offset for serialization
  
             beginIp0040OboInd = getStartOffset() + 72;	// set offset for serialization
  
             beginIp0040MultCurrSw = getStartOffset() + 73;	// set offset for serialization
  
             beginIp0040AnonIndEffDate = getStartOffset() + 74;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp0040ChbConvExclIdCounter = -1;
     public boolean isIp0040ChbConvExclIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040ChbConvExclIdCounter != sharedCounter;
         localIp0040ChbConvExclIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_CHB_CONV_EXCL_ID_LEN = 1;
	/**
	 * 	serialize this Ip0040ChbConvExclId
	 */
   protected void serializeIp0040ChbConvExclId(char[] ip0040ChbConvExclId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040ChbConvExclId,0,getStringValue(),beginIp0040ChbConvExclId,IP_0040_CHB_CONV_EXCL_ID_LEN);
       localIp0040ChbConvExclIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040ChbConvExclIdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040ChbConvExclId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040ChbConvExclId() {	 
   		return (substring(getStringValue(),beginIp0040ChbConvExclId,beginIp0040ChbConvExclId + IP_0040_CHB_CONV_EXCL_ID_LEN));
   	}
     int localIp0040ChbConvExclExpireCounter = -1;
     public boolean isIp0040ChbConvExclExpireModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040ChbConvExclExpireCounter != sharedCounter;
         localIp0040ChbConvExclExpireCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip0040ChbConvExclExpire
	 *	@return ip0040ChbConvExclExpire
	 */
	public char[]  getIp0040ChbConvExclExpireString() {
	     return getCharArray(beginIp0040ChbConvExclExpire,IP_0040_CHB_CONV_EXCL_EXPIRE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip0040ChbConvExclExpireIsNumeric() {
	    return isNumeric(beginIp0040ChbConvExclExpire
	                    ,beginIp0040ChbConvExclExpire + IP_0040_CHB_CONV_EXCL_EXPIRE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_0040_CHB_CONV_EXCL_EXPIRE_LEN = 6;
  	/**
	 * serializeIp0040ChbConvExclExpire
	 */
	protected void serializeIp0040ChbConvExclExpire(long ip0040ChbConvExclExpire) {
		 putNumber(beginIp0040ChbConvExclExpire,ip0040ChbConvExclExpire,IP_0040_CHB_CONV_EXCL_EXPIRE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp0040ChbConvExclExpireCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp0040ChbConvExclExpire
	 */
   	protected  long serializeIp0040ChbConvExclExpire(char[] value) {
	    long  ip0040ChbConvExclExpire;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip0040ChbConvExclExpire = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginIp0040ChbConvExclExpire
		       ,6
		      );
		 localIp0040ChbConvExclExpireCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip0040ChbConvExclExpire;
    }

   protected long checkIp0040ChbConvExclExpireMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp0040ChbConvExclExpire is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp0040ChbConvExclExpire() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp0040ChbConvExclExpire
			                 ,IP_0040_CHB_CONV_EXCL_EXPIRE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip0040ChbConvExclExpire", beginIp0040ChbConvExclExpire,IP_0040_CHB_CONV_EXCL_EXPIRE_LEN);
    }
   	}
     int localIp0040HardshipIndicatorCounter = -1;
     public boolean isIp0040HardshipIndicatorModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040HardshipIndicatorCounter != sharedCounter;
         localIp0040HardshipIndicatorCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_HARDSHIP_INDICATOR_LEN = 1;
	/**
	 * 	serialize this Ip0040HardshipIndicator
	 */
   protected void serializeIp0040HardshipIndicator(char[] ip0040HardshipIndicator) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040HardshipIndicator,0,getStringValue(),beginIp0040HardshipIndicator,IP_0040_HARDSHIP_INDICATOR_LEN);
       localIp0040HardshipIndicatorCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040HardshipIndicatorConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040HardshipIndicator is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040HardshipIndicator() {	 
   		return (substring(getStringValue(),beginIp0040HardshipIndicator,beginIp0040HardshipIndicator + IP_0040_HARDSHIP_INDICATOR_LEN));
   	}
     int localIp0040HardshipEffectiveCounter = -1;
     public boolean isIp0040HardshipEffectiveModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040HardshipEffectiveCounter != sharedCounter;
         localIp0040HardshipEffectiveCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip0040HardshipEffective
	 *	@return ip0040HardshipEffective
	 */
	public char[]  getIp0040HardshipEffectiveString() {
	     return getCharArray(beginIp0040HardshipEffective,IP_0040_HARDSHIP_EFFECTIVE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip0040HardshipEffectiveIsNumeric() {
	    return isNumeric(beginIp0040HardshipEffective
	                    ,beginIp0040HardshipEffective + IP_0040_HARDSHIP_EFFECTIVE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_0040_HARDSHIP_EFFECTIVE_LEN = 6;
  	/**
	 * serializeIp0040HardshipEffective
	 */
	protected void serializeIp0040HardshipEffective(long ip0040HardshipEffective) {
		 putNumber(beginIp0040HardshipEffective,ip0040HardshipEffective,IP_0040_HARDSHIP_EFFECTIVE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp0040HardshipEffectiveCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp0040HardshipEffective
	 */
   	protected  long serializeIp0040HardshipEffective(char[] value) {
	    long  ip0040HardshipEffective;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip0040HardshipEffective = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginIp0040HardshipEffective
		       ,6
		      );
		 localIp0040HardshipEffectiveCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip0040HardshipEffective;
    }

   protected long checkIp0040HardshipEffectiveMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp0040HardshipEffective is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp0040HardshipEffective() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp0040HardshipEffective
			                 ,IP_0040_HARDSHIP_EFFECTIVE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip0040HardshipEffective", beginIp0040HardshipEffective,IP_0040_HARDSHIP_EFFECTIVE_LEN);
    }
   	}
     int localIp0040HardshipExpirationCounter = -1;
     public boolean isIp0040HardshipExpirationModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040HardshipExpirationCounter != sharedCounter;
         localIp0040HardshipExpirationCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip0040HardshipExpiration
	 *	@return ip0040HardshipExpiration
	 */
	public char[]  getIp0040HardshipExpirationString() {
	     return getCharArray(beginIp0040HardshipExpiration,IP_0040_HARDSHIP_EXPIRATION_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip0040HardshipExpirationIsNumeric() {
	    return isNumeric(beginIp0040HardshipExpiration
	                    ,beginIp0040HardshipExpiration + IP_0040_HARDSHIP_EXPIRATION_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_0040_HARDSHIP_EXPIRATION_LEN = 6;
  	/**
	 * serializeIp0040HardshipExpiration
	 */
	protected void serializeIp0040HardshipExpiration(long ip0040HardshipExpiration) {
		 putNumber(beginIp0040HardshipExpiration,ip0040HardshipExpiration,IP_0040_HARDSHIP_EXPIRATION_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp0040HardshipExpirationCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp0040HardshipExpiration
	 */
   	protected  long serializeIp0040HardshipExpiration(char[] value) {
	    long  ip0040HardshipExpiration;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip0040HardshipExpiration = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginIp0040HardshipExpiration
		       ,6
		      );
		 localIp0040HardshipExpirationCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip0040HardshipExpiration;
    }

   protected long checkIp0040HardshipExpirationMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp0040HardshipExpiration is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp0040HardshipExpiration() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp0040HardshipExpiration
			                 ,IP_0040_HARDSHIP_EXPIRATION_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip0040HardshipExpiration", beginIp0040HardshipExpiration,IP_0040_HARDSHIP_EXPIRATION_LEN);
    }
   	}
     int localIp0040GamingCountrySwCounter = -1;
     public boolean isIp0040GamingCountrySwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040GamingCountrySwCounter != sharedCounter;
         localIp0040GamingCountrySwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_GAMING_COUNTRY_SW_LEN = 1;
	/**
	 * 	serialize this Ip0040GamingCountrySw
	 */
   protected void serializeIp0040GamingCountrySw(char[] ip0040GamingCountrySw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040GamingCountrySw,0,getStringValue(),beginIp0040GamingCountrySw,IP_0040_GAMING_COUNTRY_SW_LEN);
       localIp0040GamingCountrySwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040GamingCountrySwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040GamingCountrySw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040GamingCountrySw() {	 
   		return (substring(getStringValue(),beginIp0040GamingCountrySw,beginIp0040GamingCountrySw + IP_0040_GAMING_COUNTRY_SW_LEN));
   	}
     int localIp0040CrossBorderIndCounter = -1;
     public boolean isIp0040CrossBorderIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040CrossBorderIndCounter != sharedCounter;
         localIp0040CrossBorderIndCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip0040CrossBorderInd
	 *	@return ip0040CrossBorderInd
	 */
	public char[]  getIp0040CrossBorderIndString() {
	     return getCharArray(beginIp0040CrossBorderInd,IP_0040_CROSS_BORDER_IND_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip0040CrossBorderIndIsNumeric() {
	    return isNumeric(beginIp0040CrossBorderInd
	                    ,beginIp0040CrossBorderInd + IP_0040_CROSS_BORDER_IND_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_0040_CROSS_BORDER_IND_LEN = 1;
  	/**
	 * serializeIp0040CrossBorderInd
	 */
	protected void serializeIp0040CrossBorderInd(int ip0040CrossBorderInd) {
		 putNumber(beginIp0040CrossBorderInd,ip0040CrossBorderInd,IP_0040_CROSS_BORDER_IND_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp0040CrossBorderIndCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp0040CrossBorderInd
	 */
   	protected  int serializeIp0040CrossBorderInd(char[] value) {
	    int  ip0040CrossBorderInd;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip0040CrossBorderInd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginIp0040CrossBorderInd
		       ,1
		      );
		 localIp0040CrossBorderIndCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip0040CrossBorderInd;
    }

   protected int checkIp0040CrossBorderIndMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp0040CrossBorderInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp0040CrossBorderInd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp0040CrossBorderInd
			                 ,IP_0040_CROSS_BORDER_IND_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip0040CrossBorderInd", beginIp0040CrossBorderInd,IP_0040_CROSS_BORDER_IND_LEN);
    }
   	}
     int localIp0040RecPaymtCanSwCounter = -1;
     public boolean isIp0040RecPaymtCanSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040RecPaymtCanSwCounter != sharedCounter;
         localIp0040RecPaymtCanSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_REC_PAYMT_CAN_SW_LEN = 1;
	/**
	 * 	serialize this Ip0040RecPaymtCanSw
	 */
   protected void serializeIp0040RecPaymtCanSw(char[] ip0040RecPaymtCanSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040RecPaymtCanSw,0,getStringValue(),beginIp0040RecPaymtCanSw,IP_0040_REC_PAYMT_CAN_SW_LEN);
       localIp0040RecPaymtCanSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040RecPaymtCanSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040RecPaymtCanSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040RecPaymtCanSw() {	 
   		return (substring(getStringValue(),beginIp0040RecPaymtCanSw,beginIp0040RecPaymtCanSw + IP_0040_REC_PAYMT_CAN_SW_LEN));
   	}
     int localIp0040DomDbtParticipSwCounter = -1;
     public boolean isIp0040DomDbtParticipSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040DomDbtParticipSwCounter != sharedCounter;
         localIp0040DomDbtParticipSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_DOM_DBT_PARTICIP_SW_LEN = 1;
	/**
	 * 	serialize this Ip0040DomDbtParticipSw
	 */
   protected void serializeIp0040DomDbtParticipSw(char[] ip0040DomDbtParticipSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040DomDbtParticipSw,0,getStringValue(),beginIp0040DomDbtParticipSw,IP_0040_DOM_DBT_PARTICIP_SW_LEN);
       localIp0040DomDbtParticipSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040DomDbtParticipSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040DomDbtParticipSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040DomDbtParticipSw() {	 
   		return (substring(getStringValue(),beginIp0040DomDbtParticipSw,beginIp0040DomDbtParticipSw + IP_0040_DOM_DBT_PARTICIP_SW_LEN));
   	}
     int localIp0040IpcFraudCtlSwCounter = -1;
     public boolean isIp0040IpcFraudCtlSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040IpcFraudCtlSwCounter != sharedCounter;
         localIp0040IpcFraudCtlSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_IPC_FRAUD_CTL_SW_LEN = 1;
	/**
	 * 	serialize this Ip0040IpcFraudCtlSw
	 */
   protected void serializeIp0040IpcFraudCtlSw(char[] ip0040IpcFraudCtlSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040IpcFraudCtlSw,0,getStringValue(),beginIp0040IpcFraudCtlSw,IP_0040_IPC_FRAUD_CTL_SW_LEN);
       localIp0040IpcFraudCtlSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040IpcFraudCtlSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040IpcFraudCtlSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040IpcFraudCtlSw() {	 
   		return (substring(getStringValue(),beginIp0040IpcFraudCtlSw,beginIp0040IpcFraudCtlSw + IP_0040_IPC_FRAUD_CTL_SW_LEN));
   	}
     int localIp0040IccrParticipIndCounter = -1;
     public boolean isIp0040IccrParticipIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040IccrParticipIndCounter != sharedCounter;
         localIp0040IccrParticipIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_ICCR_PARTICIP_IND_LEN = 1;
	/**
	 * 	serialize this Ip0040IccrParticipInd
	 */
   protected void serializeIp0040IccrParticipInd(char[] ip0040IccrParticipInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040IccrParticipInd,0,getStringValue(),beginIp0040IccrParticipInd,IP_0040_ICCR_PARTICIP_IND_LEN);
       localIp0040IccrParticipIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040IccrParticipIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040IccrParticipInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040IccrParticipInd() {	 
   		return (substring(getStringValue(),beginIp0040IccrParticipInd,beginIp0040IccrParticipInd + IP_0040_ICCR_PARTICIP_IND_LEN));
   	}
     int localIp0040RevCreditIndCounter = -1;
     public boolean isIp0040RevCreditIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040RevCreditIndCounter != sharedCounter;
         localIp0040RevCreditIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_REV_CREDIT_IND_LEN = 1;
	/**
	 * 	serialize this Ip0040RevCreditInd
	 */
   protected void serializeIp0040RevCreditInd(char[] ip0040RevCreditInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040RevCreditInd,0,getStringValue(),beginIp0040RevCreditInd,IP_0040_REV_CREDIT_IND_LEN);
       localIp0040RevCreditIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040RevCreditIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040RevCreditInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040RevCreditInd() {	 
   		return (substring(getStringValue(),beginIp0040RevCreditInd,beginIp0040RevCreditInd + IP_0040_REV_CREDIT_IND_LEN));
   	}
     int localIp0040ChgbkBkoutIndCounter = -1;
     public boolean isIp0040ChgbkBkoutIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040ChgbkBkoutIndCounter != sharedCounter;
         localIp0040ChgbkBkoutIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_CHGBK_BKOUT_IND_LEN = 1;
	/**
	 * 	serialize this Ip0040ChgbkBkoutInd
	 */
   protected void serializeIp0040ChgbkBkoutInd(char[] ip0040ChgbkBkoutInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040ChgbkBkoutInd,0,getStringValue(),beginIp0040ChgbkBkoutInd,IP_0040_CHGBK_BKOUT_IND_LEN);
       localIp0040ChgbkBkoutIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040ChgbkBkoutIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040ChgbkBkoutInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040ChgbkBkoutInd() {	 
   		return (substring(getStringValue(),beginIp0040ChgbkBkoutInd,beginIp0040ChgbkBkoutInd + IP_0040_CHGBK_BKOUT_IND_LEN));
   	}
     int localIp0040RtnTrnstNumCounter = -1;
     public boolean isIp0040RtnTrnstNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040RtnTrnstNumCounter != sharedCounter;
         localIp0040RtnTrnstNumCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_RTN_TRNST_NUM_LEN = 10;
	/**
	 * 	serialize this Ip0040RtnTrnstNum
	 */
   protected void serializeIp0040RtnTrnstNum(char[] ip0040RtnTrnstNum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040RtnTrnstNum,0,getStringValue(),beginIp0040RtnTrnstNum,IP_0040_RTN_TRNST_NUM_LEN);
       localIp0040RtnTrnstNumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040RtnTrnstNumConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshIp0040RtnTrnstNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040RtnTrnstNum() {	 
   		return (substring(getStringValue(),beginIp0040RtnTrnstNum,beginIp0040RtnTrnstNum + IP_0040_RTN_TRNST_NUM_LEN));
   	}
     int localIp0040TrueIssuerIcaCounter = -1;
     public boolean isIp0040TrueIssuerIcaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040TrueIssuerIcaCounter != sharedCounter;
         localIp0040TrueIssuerIcaCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip0040TrueIssuerIca
	 *	@return ip0040TrueIssuerIca
	 */
	public char[]  getIp0040TrueIssuerIcaString() {
	     return getCharArray(beginIp0040TrueIssuerIca,IP_0040_TRUE_ISSUER_ICA_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip0040TrueIssuerIcaIsNumeric() {
	    return isNumeric(beginIp0040TrueIssuerIca
	                    ,beginIp0040TrueIssuerIca + IP_0040_TRUE_ISSUER_ICA_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_0040_TRUE_ISSUER_ICA_LEN = 11;
  	/**
	 * serializeIp0040TrueIssuerIca
	 */
	protected void serializeIp0040TrueIssuerIca(long ip0040TrueIssuerIca) {
		 putNumber(beginIp0040TrueIssuerIca,ip0040TrueIssuerIca,IP_0040_TRUE_ISSUER_ICA_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp0040TrueIssuerIcaCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp0040TrueIssuerIca
	 */
   	protected  long serializeIp0040TrueIssuerIca(char[] value) {
	    long  ip0040TrueIssuerIca;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip0040TrueIssuerIca = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,false/*isSigned?*/)
		       ,beginIp0040TrueIssuerIca
		       ,11
		      );
		 localIp0040TrueIssuerIcaCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip0040TrueIssuerIca;
    }

   protected long checkIp0040TrueIssuerIcaMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp0040TrueIssuerIca is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp0040TrueIssuerIca() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp0040TrueIssuerIca
			                 ,IP_0040_TRUE_ISSUER_ICA_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip0040TrueIssuerIca", beginIp0040TrueIssuerIca,IP_0040_TRUE_ISSUER_ICA_LEN);
    }
   	}
     int localIp0040MerchantTaxIdSwCounter = -1;
     public boolean isIp0040MerchantTaxIdSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040MerchantTaxIdSwCounter != sharedCounter;
         localIp0040MerchantTaxIdSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_MERCHANT_TAX_ID_SW_LEN = 1;
	/**
	 * 	serialize this Ip0040MerchantTaxIdSw
	 */
   protected void serializeIp0040MerchantTaxIdSw(char[] ip0040MerchantTaxIdSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040MerchantTaxIdSw,0,getStringValue(),beginIp0040MerchantTaxIdSw,IP_0040_MERCHANT_TAX_ID_SW_LEN);
       localIp0040MerchantTaxIdSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040MerchantTaxIdSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040MerchantTaxIdSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040MerchantTaxIdSw() {	 
   		return (substring(getStringValue(),beginIp0040MerchantTaxIdSw,beginIp0040MerchantTaxIdSw + IP_0040_MERCHANT_TAX_ID_SW_LEN));
   	}
     int localIp0040InstallServSwCounter = -1;
     public boolean isIp0040InstallServSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040InstallServSwCounter != sharedCounter;
         localIp0040InstallServSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_INSTALL_SERV_SW_LEN = 1;
	/**
	 * 	serialize this Ip0040InstallServSw
	 */
   protected void serializeIp0040InstallServSw(char[] ip0040InstallServSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040InstallServSw,0,getStringValue(),beginIp0040InstallServSw,IP_0040_INSTALL_SERV_SW_LEN);
       localIp0040InstallServSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040InstallServSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040InstallServSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040InstallServSw() {	 
   		return (substring(getStringValue(),beginIp0040InstallServSw,beginIp0040InstallServSw + IP_0040_INSTALL_SERV_SW_LEN));
   	}
     int localIp0040TokenServiceIndCounter = -1;
     public boolean isIp0040TokenServiceIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040TokenServiceIndCounter != sharedCounter;
         localIp0040TokenServiceIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_TOKEN_SERVICE_IND_LEN = 1;
	/**
	 * 	serialize this Ip0040TokenServiceInd
	 */
   protected void serializeIp0040TokenServiceInd(char[] ip0040TokenServiceInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040TokenServiceInd,0,getStringValue(),beginIp0040TokenServiceInd,IP_0040_TOKEN_SERVICE_IND_LEN);
       localIp0040TokenServiceIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040TokenServiceIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040TokenServiceInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040TokenServiceInd() {	 
   		return (substring(getStringValue(),beginIp0040TokenServiceInd,beginIp0040TokenServiceInd + IP_0040_TOKEN_SERVICE_IND_LEN));
   	}
     int localIp0040GbsBillIndCounter = -1;
     public boolean isIp0040GbsBillIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040GbsBillIndCounter != sharedCounter;
         localIp0040GbsBillIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_GBS_BILL_IND_LEN = 1;
	/**
	 * 	serialize this Ip0040GbsBillInd
	 */
   protected void serializeIp0040GbsBillInd(char[] ip0040GbsBillInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040GbsBillInd,0,getStringValue(),beginIp0040GbsBillInd,IP_0040_GBS_BILL_IND_LEN);
       localIp0040GbsBillIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040GbsBillIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040GbsBillInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040GbsBillInd() {	 
   		return (substring(getStringValue(),beginIp0040GbsBillInd,beginIp0040GbsBillInd + IP_0040_GBS_BILL_IND_LEN));
   	}
     int localIp0040InstallAuthSwCounter = -1;
     public boolean isIp0040InstallAuthSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040InstallAuthSwCounter != sharedCounter;
         localIp0040InstallAuthSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_INSTALL_AUTH_SW_LEN = 1;
	/**
	 * 	serialize this Ip0040InstallAuthSw
	 */
   protected void serializeIp0040InstallAuthSw(char[] ip0040InstallAuthSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040InstallAuthSw,0,getStringValue(),beginIp0040InstallAuthSw,IP_0040_INSTALL_AUTH_SW_LEN);
       localIp0040InstallAuthSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040InstallAuthSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040InstallAuthSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040InstallAuthSw() {	 
   		return (substring(getStringValue(),beginIp0040InstallAuthSw,beginIp0040InstallAuthSw + IP_0040_INSTALL_AUTH_SW_LEN));
   	}
     int localIp0040SeqServiceIndCounter = -1;
     public boolean isIp0040SeqServiceIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040SeqServiceIndCounter != sharedCounter;
         localIp0040SeqServiceIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_SEQ_SERVICE_IND_LEN = 1;
	/**
	 * 	serialize this Ip0040SeqServiceInd
	 */
   protected void serializeIp0040SeqServiceInd(char[] ip0040SeqServiceInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040SeqServiceInd,0,getStringValue(),beginIp0040SeqServiceInd,IP_0040_SEQ_SERVICE_IND_LEN);
       localIp0040SeqServiceIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040SeqServiceIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040SeqServiceInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040SeqServiceInd() {	 
   		return (substring(getStringValue(),beginIp0040SeqServiceInd,beginIp0040SeqServiceInd + IP_0040_SEQ_SERVICE_IND_LEN));
   	}
     int localIp0040CbfmParticipIndCounter = -1;
     public boolean isIp0040CbfmParticipIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040CbfmParticipIndCounter != sharedCounter;
         localIp0040CbfmParticipIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_CBFM_PARTICIP_IND_LEN = 1;
	/**
	 * 	serialize this Ip0040CbfmParticipInd
	 */
   protected void serializeIp0040CbfmParticipInd(char[] ip0040CbfmParticipInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040CbfmParticipInd,0,getStringValue(),beginIp0040CbfmParticipInd,IP_0040_CBFM_PARTICIP_IND_LEN);
       localIp0040CbfmParticipIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040CbfmParticipIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040CbfmParticipInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040CbfmParticipInd() {	 
   		return (substring(getStringValue(),beginIp0040CbfmParticipInd,beginIp0040CbfmParticipInd + IP_0040_CBFM_PARTICIP_IND_LEN));
   	}
     int localIp0040CbcmParticipIndCounter = -1;
     public boolean isIp0040CbcmParticipIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040CbcmParticipIndCounter != sharedCounter;
         localIp0040CbcmParticipIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_CBCM_PARTICIP_IND_LEN = 1;
	/**
	 * 	serialize this Ip0040CbcmParticipInd
	 */
   protected void serializeIp0040CbcmParticipInd(char[] ip0040CbcmParticipInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040CbcmParticipInd,0,getStringValue(),beginIp0040CbcmParticipInd,IP_0040_CBCM_PARTICIP_IND_LEN);
       localIp0040CbcmParticipIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040CbcmParticipIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040CbcmParticipInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040CbcmParticipInd() {	 
   		return (substring(getStringValue(),beginIp0040CbcmParticipInd,beginIp0040CbcmParticipInd + IP_0040_CBCM_PARTICIP_IND_LEN));
   	}
     int localIp0040CbfmDccSwCounter = -1;
     public boolean isIp0040CbfmDccSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040CbfmDccSwCounter != sharedCounter;
         localIp0040CbfmDccSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_CBFM_DCC_SW_LEN = 1;
	/**
	 * 	serialize this Ip0040CbfmDccSw
	 */
   protected void serializeIp0040CbfmDccSw(char[] ip0040CbfmDccSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040CbfmDccSw,0,getStringValue(),beginIp0040CbfmDccSw,IP_0040_CBFM_DCC_SW_LEN);
       localIp0040CbfmDccSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040CbfmDccSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040CbfmDccSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040CbfmDccSw() {	 
   		return (substring(getStringValue(),beginIp0040CbfmDccSw,beginIp0040CbfmDccSw + IP_0040_CBFM_DCC_SW_LEN));
   	}
     int localIp0040InstApiGcmsSwCounter = -1;
     public boolean isIp0040InstApiGcmsSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040InstApiGcmsSwCounter != sharedCounter;
         localIp0040InstApiGcmsSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_INST_API_GCMS_SW_LEN = 1;
	/**
	 * 	serialize this Ip0040InstApiGcmsSw
	 */
   protected void serializeIp0040InstApiGcmsSw(char[] ip0040InstApiGcmsSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040InstApiGcmsSw,0,getStringValue(),beginIp0040InstApiGcmsSw,IP_0040_INST_API_GCMS_SW_LEN);
       localIp0040InstApiGcmsSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040InstApiGcmsSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040InstApiGcmsSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040InstApiGcmsSw() {	 
   		return (substring(getStringValue(),beginIp0040InstApiGcmsSw,beginIp0040InstApiGcmsSw + IP_0040_INST_API_GCMS_SW_LEN));
   	}
     int localIp0040InsEnabApiIndCounter = -1;
     public boolean isIp0040InsEnabApiIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040InsEnabApiIndCounter != sharedCounter;
         localIp0040InsEnabApiIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_INS_ENAB_API_IND_LEN = 1;
	/**
	 * 	serialize this Ip0040InsEnabApiInd
	 */
   protected void serializeIp0040InsEnabApiInd(char[] ip0040InsEnabApiInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040InsEnabApiInd,0,getStringValue(),beginIp0040InsEnabApiInd,IP_0040_INS_ENAB_API_IND_LEN);
       localIp0040InsEnabApiIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040InsEnabApiIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040InsEnabApiInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040InsEnabApiInd() {	 
   		return (substring(getStringValue(),beginIp0040InsEnabApiInd,beginIp0040InsEnabApiInd + IP_0040_INS_ENAB_API_IND_LEN));
   	}
     int localIp0040InstApiUiSwCounter = -1;
     public boolean isIp0040InstApiUiSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040InstApiUiSwCounter != sharedCounter;
         localIp0040InstApiUiSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_INST_API_UI_SW_LEN = 1;
	/**
	 * 	serialize this Ip0040InstApiUiSw
	 */
   protected void serializeIp0040InstApiUiSw(char[] ip0040InstApiUiSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040InstApiUiSw,0,getStringValue(),beginIp0040InstApiUiSw,IP_0040_INST_API_UI_SW_LEN);
       localIp0040InstApiUiSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040InstApiUiSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040InstApiUiSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040InstApiUiSw() {	 
   		return (substring(getStringValue(),beginIp0040InstApiUiSw,beginIp0040InstApiUiSw + IP_0040_INST_API_UI_SW_LEN));
   	}
     int localIp0040MstrpassAchProgIndCounter = -1;
     public boolean isIp0040MstrpassAchProgIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040MstrpassAchProgIndCounter != sharedCounter;
         localIp0040MstrpassAchProgIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_MSTRPASS_ACH_PROG_IND_LEN = 1;
	/**
	 * 	serialize this Ip0040MstrpassAchProgInd
	 */
   protected void serializeIp0040MstrpassAchProgInd(char[] ip0040MstrpassAchProgInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040MstrpassAchProgInd,0,getStringValue(),beginIp0040MstrpassAchProgInd,IP_0040_MSTRPASS_ACH_PROG_IND_LEN);
       localIp0040MstrpassAchProgIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040MstrpassAchProgIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040MstrpassAchProgInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040MstrpassAchProgInd() {	 
   		return (substring(getStringValue(),beginIp0040MstrpassAchProgInd,beginIp0040MstrpassAchProgInd + IP_0040_MSTRPASS_ACH_PROG_IND_LEN));
   	}
     int localIp0040OboIndCounter = -1;
     public boolean isIp0040OboIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040OboIndCounter != sharedCounter;
         localIp0040OboIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_OBO_IND_LEN = 1;
	/**
	 * 	serialize this Ip0040OboInd
	 */
   protected void serializeIp0040OboInd(char[] ip0040OboInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040OboInd,0,getStringValue(),beginIp0040OboInd,IP_0040_OBO_IND_LEN);
       localIp0040OboIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040OboIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040OboInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040OboInd() {	 
   		return (substring(getStringValue(),beginIp0040OboInd,beginIp0040OboInd + IP_0040_OBO_IND_LEN));
   	}
     int localIp0040MultCurrSwCounter = -1;
     public boolean isIp0040MultCurrSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040MultCurrSwCounter != sharedCounter;
         localIp0040MultCurrSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_MULT_CURR_SW_LEN = 1;
	/**
	 * 	serialize this Ip0040MultCurrSw
	 */
   protected void serializeIp0040MultCurrSw(char[] ip0040MultCurrSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040MultCurrSw,0,getStringValue(),beginIp0040MultCurrSw,IP_0040_MULT_CURR_SW_LEN);
       localIp0040MultCurrSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040MultCurrSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040MultCurrSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040MultCurrSw() {	 
   		return (substring(getStringValue(),beginIp0040MultCurrSw,beginIp0040MultCurrSw + IP_0040_MULT_CURR_SW_LEN));
   	}
     int localIp0040AnonIndEffDateCounter = -1;
     public boolean isIp0040AnonIndEffDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040AnonIndEffDateCounter != sharedCounter;
         localIp0040AnonIndEffDateCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip0040AnonIndEffDate
	 *	@return ip0040AnonIndEffDate
	 */
	public char[]  getIp0040AnonIndEffDateString() {
	     return getCharArray(beginIp0040AnonIndEffDate,IP_0040_ANON_IND_EFF_DATE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip0040AnonIndEffDateIsNumeric() {
	    return isNumeric(beginIp0040AnonIndEffDate
	                    ,beginIp0040AnonIndEffDate + IP_0040_ANON_IND_EFF_DATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_0040_ANON_IND_EFF_DATE_LEN = 6;
  	/**
	 * serializeIp0040AnonIndEffDate
	 */
	protected void serializeIp0040AnonIndEffDate(long ip0040AnonIndEffDate) {
		 putNumber(beginIp0040AnonIndEffDate,ip0040AnonIndEffDate,IP_0040_ANON_IND_EFF_DATE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp0040AnonIndEffDateCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp0040AnonIndEffDate
	 */
   	protected  long serializeIp0040AnonIndEffDate(char[] value) {
	    long  ip0040AnonIndEffDate;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip0040AnonIndEffDate = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginIp0040AnonIndEffDate
		       ,6
		      );
		 localIp0040AnonIndEffDateCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip0040AnonIndEffDate;
    }

   protected long checkIp0040AnonIndEffDateMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp0040AnonIndEffDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp0040AnonIndEffDate() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp0040AnonIndEffDate
			                 ,IP_0040_ANON_IND_EFF_DATE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip0040AnonIndEffDate", beginIp0040AnonIndEffDate,IP_0040_ANON_IND_EFF_DATE_LEN);
    }
   	}




}
  
