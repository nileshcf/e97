package com.cloudframe.app.ip989010.dto.serialize;

/**
*  The class DisplayData501Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:40. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DisplayData501Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DisplayData501Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DISPLAY_DATA_501_LENGTH = 64;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPanAlias501;
            protected  int beginDonationLimit501;
            protected  int beginCalcDonationAmt501;
            protected  int beginBuiltDonationAmt501;
	
	/**
	* Constructor for DisplayData501Serialized
	**/
    public DisplayData501Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for DisplayData501Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DisplayData501Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this DisplayData501Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this DisplayData501Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in DisplayData501Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DISPLAY_DATA_501_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginPanAlias501 = getStartOffset() + 0;	// set offset for serialization
  
             beginDonationLimit501 = getStartOffset() + 36;	// set offset for serialization
  
             beginCalcDonationAmt501 = getStartOffset() + 44;	// set offset for serialization
  
             beginBuiltDonationAmt501 = getStartOffset() + 52;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localPanAlias501Counter = -1;
     public boolean isPanAlias501Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPanAlias501Counter != sharedCounter;
         localPanAlias501Counter = sharedCounter; return hasModified;
     }
	protected static final int PAN_ALIAS_501_LEN = 36;
	/**
	 * 	serialize this PanAlias501
	 */
   protected void serializePanAlias501(char[] panAlias501) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(panAlias501,0,getStringValue(),beginPanAlias501,PAN_ALIAS_501_LEN);
       localPanAlias501Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPanAlias501Constraints(char[] value) {
   			return super.checkConstraints(value , 36 ,false, false);
   }
    /**
	 *	refreshPanAlias501 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPanAlias501() {	 
   		return (substring(getStringValue(),beginPanAlias501,beginPanAlias501 + PAN_ALIAS_501_LEN));
   	}
     int localDonationLimit501Counter = -1;
     public boolean isDonationLimit501Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDonationLimit501Counter != sharedCounter;
         localDonationLimit501Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of donationLimit501
	 *	@return donationLimit501
	 */
	public char[]  getDonationLimit501String() {
	     return getCharArray(beginDonationLimit501,DONATION_LIMIT_501_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean donationLimit501IsNumeric() {
	    return isNumeric(beginDonationLimit501
	                    ,beginDonationLimit501 + DONATION_LIMIT_501_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DONATION_LIMIT_501_LEN = 8;
  	/**
	 * serializeDonationLimit501
	 */
	protected void serializeDonationLimit501(long donationLimit501) {
		 putNumber(beginDonationLimit501,donationLimit501,DONATION_LIMIT_501_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDonationLimit501Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDonationLimit501
	 */
   	protected  long serializeDonationLimit501(char[] value) {
	    long  donationLimit501;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    donationLimit501 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginDonationLimit501
		       ,8
		      );
		 localDonationLimit501Counter = shareString.getSerializedField().getModifiedCounter();
		return  donationLimit501;
    }

   protected long checkDonationLimit501MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDonationLimit501 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDonationLimit501() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginDonationLimit501
			                 ,DONATION_LIMIT_501_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("donationLimit501", beginDonationLimit501,DONATION_LIMIT_501_LEN);
    }
   	}
     int localCalcDonationAmt501Counter = -1;
     public boolean isCalcDonationAmt501Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCalcDonationAmt501Counter != sharedCounter;
         localCalcDonationAmt501Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of calcDonationAmt501
	 *	@return calcDonationAmt501
	 */
	public char[]  getCalcDonationAmt501String() {
	     return getCharArray(beginCalcDonationAmt501,CALC_DONATION_AMT_501_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean calcDonationAmt501IsNumeric() {
	    return isNumeric(beginCalcDonationAmt501
	                    ,beginCalcDonationAmt501 + CALC_DONATION_AMT_501_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CALC_DONATION_AMT_501_LEN = 8;
  	/**
	 * serializeCalcDonationAmt501
	 */
	protected void serializeCalcDonationAmt501(long calcDonationAmt501) {
		 putNumber(beginCalcDonationAmt501,calcDonationAmt501,CALC_DONATION_AMT_501_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCalcDonationAmt501Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCalcDonationAmt501
	 */
   	protected  long serializeCalcDonationAmt501(char[] value) {
	    long  calcDonationAmt501;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    calcDonationAmt501 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginCalcDonationAmt501
		       ,8
		      );
		 localCalcDonationAmt501Counter = shareString.getSerializedField().getModifiedCounter();
		return  calcDonationAmt501;
    }

   protected long checkCalcDonationAmt501MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCalcDonationAmt501 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshCalcDonationAmt501() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginCalcDonationAmt501
			                 ,CALC_DONATION_AMT_501_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("calcDonationAmt501", beginCalcDonationAmt501,CALC_DONATION_AMT_501_LEN);
    }
   	}
     int localBuiltDonationAmt501Counter = -1;
     public boolean isBuiltDonationAmt501Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBuiltDonationAmt501Counter != sharedCounter;
         localBuiltDonationAmt501Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of builtDonationAmt501
	 *	@return builtDonationAmt501
	 */
	public char[]  getBuiltDonationAmt501String() {
	     return getCharArray(beginBuiltDonationAmt501,BUILT_DONATION_AMT_501_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean builtDonationAmt501IsNumeric() {
	    return isNumeric(beginBuiltDonationAmt501
	                    ,beginBuiltDonationAmt501 + BUILT_DONATION_AMT_501_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BUILT_DONATION_AMT_501_LEN = 12;
  	/**
	 * serializeBuiltDonationAmt501
	 */
	protected void serializeBuiltDonationAmt501(long builtDonationAmt501) {
		 putNumber(beginBuiltDonationAmt501,builtDonationAmt501,BUILT_DONATION_AMT_501_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBuiltDonationAmt501Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBuiltDonationAmt501
	 */
   	protected  long serializeBuiltDonationAmt501(char[] value) {
	    long  builtDonationAmt501;
	    if(value.length >0 && value.length!= 12)
            value = new String(value).trim().toCharArray();
	    if (value.length < 12) value = pad(12, value, ' ', LEFT_PAD);
	    else if (value.length > 12) value = substring(value,0,12);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    builtDonationAmt501 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginBuiltDonationAmt501
		       ,12
		      );
		 localBuiltDonationAmt501Counter = shareString.getSerializedField().getModifiedCounter();
		return  builtDonationAmt501;
    }

   protected long checkBuiltDonationAmt501MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1T/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBuiltDonationAmt501 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshBuiltDonationAmt501() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginBuiltDonationAmt501
			                 ,BUILT_DONATION_AMT_501_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("builtDonationAmt501", beginBuiltDonationAmt501,BUILT_DONATION_AMT_501_LEN);
    }
   	}




}
  
