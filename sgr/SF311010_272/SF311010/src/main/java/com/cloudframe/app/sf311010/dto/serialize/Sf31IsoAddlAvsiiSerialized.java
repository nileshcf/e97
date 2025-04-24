package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class Sf31IsoAddlAvsiiSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sf31IsoAddlAvsiiSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sf31IsoAddlAvsiiSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SF_31_ISO_ADDL_AVSII_LENGTH = 175;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSf31IsoAvs2Ship2Name;
            protected  int beginSf31IsoAvs2Ship2CoName;
            protected  int beginSf31IsoAvs2Ship2Add1;
            protected  int beginSf31IsoAvs2Ship2Add2;
            protected  int beginSf31IsoAvs2Ship2City;
            protected  int beginSf31IsoAvs2Ship2State;
            protected  int beginSf31IsoAvs2Ship2Postal;
            protected  int beginSf31IsoAvs2Ship2Country;
            protected  int beginSf31IsoAvs2CurrencyCode;
            protected  int beginSf31IsoAvs2RespCode;
            protected  int beginSf31IsoAvs2PhoneNum;
            protected  int beginSf31IsoAvs2FraudAlert;
            protected  int beginSf31IsoAvs2RushOrder;
	
	/**
	* Constructor for Sf31IsoAddlAvsiiSerialized
	**/
    public Sf31IsoAddlAvsiiSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sf31IsoAddlAvsiiSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf31IsoAddlAvsiiSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sf31IsoAddlAvsiiSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,349); // serialize this field at offset 349 by default 
    }
    
	/**
	* sets parent for this Sf31IsoAddlAvsiiSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 349 by default
    }    
	/**
	* initializes the field in Sf31IsoAddlAvsiiSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SF_31_ISO_ADDL_AVSII_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSf31IsoAvs2Ship2Name = getStartOffset() + 0;	// set offset for serialization
  
             beginSf31IsoAvs2Ship2CoName = getStartOffset() + 27;	// set offset for serialization
  
             beginSf31IsoAvs2Ship2Add1 = getStartOffset() + 54;	// set offset for serialization
  
             beginSf31IsoAvs2Ship2Add2 = getStartOffset() + 86;	// set offset for serialization
  
             beginSf31IsoAvs2Ship2City = getStartOffset() + 118;	// set offset for serialization
  
             beginSf31IsoAvs2Ship2State = getStartOffset() + 133;	// set offset for serialization
  
             beginSf31IsoAvs2Ship2Postal = getStartOffset() + 135;	// set offset for serialization
  
             beginSf31IsoAvs2Ship2Country = getStartOffset() + 144;	// set offset for serialization
  
             beginSf31IsoAvs2CurrencyCode = getStartOffset() + 147;	// set offset for serialization
  
             beginSf31IsoAvs2RespCode = getStartOffset() + 150;	// set offset for serialization
  
             beginSf31IsoAvs2PhoneNum = getStartOffset() + 152;	// set offset for serialization
  
             beginSf31IsoAvs2FraudAlert = getStartOffset() + 162;	// set offset for serialization
  
             beginSf31IsoAvs2RushOrder = getStartOffset() + 163;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localSf31IsoAvs2Ship2NameCounter = -1;
     public boolean isSf31IsoAvs2Ship2NameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoAvs2Ship2NameCounter != sharedCounter;
         localSf31IsoAvs2Ship2NameCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_AVS_2_SHIP_2_NAME_LEN = 27;
	/**
	 * 	serialize this Sf31IsoAvs2Ship2Name
	 */
   protected void serializeSf31IsoAvs2Ship2Name(char[] sf31IsoAvs2Ship2Name) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoAvs2Ship2Name,0,getStringValue(),beginSf31IsoAvs2Ship2Name,SF_31_ISO_AVS_2_SHIP_2_NAME_LEN);
       localSf31IsoAvs2Ship2NameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoAvs2Ship2NameConstraints(char[] value) {
   			return super.checkConstraints(value , 27 ,false, false);
   }
    /**
	 *	refreshSf31IsoAvs2Ship2Name is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoAvs2Ship2Name() {	 
   		return (substring(getStringValue(),beginSf31IsoAvs2Ship2Name,beginSf31IsoAvs2Ship2Name + SF_31_ISO_AVS_2_SHIP_2_NAME_LEN));
   	}
     int localSf31IsoAvs2Ship2CoNameCounter = -1;
     public boolean isSf31IsoAvs2Ship2CoNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoAvs2Ship2CoNameCounter != sharedCounter;
         localSf31IsoAvs2Ship2CoNameCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_AVS_2_SHIP_2_CO_NAME_LEN = 27;
	/**
	 * 	serialize this Sf31IsoAvs2Ship2CoName
	 */
   protected void serializeSf31IsoAvs2Ship2CoName(char[] sf31IsoAvs2Ship2CoName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoAvs2Ship2CoName,0,getStringValue(),beginSf31IsoAvs2Ship2CoName,SF_31_ISO_AVS_2_SHIP_2_CO_NAME_LEN);
       localSf31IsoAvs2Ship2CoNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoAvs2Ship2CoNameConstraints(char[] value) {
   			return super.checkConstraints(value , 27 ,false, false);
   }
    /**
	 *	refreshSf31IsoAvs2Ship2CoName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoAvs2Ship2CoName() {	 
   		return (substring(getStringValue(),beginSf31IsoAvs2Ship2CoName,beginSf31IsoAvs2Ship2CoName + SF_31_ISO_AVS_2_SHIP_2_CO_NAME_LEN));
   	}
     int localSf31IsoAvs2Ship2Add1Counter = -1;
     public boolean isSf31IsoAvs2Ship2Add1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoAvs2Ship2Add1Counter != sharedCounter;
         localSf31IsoAvs2Ship2Add1Counter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_AVS_2_SHIP_2_ADD_1_LEN = 32;
	/**
	 * 	serialize this Sf31IsoAvs2Ship2Add1
	 */
   protected void serializeSf31IsoAvs2Ship2Add1(char[] sf31IsoAvs2Ship2Add1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoAvs2Ship2Add1,0,getStringValue(),beginSf31IsoAvs2Ship2Add1,SF_31_ISO_AVS_2_SHIP_2_ADD_1_LEN);
       localSf31IsoAvs2Ship2Add1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoAvs2Ship2Add1Constraints(char[] value) {
   			return super.checkConstraints(value , 32 ,false, false);
   }
    /**
	 *	refreshSf31IsoAvs2Ship2Add1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoAvs2Ship2Add1() {	 
   		return (substring(getStringValue(),beginSf31IsoAvs2Ship2Add1,beginSf31IsoAvs2Ship2Add1 + SF_31_ISO_AVS_2_SHIP_2_ADD_1_LEN));
   	}
     int localSf31IsoAvs2Ship2Add2Counter = -1;
     public boolean isSf31IsoAvs2Ship2Add2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoAvs2Ship2Add2Counter != sharedCounter;
         localSf31IsoAvs2Ship2Add2Counter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_AVS_2_SHIP_2_ADD_2_LEN = 32;
	/**
	 * 	serialize this Sf31IsoAvs2Ship2Add2
	 */
   protected void serializeSf31IsoAvs2Ship2Add2(char[] sf31IsoAvs2Ship2Add2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoAvs2Ship2Add2,0,getStringValue(),beginSf31IsoAvs2Ship2Add2,SF_31_ISO_AVS_2_SHIP_2_ADD_2_LEN);
       localSf31IsoAvs2Ship2Add2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoAvs2Ship2Add2Constraints(char[] value) {
   			return super.checkConstraints(value , 32 ,false, false);
   }
    /**
	 *	refreshSf31IsoAvs2Ship2Add2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoAvs2Ship2Add2() {	 
   		return (substring(getStringValue(),beginSf31IsoAvs2Ship2Add2,beginSf31IsoAvs2Ship2Add2 + SF_31_ISO_AVS_2_SHIP_2_ADD_2_LEN));
   	}
     int localSf31IsoAvs2Ship2CityCounter = -1;
     public boolean isSf31IsoAvs2Ship2CityModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoAvs2Ship2CityCounter != sharedCounter;
         localSf31IsoAvs2Ship2CityCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_AVS_2_SHIP_2_CITY_LEN = 15;
	/**
	 * 	serialize this Sf31IsoAvs2Ship2City
	 */
   protected void serializeSf31IsoAvs2Ship2City(char[] sf31IsoAvs2Ship2City) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoAvs2Ship2City,0,getStringValue(),beginSf31IsoAvs2Ship2City,SF_31_ISO_AVS_2_SHIP_2_CITY_LEN);
       localSf31IsoAvs2Ship2CityCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoAvs2Ship2CityConstraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshSf31IsoAvs2Ship2City is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoAvs2Ship2City() {	 
   		return (substring(getStringValue(),beginSf31IsoAvs2Ship2City,beginSf31IsoAvs2Ship2City + SF_31_ISO_AVS_2_SHIP_2_CITY_LEN));
   	}
     int localSf31IsoAvs2Ship2StateCounter = -1;
     public boolean isSf31IsoAvs2Ship2StateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoAvs2Ship2StateCounter != sharedCounter;
         localSf31IsoAvs2Ship2StateCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_AVS_2_SHIP_2_STATE_LEN = 2;
	/**
	 * 	serialize this Sf31IsoAvs2Ship2State
	 */
   protected void serializeSf31IsoAvs2Ship2State(char[] sf31IsoAvs2Ship2State) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoAvs2Ship2State,0,getStringValue(),beginSf31IsoAvs2Ship2State,SF_31_ISO_AVS_2_SHIP_2_STATE_LEN);
       localSf31IsoAvs2Ship2StateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoAvs2Ship2StateConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSf31IsoAvs2Ship2State is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoAvs2Ship2State() {	 
   		return (substring(getStringValue(),beginSf31IsoAvs2Ship2State,beginSf31IsoAvs2Ship2State + SF_31_ISO_AVS_2_SHIP_2_STATE_LEN));
   	}
     int localSf31IsoAvs2Ship2PostalCounter = -1;
     public boolean isSf31IsoAvs2Ship2PostalModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoAvs2Ship2PostalCounter != sharedCounter;
         localSf31IsoAvs2Ship2PostalCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_AVS_2_SHIP_2_POSTAL_LEN = 9;
	/**
	 * 	serialize this Sf31IsoAvs2Ship2Postal
	 */
   protected void serializeSf31IsoAvs2Ship2Postal(char[] sf31IsoAvs2Ship2Postal) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoAvs2Ship2Postal,0,getStringValue(),beginSf31IsoAvs2Ship2Postal,SF_31_ISO_AVS_2_SHIP_2_POSTAL_LEN);
       localSf31IsoAvs2Ship2PostalCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoAvs2Ship2PostalConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshSf31IsoAvs2Ship2Postal is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoAvs2Ship2Postal() {	 
   		return (substring(getStringValue(),beginSf31IsoAvs2Ship2Postal,beginSf31IsoAvs2Ship2Postal + SF_31_ISO_AVS_2_SHIP_2_POSTAL_LEN));
   	}
     int localSf31IsoAvs2Ship2CountryCounter = -1;
     public boolean isSf31IsoAvs2Ship2CountryModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoAvs2Ship2CountryCounter != sharedCounter;
         localSf31IsoAvs2Ship2CountryCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_AVS_2_SHIP_2_COUNTRY_LEN = 3;
	/**
	 * 	serialize this Sf31IsoAvs2Ship2Country
	 */
   protected void serializeSf31IsoAvs2Ship2Country(char[] sf31IsoAvs2Ship2Country) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoAvs2Ship2Country,0,getStringValue(),beginSf31IsoAvs2Ship2Country,SF_31_ISO_AVS_2_SHIP_2_COUNTRY_LEN);
       localSf31IsoAvs2Ship2CountryCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoAvs2Ship2CountryConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshSf31IsoAvs2Ship2Country is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoAvs2Ship2Country() {	 
   		return (substring(getStringValue(),beginSf31IsoAvs2Ship2Country,beginSf31IsoAvs2Ship2Country + SF_31_ISO_AVS_2_SHIP_2_COUNTRY_LEN));
   	}
     int localSf31IsoAvs2CurrencyCodeCounter = -1;
     public boolean isSf31IsoAvs2CurrencyCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoAvs2CurrencyCodeCounter != sharedCounter;
         localSf31IsoAvs2CurrencyCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_AVS_2_CURRENCY_CODE_LEN = 3;
	/**
	 * 	serialize this Sf31IsoAvs2CurrencyCode
	 */
   protected void serializeSf31IsoAvs2CurrencyCode(char[] sf31IsoAvs2CurrencyCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoAvs2CurrencyCode,0,getStringValue(),beginSf31IsoAvs2CurrencyCode,SF_31_ISO_AVS_2_CURRENCY_CODE_LEN);
       localSf31IsoAvs2CurrencyCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoAvs2CurrencyCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshSf31IsoAvs2CurrencyCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoAvs2CurrencyCode() {	 
   		return (substring(getStringValue(),beginSf31IsoAvs2CurrencyCode,beginSf31IsoAvs2CurrencyCode + SF_31_ISO_AVS_2_CURRENCY_CODE_LEN));
   	}
     int localSf31IsoAvs2RespCodeCounter = -1;
     public boolean isSf31IsoAvs2RespCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoAvs2RespCodeCounter != sharedCounter;
         localSf31IsoAvs2RespCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_AVS_2_RESP_CODE_LEN = 2;
	/**
	 * 	serialize this Sf31IsoAvs2RespCode
	 */
   protected void serializeSf31IsoAvs2RespCode(char[] sf31IsoAvs2RespCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoAvs2RespCode,0,getStringValue(),beginSf31IsoAvs2RespCode,SF_31_ISO_AVS_2_RESP_CODE_LEN);
       localSf31IsoAvs2RespCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoAvs2RespCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSf31IsoAvs2RespCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoAvs2RespCode() {	 
   		return (substring(getStringValue(),beginSf31IsoAvs2RespCode,beginSf31IsoAvs2RespCode + SF_31_ISO_AVS_2_RESP_CODE_LEN));
   	}
     int localSf31IsoAvs2PhoneNumCounter = -1;
     public boolean isSf31IsoAvs2PhoneNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoAvs2PhoneNumCounter != sharedCounter;
         localSf31IsoAvs2PhoneNumCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_AVS_2_PHONE_NUM_LEN = 10;
	/**
	 * 	serialize this Sf31IsoAvs2PhoneNum
	 */
   protected void serializeSf31IsoAvs2PhoneNum(char[] sf31IsoAvs2PhoneNum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoAvs2PhoneNum,0,getStringValue(),beginSf31IsoAvs2PhoneNum,SF_31_ISO_AVS_2_PHONE_NUM_LEN);
       localSf31IsoAvs2PhoneNumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoAvs2PhoneNumConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshSf31IsoAvs2PhoneNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoAvs2PhoneNum() {	 
   		return (substring(getStringValue(),beginSf31IsoAvs2PhoneNum,beginSf31IsoAvs2PhoneNum + SF_31_ISO_AVS_2_PHONE_NUM_LEN));
   	}
     int localSf31IsoAvs2FraudAlertCounter = -1;
     public boolean isSf31IsoAvs2FraudAlertModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoAvs2FraudAlertCounter != sharedCounter;
         localSf31IsoAvs2FraudAlertCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_AVS_2_FRAUD_ALERT_LEN = 1;
	/**
	 * 	serialize this Sf31IsoAvs2FraudAlert
	 */
   protected void serializeSf31IsoAvs2FraudAlert(char[] sf31IsoAvs2FraudAlert) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoAvs2FraudAlert,0,getStringValue(),beginSf31IsoAvs2FraudAlert,SF_31_ISO_AVS_2_FRAUD_ALERT_LEN);
       localSf31IsoAvs2FraudAlertCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoAvs2FraudAlertConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSf31IsoAvs2FraudAlert is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoAvs2FraudAlert() {	 
   		return (substring(getStringValue(),beginSf31IsoAvs2FraudAlert,beginSf31IsoAvs2FraudAlert + SF_31_ISO_AVS_2_FRAUD_ALERT_LEN));
   	}
     int localSf31IsoAvs2RushOrderCounter = -1;
     public boolean isSf31IsoAvs2RushOrderModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf31IsoAvs2RushOrderCounter != sharedCounter;
         localSf31IsoAvs2RushOrderCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_31_ISO_AVS_2_RUSH_ORDER_LEN = 1;
	/**
	 * 	serialize this Sf31IsoAvs2RushOrder
	 */
   protected void serializeSf31IsoAvs2RushOrder(char[] sf31IsoAvs2RushOrder) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf31IsoAvs2RushOrder,0,getStringValue(),beginSf31IsoAvs2RushOrder,SF_31_ISO_AVS_2_RUSH_ORDER_LEN);
       localSf31IsoAvs2RushOrderCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf31IsoAvs2RushOrderConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSf31IsoAvs2RushOrder is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf31IsoAvs2RushOrder() {	 
   		return (substring(getStringValue(),beginSf31IsoAvs2RushOrder,beginSf31IsoAvs2RushOrder + SF_31_ISO_AVS_2_RUSH_ORDER_LEN));
   	}




}
  
