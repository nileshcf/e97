package com.cloudframe.app.ms00d363.file.records.serialize;

/**
*  The class SwchControlField300010Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SwchControlField300010Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SwchControlField300010Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SWCH_CONTROL_FIELD_300010_LENGTH = 106;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSwchPaymentPartyId300010;
	
	/**
	* Constructor for SwchControlField300010Serialized
	**/
    public SwchControlField300010Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SwchControlField300010Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SwchControlField300010Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SwchControlField300010Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this SwchControlField300010Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in SwchControlField300010Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SWCH_CONTROL_FIELD_300010_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSwchPaymentPartyId300010 = getStartOffset() + 21;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSwchPaymentPartyId300010Counter = -1;
     public boolean isSwchPaymentPartyId300010Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSwchPaymentPartyId300010Counter != sharedCounter;
         localSwchPaymentPartyId300010Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of swchPaymentPartyId300010
	 *	@return swchPaymentPartyId300010
	 */
	public char[]  getSwchPaymentPartyId300010String() {
	     return getCharArray(beginSwchPaymentPartyId300010,SWCH_PAYMENT_PARTY_ID_300010_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean swchPaymentPartyId300010IsNumeric() {
	    return isNumeric(beginSwchPaymentPartyId300010
	                    ,beginSwchPaymentPartyId300010 + SWCH_PAYMENT_PARTY_ID_300010_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SWCH_PAYMENT_PARTY_ID_300010_LEN = 11;
  	/**
	 * serializeSwchPaymentPartyId300010
	 */
	protected void serializeSwchPaymentPartyId300010(long swchPaymentPartyId300010) {
		 putNumber(beginSwchPaymentPartyId300010,swchPaymentPartyId300010,SWCH_PAYMENT_PARTY_ID_300010_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSwchPaymentPartyId300010Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSwchPaymentPartyId300010
	 */
   	protected  long serializeSwchPaymentPartyId300010(char[] value) {
	    long  swchPaymentPartyId300010;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    swchPaymentPartyId300010 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,false/*isSigned?*/)
		       ,beginSwchPaymentPartyId300010
		       ,11
		      );
		 localSwchPaymentPartyId300010Counter = shareString.getSerializedField().getModifiedCounter();
		return  swchPaymentPartyId300010;
    }

   protected long checkSwchPaymentPartyId300010MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSwchPaymentPartyId300010 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSwchPaymentPartyId300010() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSwchPaymentPartyId300010
			                 ,SWCH_PAYMENT_PARTY_ID_300010_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("swchPaymentPartyId300010", beginSwchPaymentPartyId300010,SWCH_PAYMENT_PARTY_ID_300010_LEN);
    }
   	}




}
  
