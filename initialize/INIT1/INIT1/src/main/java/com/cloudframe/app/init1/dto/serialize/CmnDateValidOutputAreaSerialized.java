package com.cloudframe.app.init1.dto.serialize;

/**
*  The class CmnDateValidOutputAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:53. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnDateValidOutputAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnDateValidOutputAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_DATE_VALID_OUTPUT_AREA_LENGTH = 9;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCmnDateValidReturnCode;
            protected  int beginCmnDateValid;
	
	/**
	* Constructor for CmnDateValidOutputAreaSerialized
	**/
    public CmnDateValidOutputAreaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnDateValidOutputAreaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateValidOutputAreaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnDateValidOutputAreaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1034); // serialize this field at offset 1034 by default 
    }
    
	/**
	* sets parent for this CmnDateValidOutputAreaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1034 by default
    }    
	/**
	* initializes the field in CmnDateValidOutputAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_DATE_VALID_OUTPUT_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCmnDateValidReturnCode = getStartOffset() + 0;	// set offset for serialization
  
             beginCmnDateValid = getStartOffset() + 1;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localCmnDateValidReturnCodeCounter = -1;
     public boolean isCmnDateValidReturnCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateValidReturnCodeCounter != sharedCounter;
         localCmnDateValidReturnCodeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cmnDateValidReturnCode
	 *	@return cmnDateValidReturnCode
	 */
	public char[]  getCmnDateValidReturnCodeString() {
	     return getCharArray(beginCmnDateValidReturnCode,CMN_DATE_VALID_RETURN_CODE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cmnDateValidReturnCodeIsNumeric() {
	    return isNumeric(beginCmnDateValidReturnCode
	                    ,beginCmnDateValidReturnCode + CMN_DATE_VALID_RETURN_CODE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CMN_DATE_VALID_RETURN_CODE_LEN = 1;
  	/**
	 * serializeCmnDateValidReturnCode
	 */
	protected void serializeCmnDateValidReturnCode(int cmnDateValidReturnCode) {
		 putNumber(beginCmnDateValidReturnCode,cmnDateValidReturnCode,CMN_DATE_VALID_RETURN_CODE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCmnDateValidReturnCodeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCmnDateValidReturnCode
	 */
   	protected  int serializeCmnDateValidReturnCode(char[] value) {
	    int  cmnDateValidReturnCode;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cmnDateValidReturnCode = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginCmnDateValidReturnCode
		       ,1
		      );
		 localCmnDateValidReturnCodeCounter = shareString.getSerializedField().getModifiedCounter();
		return  cmnDateValidReturnCode;
    }

   protected int checkCmnDateValidReturnCodeMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCmnDateValidReturnCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCmnDateValidReturnCode() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCmnDateValidReturnCode
			                 ,CMN_DATE_VALID_RETURN_CODE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cmnDateValidReturnCode", beginCmnDateValidReturnCode,CMN_DATE_VALID_RETURN_CODE_LEN);
    }
   	}
     int localCmnDateValidCounter = -1;
     public boolean isCmnDateValidModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateValidCounter != sharedCounter;
         localCmnDateValidCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cmnDateValid
	 *	@return cmnDateValid
	 */
	public char[]  getCmnDateValidString() {
	     return getCharArray(beginCmnDateValid,CMN_DATE_VALID_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cmnDateValidIsNumeric() {
	    return isNumeric(beginCmnDateValid
	                    ,beginCmnDateValid + CMN_DATE_VALID_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CMN_DATE_VALID_LEN = 8;
  	/**
	 * serializeCmnDateValid
	 */
	protected void serializeCmnDateValid(long cmnDateValid) {
		 putNumber(beginCmnDateValid,cmnDateValid,CMN_DATE_VALID_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCmnDateValidCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCmnDateValid
	 */
   	protected  long serializeCmnDateValid(char[] value) {
	    long  cmnDateValid;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cmnDateValid = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginCmnDateValid
		       ,8
		      );
		 localCmnDateValidCounter = shareString.getSerializedField().getModifiedCounter();
		return  cmnDateValid;
    }

   protected long checkCmnDateValidMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCmnDateValid is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshCmnDateValid() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginCmnDateValid
			                 ,CMN_DATE_VALID_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cmnDateValid", beginCmnDateValid,CMN_DATE_VALID_LEN);
    }
   	}




}
  
