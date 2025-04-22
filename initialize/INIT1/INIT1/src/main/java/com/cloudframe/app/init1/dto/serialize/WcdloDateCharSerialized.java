package com.cloudframe.app.init1.dto.serialize;

/**
*  The class WcdloDateCharSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:05. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WcdloDateCharSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WcdloDateCharSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WCDLO_DATE_CHAR_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWcdloDateNumeric;
	
	/**
	* Constructor for WcdloDateCharSerialized
	**/
    public WcdloDateCharSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WcdloDateCharSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcdloDateCharSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WcdloDateCharSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,30); // serialize this field at offset 30 by default 
    }
    
	/**
	* sets parent for this WcdloDateCharSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 30 by default
    }    
	/**
	* initializes the field in WcdloDateCharSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WCDLO_DATE_CHAR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWcdloDateNumeric = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWcdloDateNumericCounter = -1;
     public boolean isWcdloDateNumericModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWcdloDateNumericCounter != sharedCounter;
         localWcdloDateNumericCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wcdloDateNumeric
	 *	@return wcdloDateNumeric
	 */
	public char[]  getWcdloDateNumericString() {
	     return getCharArray(beginWcdloDateNumeric,WCDLO_DATE_NUMERIC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wcdloDateNumericIsNumeric() {
	    return isNumeric(beginWcdloDateNumeric
	                    ,beginWcdloDateNumeric + WCDLO_DATE_NUMERIC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WCDLO_DATE_NUMERIC_LEN = 8;
  	/**
	 * serializeWcdloDateNumeric
	 */
	protected void serializeWcdloDateNumeric(long wcdloDateNumeric) {
		 putNumber(beginWcdloDateNumeric,wcdloDateNumeric,WCDLO_DATE_NUMERIC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWcdloDateNumericCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWcdloDateNumeric
	 */
   	protected  long serializeWcdloDateNumeric(char[] value) {
	    long  wcdloDateNumeric;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wcdloDateNumeric = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginWcdloDateNumeric
		       ,8
		      );
		 localWcdloDateNumericCounter = shareString.getSerializedField().getModifiedCounter();
		return  wcdloDateNumeric;
    }

   protected long checkWcdloDateNumericMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWcdloDateNumeric is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshWcdloDateNumeric() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginWcdloDateNumeric
			                 ,WCDLO_DATE_NUMERIC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wcdloDateNumeric", beginWcdloDateNumeric,WCDLO_DATE_NUMERIC_LEN);
    }
   	}




}
  
