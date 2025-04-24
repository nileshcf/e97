package com.cloudframe.app.init1.dto.serialize;

/**
*  The class CmnDateConvInputFormatsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnDateConvInputFormatsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnDateConvInputFormatsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_DATE_CONV_INPUT_FORMATS_LENGTH = 17;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCmnDateJulianIn;
	
	/**
	* Constructor for CmnDateConvInputFormatsSerialized
	**/
    public CmnDateConvInputFormatsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnDateConvInputFormatsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateConvInputFormatsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnDateConvInputFormatsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1025); // serialize this field at offset 1025 by default 
    }
    
	/**
	* sets parent for this CmnDateConvInputFormatsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1025 by default
    }    
	/**
	* initializes the field in CmnDateConvInputFormatsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_DATE_CONV_INPUT_FORMATS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginCmnDateJulianIn = getStartOffset() + 10;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCmnDateJulianInCounter = -1;
     public boolean isCmnDateJulianInModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateJulianInCounter != sharedCounter;
         localCmnDateJulianInCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cmnDateJulianIn
	 *	@return cmnDateJulianIn
	 */
	public char[]  getCmnDateJulianInString() {
	     return getCharArray(beginCmnDateJulianIn,CMN_DATE_JULIAN_IN_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cmnDateJulianInIsNumeric() {
	    return isNumeric(beginCmnDateJulianIn
	                    ,beginCmnDateJulianIn + CMN_DATE_JULIAN_IN_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CMN_DATE_JULIAN_IN_LEN = 7;
  	/**
	 * serializeCmnDateJulianIn
	 */
	protected void serializeCmnDateJulianIn(long cmnDateJulianIn) {
		 putNumber(beginCmnDateJulianIn,cmnDateJulianIn,CMN_DATE_JULIAN_IN_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCmnDateJulianInCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCmnDateJulianIn
	 */
   	protected  long serializeCmnDateJulianIn(char[] value) {
	    long  cmnDateJulianIn;
	    if(value.length >0 && value.length!= 7)
            value = new String(value).trim().toCharArray();
	    if (value.length < 7) value = pad(7, value, ' ', LEFT_PAD);
	    else if (value.length > 7) value = substring(value,0,7);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cmnDateJulianIn = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(7,value,false/*isSigned?*/)
		       ,beginCmnDateJulianIn
		       ,7
		      );
		 localCmnDateJulianInCounter = shareString.getSerializedField().getModifiedCounter();
		return  cmnDateJulianIn;
    }

   protected long checkCmnDateJulianInMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCmnDateJulianIn is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshCmnDateJulianIn() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginCmnDateJulianIn
			                 ,CMN_DATE_JULIAN_IN_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cmnDateJulianIn", beginCmnDateJulianIn,CMN_DATE_JULIAN_IN_LEN);
    }
   	}




}
  
