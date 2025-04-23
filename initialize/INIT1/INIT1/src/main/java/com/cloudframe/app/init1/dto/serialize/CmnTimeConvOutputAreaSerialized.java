package com.cloudframe.app.init1.dto.serialize;

/**
*  The class CmnTimeConvOutputAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:56. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnTimeConvOutputAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnTimeConvOutputAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_TIME_CONV_OUTPUT_AREA_LENGTH = 30;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCmnTimeConvReturnCode;
	
	/**
	* Constructor for CmnTimeConvOutputAreaSerialized
	**/
    public CmnTimeConvOutputAreaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnTimeConvOutputAreaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnTimeConvOutputAreaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnTimeConvOutputAreaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1047); // serialize this field at offset 1047 by default 
    }
    
	/**
	* sets parent for this CmnTimeConvOutputAreaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1047 by default
    }    
	/**
	* initializes the field in CmnTimeConvOutputAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_TIME_CONV_OUTPUT_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCmnTimeConvReturnCode = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localCmnTimeConvReturnCodeCounter = -1;
     public boolean isCmnTimeConvReturnCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnTimeConvReturnCodeCounter != sharedCounter;
         localCmnTimeConvReturnCodeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cmnTimeConvReturnCode
	 *	@return cmnTimeConvReturnCode
	 */
	public char[]  getCmnTimeConvReturnCodeString() {
	     return getCharArray(beginCmnTimeConvReturnCode,CMN_TIME_CONV_RETURN_CODE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cmnTimeConvReturnCodeIsNumeric() {
	    return isNumeric(beginCmnTimeConvReturnCode
	                    ,beginCmnTimeConvReturnCode + CMN_TIME_CONV_RETURN_CODE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CMN_TIME_CONV_RETURN_CODE_LEN = 1;
  	/**
	 * serializeCmnTimeConvReturnCode
	 */
	protected void serializeCmnTimeConvReturnCode(int cmnTimeConvReturnCode) {
		 putNumber(beginCmnTimeConvReturnCode,cmnTimeConvReturnCode,CMN_TIME_CONV_RETURN_CODE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCmnTimeConvReturnCodeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCmnTimeConvReturnCode
	 */
   	protected  int serializeCmnTimeConvReturnCode(char[] value) {
	    int  cmnTimeConvReturnCode;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cmnTimeConvReturnCode = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginCmnTimeConvReturnCode
		       ,1
		      );
		 localCmnTimeConvReturnCodeCounter = shareString.getSerializedField().getModifiedCounter();
		return  cmnTimeConvReturnCode;
    }

   protected int checkCmnTimeConvReturnCodeMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCmnTimeConvReturnCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCmnTimeConvReturnCode() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCmnTimeConvReturnCode
			                 ,CMN_TIME_CONV_RETURN_CODE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cmnTimeConvReturnCode", beginCmnTimeConvReturnCode,CMN_TIME_CONV_RETURN_CODE_LEN);
    }
   	}




}
  
