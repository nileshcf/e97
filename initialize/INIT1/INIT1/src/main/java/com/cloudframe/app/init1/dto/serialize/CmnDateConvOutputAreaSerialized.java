package com.cloudframe.app.init1.dto.serialize;

/**
*  The class CmnDateConvOutputAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:53. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnDateConvOutputAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnDateConvOutputAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_DATE_CONV_OUTPUT_AREA_LENGTH = 48;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCmnDateConvReturnCode;
	
	/**
	* Constructor for CmnDateConvOutputAreaSerialized
	**/
    public CmnDateConvOutputAreaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnDateConvOutputAreaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateConvOutputAreaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnDateConvOutputAreaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1042); // serialize this field at offset 1042 by default 
    }
    
	/**
	* sets parent for this CmnDateConvOutputAreaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1042 by default
    }    
	/**
	* initializes the field in CmnDateConvOutputAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_DATE_CONV_OUTPUT_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCmnDateConvReturnCode = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localCmnDateConvReturnCodeCounter = -1;
     public boolean isCmnDateConvReturnCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateConvReturnCodeCounter != sharedCounter;
         localCmnDateConvReturnCodeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cmnDateConvReturnCode
	 *	@return cmnDateConvReturnCode
	 */
	public char[]  getCmnDateConvReturnCodeString() {
	     return getCharArray(beginCmnDateConvReturnCode,CMN_DATE_CONV_RETURN_CODE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cmnDateConvReturnCodeIsNumeric() {
	    return isNumeric(beginCmnDateConvReturnCode
	                    ,beginCmnDateConvReturnCode + CMN_DATE_CONV_RETURN_CODE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CMN_DATE_CONV_RETURN_CODE_LEN = 1;
  	/**
	 * serializeCmnDateConvReturnCode
	 */
	protected void serializeCmnDateConvReturnCode(int cmnDateConvReturnCode) {
		 putNumber(beginCmnDateConvReturnCode,cmnDateConvReturnCode,CMN_DATE_CONV_RETURN_CODE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCmnDateConvReturnCodeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCmnDateConvReturnCode
	 */
   	protected  int serializeCmnDateConvReturnCode(char[] value) {
	    int  cmnDateConvReturnCode;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cmnDateConvReturnCode = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginCmnDateConvReturnCode
		       ,1
		      );
		 localCmnDateConvReturnCodeCounter = shareString.getSerializedField().getModifiedCounter();
		return  cmnDateConvReturnCode;
    }

   protected int checkCmnDateConvReturnCodeMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCmnDateConvReturnCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCmnDateConvReturnCode() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCmnDateConvReturnCode
			                 ,CMN_DATE_CONV_RETURN_CODE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cmnDateConvReturnCode", beginCmnDateConvReturnCode,CMN_DATE_CONV_RETURN_CODE_LEN);
    }
   	}




}
  
