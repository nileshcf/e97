package com.cloudframe.app.init1.dto.serialize;

/**
*  The class CmnTimeValidateOutputAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:53. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnTimeValidateOutputAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnTimeValidateOutputAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_TIME_VALIDATE_OUTPUT_AREA_LENGTH = 15;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCmnTimeValidReturnCode;
            protected  int beginCmnTimeValidIso;
            protected  int beginCmnTimeValidNumeric;
	
	/**
	* Constructor for CmnTimeValidateOutputAreaSerialized
	**/
    public CmnTimeValidateOutputAreaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnTimeValidateOutputAreaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnTimeValidateOutputAreaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnTimeValidateOutputAreaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1032); // serialize this field at offset 1032 by default 
    }
    
	/**
	* sets parent for this CmnTimeValidateOutputAreaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1032 by default
    }    
	/**
	* initializes the field in CmnTimeValidateOutputAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_TIME_VALIDATE_OUTPUT_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCmnTimeValidReturnCode = getStartOffset() + 0;	// set offset for serialization
  
             beginCmnTimeValidIso = getStartOffset() + 1;	// set offset for serialization
  
             beginCmnTimeValidNumeric = getStartOffset() + 9;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCmnTimeValidReturnCodeCounter = -1;
     public boolean isCmnTimeValidReturnCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnTimeValidReturnCodeCounter != sharedCounter;
         localCmnTimeValidReturnCodeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cmnTimeValidReturnCode
	 *	@return cmnTimeValidReturnCode
	 */
	public char[]  getCmnTimeValidReturnCodeString() {
	     return getCharArray(beginCmnTimeValidReturnCode,CMN_TIME_VALID_RETURN_CODE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cmnTimeValidReturnCodeIsNumeric() {
	    return isNumeric(beginCmnTimeValidReturnCode
	                    ,beginCmnTimeValidReturnCode + CMN_TIME_VALID_RETURN_CODE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CMN_TIME_VALID_RETURN_CODE_LEN = 1;
  	/**
	 * serializeCmnTimeValidReturnCode
	 */
	protected void serializeCmnTimeValidReturnCode(int cmnTimeValidReturnCode) {
		 putNumber(beginCmnTimeValidReturnCode,cmnTimeValidReturnCode,CMN_TIME_VALID_RETURN_CODE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCmnTimeValidReturnCodeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCmnTimeValidReturnCode
	 */
   	protected  int serializeCmnTimeValidReturnCode(char[] value) {
	    int  cmnTimeValidReturnCode;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cmnTimeValidReturnCode = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginCmnTimeValidReturnCode
		       ,1
		      );
		 localCmnTimeValidReturnCodeCounter = shareString.getSerializedField().getModifiedCounter();
		return  cmnTimeValidReturnCode;
    }

   protected int checkCmnTimeValidReturnCodeMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCmnTimeValidReturnCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCmnTimeValidReturnCode() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCmnTimeValidReturnCode
			                 ,CMN_TIME_VALID_RETURN_CODE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cmnTimeValidReturnCode", beginCmnTimeValidReturnCode,CMN_TIME_VALID_RETURN_CODE_LEN);
    }
   	}
     int localCmnTimeValidIsoCounter = -1;
     public boolean isCmnTimeValidIsoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnTimeValidIsoCounter != sharedCounter;
         localCmnTimeValidIsoCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_TIME_VALID_ISO_LEN = 8;
	/**
	 * 	serialize this CmnTimeValidIso
	 */
   protected void serializeCmnTimeValidIso(char[] cmnTimeValidIso) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnTimeValidIso,0,getStringValue(),beginCmnTimeValidIso,CMN_TIME_VALID_ISO_LEN);
       localCmnTimeValidIsoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnTimeValidIsoConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshCmnTimeValidIso is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnTimeValidIso() {	 
   		return (substring(getStringValue(),beginCmnTimeValidIso,beginCmnTimeValidIso + CMN_TIME_VALID_ISO_LEN));
   	}
     int localCmnTimeValidNumericCounter = -1;
     public boolean isCmnTimeValidNumericModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnTimeValidNumericCounter != sharedCounter;
         localCmnTimeValidNumericCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cmnTimeValidNumeric
	 *	@return cmnTimeValidNumeric
	 */
	public char[]  getCmnTimeValidNumericString() {
	     return getCharArray(beginCmnTimeValidNumeric,CMN_TIME_VALID_NUMERIC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cmnTimeValidNumericIsNumeric() {
	    return isNumeric(beginCmnTimeValidNumeric
	                    ,beginCmnTimeValidNumeric + CMN_TIME_VALID_NUMERIC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CMN_TIME_VALID_NUMERIC_LEN = 6;
  	/**
	 * serializeCmnTimeValidNumeric
	 */
	protected void serializeCmnTimeValidNumeric(long cmnTimeValidNumeric) {
		 putNumber(beginCmnTimeValidNumeric,cmnTimeValidNumeric,CMN_TIME_VALID_NUMERIC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCmnTimeValidNumericCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCmnTimeValidNumeric
	 */
   	protected  long serializeCmnTimeValidNumeric(char[] value) {
	    long  cmnTimeValidNumeric;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cmnTimeValidNumeric = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginCmnTimeValidNumeric
		       ,6
		      );
		 localCmnTimeValidNumericCounter = shareString.getSerializedField().getModifiedCounter();
		return  cmnTimeValidNumeric;
    }

   protected long checkCmnTimeValidNumericMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCmnTimeValidNumeric is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshCmnTimeValidNumeric() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginCmnTimeValidNumeric
			                 ,CMN_TIME_VALID_NUMERIC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cmnTimeValidNumeric", beginCmnTimeValidNumeric,CMN_TIME_VALID_NUMERIC_LEN);
    }
   	}




}
  
